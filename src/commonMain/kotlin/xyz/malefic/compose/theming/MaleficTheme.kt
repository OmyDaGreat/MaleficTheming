package xyz.malefic.compose.theming

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

/**
 * Applies the Malefic theme using Material 3 design to the given content.
 *
 * You can create themes easily using the DSL:
 * ```
 * MaleficTheme(
 *     theme = themeConfig {
 *         primary = Color(0xFF6200EE)
 *         background = Color.White
 *         // Other colors are automatically derived
 *     }
 * ) {
 *     // Your content
 * }
 * ```
 *
 * Or pass a pre-built ThemeConfig directly.
 *
 * @param theme The configuration for the theme. Can be created using themeConfig DSL.
 * @param content The composable content to which the theme will be applied.
 */
@Composable
fun MaleficTheme(
    theme: ThemeConfig = themeConfig {},
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme =
            ColorScheme(
                primary = theme.primary,
                onPrimary = theme.onPrimary,
                primaryContainer = theme.primaryContainer,
                onPrimaryContainer = theme.onPrimaryContainer,
                inversePrimary = theme.inversePrimary,
                secondary = theme.secondary,
                onSecondary = theme.onSecondary,
                secondaryContainer = theme.secondaryContainer,
                onSecondaryContainer = theme.onSecondaryContainer,
                tertiary = theme.tertiary,
                onTertiary = theme.onTertiary,
                tertiaryContainer = theme.tertiaryContainer,
                onTertiaryContainer = theme.onTertiaryContainer,
                background = theme.background,
                onBackground = theme.onBackground,
                surface = theme.surface,
                onSurface = theme.onSurface,
                surfaceVariant = theme.surfaceVariant,
                onSurfaceVariant = theme.onSurfaceVariant,
                surfaceTint = theme.surfaceTint,
                inverseSurface = theme.inverseSurface,
                inverseOnSurface = theme.inverseOnSurface,
                error = theme.error,
                onError = theme.onError,
                errorContainer = theme.errorContainer,
                onErrorContainer = theme.onErrorContainer,
                outline = theme.outline,
                outlineVariant = theme.outlineVariant,
                scrim = theme.scrim,
                surfaceBright = theme.surfaceBright,
                surfaceDim = theme.surfaceDim,
                surfaceContainer = theme.surfaceContainer,
                surfaceContainerHigh = theme.surfaceContainerHigh,
                surfaceContainerHighest = theme.surfaceContainerHighest,
                surfaceContainerLow = theme.surfaceContainerLow,
                surfaceContainerLowest = theme.surfaceContainerLowest,
                primaryFixed = theme.primaryFixed,
                primaryFixedDim = theme.primaryFixedDim,
                onPrimaryFixed = theme.onPrimaryFixed,
                onPrimaryFixedVariant = theme.onPrimaryFixedVariant,
                secondaryFixed = theme.onSecondaryFixed,
                secondaryFixedDim = theme.secondaryFixedDim,
                onSecondaryFixed = theme.onSecondaryFixed,
                onSecondaryFixedVariant = theme.onSecondaryFixedVariant,
                tertiaryFixed = theme.tertiaryFixed,
                tertiaryFixedDim = theme.tertiaryFixedDim,
                onTertiaryFixed = theme.onTertiaryFixed,
                onTertiaryFixedVariant = theme.onTertiaryFixedVariant,
            ),
        typography = MaterialTheme.typography,
        shapes = MaterialTheme.shapes,
        content = content,
    )
}
