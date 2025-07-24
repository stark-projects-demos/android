package co.getstark.starkandroidsample.demos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

import co.getstark.starkandroidsample.R;

public class NotificationsDemoActivity extends BaseDemoActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications_demo);
        setTitle("Notifications - Accessibility Issues");

        Button showAlertButton = findViewById(R.id.button_alert);
        showAlertButton.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(NotificationsDemoActivity.this);
            // builder.setTitle("Alert Title");
            builder.setMessage("This is the alert dialog message. 👋");

            builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
            builder.setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss());

            AlertDialog dialog = builder.create();
            dialog.show();
        });
    }
}
