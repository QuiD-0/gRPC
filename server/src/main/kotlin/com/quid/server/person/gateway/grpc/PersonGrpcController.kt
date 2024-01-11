package com.quid.server.person.gateway.grpc

import PersonService.*
import PersonUseCaseGrpc.PersonUseCaseImplBase
import com.quid.server.person.usecase.CreatePerson
import com.quid.server.person.usecase.FindPerson
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class PersonGrpcController(
    private val findPerson: FindPerson,
    private val createPerson: CreatePerson
) : PersonUseCaseImplBase() {

    override fun getPerson(
        request: PersonGetRequest,
        responseObserver: StreamObserver<PersonProto>
    ) {
        findPerson.byId(request.id)
            .toPersonGrpc()
            .let { sendResponse(responseObserver, it) }
    }

    override fun createPerson(
        request: PersonCreateRequest,
        responseObserver: StreamObserver<PersonProto>
    ) {
        createPerson(request)
            .toPersonGrpc()
            .let { sendResponse(responseObserver, it) }
    }

    private fun <T> sendResponse(
        responseObserver: StreamObserver<T>,
        it: T
    ) {
        responseObserver.onNext(it)
        responseObserver.onCompleted()
    }

}