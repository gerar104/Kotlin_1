package com.example.kotlinbasics

fun main() {
    newTopic("POO")
    subTopic("class")
    println(School())

    //constructor
    subTopic("Constructor")
    val school = School("Gerardo", "Santos Degollado")
    println(school)

    //override
    subTopic("Override")
    val schoolInactive = School("Gerardo", "Santos Degollado", School.INACTIVE)
    println(schoolInactive)

    //this
    subTopic("this")
    val highSchool = School("Stan", "Indepedencia #232", mutableListOf(Person("Jose", "Rodriguez")))
    println(highSchool)

    //properties & methods
    subTopic("Metodos y propiedades")
    val person = Person("Gerardo", "Toledano")
    println(person.getFullname())
    println(person.showWork())
    person.salary = 10000f
    println(person.salary)


    //Set and Get
    subTopic("Set & Get")
    person.tax = 20f
    println(person.salary)

    //herencia
    val teacher = Teacher("Alex", "Castillo", 45)
    highSchool.staff.add(teacher)
//    println(highSchool)
    val admin = Admin("Gerry", "Toledano", 1)
    highSchool.staff.add(admin)
    println(highSchool)
    println("Teacher:  ${teacher.showWork()}")
    println("Admin: ${admin.showWork()}")

    //visibilidad o encapsulacion
    subTopic("Encapsulacion")
    println(teacher.firstName)
//    println(teacher.lastName)

//companion object
    subTopic("Companion object")
    println(School.ACTIVE)

    val schoolActive = School("Oxf", "Calle Roma #456", School.ACTIVE)
    println(schoolActive)


    //enum
    subTopic("Enum")
    schoolActive.setType(TypeSchool.PRIVATE)
    println(schoolActive.getType())

    //Nested class
    subTopic("Clase anidada")
    println(teacher.classRoom)
    teacher.classRoom.key = "4°A"
    println(teacher.classRoom)

    //Inner class
    subTopic("Inner class")
    println(teacher.classRoom.getInfo())

    //interface
    subTopic("Interface")
    teacher.salary=1000.0f
    val boss:Boss=teacher
    println(boss.namePerson())
    println(boss.netSalary())

    //dataClass
    subTopic("Data Class")
    println(schoolActive)
    println(schoolActive.component1())
    val schoolCopy=schoolActive.copy()
    schoolCopy.name="Ford"
    println(schoolCopy)

    //equal & hashCode
    subTopic("Equal & HashCode")

    schoolActive.numCode="356"
    schoolCopy.numCode="357"
    println(schoolActive.equals(schoolCopy))
}