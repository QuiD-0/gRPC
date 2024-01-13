package com.quid.client.person.gateway.grpc

import PersonService.*
import PersonUseCaseGrpc.PersonUseCaseBlockingStub
import com.google.protobuf.Empty
import com.quid.client.person.domain.Person
import com.quid.client.person.domain.toDomain
import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.stereotype.Component

interface PersonGrpcClient {
    fun getPerson(): List<Person>
    fun getPersonById(id: Long): Person
    fun createPerson(request: PersonCreateRequest): Empty
    fun deletePerson(id: Long): Empty

    @Component
    class PersonGrpcClientImpl : PersonGrpcClient {

        @GrpcClient("person")
        private lateinit var personClient: PersonUseCaseBlockingStub

        override fun getPerson(): List<Person> =
            personClient.getPerson(Empty.getDefaultInstance())
                .asSequence()
                .map { it.toDomain() }
                .toList()

        override fun getPersonById(id: Long): Person =
            personClient.getPersonById(toPersonGetRpcRequest(id))
                .toDomain()

        override fun createPerson(request: PersonCreateRequest): Empty =
            personClient.createPerson(request)

        override fun deletePerson(id: Long): Empty=
            personClient.deletePerson(toPersonCreateRpcRequest(id))


        private fun toPersonGetRpcRequest(id: Long): PersonGetRequest =
            PersonGetRequest.newBuilder()
                .setId(id)
                .build()

        private fun toPersonCreateRpcRequest(id: Long): PersonDeleteRequest =
            PersonDeleteRequest.newBuilder()
                .setId(id)
                .build()
    }
}