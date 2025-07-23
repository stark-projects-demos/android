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
import co.getstark.starkandroidsample.demos.RadioButtonDemoActivity;
import co.getstark.starkandroidsample.demos.SwitchDemoActivity;
import co.getstark.starkandroidsample.demos.SliderDemoActivity;
import co.getstark.starkandroidsample.demos.ProgressBarDemoActivity;
import co.getstark.starkandroidsample.demos.SpinnerDemoActivity;
import co.getstark.starkandroidsample.demos.ListViewDemoActivity;
import co.getstark.starkandroidsample.demos.TabLayoutDemoActivity;
import co.getstark.starkandroidsample.demos.DialogDemoActivity;
import co.getstark.starkandroidsample.demos.ToastDemoActivity;
import co.getstark.starkandroidsample.demos.WebViewDemoActivity;
import co.getstark.starkandroidsample.demos.VideoPlayerDemoActivity;
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
        demoItems.add(new DemoItem("Radio Buttons", "Radio button groups with issues", RadioButtonDemoActivity.class));

        // Interactive Controls (6 items)
        demoItems.add(new DemoItem("Switches & Toggles", "Toggle controls without proper state announcements",
                SwitchDemoActivity.class));
        demoItems.add(new DemoItem("Sliders", "Sliders missing value announcements", SliderDemoActivity.class));
        demoItems.add(new DemoItem("Progress Bars", "Progress indicators without status updates",
                ProgressBarDemoActivity.class));
        demoItems.add(new DemoItem("Spinners", "Dropdown menus with navigation issues", SpinnerDemoActivity.class));
        demoItems.add(
                new DemoItem("Date Pickers", "Date selection with accessibility barriers", ButtonDemoActivity.class));
        demoItems.add(
                new DemoItem("Time Pickers", "Time selection without proper announcements", ButtonDemoActivity.class));

        // List and Navigation (6 items)
        demoItems.add(new DemoItem("List Views", "Lists with poor item accessibility", ListViewDemoActivity.class));
        demoItems.add(new DemoItem("RecyclerView", "RecyclerView with focus issues", ListViewDemoActivity.class));
        demoItems.add(new DemoItem("Tab Layout", "Tab navigation with focus issues", TabLayoutDemoActivity.class));
        demoItems.add(new DemoItem("Navigation Drawer", "Side navigation with accessibility problems",
                TabLayoutDemoActivity.class));
        demoItems.add(
                new DemoItem("Bottom Navigation", "Bottom nav without proper labels", TabLayoutDemoActivity.class));
        demoItems.add(
                new DemoItem("ViewPager", "Swipeable content without navigation cues", TabLayoutDemoActivity.class));

        // Dialogs and Feedback (5 items)
        demoItems.add(new DemoItem("Dialogs", "Modal dialogs with focus traps", DialogDemoActivity.class));
        demoItems.add(
                new DemoItem("Alert Dialogs", "Alert dialogs without proper announcements", DialogDemoActivity.class));
        demoItems.add(new DemoItem("Toast Messages", "Temporary notifications not announced", ToastDemoActivity.class));
        demoItems.add(new DemoItem("Snackbars", "Action bars with poor accessibility", ToastDemoActivity.class));
        demoItems.add(
                new DemoItem("Bottom Sheets", "Modal bottom sheets with navigation issues", DialogDemoActivity.class));

        // Media and Advanced Controls (8 items)
        demoItems.add(new DemoItem("Web Views", "Web content with accessibility barriers", WebViewDemoActivity.class));
        demoItems.add(new DemoItem("Video Player", "Media player without accessible controls",
                VideoPlayerDemoActivity.class));
        demoItems.add(
                new DemoItem("Audio Player", "Audio controls without proper labeling", VideoPlayerDemoActivity.class));
        demoItems.add(new DemoItem("Camera Preview", "Camera interface with accessibility issues",
                VideoPlayerDemoActivity.class));
        demoItems.add(
                new DemoItem("Map View", "Interactive maps without screen reader support", WebViewDemoActivity.class));
        demoItems.add(
                new DemoItem("Chart/Graph", "Data visualizations without alt descriptions", ImageDemoActivity.class));
        demoItems.add(new DemoItem("Custom Views", "Custom controls without accessibility support",
                ButtonDemoActivity.class));
        demoItems.add(
                new DemoItem("Animations", "Animations that interfere with screen readers", ButtonDemoActivity.class));
    }

    private void setupRecyclerView() {
        adapter = new DemoAdapter(this, demoItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}