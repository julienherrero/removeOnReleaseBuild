package com.example.removecodeonrealdemo

inline fun debugOnly(block: () -> Unit) {
    block()
}