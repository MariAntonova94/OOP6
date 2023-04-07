package org.example.OOP.seminar6;
import org.example.OOP.seminar6.controllers.NoteController;
import org.example.OOP.seminar6.model.*;
import org.example.OOP.seminar6.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}