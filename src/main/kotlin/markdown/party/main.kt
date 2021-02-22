package markdown.party

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

/**
 * The main entry point of the application.
 */
fun main() {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 1234
    val server = embeddedServer(Netty, port = port) {
        routing {
            get { call.respondText("Hello world.") }
        }
    }
    server.start(wait = true)
}
