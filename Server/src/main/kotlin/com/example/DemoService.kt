package com.example

import com.google.protobuf.Empty
import io.grpc.stub.StreamObserver
import jakarta.inject.Singleton

@Singleton
class DemoService() : DemoServiceGrpc.DemoServiceImplBase() {

    override fun send(request: Empty?, responseObserver: StreamObserver<DemoReply>?) {
        for (i in 1..100) {
            Thread.sleep(1500)
            val message = DemoReply.newBuilder().setMessage("${i}%...").build()
            responseObserver?.onNext(message)
        }

        responseObserver?.onNext(DemoReply.newBuilder().setMessage("Download concluído!!").build())
        responseObserver?.onCompleted();
    }

}