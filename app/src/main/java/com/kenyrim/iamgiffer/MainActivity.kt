package com.kenyrim.iamgiffer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.NonNull
import com.kenyrim.iamgiffer.api.Data
import com.kenyrim.iamgiffer.api.Request
import com.kenyrim.iamgiffer.data.Example
import io.reactivex.Observable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service: Observable<List<Example>>? = Request.Factory.createService()

        service?.subscribeOn(Schedulers.newThread())
            ?.observeOn(Schedulers.io())
            ?.subscribe(object : DisposableObserver<List<Example>>() {
                override fun onNext(@NonNull list: List<Example>) {
                    Log.e("onNext", list[0].file.path.toString())
                }

                override fun onError(@NonNull e: Throwable) {
                    e.printStackTrace()
                    Log.e("onError", "" + e.message)
                }

                override fun onComplete() {
                    Log.e("onComplete", "onComplete")
                }
            })
    }
}