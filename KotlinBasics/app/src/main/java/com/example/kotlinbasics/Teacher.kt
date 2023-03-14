package com.example.kotlinbasics

class Teacher(firstName: String, lastName: String, var students: Short) :
    Person(firstName, lastName),
    Boss {
    var classRoom: ClassRoom = ClassRoom("N/A")

    override fun showWork(): String {
        return super.showWork() + "\nDando clases..."
    }

    override fun namePerson(): String {
        return super.getFullname()
    }

    override fun netSalary(): Float {
       return salary
    }

    inner class ClassRoom(var key: String) {
        override fun toString(): String {
            return "Classroom $key"
        }

       fun getInfo():String{
           return "Classroom ${key} with teacher $firstName and $students"
       }
    }
}