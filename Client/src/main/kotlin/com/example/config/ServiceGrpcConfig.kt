package com.example.config

import com.example.HelloServiceGrpc
import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import jakarta.inject.Singleton

@Factory
class ServiceGrpcConfig {

    @Singleton
    fun helloServiceConfig(@GrpcChannel("http://localhost:50051") channel: ManagedChannel): HelloServiceGrpc.HelloServiceBlockingStub? {
        return HelloServiceGrpc.newBlockingStub(channel)
    }

}