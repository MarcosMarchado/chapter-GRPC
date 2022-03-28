package com.example

import io.grpc.stub.StreamObserver
import jakarta.inject.Singleton

@Singleton
class HelloService (): HelloServiceGrpc.HelloServiceImplBase() {

    override fun sendHello(request: HelloRequest?, responseObserver: StreamObserver<HelloReply>?) {

        var message = HelloReply.newBuilder().setMessage("Hello world "+ request?.name).build()

        responseObserver?.onNext(message)
        responseObserver?.onCompleted()
    }
}