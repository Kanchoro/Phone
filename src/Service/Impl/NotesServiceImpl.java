package Service.Impl;

import DAO.AllDAO;
import Models.Notes;
import Service.NotesService;

public class NotesServiceImpl implements NotesService {
    private final AllDAO allDAO;

    public NotesServiceImpl(AllDAO allDAO) {
        this.allDAO = allDAO;
    }

    @Override
    public void addNote(Notes notes) {
        allDAO.addNote(notes);
    }

    @Override
    public void getAllNotes() {
        allDAO.getAllNotes();
    }
}
