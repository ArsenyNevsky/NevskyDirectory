import javax.swing.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 03.10.13
 * Time: 0:32
 * Location: ${Russia_Saint-Petersburg}
 */
public class ListModel extends DefaultListModel {


    public ListModel() {
        super();
        arrayNote = new ArrayList<>();
    }



    public void addElement(String title, String text) {
        note = new Note(title, text);
        arrayNote.add(note);
    }


    public void addElement(String title) {
        note = new Note(title, "");
        arrayNote.add(note);
    }


    public String getText(int position) {
        return arrayNote.get(position).getText();
    }


    public String getTitle(int position) {
        return arrayNote.get(position).getTitle();
    }


    public Note getNote(int position) {
        return arrayNote.get(position);
    }


    public String[] getTitleArray() {
        String[] array = new String[arrayNote.size()];
        for (int i = 0; i < arrayNote.size(); i++) {
            array[i] = arrayNote.get(i).getTitle();
        }
        return array;
    }


    private Note note;
    private ArrayList<Note> arrayNote;
}
