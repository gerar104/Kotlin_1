package com.example.kotlinbasics


var userName = "Gera"
const val SPECIES = "Human"
private const val SEPARATOR="===================="


fun main() {
   implementations()

}



fun implementations(){
    println("Kotlin basic")
    //variable
    newTopic("Variables")
    var age: Int = 31 // Al declarar una variable con 'var' esta podra cambiar su valor
    println(age)

    val name =
        "Gerardo" //al declarar una variable con 'val' su valor no cambia, es una variable de solo lectura
    println(name)
    /****
     * para declarar una variable a la que despues se le asignara valor
     * se le deba poner 'var variableName : Type' en este caso es de tipo String
     ****/
    var job: String
    job = "Developer"
    println(job)

    val languaje: String
    languaje = "Kotlin"
    println(languaje)

    //variable global
    println(userName)

    //constantes
    println(SPECIES)


    //String templates
    newTopic("String Templates")
    println("My name is: $name")
    println("My username is: $userName")
    println("I am: $SPECIES")

    //tipos de datos
    newTopic("Tipos de datos")
    val char: Char = 'a'
    val char2: Char = 'L'
    print(char)
    print(char2)
    println()

    val string: String = "Ger"
    println(string)

    val boolean: Boolean = true
    println(boolean)


    //8 bits -128 al 127 (256 posibles valores).
    val jobs: Byte = 3
    println("$jobs trabajos")
    //16 bits (2 bytes) -32768 to 32767
    val workDays: Short = 200
    println("$workDays dias trabajados")
    //32 bits (4 bytes) -2,147,483,648 to 2,147,483,647
    val workedMinutes: Int = 288000
    println("$workedMinutes minutos trabajados")
    //64 bits (8 Bytes) -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
    val workInMilliseconds: Long = 17280000000
    println("$workInMilliseconds milisegundos trabajados")


    //32 bits en memoria (4 bytes) y permite almacenar números con hasta 7 decimales.
    val height: Float = 1.75f
    println("Estatura: ${height}m")

    //Ocupa 64 bits en memoria (8 bytes) y nos da la posibilidad de almacenar hasta 16 decimales.
    val heightDouble: Double = 1.75333333333
    println("Estatura real: ${heightDouble}m")

    //Funciones
    newTopic("Funciones")
    basic()
    parameters(name)
    println(returnData())

    //sobrecarga
    overload(age)
    overload(job)
    overload(job,languaje)
    overload(languaje = languaje)

}

fun overload(job:String="Intern", languaje:String){
    println("Mi trabajo es ${job}  con el lenjuage $languaje")
}

fun overload(job: String) {
    println("Mi trabajo es $job")
}

fun overload(age: Int) {
println("Mi edad es $age")
}



fun returnData(): String {
    return "Datos retornados"
}

fun parameters(name: String) {
    println("Funcion con paremetros, el valor es: $name")
}

fun basic() {
    println("Funcion basica")
}

fun newTopic(header:String){

    print("\n$SEPARATOR $header $SEPARATOR\n")
}

fun subTopic(subTopic:String){

    print("\n$SEPARATOR $subTopic \n")
}