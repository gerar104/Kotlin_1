package com.example.kotlinbasics

fun main() {
    newTopic("Sentencias condicionales")
    subTopic("If")

    if (true) {
        println("Condicion exitosa")
    }

//equality
    subTopic("Equality")
    if (1 == 1) {
        println("1 es igual a 1")
    }

    //equals
    subTopic("Equals")
    val ger = "Ger"
    if (ger.equals("Ger")) {
        println("Es lo mismo")
    }

    //Operadores logicos
    subTopic("Operdores Logicos")
    if (1 != 2) {//not
        println("1 es diferente de 2")
    }

    if (1 == 1 || 1 < 2) {//or
        println("1 es igual o menor a 2")
    }

    if (1 != 2 && 1 < 2) {//and
        println("1 es diferente y menosr a 2")
    }

    //nested if
    if (1 == 1) {
        if (1 < 2) {
            println("If anidado")
        }
    }

    //if else
    subTopic("If else")
    val a = 15
    val b = 5
    if (a > b) {
        println("a es mayor que b")
    } else {
        println("a no es mayor que b")
    }

    if (a < b) {
        println("a es menor que b")
    } else if (a == b) {
        println("a es igual a b")
    } else {
        println("a es mayor que b")
    }

    //When es una especia de Switch
    subTopic("Sentencia when")

    val name = "Gera"
    if (name.equals("Karina")) {
        println("Hola Karina")
    } else if (name.equals("Pablo")) {
        println("Hola Pablin")
    } else if (name.equals("Gera") || name.equals("Cursos android ANT")) {
        println("Hola Gera")
    } else if (name.equals("Pamela")) {
        println("Hola Pam")
    } else {
        println("Hola desconocido")
    }

    //ahora con when
    when (name) {
        "Karina" -> println("Hola Karina")
        "Pablo" -> println("Hola Pablin")
        "Gera", "Cursos android ANT" -> println("Hola Gera")
        "Pamela" -> println("Hola Pam")
        else -> println("Hola desconocido")
    }

    //collectios
    subTopic("VarArg")
    multiArguments("Karina", "Pamela", "Pablo")

    //Array simple      0   1   2   3   4   5
    val array = arrayOf('p', 'a', 'm', 'e', 'l', 'a')
    println(array[0])
    println(array.get(1))//Obtienes el valor de la pocision indicada del array
    println(array[4])//Obtienes el valor de la pocision indicada del array

    val arrayStr: String = "Pamela"
    println(arrayStr[0])
    println(arrayStr.get(4))

    //listOf
    subTopic("ListOf")
    /*Para este tipo de lista ya no se puede agregar ningun nuevo elemento, por lo que es de solo lectura*/
//    val readOnlyList= listOf<String>("Gera","Merry","Cris","Laura")
    val readOnlyList: List<String>
    readOnlyList = listOf("Gera", "Merry", "Cris", "Laura")
    println("Read Only: $readOnlyList")
    println("Name at ${readOnlyList.get(3)}")


    //mutableListOf, permite agregar nuevos elementos a los ya existentes en la lista, cosa que en la lista anterior no se permitía
    subTopic("MutableListOf")
    val mutableList = mutableListOf<String>("Gera", "Merry", "Cris", "Laura")
    println("Mutable $mutableList")
    mutableList.add("Juan")//Se agrega elemento
    println("Add $mutableList")
    mutableList.removeAt(1)//Se elimina por numero de la posicion
    println("Remove At $mutableList")
    mutableList.remove("Juan")//Se elimina por el elemento
    println("Remove: $mutableList")
    mutableList.set(1, "Angel")//Actualizamos un elemento en la posicion indicada
    println("Update $mutableList")

    //map
    subTopic("Map")
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("Ger", "Gerardo")
    mutableMap.put("Andy", "Andrea")
    mutableMap.put("Pam", "Pamela")
    mutableMap.put("Chris", "Christian")
    println("Map $mutableMap")
    println("Get by key: ${mutableMap.get("Andy")}")
    mutableMap.remove("Pam")
    mutableMap.set("Chris", "Cristina")
    println("Remove & Set: $mutableMap")
    println(mutableMap.keys)//se imprimen unicamente las claves del mapa
    println(mutableMap.values) //se imprimen solo los valores del mapa


    //arrayOfNulls
    subTopic("Array of null")
    val nullArray = arrayOfNulls<String>(3)
    nullArray[1] = "Karina"
    println(nullArray[1])
    println(nullArray[0])


    //methods Collections
    subTopic("Metodos en colecciones")
    println(readOnlyList)
    println("sort: ${readOnlyList.sorted()}")//Ordena los elementos  de forma alfabetica (para este caso de Strings)
    println("Reverse: ${readOnlyList.reversed()}")//ordena los elementos en forma contraria a como se definieron
    println(
        "Sorted reverse ${
            readOnlyList.sorted().reversed()
        }"
    )//orderna en reversa el arreglo ordeanado
    println("IndexOf Laura: ${readOnlyList.indexOf("Laura")}")//Ayuda a ubicar un elemento de acuerdo con su valor

    //loops
    subTopic("Bucles")
    loops("Karina", "Pamela", "Pablo", "Juan ", "Albert")

}

fun loops(vararg names: String) {
//for
    subTopic("Ciclo for")
    for (i in 1..10) {
        print("$i,")
    }
    println()
//de 2 en 2
    for (i in 1..10 step 2) {
        print("$i,")
    }

    for (i in 0..names.size - 1) {
        println("$i = ${names.get(i)}")
    }

    for (name in names) {
        println(name)
    }

    //foreach
    subTopic("Foreach")
    names.forEach { name ->
        println(name)
    }

    (1..5).forEach { name ->
        println(name)
    }

    //While
    subTopic("While")
    var index = 0
    while (index < names.size) {
        println("index: $index")
        println("name at index: ${names.get(index)}")
//        index=index+1
        index++//incremento de 1 en 1
    }

    //Do while
    subTopic("Do While")
    do {
        index--//decremento de 1 en 1
        println("index: $index")
        println("name at index: ${names.get(index)}")
//        index=index+1

    } while (index > 0)

    //return
    subTopic("Return")
    (1..5).forEach { number ->
        if (number == 3) {
            return@forEach //Cuando lo declaramos de esta manera, al entrar en la condicion retornara al inico de la funcion
            //return // nos retorna completamente, sacandonos incluso del metodo main
        }
        println(number)
    }

    //break
    subTopic("Break")
    for (i in 1..5) {
        if (i == 3) {
            break //al caer en el break se rompe el ciclo
        }
        println(i)
    }
}


fun multiArguments(vararg name: String) {
    println("vararg en la pocision 0: ${name[0]}")
}


