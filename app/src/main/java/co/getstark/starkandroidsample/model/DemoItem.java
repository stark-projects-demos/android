package co.getstark.starkandroidsample.model;

public class DemoItem {
    private String title;
    private String description;
    private Class<?> activityClass;

    public DemoItem(String title, String description, Class<?> activityClass) {
        this.title = title;
        this.description = description;
        this.activityClass = activityClass;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Class<?> getActivityClass() {
        return activityClass;
    }
}
