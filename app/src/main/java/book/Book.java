package book;

public class Book {
    private int resourceId;
    private String title;

    public Book(int resourceId, String title) {
        this.resourceId = resourceId;
        this.title = title;
    }



    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getTitle() {
        return title;
    }
}
