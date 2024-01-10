package com.quid.client.person.domain

import PersonService.PhoneNumberProto


data class PhoneNumber(
    val number: String
){

    fun toPhoneNumberGrpc(): PhoneNumberProto {
        return PhoneNumberProto.newBuilder()
            .setNumber(number)
            .build()
    }
}

fun PhoneNumberProto.toDomain(): PhoneNumber {
    return PhoneNumber(
        number = number
    )
}