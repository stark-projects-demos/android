# Stark Android Accessibility Demo App

This Android application serves as a demonstration platform for Stark's accessibility testing tools. It intentionally includes various accessibility issues to showcase how Stark can detect and analyze accessibility problems in Android applications.

## Purpose

This demo app is designed to:

- Demonstrate Stark's accessibility analysis capabilities
- Provide real examples of common accessibility issues in mobile apps
- Show how accessibility testing can be integrated into Android development workflows

## Getting Started

### Prerequisites

- Android Studio
- Android SDK
- Stark account and API key

### Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/stark-projects-demos/android.git
   ```

2. Open the project in Android Studio

3. Sync Gradle files to download dependencies

4. Ensure your `local.properties` file includes your Android SDK path

### Running the App

1. Build and run the app on an emulator or physical device:

   ```bash
   ./gradlew installDebug
   ```

2. Navigate through the app to explore various UI components with accessibility issues

## Stark Integration

This app demonstrates how to integrate Stark's accessibility testing into your Android development workflow.

### Basic Integration

```java
AccessibilityChecker checker = new AccessibilityChecker("your-stark-project-token");
checker.runStandardChecks(rootView, "YourScanName");
```

### Getting Your API Key

1. Log in to your Stark account
2. Navigate to project settings
3. Copy your project token or API key

## About Stark

Stark provides powerful tools for detecting and analyzing accessibility issues in mobile applications. For more information about Stark's Android accessibility tools, visit [getstark.co](https://getstark.co).

## Support

For questions or support, contact [support@getstark.co](mailto:support@getstark.co).
