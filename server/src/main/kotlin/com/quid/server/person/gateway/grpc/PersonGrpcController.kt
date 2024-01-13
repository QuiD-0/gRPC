package com.quid.server.person.gateway.grpc

import PersonService.*
import PersonUseCaseGrpc.PersonUseCaseImplBase
import com.google.protobuf.Empty
import com.quid.server.person.usecase.CreatePerson
import com.quid.server.person.usecase.DeletePerson
import com.quid.server.person.usecase.FindPerson
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class PersonGrpcController(
    private val findPerson: FindPerson,
    private val createPerson: CreatePerson,
    private val deletePerson: DeletePerson
) : PersonUseCaseImplBase() {

    override fun getPerson(request: Empty, responseObserver: StreamObserver<PersonProto>) {
        findPerson.all()
            .map { it.toPersonGrpc() }
            .forEach { responseObserver.onNext(it) }
            .also { responseObserver.onCompleted() }
    }

    override fun getPersonById(request: PersonGetRequest, responseObserver: StreamObserver<PersonProto>) {
        findPerson.byId(request.id)
            .toPersonGrpc()
            .also { responseObserver.onNext(it) }
            .also { responseObserver.onCompleted() }
    }

    override fun createPerson(
        request: PersonCreateRequest,
        responseObserver: StreamObserver<Empty>
    ) {
        createPerson(request)
            .also { responseObserver.onNext(Empty.getDefaultInstance()) }
            .also { responseObserver.onCompleted() }
    }

    override fun deletePerson(request: PersonDeleteRequest?, responseObserver: StreamObserver<Empty>) {
        deletePerson(request!!.id)
            .also { responseObserver.onNext(Empty.getDefaultInstance()) }
            .also { responseObserver.onCompleted() }
    }
}