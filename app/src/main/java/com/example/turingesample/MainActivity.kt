package com.example.turingesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.turingesample.ui.theme.TuringEsampleTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.Color
import com.example.turingesample.ui.components.StaggeredGrid
import com.example.turingesample.ui.components.StaggeredTile

class MainActivity : ComponentActivity() {

    private companion object {
        val STAGGERED_TILES = listOf(
            StaggeredTile(2, 2, Color.Green, Icons.Default.Call),
            StaggeredTile(2, 1, Color.Blue, Icons.Default.DateRange),
            StaggeredTile(1, 2, Color.Cyan, Icons.Default.Star),
            StaggeredTile(1, 1, Color.Gray, Icons.Default.Call),
            StaggeredTile(2, 2, Color.Red, Icons.Default.Build),
            StaggeredTile(1, 2, Color.Yellow, Icons.Default.Person),
            StaggeredTile(1, 1, Color.Green, Icons.Default.Edit),
            StaggeredTile(3, 1, Color.Blue, Icons.Default.Done),
            StaggeredTile(1, 1, Color.Cyan, Icons.Default.Notifications),
            StaggeredTile(4, 1, Color.Red, Icons.Default.Favorite)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TuringEsampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StaggeredGrid(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        tiles = STAGGERED_TILES
                    ) { tile ->

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TuringEsampleTheme {
        Greeting("Android")
    }
}