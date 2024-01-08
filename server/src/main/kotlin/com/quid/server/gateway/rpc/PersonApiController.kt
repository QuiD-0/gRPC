package com.quid.server.gateway.rpc

import PersonOuterClass.Person
import PhoneNumberOuterClass.PhoneNumber
import PhoneTypeOuterClass.PhoneType
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class PersonApiController {

    fun getPerson(id: Int, response: StreamObserver<Person>) {
        response.onNext(
            getPerson(id)
        )
        response.onCompleted()
    }

    private fun getPerson(id: Int): Person =
        Person.newBuilder()
            .setId(id)
            .setName("Person $id")
            .setEmail("test@mail.com")
            .setPhones(
                1,
                PhoneNumber.newBuilder()
                    .setNumber("123456789")
                    .setType(PhoneType.MOBILE)
                    .build()
            )
            .build()
}