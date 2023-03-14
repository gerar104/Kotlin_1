package com.example.kotlinbasics.advanced

import com.example.kotlinbasics.*


private var nullStrGlobal: String? = null
private lateinit var lateinitGlobal: String
private val lazyGlobal: Any by lazy { "gLazyKotlin" }

fun main() {
    newTopic("Metodos String")
    //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34
    //K o t l y n   c o u r   s  e     b  y     C  u  r  s  o  s     A  n  d  r  o  i  d    A   N  T
    val course = "Kotlyn course by Cursos Android ANT"
    val target = "Android"
    println(course.length)
    println(course.compareTo(target))
    println(course.equals(target))
    println(course.contains(target))

    println(course.toLowerCase())
    println(course.toUpperCase())
    println(course.subSequence(0, 6))
    println(course.indexOf("N"))

    val empty = " "
    println(empty.isBlank())
    println(empty.isEmpty())
    println(course.lastIndexOf("n"))
    println(course.toLowerCase().lastIndexOf("n"))

    println(course.replace('c', 'k'))
    println(course.toLowerCase().replace("an", "os"))
    println(course.replaceBefore("by", "Only "))
    println(course.reversed())
    println(course.slice(20..course.length - 1))
    println(course.split(" "))
    println(course.startsWith('K'))
    println(course.substring(14, 16))
    println(course.substring(course.lastIndexOf('A', course.length)))
    println(course.trim())

    //nullable ? !!
    newTopic("Null safety")
    subTopic("?")
    var nullStr: String? = null
    println(nullStr)
    nullStr = "Hola"
    println(nullStr.get(0))
    println(nullStrGlobal?.reversed())
    subTopic("!!")
    nullStr = null
    showMessage(nullStr)
    nullStrGlobal = null//"Android"
    showMessage("Kotlin ")

    //Elvis Operator ?:
    subTopic("Elvis operator")
    nullStrGlobal = "Kotlin"
    val elvis = nullStrGlobal ?: "Java"
    println("Yo programo en $elvis")

    val noElvis = if (nullStrGlobal != null) {
        nullStrGlobal
    } else {
        "java"
    }
    println("Yo programo en $noElvis")

    //readLine
    subTopic("Readline")
    println("Inserte un numero: ")
    val first = readln()
    val a = first!!.toInt()
    println("a = $a")

    println("Inserta el segundo número: ")
    val second = readln()
    val b = second.toInt()
    println("El segundo numero es: $b")

    //operadores matematicos
    newTopic("Operadores Matematicos")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

//cast
    newTopic("Safe cast")
    subTopic("Smart cast")
    var obj: Any = 3//"Kotlyn course" //any significa que puede ser cualquier valor
    //println(obj.toString().toInt()*b)
    val objNum: Any = 3//"3d"
    if (objNum is Int) {
        println("objNum es un número")
        println(objNum.toString().toInt() * b)
    } else {
        println("objNum no es un numero")
    }

// try catch finally
    subTopic("Try catch finally")
    try {
        println("obj es un número y esta es la ultima linea del try")
        println(obj.toString().toInt() * b)
    } catch (e: java.lang.Exception) {
        println(e)
        println("Mensaje personalizado para el error en catch")
    } finally {
        println("Try catch finalizado")
    }


    //unsafe cast
    subTopic("Unsafe cast")
    obj = "true"
    val unsafeStr: String = obj as String
    println(unsafeStr)
    subTopic("Safe cast")
    obj = true
    val safeStr = obj as? String
    println(safeStr)


    //throw
    subTopic("throw")
    val job = "Diseñador"
    checkType(job)
    try {
        checkType(b)
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Tarea finalizada exitosamente")
    }

    //infix (extension)
    subTopic("Infix")
    val name = "Android"
    println(name.toUpperCase())
    println(name.toLowerCase())
    println(name.toMixCase(true))
    println(name.toMixCase(false))

    //lazy & lateinit
    newTopic("Asignacion tardia")
    subTopic("lateinit")//solo se aplica a variables globales, nos permite crear una variable que de momento no puede contener ningun valor, pero que mas adelante lo tendra de forma segura
    if (setValueForLateinit()) {
        println(lateinitGlobal)
        println(lateinitGlobal.toMixCase(true))
    }

    subTopic("lazy")
    println(lazyGlobal)
//    lazyGlobal="f"

    //Scope functions
    newTopic("Funciones de alcance")
    val highSchool =
        School("Stan", "Independencia #324", mutableListOf(Person("Jose", "Rodriguez")))
    val teacher = Teacher("Alex", "Castillo", 45)
    val admin = Admin("Gerardo", "Toledano", 1)

    //with
    subTopic("with")//CON este objeto, haz algo...
    with(highSchool) {
        println("Con este objeto, imprime lo siguiente: ")
        println(getType())
        println(toString())
    }


    //apply
    subTopic("Apply")//APLICA las siguientes configuraciones
    /*Modificar el valor de las propiedades en el objeto*/
    teacher.apply {
        classRoom.key = "4°B"
        salary = 2000f
    }
    println(teacher.classRoom.key)
    println(teacher.salary)
    println("Valores asignados correctamente con apply")

    //run
    subTopic("run")//esta recomendada para ejecutar un bloque de codigo mas complejo relacionado al objeto, podemos asignar nuevas propiedades y mandar a llamar metodos
    highSchool.run {
        println("Ejecuta el siguiente bloque de codigo en el objeto")
        staff.add(teacher)
        staff.add(admin)
        println("Members: ${staff.size}")
        println(this)
    }

    //let
    subTopic("let")
    var school: School? = null
    school = createSchool()
    school?.let {//si la escuela es difereente de null, permite hacer  lo siguiente
        school.staff.add(admin)
        println("Sie el objeto es diferente de nulo, permite imprimirlo: $it")
    }

    //also
    subTopic("Also")
    /*Se recomienda para añadir una configuracion o proceso donde se necesite la referencia al objeto it en lugar de sus metodos o propiedades*/
    val udemy:School
    udemy=School().apply {
        numCode="458".also {
            println("Y tambien, notifica que el codigo de la escuela nueva es: $it")
        }
    }
}

private fun createSchool(): School? {
    //return null
    val escuela = School("HArvard", "Calle principal")
    return escuela
}


private fun setValueForLateinit(): Boolean {
    lateinitGlobal = "gLateinitKotlyn"
    return lateinitGlobal.isNotEmpty()
}

private infix fun String.toMixCase(firstUpper: Boolean): String {
    var mixString = ""
    var index = 0
    var module = 0
    if (firstUpper) {
        this.toUpperCase()
    } else {
        this.toLowerCase()
        module = 1
    }

    while (index < this.length) {
        if (index % 2 == module) {
            mixString += this.get(index).toUpperCase()
        } else {
            mixString += this.get(index).toLowerCase()
        }
        index++
    }

    return mixString
}

private fun checkType(value: Any) {
    if (value is String) {
        println("String valido")
    } else {
        throw TypeCastException(" No es un String")
    }
}

private fun showMessage(msg: String?) {
    println("? ${msg?.get(0)}")
    if (msg != null) {
        println("! ${msg.get(0)}")
    }

    if (nullStrGlobal != null) {
        println("g!! ${nullStrGlobal!!.get(0)}")
    }


}

