package com.example.kotlinbasics

open class Person(val firstName: String, private val lastName: String) {
    var tax: Float = 10.0f
        get() = 1 - (field * 0.01f)

    var salary: Float = 0f
        set(value) {
            field = value
        }
        get() = field * tax

    fun getFullname(): String {
        return "$firstName $lastName"
    }

   open  fun showWork(): String {
        return "Capturando datos..."
    }

}