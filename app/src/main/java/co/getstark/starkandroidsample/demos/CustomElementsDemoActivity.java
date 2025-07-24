package co.getstark.starkandroidsample.demos;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import co.getstark.starkandroidsample.R;

public class CustomElementsDemoActivity extends BaseDemoActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_elements_demo);
        setTitle("Custom Elements - Accessibility Issues");

        // Find the views for the accordion from the layout
        LinearLayout accordionHeader = findViewById(R.id.accordion_header);
        TextView accordionContent = findViewById(R.id.accordion_content);
        ImageView accordionIcon = findViewById(R.id.accordion_icon);

        // Set the click listener on the header
        accordionHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the content is currently visible
                if (accordionContent.getVisibility() == View.GONE) {
                    // If it's gone, make it visible
                    accordionContent.setVisibility(View.VISIBLE);
                    // Animate the icon to point down (expanded)
                    accordionIcon.animate().rotation(180f).setDuration(300).start();
                } else {
                    // If it's visible, make it gone
                    accordionContent.setVisibility(View.GONE);
                    // Animate the icon to point up (collapsed)
                    accordionIcon.animate().rotation(0f).setDuration(300).start();
                }
            }
        });
    }

}
