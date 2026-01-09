package xyz.malefic.compose.theming

import androidx.compose.ui.graphics.Color

/**
 * Data class representing the theme configuration for the application using Material 3 color scheme.
 *
 * @property primary The primary color of the theme.
 * @property onPrimary The color used for text and icons displayed on top of the primary color.
 * @property primaryContainer The primary container color of the theme.
 * @property onPrimaryContainer The color used for text and icons displayed on top of the primary container.
 * @property secondary The secondary color of the theme.
 * @property onSecondary The color used for text and icons displayed on top of the secondary color.
 * @property secondaryContainer The secondary container color of the theme.
 * @property onSecondaryContainer The color used for text and icons displayed on top of the secondary container.
 * @property tertiary The tertiary color of the theme.
 * @property onTertiary The color used for text and icons displayed on top of the tertiary color.
 * @property tertiaryContainer The tertiary container color of the theme.
 * @property onTertiaryContainer The color used for text and icons displayed on top of the tertiary container.
 * @property error The error color of the theme.
 * @property onError The color used for text and icons displayed on top of the error color.
 * @property errorContainer The error container color of the theme.
 * @property onErrorContainer The color used for text and icons displayed on top of the error container.
 * @property background The background color of the theme.
 * @property onBackground The color used for text and icons displayed on top of the background color.
 * @property surface The surface color of the theme.
 * @property onSurface The color used for text and icons displayed on top of the surface color.
 * @property surfaceTint The surface tint color of the theme.
 * @property surfaceVariant The surface variant color of the theme.
 * @property onSurfaceVariant The color used for text and icons displayed on top of the surface variant.
 * @property outline The outline color of the theme.
 * @property outlineVariant The outline variant color of the theme.
 * @property scrim The scrim color of the theme.
 * @property inverseSurface The inverse surface color of the theme.
 * @property inverseOnSurface The color used for text and icons displayed on top of the inverse surface.
 * @property inversePrimary The inverse primary color of the theme.
 * @property surfaceDim The dim surface color of the theme.
 * @property surfaceBright The bright surface color of the theme.
 * @property surfaceContainerLowest The lowest surface container color of the theme.
 * @property surfaceContainerLow The low surface container color of the theme.
 * @property surfaceContainer The surface container color of the theme.
 * @property surfaceContainerHigh The high surface container color of the theme.
 * @property surfaceContainerHighest The highest surface container color of the theme.
 * @property primaryFixed The primary fixed color of the theme.
 * @property primaryFixedDim The dim primary fixed color of the theme.
 * @property onPrimaryFixed The color used for text and icons displayed on top of the primary fixed color.
 * @property onPrimaryFixedVariant The color used for text and icons displayed on top of the primary fixed variant.
 * @property secondaryFixed The secondary fixed color of the theme.
 * @property secondaryFixedDim The dim secondary fixed color of the theme.
 * @property onSecondaryFixed The color used for text and icons displayed on top of the secondary fixed color.
 * @property onSecondaryFixedVariant The color used for text and icons displayed on top of the secondary fixed variant.
 * @property tertiaryFixed The tertiary fixed color of the theme.
 * @property tertiaryFixedDim The dim tertiary fixed color of the theme.
 * @property onTertiaryFixed The color used for text and icons displayed on top of the tertiary fixed color.
 * @property onTertiaryFixedVariant The color used for text and icons displayed on top of the tertiary fixed variant.
 */
data class ThemeConfig(
    val primary: Color,
    val onPrimary: Color,
    val primaryContainer: Color,
    val onPrimaryContainer: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryContainer: Color,
    val onSecondaryContainer: Color,
    val tertiary: Color,
    val onTertiary: Color,
    val tertiaryContainer: Color,
    val onTertiaryContainer: Color,
    val error: Color,
    val onError: Color,
    val errorContainer: Color,
    val onErrorContainer: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val surfaceTint: Color,
    val outline: Color,
    val outlineVariant: Color,
    val scrim: Color,
    val inverseSurface: Color,
    val inverseOnSurface: Color,
    val inversePrimary: Color,
    val surfaceDim: Color,
    val surfaceBright: Color,
    val surfaceContainerLowest: Color,
    val surfaceContainerLow: Color,
    val surfaceContainer: Color,
    val surfaceContainerHigh: Color,
    val surfaceContainerHighest: Color,
    val primaryFixed: Color,
    val primaryFixedDim: Color,
    val onPrimaryFixed: Color,
    val onPrimaryFixedVariant: Color,
    val secondaryFixed: Color,
    val secondaryFixedDim: Color,
    val onSecondaryFixed: Color,
    val onSecondaryFixedVariant: Color,
    val tertiaryFixed: Color,
    val tertiaryFixedDim: Color,
    val onTertiaryFixed: Color,
    val onTertiaryFixedVariant: Color,
)

@DslMarker
annotation class ThemeConfigDsl

/**
 * DSL Builder for creating ThemeConfig with intelligent defaults.
 * Only requires primary and background colors - all other colors are derived with sensible defaults.
 */
@ThemeConfigDsl
class ThemeConfigBuilder {
    var primary: Color? = null
    var onPrimary: Color? = null
    var primaryContainer: Color? = null
    var onPrimaryContainer: Color? = null

    var secondary: Color? = null
    var onSecondary: Color? = null
    var secondaryContainer: Color? = null
    var onSecondaryContainer: Color? = null

    var tertiary: Color? = null
    var onTertiary: Color? = null
    var tertiaryContainer: Color? = null
    var onTertiaryContainer: Color? = null

    var error: Color? = null
    var onError: Color? = null
    var errorContainer: Color? = null
    var onErrorContainer: Color? = null

    var background: Color? = null
    var onBackground: Color? = null

    var surface: Color? = null
    var onSurface: Color? = null
    var surfaceVariant: Color? = null
    var onSurfaceVariant: Color? = null
    var surfaceTint: Color? = null

    var outline: Color? = null
    var outlineVariant: Color? = null
    var scrim: Color? = null

    var inverseSurface: Color? = null
    var inverseOnSurface: Color? = null
    var inversePrimary: Color? = null

    var surfaceDim: Color? = null
    var surfaceBright: Color? = null
    var surfaceContainerLowest: Color? = null
    var surfaceContainerLow: Color? = null
    var surfaceContainer: Color? = null
    var surfaceContainerHigh: Color? = null
    var surfaceContainerHighest: Color? = null

    var primaryFixed: Color? = null
    var primaryFixedDim: Color? = null
    var onPrimaryFixed: Color? = null
    var onPrimaryFixedVariant: Color? = null

    var secondaryFixed: Color? = null
    var secondaryFixedDim: Color? = null
    var onSecondaryFixed: Color? = null
    var onSecondaryFixedVariant: Color? = null

    var tertiaryFixed: Color? = null
    var tertiaryFixedDim: Color? = null
    var onTertiaryFixed: Color? = null
    var onTertiaryFixedVariant: Color? = null

    fun build(): ThemeConfig {
        val primaryColor = primary ?: Color(0xFF6200EE)
        val bgColor = background ?: Color.White
        val surfaceColor = surface ?: bgColor
        val secondaryColor = secondary ?: primaryColor.copy(alpha = 0.7f)
        val errorColor = error ?: Color(0xFFB00020)

        val onPrimaryColor = onPrimary ?: Color.White
        val onBgColor = onBackground ?: Color.Black
        val onSurfaceColor = onSurface ?: onBgColor
        val onSecondaryColor = onSecondary ?: Color.White
        val onErrorColor = onError ?: Color.White

        return ThemeConfig(
            primary = primaryColor,
            onPrimary = onPrimaryColor,
            primaryContainer = primaryContainer ?: primaryColor,
            onPrimaryContainer = onPrimaryContainer ?: onPrimaryColor,
            secondary = secondaryColor,
            onSecondary = onSecondaryColor,
            secondaryContainer = secondaryContainer ?: secondaryColor,
            onSecondaryContainer = onSecondaryContainer ?: onSecondaryColor,
            tertiary = tertiary ?: secondaryColor,
            onTertiary = onTertiary ?: onSecondaryColor,
            tertiaryContainer = tertiaryContainer ?: secondaryColor,
            onTertiaryContainer = onTertiaryContainer ?: onSecondaryColor,
            error = errorColor,
            onError = onErrorColor,
            errorContainer = errorContainer ?: errorColor,
            onErrorContainer = onErrorContainer ?: onErrorColor,
            background = bgColor,
            onBackground = onBgColor,
            surface = surfaceColor,
            onSurface = onSurfaceColor,
            surfaceVariant = surfaceVariant ?: surfaceColor,
            onSurfaceVariant = onSurfaceVariant ?: onSurfaceColor,
            surfaceTint = surfaceTint ?: primaryColor,
            outline = outline ?: onSurfaceColor.copy(alpha = 0.12f),
            outlineVariant = outlineVariant ?: onSurfaceColor.copy(alpha = 0.06f),
            scrim = scrim ?: Color.Black,
            inverseSurface = inverseSurface ?: onSurfaceColor,
            inverseOnSurface = inverseOnSurface ?: surfaceColor,
            inversePrimary = inversePrimary ?: primaryColor,
            surfaceDim = surfaceDim ?: surfaceColor,
            surfaceBright = surfaceBright ?: surfaceColor,
            surfaceContainerLowest = surfaceContainerLowest ?: surfaceColor,
            surfaceContainerLow = surfaceContainerLow ?: surfaceColor,
            surfaceContainer = surfaceContainer ?: surfaceColor,
            surfaceContainerHigh = surfaceContainerHigh ?: surfaceColor,
            surfaceContainerHighest = surfaceContainerHighest ?: surfaceColor,
            primaryFixed = primaryFixed ?: primaryColor,
            primaryFixedDim = primaryFixedDim ?: primaryColor,
            onPrimaryFixed = onPrimaryFixed ?: onPrimaryColor,
            onPrimaryFixedVariant = onPrimaryFixedVariant ?: onPrimaryColor,
            secondaryFixed = secondaryFixed ?: secondaryColor,
            secondaryFixedDim = secondaryFixedDim ?: secondaryColor,
            onSecondaryFixed = onSecondaryFixed ?: onSecondaryColor,
            onSecondaryFixedVariant = onSecondaryFixedVariant ?: onSecondaryColor,
            tertiaryFixed = tertiaryFixed ?: secondaryColor,
            tertiaryFixedDim = tertiaryFixedDim ?: secondaryColor,
            onTertiaryFixed = onTertiaryFixed ?: onSecondaryColor,
            onTertiaryFixedVariant = onTertiaryFixedVariant ?: onSecondaryColor,
        )
    }
}

/**
 * Creates a ThemeConfig using a type-safe DSL with intelligent defaults.
 * Only primary color is required - all other colors have sensible defaults.
 *
 * Example:
 * ```
 * val theme = themeConfig {
 *     primary = Color(0xFF6200EE)
 *     background = Color.White
 *     // All other colors are automatically derived
 * }
 * ```
 */
fun themeConfig(block: ThemeConfigBuilder.() -> Unit): ThemeConfig = ThemeConfigBuilder().apply(block).build()
