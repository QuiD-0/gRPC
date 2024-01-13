package com.quid.server.person.gateway.repository

import com.quid.server.person.domain.Person
import com.quid.server.person.gateway.repository.inMemory.PersonInMemoryRepository
import org.springframework.stereotype.Repository

interface PersonRepository {

    fun save(person :Person): Person
    fun findById(id: Long): Person
    fun findAll(): List<Person>
    fun deleteById(id: Long)

    @Repository
    class PersonRepositoryImpl(
        private val inMemoryRepository: PersonInMemoryRepository
    ) : PersonRepository {
        override fun save(person: Person): Person =
            inMemoryRepository.save(person)

        override fun findById(id: Long): Person =
            inMemoryRepository.findById(id)

        override fun findAll(): List<Person> =
            inMemoryRepository.findAll()

        override fun deleteById(id: Long) {
            inMemoryRepository.deleteById(id)
        }
    }
}