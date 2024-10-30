package com.badminton


import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: 8080) {
        routing {
            static("/") {
                files("frontend/build")
            }
            get("/") {
                call.respondText("Hello World from Kotlin!", ContentType.Text.Plain)
            }
        }
    }.start(wait = true)
}
