import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 03.10.13
 * Time: 15:05
 * Location: ${Russia_Saint-Petersburg}
 */
public class OpenFile {

    public OpenFile() {
        file = new File(PATH_DIRECTORY);
        FilenameFilter only = new OnlyTXT();
        listFile = file.list(only);
        for (String s : listFile) {
            System.out.println(s);
        }
        System.out.println(file.getAbsolutePath());
    }


    public ListModel open() {
        ListModel list = new ListModel();
        for (String name : listFile) {
            try (FileReader fr = new FileReader(name)) {
                StringBuilder text = new StringBuilder();
                int c;
                while ((c = fr.read()) != -1) {
                    text.append((char)c);
                }
                list.addElement(name.substring(0, name.length() - 4), text.toString());
                System.out.println(list.getTitle(0));
            } catch (FileNotFoundException e) {
                System.out.print("FILE DOESN'T FIND. Directory: " + file.getPath() + "\n");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nContent:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.getText(i));
        }

        return list;
    }


    private class OnlyTXT implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(TXT);
        }

        private final String TXT = ".txt";
    }

    private String[] listFile;
    private File file;
    private final String PATH_DIRECTORY = "/JNoteBookItem";
}
