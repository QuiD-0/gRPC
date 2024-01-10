package com.quid.server.person.gateway.grpc

import GetPersonUseCaseGrpc
import PersonService
import PersonService.PersonProto
import com.quid.server.person.usecase.GetPersonUseCase
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class PersonApiController(
    private val getPersonUseCase: GetPersonUseCase
) : GetPersonUseCaseGrpc.GetPersonUseCaseImplBase() {

    override fun getPerson(
        request: PersonService.PersonGetRequest,
        responseObserver: StreamObserver<PersonProto>
    ) {
        getPersonUseCase.getPerson(request, responseObserver)
    }
}