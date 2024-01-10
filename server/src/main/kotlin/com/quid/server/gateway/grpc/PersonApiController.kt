package com.quid.server.gateway.grpc

import GetPersonUseCaseGrpc
import PersonOuterClass.Person
import PersonService.PersonGetRequest
import com.quid.server.usecase.GetPersonUseCase
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class PersonApiController(
    private val getPersonUseCase: GetPersonUseCase
) : GetPersonUseCaseGrpc.GetPersonUseCaseImplBase() {

    override fun getPerson(request: PersonGetRequest, responseObserver: StreamObserver<Person>) {
        getPersonUseCase.getPerson(request, responseObserver)
    }
}