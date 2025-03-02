package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Note;
import model.Notebook;

public class Controller {

    @FXML
    private TextField titleBox;
    
    @FXML
    private TextArea notesBox;
    
    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button debugButton;

    @FXML
    private Button editButton;

    @FXML
    private Button saveButton;

    @FXML
    private TextField noteContentTitle;

    @FXML
    private TextArea noteContentText;

    @FXML
    private Text title;

    @FXML
    private Text text;

    @FXML
    private ListView<String> listView;

    private Notebook notebook;

    public Controller() {
        notebook = new Notebook();
    }

    @FXML
    public void addNote() {
        String title = titleBox.getText();
        String notes = notesBox.getText();
        

        if (!"".equals(title)) {
            Note note = new Note(title, notes);
            notebook.addToNoteBook(note);
            refreshListView(note);

            titleBox.clear();
            notesBox.clear();
        } 
    }

    @FXML
    public void debug() {
        notebook.printAll();
    }

    @FXML
    public void initialize() {
        listView.setOnMouseClicked(this::handleListViewClick);
        noteContentTitle.setVisible(false);
        noteContentText.setVisible(false);
    }

    @FXML
    public void handleListViewClick(MouseEvent event) {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            showNote();
        }
    }

    @FXML 
    public void refreshListView(Note note) {
        listView.getItems().add(note.getNoteTitle());
    }

    @FXML
    public void delete() {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            listView.getItems().remove(selectedTitle);
            notebook.removeNote(selectedTitle);
        }
    }

    @FXML
    public void showNote() {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {

            Note note = notebook.getNoteByTitle(selectedTitle);
            title.setText(note.getNoteTitle());
            text.setText(note.getNoteText());

        }
    }

    @FXML
    public void edit() {
        String selectedTitle = listView.getSelectionModel().getSelectedItem();
        if (selectedTitle != null) {
            Note note = notebook.getNoteByTitle(selectedTitle);
        
            noteContentTitle.setText(note.getNoteTitle());
            noteContentText.setText(note.getNoteText());
            noteContentTitle.setVisible(true);
            noteContentText.setVisible(true);

        }

    }
}
