import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 12.09.13
 * Time: 22:12
 * Location: ${Russia_Saint-Petersburg}
 */
public class ProgressRenderer extends JProgressBar implements TableCellRenderer {

    public ProgressRenderer(int min, int max) {
        super(min, max);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object o, boolean b, boolean b2, int i, int i2) {
        setValue((int)((Float) o).floatValue());
        return this;
    }
}
