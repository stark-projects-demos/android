package co.getstark.starkandroidsample.demos;

import android.os.Bundle;

import co.getstark.starkandroidsample.R;

public class DeviceOrientationDemoActivity extends BaseDemoActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_orientation_demo);
        setTitle("Device Orientation - Accessibility Issues");
    }
}
