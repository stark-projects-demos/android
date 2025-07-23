package co.getstark.starkandroidsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import co.getstark.starkandroidsample.adapter.DemoAdapter;
import co.getstark.starkandroidsample.demos.ButtonDemoActivity;
import co.getstark.starkandroidsample.demos.TextFieldDemoActivity;
import co.getstark.starkandroidsample.demos.ImageDemoActivity;
import co.getstark.starkandroidsample.demos.CheckboxDemoActivity;
import co.getstark.starkandroidsample.model.DemoItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DemoAdapter adapter;
    private List<DemoItem> demoItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupDemoList();
        setupRecyclerView();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.demo_list);
    }

    private void setupDemoList() {
        demoItems = new ArrayList<>();

        // Basic Controls (5 items)
        demoItems.add(
                new DemoItem("Button Controls", "Buttons with poor accessibility practices", ButtonDemoActivity.class));
        demoItems.add(
                new DemoItem("Text Fields", "Input fields with accessibility issues", TextFieldDemoActivity.class));
        demoItems.add(new DemoItem("Images", "Images missing alt text and descriptions", ImageDemoActivity.class));
        demoItems.add(new DemoItem("Checkboxes", "Checkboxes with poor labeling", CheckboxDemoActivity.class));
    }

    private void setupRecyclerView() {
        adapter = new DemoAdapter(this, demoItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}