package com.quid.client.person.gateway.grpc

import PersonService.PersonCreateRequest
import PersonService.PersonGetRequest
import PersonUseCaseGrpc.PersonUseCaseBlockingStub
import com.quid.client.person.domain.Person
import com.quid.client.person.domain.toDomain
import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.stereotype.Component

interface PersonGrpcClient {
    fun getPerson(id: Long): Person
    fun createPerson(request: PersonCreateRequest): Person

    @Component
    class PersonGrpcClientImpl : PersonGrpcClient {

        @GrpcClient("person")
        private lateinit var personClient: PersonUseCaseBlockingStub


        override fun getPerson(id: Long): Person =
            getPersonProtoRequest(id)
                .let { personClient.getPerson(it).toDomain() }

        override fun createPerson(request: PersonCreateRequest): Person =
            request.let { personClient.createPerson(it) }
                .toDomain()

        private fun getPersonProtoRequest(id: Long): PersonGetRequest? =
            PersonGetRequest.newBuilder()
                .setId(id)
                .build()
    }
}