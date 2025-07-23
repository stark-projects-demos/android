package co.getstark.starkandroidsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import co.getstark.starkandroidsample.adapter.DemoAdapter;
import co.getstark.starkandroidsample.demos.AudioVideoDemoActivity;
import co.getstark.starkandroidsample.demos.ColorContrastDemoActivity;
import co.getstark.starkandroidsample.demos.DeviceOrientationDemoActivity;
import co.getstark.starkandroidsample.demos.FormsDemoActivity;
import co.getstark.starkandroidsample.demos.ImagesDemoActivity;
import co.getstark.starkandroidsample.demos.MiscDemoActivity;
import co.getstark.starkandroidsample.demos.NavigationDemoActivity;
import co.getstark.starkandroidsample.demos.SemanticsDemoActivity;
import co.getstark.starkandroidsample.demos.TeamSyncDemoActivity;
import co.getstark.starkandroidsample.demos.TextContentDemoActivity;
import co.getstark.starkandroidsample.demos.UIControlsDemoActivity;
import co.getstark.starkandroidsample.demos.NotificationsDemoActivity;
import co.getstark.starkandroidsample.demos.CustomElementsDemoActivity;
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

        demoItems.add(new DemoItem("TeamSync", "An example of a real app with some issues", TeamSyncDemoActivity.class));
        demoItems.add(new DemoItem("UI Controls", "User interaction", UIControlsDemoActivity.class));
        demoItems.add(new DemoItem("Notifications", "User notifications", NotificationsDemoActivity.class));
        demoItems.add(new DemoItem("Custom Elements", "Various custom elements", CustomElementsDemoActivity.class));
        demoItems.add(new DemoItem("Form Labels and Validation", "Forms and their presentation", FormsDemoActivity.class));
        demoItems.add(new DemoItem("Navigation", "User navigation controls", NavigationDemoActivity.class));
        demoItems.add(new DemoItem("Device Orientation", "", DeviceOrientationDemoActivity.class));
        demoItems.add(new DemoItem("Semantic Structure and Meaning", "", SemanticsDemoActivity.class));
        demoItems.add(new DemoItem("Color and Contrast", "Accessibility of colors", ColorContrastDemoActivity.class));
        demoItems.add(new DemoItem("Audio and Video", "Non-textual content", AudioVideoDemoActivity.class));
        demoItems.add(new DemoItem("Text Content", "", TextContentDemoActivity.class));
        demoItems.add(new DemoItem("Images", "Images and their presentation", ImagesDemoActivity.class));
        demoItems.add(new DemoItem("Misc", "Miscellaneous accessibility checks", MiscDemoActivity.class));
    }

    private void setupRecyclerView() {
        adapter = new DemoAdapter(this, demoItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}