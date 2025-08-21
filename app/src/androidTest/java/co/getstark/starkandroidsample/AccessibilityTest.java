package co.getstark.starkandroidsample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;

import android.app.Activity;
import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import co.getstark.accessibility.instrumentation.AccessibilityChecker;
import co.getstark.accessibility.instrumentation.StarkAccessibilityCheckResult;
import co.getstark.starkandroidsample.demos.AudioVideoDemoActivity;
import co.getstark.starkandroidsample.demos.ColorContrastDemoActivity;
import co.getstark.starkandroidsample.demos.CustomElementsDemoActivity;
import co.getstark.starkandroidsample.demos.FormsDemoActivity;
import co.getstark.starkandroidsample.demos.ImagesDemoActivity;
import co.getstark.starkandroidsample.demos.NavigationDemoActivity;
import co.getstark.starkandroidsample.demos.NotificationsDemoActivity;
import co.getstark.starkandroidsample.demos.SemanticsDemoActivity;
import co.getstark.starkandroidsample.demos.TeamSyncDemoActivity;
import co.getstark.starkandroidsample.demos.UIControlsDemoActivity;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AccessibilityTest {

    private <T extends Activity> void runAccessibilityCheck(Class<T> activityClass, String scanName) {
        try (ActivityScenario<T> scenario = ActivityScenario.launch(activityClass)) {
            scenario.onActivity(activity -> {
                View rootView = activity.getWindow().getDecorView().getRootView();
                AccessibilityChecker checker = new AccessibilityChecker("stark_••••••••••••••••••••••••••••••••");
                CompletableFuture<List<StarkAccessibilityCheckResult>> resultsFuture = checker
                        .runStandardChecks(rootView, scanName);
                try {
                    resultsFuture.get();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    @Test
    public void testMainActivityAccessibility() {
        runAccessibilityCheck(MainActivity.class, "MainActivity Scan");
    }

    @Test
    public void testTeamSyncDemoActivityAccessibility() {
        runAccessibilityCheck(TeamSyncDemoActivity.class, "TeamSync Demo Scan");
    }

    @Test
    public void testUIControlsDemoActivityAccessibility() {
        runAccessibilityCheck(UIControlsDemoActivity.class, "UI Controls Demo Scan");
    }

    @Test
    public void testFormsDemoActivityAccessibility() {
        runAccessibilityCheck(FormsDemoActivity.class, "Forms Demo Scan");
    }

    @Test
    public void testNavigationDemoActivityAccessibility() {
        runAccessibilityCheck(NavigationDemoActivity.class, "Navigation Demo Scan");
    }

    @Test
    public void testNotificationsDemoActivityAccessibility() {
        runAccessibilityCheck(NotificationsDemoActivity.class, "Notifications Demo Scan");
    }

    @Test
    public void testColorContrastDemoActivityAccessibility() {
        runAccessibilityCheck(ColorContrastDemoActivity.class, "Color Contrast Demo Scan");
    }

    @Test
    public void testImagesDemoActivityAccessibility() {
        runAccessibilityCheck(ImagesDemoActivity.class, "Images Demo Scan");
    }

    @Test
    public void testSemanticsDemoActivityAccessibility() {
        runAccessibilityCheck(SemanticsDemoActivity.class, "Semantics Demo Scan");
    }

    @Test
    public void testCustomElementsDemoActivityAccessibility() {
        runAccessibilityCheck(CustomElementsDemoActivity.class, "Custom Elements Demo Scan");
    }

    @Test
    public void testAudioVideoDemoActivityAccessibility() {
        runAccessibilityCheck(AudioVideoDemoActivity.class, "Audio Video Demo Scan");
    }
}