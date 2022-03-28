package com.example.controller

import com.example.HelloReply
import com.example.HelloRequest
import com.example.HelloServiceGrpc
import com.example.dto.HelloDto
import com.example.util.converteParaDto
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller
class HelloGrpcController(val helloService: HelloServiceGrpc.HelloServiceBlockingStub) {

    @Get("/hello")
    fun hello(@QueryValue nome: String): HelloDto? {
        val request: HelloRequest = HelloRequest.newBuilder().setName(nome).build()
        val response: HelloReply = helloService.sendHello(request)
        return response.converteParaDto();
    }

}