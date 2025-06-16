# Stark Android Sample

## Overview

This repository showcases a sample Android application designed to demonstrate the seamless integration of the Stark Accessibility for Android library into UI testing workflows. The application intentionally includes accessibility issues to highlight the capabilities of the Stark library in detecting and reporting these issues for further analysis.

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-repo/StarkAndroidSample.git
   ```

2. Open the project in Android Studio.

3. Sync the Gradle files to download dependencies.

4. Ensure the `local.properties` file is configured with the path to your Android SDK.

## Running the App

1. Build and run the app on an emulator or physical device.
2. Navigate through the app to explore its features.

## Running UI Tests

1. Open the `androidTest` directory under `src`.
2. Run the UI tests to detect accessibility issues.
3. Review the results reported by the Stark library.

## Configuring the Stark Library

To integrate the Stark Accessibility library into your tests, follow these steps:

1. **Obtain Your Stark Project Token/API Key**:

   - Log in to your Stark account.
   - Navigate to the project settings or API section.
   - Copy your project token or API key.

2. **Initialize the Accessibility Checker**:

   - Create an instance of `AccessibilityChecker` using your API key.
   - Use the `runStandardChecks` method to perform accessibility checks on the root view.

3. **Example Test Usage**:
   ```java
   AccessibilityChecker checker = new AccessibilityChecker("your-stark-project-token");
   checker.runStandardChecks(rootView, "YourScanName");
   ```

## Project Structure

- **app/**: Contains the main application code.
  - `src/main`: Application source code, including `AndroidManifest.xml`, Java classes, and resources.
  - `src/androidTest`: UI tests integrated with the Stark Accessibility library.
- **gradle/**: Gradle wrapper and configuration files.
- **build.gradle.kts**: Project-level Gradle configuration.
- **settings.gradle.kts**: Settings for the Gradle build.

## Stark Accessibility Library

The Stark Accessibility library is a powerful tool for detecting and analyzing accessibility issues in Android applications. For more information, visit [Stark for Android](https://github.com/stark-contrast/stark-android/).

## Contact

For questions or support, please contact [support@getstark.co](mailto:support@getstark.co).
