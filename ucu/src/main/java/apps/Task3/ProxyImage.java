package apps.task3;

public class ProxyImage implements MyImage {
    private RealImage img;
    private String filename;


    public ProxyImage(String filename) {
        this.filename = filename;
    }

    private void initialize() {
        if (img == null) {
            img = new RealImage(filename);
        }
    }

    @Override
    public void display() {
        initialize();
        img.display();
    }
}
