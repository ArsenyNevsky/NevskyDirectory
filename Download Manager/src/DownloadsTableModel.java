import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 12.09.13
 * Time: 22:14
 * Location: ${Russia_Saint-Petersburg}
 */
public class DownloadsTableModel extends AbstractTableModel implements Observer {

    private static final String[] columnNames = {"URL", "Size", "Progress", "Status"};
    private static final Class[] columnClasses = {String.class, String.class, JProgressBar.class, String.class};
    private ArrayList<Download> downloadList = new ArrayList<Download>();

    @Override
    public void update(Observable observable, Object o) {
        int index = downloadList.indexOf(o);
        fireTableCellUpdated(index, index);
    }

    @Override
    public int getRowCount() {
        return downloadList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int i, int i2) {
        Download download = downloadList.get(i);
        switch (i2) {
            case 0:
                return download.getUrl();
            case 1:
                int size = download.getSize();
                return (size == -1) ? "" : Integer.toString(size);
            case 2:
                return new Float(download.getProgress());
            case 3:
                return Download.STASUSES[download.getStatus()];
        }
        return "";
    }

    public void clearDownload(int row) {
        downloadList.remove(row);
    }


    public Download getDownload(int row) {
        return downloadList.get(row);
    }


    public void addDownload(Download download) {
        download.addObserver(this);
        downloadList.add(download);
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }


    public Class getColumnClass(int col) {
        return columnClasses[col];
    }
}
