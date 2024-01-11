package com.quid.server.person.usecase

import com.quid.server.person.domain.Person
import com.quid.server.person.gateway.repository.PersonRepository
import org.springframework.stereotype.Service

interface FindPerson {
    fun byId(id: Long): Person

    @Service
    class FindPersonUseCase(
        private val personRepository: PersonRepository
    ) : FindPerson {
        override fun byId(id: Long) = personRepository.findById(id)
    }
}
