package com.example.mycvhw

//import com.google.gson.annotations.SerializedName
class Skill(var name:String?) {
//    @SerializedName("name")
//lateinit var name:String

    override fun toString():String {
        return ("Skill{" +
                "name= " + name + "} ")
    }
}