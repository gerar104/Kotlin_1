package com.example.kotlinbasics

data class School(
    var name: String,
    var address: String,
    val active: Boolean = true,
    var numCode: String = ""
) {

    var staff: MutableList<Person>//propiedad de la clase
    private var typeSchool: TypeSchool = TypeSchool.FEDERAL

    init {
        staff = mutableListOf()
    }

    constructor() : this("", "")

    constructor(name: String, address: String, staff: MutableList<Person>) : this(name, address) {
        this.staff = staff
    }

    fun setType(typeSchool: TypeSchool) {
        this.typeSchool = typeSchool
    }

    fun getType(): String {
        return typeSchool.type
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as School

        if (numCode != other.numCode) return false

        return true
    }

    override fun hashCode(): Int {
        return numCode.hashCode()
    }


    /* override fun toString(): String {
         if (active) {
             return if (staff.size > 0) {
                 "name: $name at $address, with ${staff.size} members"
             } else {
                 "name: $name at $address"
             }
         } else {
             return "Escuela inactiva"
         }
     }*/

    companion object {
        const val ACTIVE = true
        const val INACTIVE = false
    }
}