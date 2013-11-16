/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 03.10.13
 * Time: 14:20
 * Location: ${Russia_Saint-Petersburg}
 */
public class ControllerNote implements Controller {


    public ControllerNote() {
        initListNote();
        view = new NoteFrame(this, list);
    }


    public String[] getTitleArray() {
        return list.getTitleArray();
    }


    @Override
    public String getTitle(int index) {
        return list.getTitle(index);
    }


    @Override
    public String getText(int index) {
        return list.getText(index);
    }


    @Override
    public void addNote() {

    }


    private void initListNote() {
        of = new OpenFile();
        list = of.open();
    }


    private OpenFile of;
    private ListModel list;
    private NoteFrame view;
}
