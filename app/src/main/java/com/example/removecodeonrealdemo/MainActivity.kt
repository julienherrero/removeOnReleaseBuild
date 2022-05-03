package com.example.removecodeonrealdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        debugOnly {
            Log.d("MainActivity", "This is for debug build (debugOnly)")
        }

        releaseOnly {
            Log.d("MainActivity", "This is for release build (releaseOnly)")
        }

        ifDebugElseRelease({ Log.d("MainActivity", "This is for debug build (ifDebugElseRelease)") }) {
            Log.d(
                "MainActivity",
                "This is for release build (ifDebugElseRelease)"
            )
        }
    }
}
