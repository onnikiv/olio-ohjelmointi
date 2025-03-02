package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Note;
import model.Notebook;

public class NoteController {

    @FXML
    private TextField titleBox;
    @FXML
    private TextArea notesBox;
    @FXML
    private Button saveButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button editButton;
    @FXML
    private TextField noteContentTitle;
    @FXML
    private TextArea noteContentText;
    @FXML
    private Text title;
    @FXML
    private Text text;
    @FXML
    private Text debugText;
    @FXML
    private VBox editBox;
    @FXML
    private VBox box;
    @FXML

    private ListView<String> listView;
    private final Notebook notebook;


    public NoteController() {
        notebook = new Notebook();
    }

    @FXML
    public void initialize() {
        listView.setOnMouseClicked(this::handleListViewClick);
        editBox.setVisible(false);
        box.setVisible(false);
        saveButton.setVisible(false);
        editButton.setVisible(false);
        deleteButton.setVisible(false);
    }

    @FXML
    public boolean checkItemFromListView(String noteTitle) {
        return listView.getItems().contains(noteTitle);
    }

    @FXML
    public void addNote() {
        String noteTitle = titleBox.getText();
        String notes = notesBox.getText();
        
        if (!"".equals(noteTitle) && !checkItemFromListView(noteTitle)) {
            Note note = new Note(noteTitle, notes);
            notebook.addToNoteBook(note);
            refreshListView(note);

            titleBox.clear();
            notesBox.clear();
        } else {
            debugText.setText("The List already contains an item with the same title!\n" + noteTitle);
        }
    }

    @FXML
    public void handleListViewClick(MouseEvent event) {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            showNote();
            editButton.setVisible(true);
            deleteButton.setVisible(true);
            
            debugText.setText("");
        }
    }

    @FXML 
    public void refreshListView(Note note) {
        listView.getItems().add(note.getNoteTitle());
        debugText.setText("Added Note");
    }

    @FXML
    public void delete() {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            listView.getItems().remove(selectedTitle);
            notebook.removeNote(selectedTitle);
            title.setText("");
            text.setText("");

            debugText.setText("Note Deleted!");
        }
    }

    @FXML
    public void showNote() {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            box.setVisible(true);
            Note note = notebook.getNoteByTitle(selectedTitle);
            title.setText(note.getNoteTitle());
            text.setText(note.getNoteText());
        }
    }

    @FXML
    public void edit() {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            box.setVisible(false);
            editBox.setVisible(true);
            saveButton.setVisible(true);
            Note note = notebook.getNoteByTitle(selectedTitle);
        
            noteContentTitle.setText(note.getNoteTitle());
            noteContentText.setText(note.getNoteText());
            noteContentTitle.setVisible(true);
            noteContentText.setVisible(true);
        }
    }

    @FXML
    public void save() {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            String editedTitle = noteContentTitle.getText();
            String editedText = noteContentText.getText();
            Note note = notebook.getNoteByTitle(selectedTitle);

            note.setNoteTitle(editedTitle);
            note.setNoteText(editedText);

            listView.getItems().set(listView.getSelectionModel().getSelectedIndex(), editedTitle);

            editBox.setVisible(false);
            saveButton.setVisible(false);
            box.setVisible(true);

            title.setText("");
            text.setText("");

            debugText.setText("Saved");
        }
    }
}
