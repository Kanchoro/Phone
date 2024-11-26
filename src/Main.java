import DAO.AllDAO;
import DAO.Impl.AllDAOImpl;
import Models.Bank;
import Models.Notes;
import Service.Impl.BankServiceImpl;
import Service.Impl.CalculationServiceImpl;
import Service.Impl.NotesServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        AllDAOImpl allDAO = new AllDAOImpl();
        BankServiceImpl bankService = new BankServiceImpl(allDAO);

        CalculationServiceImpl calculationService = new CalculationServiceImpl(allDAO);

        NotesServiceImpl notesService = new NotesServiceImpl(allDAO);


        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    1.Bank!
                    2.Calculation!
                    3.Notes!
                    4.Exit!
                    """);
            System.out.print("Write the number: ");
            int number = scanner.nextInt();
            while (true) {
                switch (number) {
                    case 1 -> {
                        System.out.println("""
                                1.Add money!
                                2.Bank account!
                                """);
                        System.out.print("Write the number: ");
                        int number2 = scanner.nextInt();
                        switch (number2) {
                            case 1 -> {
                                System.out.print("Money: ");
                                int money = scanner.nextInt();
                                bankService.addMoney(new Bank(money));
                            }
                            case 2 -> {
                                bankService.getAllMoney();
                            }
                        }
                    }
                    case 2-> {
                        System.out.print("First number: ");
                        int firstNumber = scanner.nextInt();
                        System.out.print("(+,-,/,*,%): ");
                        char symbol = scanner.next().charAt(0);
                        System.out.print("Second number: ");
                        int secondNumber = scanner.nextInt();
                        calculationService.summa(firstNumber,symbol,secondNumber);
                    }
                    case 3->{
                        System.out.println("1.Add note\n2.All notes");
                        int number2 = scanner.nextInt();
                        switch (number2) {
                            case 1 -> {
                                System.out.println("Write the note: ");
                                String note = scanner2.nextLine();
                                notesService.addNote(new Notes(note));
                            }
                            case 2->{
                                notesService.getAllNotes();
                            }
                        }
                    }
                    case 4->{
                        System.out.println("Bye-bye!");
                        return;
                    }
                    default -> System.out.println("Invalid number!!!");

                }
                System.out.println("1.Back!\n2.Continue");
                System.out.print("Write the number: ");
                int number3 = scanner.nextInt();
                if (number3==1)break;
            }
        }
    }
}