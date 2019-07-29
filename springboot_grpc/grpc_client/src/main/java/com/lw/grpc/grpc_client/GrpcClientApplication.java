package com.lw.grpc.grpc_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcClientApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(GrpcClientApplication.class, args);
        grpcClient client = new grpcClient("127.0.0.1", 8888);
        try {
            String user = "lw";
            if (args.length > 0) {
                user = args[0];
            }
            client.greet(user);
        } finally {
            client.shutdown();
        }
    }

}
