# Stark Android Accessibility Demo App

This Android application demonstrates common accessibility issues in mobile app development. It's designed as a learning tool to help developers understand and identify accessibility problems that affect users with disabilities.

## Overview

The app has been restructured from its original tab-based navigation to a cleaner list-based navigation system that provides easy access to 30+ different demo screens, each showcasing specific accessibility issues.

## App Structure

### Main Screen

- **Clean Navigation**: Removed the original bottom tab navigation
- **Demo List**: Displays a comprehensive list of accessibility demo screens organized by category
- **Easy Navigation**: Each item shows a title and description of the accessibility issues it demonstrates

### Demo Categories (30 Total Demos)

#### Basic Controls (5 demos)

1. **Button Controls** - Buttons with poor accessibility practices
2. **Text Fields** - Input fields with accessibility issues
3. **Images** - Images missing alt text and descriptions
4. **Checkboxes** - Checkboxes with poor labeling
5. **Radio Buttons** - Radio button groups with issues

#### Interactive Controls (6 demos)

6. **Switches & Toggles** - Toggle controls without proper state announcements
7. **Sliders** - Sliders missing value announcements
8. **Progress Bars** - Progress indicators without status updates
9. **Spinners** - Dropdown menus with navigation issues
10. **Date Pickers** - Date selection with accessibility barriers
11. **Time Pickers** - Time selection without proper announcements

#### List and Navigation (6 demos)

12. **List Views** - Lists with poor item accessibility
13. **RecyclerView** - RecyclerView with focus issues
14. **Tab Layout** - Tab navigation with focus issues
15. **Navigation Drawer** - Side navigation with accessibility problems
16. **Bottom Navigation** - Bottom nav without proper labels
17. **ViewPager** - Swipeable content without navigation cues

#### Dialogs and Feedback (5 demos)

18. **Dialogs** - Modal dialogs with focus traps
19. **Alert Dialogs** - Alert dialogs without proper announcements
20. **Toast Messages** - Temporary notifications not announced
21. **Snackbars** - Action bars with poor accessibility
22. **Bottom Sheets** - Modal bottom sheets with navigation issues

#### Media and Advanced Controls (8 demos)

23. **Web Views** - Web content with accessibility barriers
24. **Video Player** - Media player without accessible controls
25. **Audio Player** - Audio controls without proper labeling
26. **Camera Preview** - Camera interface with accessibility issues
27. **Map View** - Interactive maps without screen reader support
28. **Chart/Graph** - Data visualizations without alt descriptions
29. **Custom Views** - Custom controls without accessibility support
30. **Animations** - Animations that interfere with screen readers

## Key Features

### Navigation System

- **Back Navigation**: All demo screens include proper back navigation to return to the main list
- **Action Bar Support**: Each demo screen shows a descriptive title in the action bar
- **Consistent UX**: Uniform navigation experience across all demo screens

### Comprehensive Button Demo (Fully Implemented)

The Button Controls demo showcases multiple accessibility issues:

1. **Missing Accessibility Information**

   - Buttons with no content description
   - Icon-only buttons without accessible labels

2. **Visual Accessibility Issues**

   - Poor color contrast (fails WCAG guidelines)
   - Touch targets smaller than 48dp minimum

3. **State and Context Issues**

   - Disabled buttons without explanation
   - Misleading button text

4. **Focus and Navigation Issues**
   - Improper focus order
   - Missing focus indicators

### Technical Implementation

- **RecyclerView**: Efficient list display with card-based layout
- **Material Design**: Clean, modern UI following Material Design principles
- **Modular Architecture**: Each demo is a separate activity for easy expansion
- **Extensible**: Easy to add new demo screens by creating new activities

## Future Development

The remaining 29 demo screens are set up with placeholder activities and can be easily expanded to include:

- Specific accessibility issues for each control type
- Interactive examples that demonstrate problems
- Before/after comparisons showing accessible implementations
- Integration with accessibility testing tools

## Usage for Accessibility Testing

1. **Enable TalkBack**: Go to Settings > Accessibility > TalkBack to experience the issues firsthand
2. **Navigate with Screen Reader**: Try navigating each demo screen using only TalkBack
3. **Test Focus Management**: Use D-pad or keyboard navigation to see focus issues
4. **Check Color Contrast**: Verify readability in different lighting conditions

## Development Notes

This app is intentionally designed with accessibility issues for educational purposes. In real applications, these issues should be fixed following WCAG 2.1 AA guidelines and Android accessibility best practices.

## Building and Running

```bash
# Clone the repository
cd /path/to/StarkAndroidDemo

# Build the app
./gradlew assembleDebug

# Install on device/emulator
./gradlew installDebug
```

The app targets modern Android versions and uses standard Android development practices for maximum compatibility.

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
