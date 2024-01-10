package com.quid.client.person.gateway.web

import com.quid.client.person.domain.Person
import com.quid.client.person.gateway.grpc.PersonGrpcClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/person")
class PersonCallController(
    private val personGrpcClient: PersonGrpcClient
) {

    @GetMapping("/{id}")
    fun getPerson(@PathVariable id: String): Person =
        personGrpcClient.getPerson(id)

}