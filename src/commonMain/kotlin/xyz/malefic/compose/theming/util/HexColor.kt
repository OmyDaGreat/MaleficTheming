package xyz.malefic.compose.theming.util

import androidx.compose.ui.graphics.Color

/**
 * Parses a hex color string and returns a Color object.
 *
 * Note: This utility is now primarily for internal use. When using the DSL, you can pass Color objects directly.
 *
 * @param hex The hex color string to parse. It can be in the format of #RRGGBB or #AARRGGBB.
 * @return A Color object representing the parsed color.
 * @throws IllegalArgumentException If the hex string is not in a valid format.
 */
fun parseHexColor(hex: String): Color {
    val cleanedHex = hex.removePrefix("#")
    return when (cleanedHex.length) {
        6 -> {
            val colorValue = cleanedHex.toLong(16) or (0xFF000000)
            Color(colorValue.toInt())
        }

        8 -> {
            val colorValue = cleanedHex.toLong(16)
            Color(colorValue.toInt())
        }

        else -> {
            throw IllegalArgumentException("Invalid color hex string: $hex")
        }
    }
}

/**
 * Extension function to easily create Color from hex string in DSL.
 *
 * Example:
 * ```
 * themeConfig {
 *     primary = "#6200EE".toColor()
 * }
 * ```
 */
fun String.toColor(): Color = parseHexColor(this)
