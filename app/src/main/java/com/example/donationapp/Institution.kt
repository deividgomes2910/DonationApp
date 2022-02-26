package com.example.donationapp

class Institution(
    val id : String?,
    val name: String?,
    val email : String?,
    val photoUrl: String?,
    val institutionType: String? = null,
    val address: String? = null,
    val phone: String?,
    val description: String? = null
) {

    constructor() : this(
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
    )

}