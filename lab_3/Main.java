import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cinema> cinemas = new ArrayList<>();
        boolean[][] seatsConfiguration =
                {{true, true, true, true, true}, {false, true, true, true, false}, {false, false, true, false, false}};
        Hall hall = new Hall(seatsConfiguration);
        Cinema cinema = new Cinema(hall);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите вариант действий:(Admin, User, Exit)");
            String choice = scan.nextLine();
            if (choice.equals("Admin")) {
                System.out.println("Вы выбрали вариант Admin.Вы зашли как администратор.");
                Admin aui = new Admin(cinemas);
                aui.addCinema(cinema);
                aui.start();
            } else if (choice.equals("User")) {
                System.out.println("Вы выбрали вариант User. Вы зашли как пользователь.");
                User uui = new User(cinemas);
                uui.start();
            } else if (choice.equals("Exit")) {
                System.out.println("Вы выбрали вариант Exit. Программа будет закрыта.");
                break;
            } else {
                System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        }
    }

}
