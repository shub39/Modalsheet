package org.example.modalsheet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform