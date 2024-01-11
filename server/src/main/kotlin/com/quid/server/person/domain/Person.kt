package com.quid.server.person.domain

import PersonService.PersonProto


data class Person(
    val id: Long? = null,
    val name: String,
    val email: String,
    val phones: List<PhoneNumber>
) {
    constructor(request: PersonService.PersonCreateRequest) : this(
        name = request.name,
        email = request.email,
        phones = request.phoneNumbersList.map { PhoneNumber(it) }
    )

    fun toPersonGrpc(): PersonProto {
        return PersonProto.newBuilder()
            .setId(id!!)
            .setName(name)
            .setEmail(email)
            .addAllPhones(phones.map { it.toPhoneNumberGrpc() })
            .build()
    }
}

fun PersonProto.toDomain(): Person {
    return Person(
        id = id,
        name = name,
        email = email,
        phones = phonesList.map { it.toDomain() }
    )
}

