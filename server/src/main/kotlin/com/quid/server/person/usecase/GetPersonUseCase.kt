package com.quid.server.person.usecase

import GetPersonUseCaseGrpc.GetPersonUseCaseImplBase
import PersonService.PersonGetRequest
import PersonService.PersonProto
import com.quid.client.person.domain.Person
import io.grpc.stub.StreamObserver
import org.springframework.stereotype.Service

@Service
class GetPersonUseCase : GetPersonUseCaseImplBase() {

    override fun getPerson(request: PersonGetRequest, responseObserver: StreamObserver<PersonProto>) {
        val person = Person(1,"QUID", "quid@test.com", "010-1111-2222")

        responseObserver.onNext(person.toPersonGrpc())
        responseObserver.onCompleted()
    }
}