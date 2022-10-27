package com.example.android.zsgstenkasi

data class Student(var name: String, var phone: String, var emailId: String)

object StudentData {
    val student: List<Student> = listOf(
        Student("Arul Kumar", "8799787613", "arulkumar123@gmail.com"),
        Student("Daniel Raj", "9896457632", "dainelraj09@gmail.com"),
        Student("James", "9867359647", "james0098@gmail.com"),
        Student("Petchi Muthu", "9789263997", "petchimuthu0091@gmail.com"),
        Student("Mugila", "8897612120", "mugila26@gmail.com"),
        Student("Junaitha Fathima ", "8990876443", "fathima23@gmail.com"),
        Student("Kiruthika", "8122985654", "kiruthika123@gmail.com"),
        Student("Bala Sithaswaran", "8872348291", "bala323@gmail.com"),
        Student("Mariappan", "7708322183", "mariappan@gmail.com"),
        Student("Rajavel", "9941978763", "rajavel@gmail.com"),
        Student("Jegan", "879348763", "jegan@gmail.com"),
        Student("Hari Prasath", "7799098363", "hariprasath123@gmail.com"),
        Student("Kaaj Peer Mohamad", "9909978763", "kaajpeer20@gmail.com"),
        Student("Ranjith", "8980978763", "ranjithraina@gmail.com"),
        Student("Sathish", "9847563223", "sathishkumar23@gmail.com"),
        Student("Siva Ram", "708678763", "sivaram3@gmail.com"),
        Student("Zerome", "9080704063", "zerome93@gmail.com")
    )
}