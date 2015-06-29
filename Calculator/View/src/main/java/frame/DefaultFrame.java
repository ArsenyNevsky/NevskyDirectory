package frame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by erafiil on 29.06.15.
 */
public abstract class DefaultFrame extends JFrame {

    public DefaultFrame() {
        frame = new JFrame("Macbook calculator");
        panel = new JPanel();
        frame.add(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(240, 320);
        frame.setResizable(false);
        frame.setVisible(true);
        GridLayout gl = new GridLayout(4, 6);
        panel.setLayout(gl);
        panel.setBackground(new Color(75, 73, 71));
    }

    private void initButtons() {

    }

    protected abstract void setPanelBackground();


    protected JFrame frame;
    protected JPanel panel;
}
