package com.quid.server.usecase

import GetPersonUseCaseGrpc.GetPersonUseCaseImplBase
import PersonService.PersonGetRequest
import PersonService.PersonProto
import io.grpc.stub.StreamObserver
import org.springframework.stereotype.Service

@Service
class GetPersonUseCase : GetPersonUseCaseImplBase() {

    override fun getPerson(request: PersonGetRequest, responseObserver: StreamObserver<PersonProto>) {
        val person = PersonProto.newBuilder()
            .setId(1)
            .setName("QuiD")
            .setEmail("test@mail.com")
            .addPhones(
                PersonService.PhoneNumberProto.newBuilder()
                    .setNumber("123456789")
                    .build()
            ).build()

        responseObserver.onNext(person)
        responseObserver.onCompleted()
    }
}