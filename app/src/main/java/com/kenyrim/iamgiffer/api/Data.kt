package com.kenyrim.iamgiffer.api

import java.util.*

class Data {

    data class File(
        var path: String?,
        var server: String?,
        var formats: List<String>?,
        var id: String?,
    )

    data class Tag2(
        var id: String?
    )

    data class Tag(
        var value: Int?,
        var tag: Tag?
    )

    data class Creator(
        var username: String?,
        var id: String?
    )

    data class Root(
        var _id: String?,
        var width:Int,
        var height:Int,
        var file: File?,
        var kind: String?,
        var tags: List<Tag>?,
        var createdAt: Date?,
        var creator: Creator?,
        var id: String?,
        var liked: Boolean,
        var ad: Boolean,
        var safeStatus: String?
    )
}