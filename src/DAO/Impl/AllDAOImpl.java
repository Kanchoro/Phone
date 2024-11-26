package DAO.Impl;

import DAO.AllDAO;
import Models.Bank;
import Models.Notes;

import java.util.Arrays;

public class AllDAOImpl implements AllDAO {
    Bank [] moneys = new Bank [0];
    Notes [] notes = new Notes[0];
    private int size;
    private int size2;
    @Override
    public void addMoney(Bank money) {
        moneys= Arrays.copyOf(moneys,moneys.length+1);
        moneys[moneys.length-1]=money;
        size++;
        System.out.println(money);
    }

    @Override
    public void getAllMoney() {
        int sum = 0;
        for (Bank money : moneys) {
            sum += (int) money.getMoney();
        }
        System.out.println("Bank account: "+sum);
    }

    @Override
    public void summa(int firstNumber, char symbol, int secondNumber) {
        switch (symbol){
            case '-'->{
                System.out.println("Result!");
                System.out.println(firstNumber-secondNumber);
            }
            case '+'->{
                System.out.println("Result!");
                System.out.println(firstNumber+secondNumber);
            }
            case '/'->{
                System.out.println("Result!");
                System.out.println((double) firstNumber/secondNumber);
            }
            case '*'->{
                System.out.println("Result!");
                System.out.println(firstNumber*secondNumber);
            }
            case'%'->{
                System.out.println("Result!");
                System.out.println((double) firstNumber%secondNumber);
            }
            default -> {
                System.out.println("Invalid symbol!!!");

            }
        }
    }

    @Override
    public void addNote(Notes note) {
        notes = Arrays.copyOf(notes,notes.length+1);
        notes[notes.length-1]=note;
        size2++;
        System.out.println("Successfully added!");
    }

    @Override
    public void getAllNotes() {
        for (Notes note : notes) {
            System.out.println(note);
        }
    }


}
