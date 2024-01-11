package com.quid.server.person.usecase

import PersonService.PersonCreateRequest
import com.quid.server.person.domain.Person
import com.quid.server.person.gateway.repository.PersonRepository
import org.springframework.stereotype.Service

fun interface CreatePerson {
    operator fun invoke(request: PersonCreateRequest): Person

    @Service
    class CreatePersonUseCase(
        private val personRepository: PersonRepository
    ) : CreatePerson {
        override fun invoke(request: PersonCreateRequest): Person =
            Person(request)
                .let { personRepository.save(it) }
    }
}