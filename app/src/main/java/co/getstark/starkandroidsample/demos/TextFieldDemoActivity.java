package co.getstark.starkandroidsample.demos;

import android.os.Bundle;
import android.widget.EditText;

import co.getstark.starkandroidsample.R;

public class TextFieldDemoActivity extends BaseDemoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textfield_demo);

        setTitle("Text Field Demo - Accessibility Issues");
    }
}
