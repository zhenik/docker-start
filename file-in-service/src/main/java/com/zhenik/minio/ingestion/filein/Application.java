package com.zhenik.minio.ingestion.filein;


import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        String serviceId = UUID.randomUUID().toString();
        ServerBuilder sb = Server.builder();
        sb.http(8080);
        sb.service("/healthcheck", (ctx, res) -> HttpResponse.of("OK " + serviceId));
        sb.annotatedService(new FileInService());
        Server server = sb.build();
        CompletableFuture<Void> future = server.start();
        future.join();
    }
}
