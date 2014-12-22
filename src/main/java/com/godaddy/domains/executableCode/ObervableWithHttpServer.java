package com.godaddy.domains.executableCode;

import org.vertx.java.core.Handler;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.VertxFactory;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.http.HttpClientResponse;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.http.RouteMatcher;
import rx.Observable;
import rx.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by agupta on 12/22/2014.
 */
public class ObervableWithHttpServer extends BaseClass {

    public void runCode() {
        System.out.println("***********************************************");
        System.out.println("Using vertx handler");


        VertxFactory.newVertx().createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
            public void handle(HttpServerRequest req) {
                System.out.println("Got request: " + req.uri());
                System.out.println("Headers are: ");
                for (Map.Entry<String, String> entry : req.headers()) {
                    System.out.println(entry.getKey() + ":" + entry.getValue());
                }
                req.response().headers().set("Content-Type", "text/html; charset=UTF-8");
                req.response().end("<html><body><h1>Hello from vert.x!</h1></body></html>");
            }
        }).listen(8080);


        VertxFactory.newVertx().createHttpClient().setPort(8080).setHost("localhost").getNow("/", new Handler<HttpClientResponse>() {
            public void handle(HttpClientResponse response) {
                response.bodyHandler(data -> {
                    System.out.println(data);
                });
            }
        });


    }


    public ArrayList<String> getList(String text){
        return new ArrayList<String>();
    }
}
