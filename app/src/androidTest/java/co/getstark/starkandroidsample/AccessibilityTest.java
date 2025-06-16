package co.getstark.starkandroidsample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import co.getstark.accessibility.AccessibilityChecker;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AccessibilityTest {
    @Test
    public void testAccessibility() {
        try (ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
            onView(isRoot()).check(matches(isDisplayed())); // This will wait until the root view is considered displayed


            scenario.onActivity(activity -> {
                View rootView = activity.getWindow().getDecorView().getRootView();
                AccessibilityChecker checker = new AccessibilityChecker("stark_••••••••••••••••••••••••••••••••");
                checker.runStandardChecks(rootView, "MainActivity");
            });
        }
    }
}