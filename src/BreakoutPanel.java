import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BreakoutPanel extends JPanel {

    private Image catPic; // background image
    public BreakoutPanel() {
        super();
        this.setPreferredSize(new Dimension(800, 600));
        try {
            catPic = ImageIO.read(new File("cat.png"));
        } catch (IOException e) {
            System.out.println("Don't attempt to draw background -- didn't load");
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 800, 600);
        if (catPic!= null) {
            g.drawImage(catPic, 10, 10, 780, 580, null);
        } else {
            // draw a background differently
        }
    }
}
