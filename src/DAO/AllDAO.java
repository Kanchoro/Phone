package DAO;

import Models.Bank;
import Models.Notes;

public interface AllDAO {
    void addMoney (Bank money);
    void getAllMoney();
    void summa(int firstNumber , char symbol , int secondNumber);
    void addNote(Notes notes);
    void getAllNotes();
}
