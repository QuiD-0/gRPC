package com.quid.server.person.gateway.repository

import com.quid.server.person.domain.Person
import com.quid.server.person.gateway.repository.inMemory.PersonInMemoryRepository
import org.springframework.stereotype.Repository

interface PersonRepository {

    fun save(person :Person): Person
    fun findById(id: Long): Person

    @Repository
    class PersonRepositoryImpl(
        private val inMemoryRepository: PersonInMemoryRepository
    ) : PersonRepository {
        override fun save(person: Person): Person {
            return inMemoryRepository.save(person)
        }

        override fun findById(id: Long): Person {
            return inMemoryRepository.findById(id)
        }
    }
}