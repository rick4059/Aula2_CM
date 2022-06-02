package com.example.aula2.api

import androidx.compose.ui.graphics.Path
import com.google.android.gms.common.internal.safeparcel.SafeParcelable
import retrofit2.Call
import retrofit2.http.*

interface EndPoints{

    @GET("/users/")
    fun getUsers(): retrofit2.Call<List<user>>

}
