![](cover.jpeg)

# MaleficTheming

![Maven Central Version](https://img.shields.io/maven-central/v/xyz.malefic.compose/theming)

> A Kotlin Multiplatform library for creating and managing Material 3 themes in Jetpack Compose with a type-safe DSL

## 🦿 Prerequisites

- Java 17 or above
- For iOS: Xcode and iOS 13+

## ⌨️ Usage

1. Get the artifact from the [central repo](https://central.sonatype.com/artifact/xyz.malefic.compose/theming)
2. Create themes using the type-safe DSL with intelligent defaults
3. Customize as much or as little as you want - only primary color is required!

### Installation

Add the library to your `build.gradle.kts`:

```kotlin
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("xyz.malefic.compose:theming:2.0.0")
            }
        }
    }
}
```

### Quick Start

The simplest possible theme - just specify a primary color:

```kotlin
MaleficTheme(
    theme = themeConfig {
        primary = Color(0xFF6200EE)
    }
) {
    // Your UI here
}
```

All other colors are automatically derived with intelligent defaults!

### Customization Examples

Specify as much or as little as you want:

```kotlin
// Minimal - just primary and background
MaleficTheme(
    theme = themeConfig {
        primary = Color(0xFF6200EE)
        background = Color.White
    }
) {
    // Your content
}

// More customization
MaleficTheme(
    theme = themeConfig {
        primary = Color(0xFF6200EE)
        onPrimary = Color.White
        secondary = Color(0xFF03DAC6)
        background = Color(0xFFFFFBFE)
        surface = Color(0xFFFFFBFE)
        error = Color(0xFFB3261E)
    }
) {
    // Your content
}

// Use hex strings with the extension
MaleficTheme(
    theme = themeConfig {
        primary = "#6200EE".toColor()
        secondary = "#03DAC6".toColor()
        background = "#FFFBFE".toColor()
    }
) {
    // Your content
}

// Full Material 3 customization (if needed)
MaleficTheme(
    theme = themeConfig {
        primary = Color(0xFF6200EE)
        onPrimary = Color.White
        primaryContainer = Color(0xFFEADDFF)
        onPrimaryContainer = Color(0xFF21005E)
        secondary = Color(0xFF03DAC6)
        // ... customize all 47 Material 3 colors
    }
) {
    // Your content
}
```

### Default Theme

No configuration needed? Use the default theme:

```kotlin
MaleficTheme {
    // Your content with default Material 3 colors
}
```

## 🎯 Features

- ✅ **Type-safe DSL** - Kotlin DSL with full IDE support and autocomplete
- ✅ **Intelligent Defaults** - Specify only what you need, rest is derived automatically
- ✅ **Material 3** - Full Material 3 color scheme support (47 colors)
- ✅ **Multiplatform** - Works on JVM, iOS, and Android
- ✅ **Hex Support** - Easy hex color conversion with `.toColor()` extension

## 🎯 Supported Platforms

- ✅ **JVM Desktop** (Compose Desktop)
- ✅ **iOS** (Compose Multiplatform)
- ✅ **Android** (Jetpack Compose)

## 🔄 Migration from 1.x

If you were using the old file-based approach:

**Old (1.x):**
```kotlin
val themeJson = """{"primary": "#FF6200EE", ...}"""
MaleficThemeFromJson(jsonContent = themeJson) { }
```

**New (2.x):**
```kotlin
MaleficTheme(
    theme = themeConfig {
        primary = "#6200EE".toColor()
        // Only specify what you need!
    }
) { }
```

## ✍️ Author

👤 **Om Gupta**

* Email: om@malefic.xyz
* Github: [@OmyDaGreat](https://github.com/OmyDaGreat)

Feel free to reach out! :D

## 🤝 Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

1. Open an issue first to discuss what you would like to change.
2. Fork the Project
3. Create your feature branch (`git checkout -b feature/amazing-feature`)
4. Commit your changes (`git commit -m 'Add some amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a pull request

Please make sure to update tests as appropriate.

## ❤ Show your support

Give a ⭐️ if this project helped you!

## 📝 License

```
MIT License

Copyright (c) 2024 Om Gupta

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

_This README was generated by [readgen](https://github.com/theapache64/readgen)_ ❤
