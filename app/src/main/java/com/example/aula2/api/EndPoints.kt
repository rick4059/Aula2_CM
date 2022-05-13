package com.example.aula2.api

import retrofit2.Call
import retrofit2.http.*

interface EndPoints{

    @GET("/users/")
    fun getUsers(): Call<List<user>>

    @GET("/users/{id}")
    fun getUserById(@Path("id") id: Int): Call<user>

    @FormUrlEncoded
    @POST("/posts")
    fun postTest(@Field("title") first: String?): Call<OutputPost>
}
