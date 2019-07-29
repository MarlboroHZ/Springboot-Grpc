package com.lw.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(GrpcServerApplication.class, args);
        grpcServer server = new grpcServer();
        server.start();
        server.blockUntilShutdown();
    }

}
