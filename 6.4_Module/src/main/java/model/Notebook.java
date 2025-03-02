package model;

import java.util.ArrayList;

public class Notebook {

    private final ArrayList<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public void addToNoteBook(Note note) {
        notes.add(note);
    }
    
    public Note getNoteByTitle(String title) {
        for (Note note : notes) {
            if (note.getNoteTitle().equals(title)) {
                return note;
                }
        } return null;
    }

    public void removeNote(String title) {
        notes.remove(checkNote(title));
    }

    public Note checkNote(String title) {
        for (Note note : notes) {
            if (note.getNoteTitle().equals(title)) {
            return note;
            }
        }
        return null;
    }
}
