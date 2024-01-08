package com.quid.server.usecase

import GetPersonUseCaseGrpc.GetPersonUseCaseImplBase
import PersonOuterClass.Person
import PersonService.PersonGetRequest
import PhoneNumberOuterClass.PhoneNumber
import PhoneTypeOuterClass.PhoneType
import io.grpc.stub.StreamObserver
import org.springframework.stereotype.Service

@Service
class GetPersonUseCase : GetPersonUseCaseImplBase() {

    override fun getPerson(request: PersonGetRequest, responseObserver: StreamObserver<Person>) {
        val person = Person.newBuilder()
            .setId(1)
            .setName("QuiD")
            .setEmail("test@mail.com")
            .addPhones(
                PhoneNumber.newBuilder()
                    .setNumber("123456789")
                    .build()
            ).build()

        responseObserver.onNext(person)
        responseObserver.onCompleted()
    }
}