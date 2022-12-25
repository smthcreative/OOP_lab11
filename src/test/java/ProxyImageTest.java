

import image.ProxyImage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {

    ProxyImage img;

    @Test
    void display() {
        img = new ProxyImage("images.png");

        assertNull(img.getImage());
        img.display();
        assertNull(img.getImage());
    }
}
