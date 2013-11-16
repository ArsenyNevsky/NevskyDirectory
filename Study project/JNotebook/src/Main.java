import javax.swing.*;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 03.10.13
 * Time: 0:07
 * Location: ${Russia_Saint-Petersburg}
 */
public class Main {


    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ControllerNote();
            }
        });

    }
}
