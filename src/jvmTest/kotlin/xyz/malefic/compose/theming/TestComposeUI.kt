package xyz.malefic.compose.theming

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import xyz.malefic.compose.theming.util.toColor

object TestComposeUI {
    @Composable
    fun ThemeToggleExampleComposable() {
        var isLightTheme by remember { mutableStateOf(true) }

        // Create theme configurations for light and dark themes using DSL
        val lightTheme =
            themeConfig {
                primary = "#6200EE".toColor()
                secondary = "#03DAC6".toColor()
                background = Color.White
                surface = Color.White
                error = "#B00020".toColor()
                onPrimary = Color.White
                onSecondary = Color.Black
                onBackground = Color.Black
                onSurface = Color.Black
                onError = Color.White
            }

        val darkTheme =
            themeConfig {
                primary = "#BB86FC".toColor()
                secondary = "#03DAC6".toColor()
                background = "#121212".toColor()
                surface = "#121212".toColor()
                error = "#CF6679".toColor()
                onPrimary = Color.Black
                onSecondary = Color.Black
                onBackground = Color.White
                onSurface = Color.White
                onError = Color.Black
            }

        val currentTheme = if (isLightTheme) lightTheme else darkTheme

        // Apply the theme using the MaleficTheme function
        MaleficTheme(currentTheme) {
            Box(
                modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
                contentAlignment = Alignment.Center,
            ) {
                Button(
                    onClick = { isLightTheme = !isLightTheme },
                ) {
                    Text(
                        text = if (isLightTheme) "Switch to Dark Mode" else "Switch to Light Mode",
                        color = MaterialTheme.colorScheme.onPrimary,
                    )
                }
            }
        }
    }
}

fun main() =
    application {
        Window(title = "Test Composable UI: Theme Toggle", onCloseRequest = ::exitApplication) {
            TestComposeUI.ThemeToggleExampleComposable()
        }
    }
