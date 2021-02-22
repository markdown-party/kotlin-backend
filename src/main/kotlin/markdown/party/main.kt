@file:JvmName("Main")

package markdown.party

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

/**
 * Returns the port number to use when running the web application. Defaults to 1234 if no port is
 * specified.
 */
private val Port = System.getenv("PORT")?.toIntOrNull() ?: 1234

/**
 * The main entry point of the application.
 */
fun main() {
    val server = embeddedServer(Netty, port = Port) {
        routing {
            get { call.respondText("Hello world.") }
        }
    }
    server.start(wait = true)
}
