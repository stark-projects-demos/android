package co.getstark.starkandroidsample;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import co.getstark.accessibility.instrumentation.AccessibilityChecker;
import co.getstark.accessibility.instrumentation.StarkAccessibilityCheckResult;


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
            scenario.onActivity(activity -> {
                View rootView = activity.getWindow().getDecorView().getRootView();
                AccessibilityChecker checker = new AccessibilityChecker("stark_d65a79f636724e4184f3234c0957367a");
                CompletableFuture<List<StarkAccessibilityCheckResult>> resultsFuture = checker.runStandardChecks(rootView, "MainActivity");
                try {
                    resultsFuture.get();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}