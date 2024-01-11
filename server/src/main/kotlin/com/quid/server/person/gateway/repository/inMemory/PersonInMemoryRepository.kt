package com.quid.server.person.gateway.repository.inMemory

import com.quid.server.person.domain.Person
import org.springframework.stereotype.Component

@Component
class PersonInMemoryRepository {
    private val persons = mutableMapOf<Long, Person>()

    fun save(person: Person): Person {
        persons[person.id?:1L] = person
        return person
    }

    fun findById(id: Long): Person {
        return persons[id]?: throw Exception("Person not found")
    }
}