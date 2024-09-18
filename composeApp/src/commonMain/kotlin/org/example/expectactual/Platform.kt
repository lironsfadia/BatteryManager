package org.example.expectactual

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform