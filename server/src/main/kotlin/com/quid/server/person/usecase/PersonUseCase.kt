package com.quid.server.person.usecase

import PersonService.PersonCreateRequest
import com.quid.server.person.domain.Person
import com.quid.server.person.gateway.repository.PersonRepository
import org.springframework.stereotype.Service

interface PersonUseCase {
    fun getPerson(id: Long): Person
    fun createPerson(request: PersonCreateRequest): Person

    @Service
    class PersonUseCaseImpl(
        private val personRepository: PersonRepository
    ) : PersonUseCase {

        override fun getPerson(id: Long) = personRepository.findById(id)

        override fun createPerson(request: PersonCreateRequest): Person =
            Person(request)
                .let { personRepository.save(it) }
    }
}
