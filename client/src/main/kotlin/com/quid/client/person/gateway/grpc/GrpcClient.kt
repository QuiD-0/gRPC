package com.quid.client.person.gateway.grpc

import GetPersonUseCaseGrpc.GetPersonUseCaseBlockingStub
import PersonService.PersonGetRequest
import com.quid.client.person.domain.Person
import com.quid.client.person.domain.toDomain
import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.stereotype.Component

interface PersonGrpcClient {
    fun getPerson(id: String): Person

    @Component
    class PersonGrpcClientImpl : PersonGrpcClient {

        @GrpcClient("person")
        private lateinit var personClient: GetPersonUseCaseBlockingStub

        override fun getPerson(id: String): Person =
            PersonGetRequest.newBuilder()
                .setId(id)
                .build()
                .let { personClient.getPerson(it).toDomain() }
    }
}