package com.quid.client.person.gateway.web.request

import PersonService.PersonCreateRequest

data class CreatePersonRequest(
    val name: String,
    val email: String,
    val phoneNumber: List<String>
){
    fun toPersonGrpc(): PersonCreateRequest {
        return PersonCreateRequest.newBuilder()
            .setName(name)
            .setEmail(email)
            .addAllPhoneNumbers(phoneNumber)
            .build()
    }
}
