package com.quid.server

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
            .setName("John Doe")
            .setEmail("test@mail.com")
            .setPhones(
                0,
                PhoneNumber.newBuilder()
                    .setNumber("123456789")
                    .setType(PhoneType.MOBILE)
                    .build()
            )
            .build()

        responseObserver.onNext(person)
        responseObserver.onCompleted()
    }
}