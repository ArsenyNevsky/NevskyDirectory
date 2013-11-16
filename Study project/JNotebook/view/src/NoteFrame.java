import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 03.10.13
 * Time: 0:15
 * Location: ${Russia_Saint-Petersburg}
 */
public class NoteFrame extends JFrame {


    public NoteFrame(ControllerNote controller, ListModel listNote) {
        super("JNoteBook");
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(405, 370);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(300, 300);
        panel.setLayout(null);

        this.controller = controller;
        this.listNote = listNote;

        initTextArea();
        initButtons();
        initList();

        frame.add(panel);
        frame.setVisible(true);

        buttOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNote();
            }
        });

    }

    private void openNote() {
        int index = list.getSelectedIndex();
        textArea.setText(controller.getText(index));
    }


    private void initButtons() {
        buttAdd = new JButton("ADD");
        buttAdd.setBounds(0, 300, 52, 40);

        buttOpen = new JButton("OPEN");
        buttOpen.setBounds(53, 300, 50, 40);

        panel.add(buttAdd);
        panel.add(buttOpen);
    }


    private void initTextArea() {
        textArea = new JTextArea();
        textArea.setBounds(110, 0, 400, 335);
        panel.add(textArea);
    }


    private void initList() {
        String[] array = controller.getTitleArray();
        list = new JList(array);
        list.setBounds(0, 0, 100, 300);
        list.setSelectedIndex(0);
        panel.add(list);
    }


    private JList list;
    private JTextArea textArea;
    private JPanel panel;
    private JButton buttAdd;
    private JButton buttOpen;
    private JFrame frame;
    private ControllerNote controller;
    private ListModel listNote;


}
