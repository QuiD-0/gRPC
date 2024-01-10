package com.quid.client.gateway.grpc

import GetPersonUseCaseGrpc
import PersonOuterClass.Person
import PersonService
import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.stereotype.Component

interface PersonGrpcClient {
    fun getPerson(id: String)

    @Component
    class PersonGrpcClientImpl : PersonGrpcClient {

        @GrpcClient("person")
        private lateinit var personClient: GetPersonUseCaseGrpc.GetPersonUseCaseBlockingStub

        override fun getPerson(id: String) {
            val request = PersonService.PersonGetRequest.newBuilder()
                .setId(id)
                .build()

            val person = personClient.getPerson(request)
            println(person)
        }
    }
}