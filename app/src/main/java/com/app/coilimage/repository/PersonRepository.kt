package com.app.coilimage.repository

import com.app.coilimage.model.Person

class PersonRepository {
    fun getAllData(): List<Person>{
        return listOf(
            Person(
                id = 0,
                firstName = "Sofia",
                lastName = "Smith",
                age = 20
            ),
            Person(
                id = 1,
                firstName = "Liam",
                lastName = "Johnson",
                age = 24
            ),
            Person(
                id = 2,
                firstName = "Ava",
                lastName = "Brown",
                age = 23
            ),
            Person(
                id = 3,
                firstName = "Noah",
                lastName = "Davis",
                age = 29
            ),
            Person(
                id = 4,
                firstName = "Mia",
                lastName = "Milter",
                age = 30
            ),
            Person(
                id = 5,
                firstName = "Ethan",
                lastName = "Wilson",
                age = 18
            ),
            Person(
                id = 6,
                firstName = "Olivia",
                lastName = "Taylor",
                age = 19
            ),
            Person(
                id = 7,
                firstName = "Aiden",
                lastName = "Anderson",
                age = 32
            ),
            Person(
                id = 8,
                firstName = "Harper",
                lastName = "Thomas",
                age = 37
            ),
            Person(
                id = 9,
                firstName = "Lucas",
                lastName = "Jackson",
                age = 26
            )
        )
    }
}