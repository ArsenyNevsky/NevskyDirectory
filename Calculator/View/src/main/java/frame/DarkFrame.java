package frame;

import java.awt.*;

/**
 * Created by erafiil on 30.06.15.
 */
public class DarkFrame extends DefaultFrame {

    public DarkFrame() {
        super();
    }

    @Override
    protected void setPanelBackground() {
        panel.setBackground(new Color(75, 73, 71));
    }
}
