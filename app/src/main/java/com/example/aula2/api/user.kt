package com.example.aula2.api

data class user (
    val id: Int,
    val name: String,
    val email: String,
    val address: Address
)

data class Address(
    val city: String,
    val zipcode: String,
    val geo: geo
)

data class geo(
    val lat: String,
    val lng: String
)