package co.getstark.starkandroidsample.demos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import co.getstark.starkandroidsample.R;

public class ButtonDemoActivity extends BaseDemoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_demo);

        setTitle("Button Demo - Accessibility Issues");

        setupButtons();
    }

    private void setupButtons() {
        // Button with no accessibility text
        Button invisibleButton = findViewById(R.id.invisible_button);
        invisibleButton.setOnClickListener(v -> Toast
                .makeText(this, "Invisible button clicked! This button has no content description.", Toast.LENGTH_SHORT)
                .show());

        // Button with poor color contrast
        Button lowContrastButton = findViewById(R.id.low_contrast_button);
        lowContrastButton.setOnClickListener(v -> Toast
                .makeText(this, "Low contrast button clicked! Hard to see, isn't it?", Toast.LENGTH_SHORT).show());

        // Button that's too small for touch targets
        Button tinyButton = findViewById(R.id.tiny_button);
        tinyButton.setOnClickListener(
                v -> Toast.makeText(this, "Tiny button clicked! This button is too small for accessible touch targets.",
                        Toast.LENGTH_SHORT).show());

        // Button with only icon, no text
        Button iconOnlyButton = findViewById(R.id.icon_only_button);
        iconOnlyButton.setOnClickListener(v -> Toast
                .makeText(this, "Icon-only button clicked! No content description provided.", Toast.LENGTH_SHORT)
                .show());

        // Disabled button that doesn't indicate why it's disabled
        Button disabledButton = findViewById(R.id.disabled_button);
        disabledButton.setEnabled(false);
        // In a real app, you'd provide context about why it's disabled

        // Button with misleading text
        Button misleadingButton = findViewById(R.id.misleading_button);
        misleadingButton.setOnClickListener(v -> Toast
                .makeText(this, "Action CANCELLED! The button said 'Continue' but actually cancels.", Toast.LENGTH_LONG)
                .show());

        // Focus order demonstration buttons
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);

        button1.setOnClickListener(v -> Toast.makeText(this, "First button clicked", Toast.LENGTH_SHORT).show());
        button2.setOnClickListener(v -> Toast.makeText(this, "Second button clicked", Toast.LENGTH_SHORT).show());
        button3.setOnClickListener(v -> Toast.makeText(this, "Third button clicked", Toast.LENGTH_SHORT).show());
    }
}
