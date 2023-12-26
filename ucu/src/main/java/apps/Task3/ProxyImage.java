package apps.Task3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProxyImage implements MyImage {
    private RealImage img;
    private String filename;
    private JFrame frame;

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
