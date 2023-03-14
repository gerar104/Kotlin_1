package com.example.kotlinbasics

fun main() {
secondTask()

}

private fun firstTask(){
    subTopic("TAREA")
    val listaMutable = mutableListOf<String>(
        "Gerardo", "Andrea", "Diana", "Luis", "Omar", "Karina", "Yera", "Santi", "Toño del Villar"
    )
    println(listaMutable)


    for (i in 0..listaMutable.size - 1) {
        val element = listaMutable.get(i)

        when (listaMutable.get(i)) {
            "Gerardo" -> {
                listaMutable.set(i, "Gerardo Toledano Salinas")
            }
            "Andrea" -> {
                listaMutable.set(i, "Andrea del Villar Rosales")
            }
            "Karina" -> {
                listaMutable.removeAt(i)
                listaMutable.add("Karina Salinas (ad)")
            }
            "Yera" -> {
                listaMutable.remove("Yera")
            }
            else -> {
                println(listaMutable.get(i))
            }


        }

    }
    val mapa = mutableMapOf<Int, String>()
    var contador: Int = 0;
    listaMutable.forEach { person ->
        print("$person, ")
        if (person.equals("Santi") || person.equals("Luis")) {
            println("Sentencia if con 2 condiciones")
        } else {
            mapa.put(contador, person)
            contador++
        }
    }

    println(mapa)
}

private fun secondTask(){
    //Tarea
    subTopic("Tarea Kotlin Advance")
    var num: Any?
    num = 5.0
    safeTask(num)
    num = null
    safeTask(num)
    num = "J"
    safeTask(num)
}
private fun safeTask(num: Any?) {
    println("num: ${num?.toString().toDouble()}")
}