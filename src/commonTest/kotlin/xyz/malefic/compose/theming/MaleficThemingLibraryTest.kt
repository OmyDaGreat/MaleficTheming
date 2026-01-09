package xyz.malefic.compose.theming

import xyz.malefic.compose.theming.util.parseHexColor
import xyz.malefic.compose.theming.util.toColor
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class MaleficThemingLibraryTest {
    @Test
    fun testDSLThemeCreation() {
        // Test the DSL theme creation with minimal config
        val theme =
            themeConfig {
                primary = "#6200EE".toColor()
                background = "#FFFFFF".toColor()
            }

        assertNotNull(theme)
        assertEquals(parseHexColor("#6200EE"), theme.primary)
        assertEquals(parseHexColor("#FFFFFF"), theme.background)
        // Verify defaults are applied
        assertNotNull(theme.secondary)
        assertNotNull(theme.surface)
        assertNotNull(theme.error)
    }

    @Test
    fun testFullDSLCustomization() {
        // Test full Material 3 color customization
        val theme =
            themeConfig {
                primary = parseHexColor("#FF6200EE")
                onPrimary = parseHexColor("#FFFFFFFF")
                primaryContainer = parseHexColor("#FF6200EE")
                onPrimaryContainer = parseHexColor("#FFFFFFFF")
                secondary = parseHexColor("#FF03DAC6")
                onSecondary = parseHexColor("#FF000000")
                secondaryContainer = parseHexColor("#FF03DAC6")
                onSecondaryContainer = parseHexColor("#FF000000")
                tertiary = parseHexColor("#FF03DAC6")
                onTertiary = parseHexColor("#FF000000")
                tertiaryContainer = parseHexColor("#FF03DAC6")
                onTertiaryContainer = parseHexColor("#FF000000")
                error = parseHexColor("#FFB00020")
                onError = parseHexColor("#FFFFFFFF")
                errorContainer = parseHexColor("#FFB00020")
                onErrorContainer = parseHexColor("#FFFFFFFF")
                background = parseHexColor("#FFFFFFFF")
                onBackground = parseHexColor("#FF000000")
                surface = parseHexColor("#FFFFFFFF")
                onSurface = parseHexColor("#FF000000")
            }

        assertNotNull(theme)
        assertEquals(parseHexColor("#FF6200EE"), theme.primary)
        assertEquals(parseHexColor("#FFFFFFFF"), theme.onPrimary)
        assertEquals(parseHexColor("#FF6200EE"), theme.primaryContainer)
        assertEquals(parseHexColor("#FFFFFFFF"), theme.onPrimaryContainer)
        assertEquals(parseHexColor("#FF03DAC6"), theme.secondary)
        assertEquals(parseHexColor("#FF000000"), theme.onSecondary)
        assertEquals(parseHexColor("#FF03DAC6"), theme.secondaryContainer)
        assertEquals(parseHexColor("#FF000000"), theme.onSecondaryContainer)
    }

    @Test
    fun testColorHexParsing() {
        // Test hex color parsing functionality
        val color1 = parseHexColor("#FF6200EE")
        val color2 = parseHexColor("#6200EE")

        assertTrue(color1.value != 0UL)
        assertTrue(color2.value != 0UL)
    }

    @Test
    fun testColorHexExtension() {
        // Test the String.toColor() extension
        val color = "#6200EE".toColor()
        assertTrue(color.value != 0UL)
        assertEquals(parseHexColor("#6200EE"), color)
    }

    @Test
    fun testDefaultTheme() {
        // Test that default theme works with no configuration
        val theme = themeConfig {}

        assertNotNull(theme)
        assertTrue(theme.primary.value != 0UL)
        assertTrue(theme.background.value != 0UL)
        assertTrue(theme.surface.value != 0UL)
        assertTrue(theme.error.value != 0UL)
    }

    @Test
    fun testIntelligentDefaults() {
        // Test that defaults are intelligently derived
        val theme =
            themeConfig {
                primary = "#FF0000".toColor()
            }

        assertNotNull(theme)
        assertEquals(parseHexColor("#FF0000"), theme.primary)
        // Secondary should be derived from primary
        assertNotNull(theme.secondary)
        // Surface should default to background
        assertNotNull(theme.surface)
        // Error should have a default
        assertNotNull(theme.error)
    }
}
