package com.quid.server.person.gateway.grpc

import PersonService
import PersonService.PersonProto
import PersonUseCaseGrpc
import com.quid.server.person.usecase.PersonUseCase
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class PersonGrpcController(
    private val personUseCase: PersonUseCase
) : PersonUseCaseGrpc.PersonUseCaseImplBase() {

    override fun getPerson(
        request: PersonService.PersonGetRequest,
        responseObserver: StreamObserver<PersonProto>
    ) {
        personUseCase.getPerson(request.id)
            .toPersonGrpc()
            .let {
                responseObserver.onNext(it)
                responseObserver.onCompleted()
            }

    }

    override fun createPerson(
        request: PersonService.PersonCreateRequest,
        responseObserver: StreamObserver<PersonProto>
    ) {
        personUseCase.createPerson(request)
            .toPersonGrpc()
            .let {
                responseObserver.onNext(it)
                responseObserver.onCompleted()
            }
    }

}