package com.quid.server.person.usecase

import com.quid.server.person.gateway.repository.PersonRepository
import org.springframework.stereotype.Service

interface DeletePerson {
    operator fun invoke(id: Long)

    @Service
    class DeletePersonUseCase(
        private val repository: PersonRepository
    ) : DeletePerson {
        override fun invoke(id: Long) {
            repository.deleteById(id)
        }
    }
}