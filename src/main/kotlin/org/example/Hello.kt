package org.example

import spark.Spark.get
import spark.Spark.port

//
//data class User(val name: String, val email: String, val id: Int);

fun main(args: Array<String>) {
    port(8080)
    get("/hello/:name") { request, response -> "Hello: " + request.params(":name")}
    get("/hello/") { request, response -> "Hello: Anonymous" }

}