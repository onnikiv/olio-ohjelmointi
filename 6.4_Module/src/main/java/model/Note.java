package model;

public class Note {
    private String noteTitle;
    private String noteText;

    public Note(String title, String text) {
        this.noteTitle = title;
        this.noteText = text;
    }

    public void setNoteTitle(String title) {
        this.noteTitle = title;
    }

    public void setNoteText(String text) {
        this.noteText = text;
    }

    public String getNoteTitle() {
        return noteTitle;
    }
    
    public String getNoteText() {
        return noteText;
    }
}