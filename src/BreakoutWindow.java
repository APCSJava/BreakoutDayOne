import javax.swing.*;

public class BreakoutWindow extends JFrame {

    public BreakoutWindow() {
        super("My Stupendous Breakout Clone");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new BreakoutPanel());
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
}
