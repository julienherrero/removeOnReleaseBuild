package com.example.removecodeonrealdemo

@Suppress("UNUSED_PARAMETER")
inline fun debugOnly(block: () -> Unit) {
    // do nothing in release build
}

inline fun releaseOnly(block: () -> Unit) {
    block()
}

@Suppress("UNUSED_PARAMETER")
inline fun ifDebugElseRelease(blockDebug: () -> Unit, blockRelease: () -> Unit) {
    blockRelease()
}
