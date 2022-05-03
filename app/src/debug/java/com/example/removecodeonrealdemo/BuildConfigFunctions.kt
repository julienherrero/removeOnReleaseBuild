package com.example.removecodeonrealdemo

inline fun debugOnly(block: () -> Unit) {
    block()
}

@Suppress("UNUSED_PARAMETER")
inline fun releaseOnly(block: () -> Unit) {
    // do nothing in debug build
}

@Suppress("UNUSED_PARAMETER")
inline fun ifDebugElseRelease(blockDebug: () -> Unit, blockRelease: () -> Unit) {
    blockDebug()
}
