package com.example.donationapp

class HomeCardView (val establishmentId : String?, val photoUrl : String?, val title : String?, val description : String?, var timestamp : Long? = null){

    constructor() : this(
        "",
        "",
        "",
    "")
}