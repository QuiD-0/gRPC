package com.quid.client.person.domain

import PersonService.PersonProto


data class Person(
    val id: Long,
    val name: String,
    val email: String,
    val phones: List<PhoneNumber>
) {
    constructor(id: Long, name: String, email: String, phoneNumber: String) : this(
        id = id,
        name = name,
        email = email,
        phones = listOf(PhoneNumber(phoneNumber))
    )

    fun toPersonGrpc(): PersonProto {
        return PersonProto.newBuilder()
            .setId(id)
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

