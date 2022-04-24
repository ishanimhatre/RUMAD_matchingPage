package com.yuyakaido.android.cardstackview.sample

import retrofit2.Call
import retrofit2.http.GET

interface MusicAPI {

    @GET("/users")
    fun fetchallUsers(): Call<List<Spot>>
}