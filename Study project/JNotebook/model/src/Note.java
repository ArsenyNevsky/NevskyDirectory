/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 03.10.13
 * Time: 0:07
 * Location: ${Russia_Saint-Petersburg}
 */
public class Note {


    public Note() {
        text = "";
        title = "";
    }


    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }


    public Note(String title) {
        this.title = title;
        text = "";
    }


    public void setText(String text) {
        this.text = text;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }


    public String getText() {
        return text;
    }


    private String title;
    private String text;
}
