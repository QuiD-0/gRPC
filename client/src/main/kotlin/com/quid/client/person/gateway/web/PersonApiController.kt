package com.quid.client.person.gateway.web

import com.quid.client.person.domain.Person
import com.quid.client.person.gateway.grpc.PersonGrpcClient
import com.quid.client.person.gateway.web.request.CreatePersonRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person")
class PersonApiController(
    private val personGrpcClient: PersonGrpcClient
) {

    @GetMapping("/{id}")
    fun getPerson(@PathVariable id: String): Person =
        personGrpcClient.getPerson(id)

    @PostMapping
    fun createPerson(@RequestBody request: CreatePersonRequest): Person =
        personGrpcClient.createPerson(request)

}