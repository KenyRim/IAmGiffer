package com.kenyrim.iamgiffer.api

import com.kenyrim.iamgiffer.BASE_URL
import com.kenyrim.iamgiffer.BuildConfig
import com.kenyrim.iamgiffer.SEARCH
import com.kenyrim.iamgiffer.data.Example
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import rx.schedulers.Schedulers
import java.util.*
import java.util.concurrent.TimeUnit

public interface Request {

    @GET("$SEARCH/media")
    fun searchGifs(
        @Query("q") search: String?,
        @Query("limit") limit: Int?,
        @Query("skip") skip: Int?
    ): Observable<List<Example>>?


    object Factory {
        fun createService(): Observable<List<Example>>? {
            val interceptor = run {
                val httpLoggingInterceptor = HttpLoggingInterceptor()
                httpLoggingInterceptor.apply {
                    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
                }
            }
            val client: OkHttpClient = OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()
            return retrofit.create(Request::class.java).searchGifs("apple",5,0)
        }
    }
}


