package com.quid.server.person.gateway.repository.inMemory

import com.quid.server.person.domain.Person
import org.springframework.stereotype.Component

@Component
class PersonInMemoryRepository {
    private val persons = mutableMapOf<Long, Person>()

    fun save(person: Person): Person {
        val id = person.id?: persons.size.toLong()
        val withId = person.copy(id = id)
        persons[id] = withId
        return withId
    }

    fun findById(id: Long): Person {
        return persons[id]?: throw Exception("Person not found")
    }

    fun findAll(): List<Person> {
        return persons.values.toList()
    }
}