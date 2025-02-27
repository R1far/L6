import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Reader[] students = new Reader[5];
        students[0] = new Reader("Абрамов М.Б.", 10, "Дизайн", "26.03.1995", "89991112233");
        students[1] = new Reader("Пушкин Е.И.", 11, "Программист", "17.04.1999", "89555553344");
        students[2] = new Reader("Лермонтов Д.С.", 12, "Физика", "01.08.1989", "89999999999");
        students[3] = new Reader("Кульбаков И.Е.", 13, "Биология", "18.09.1996", "89544543454");
        students[4] = new Reader("Фирстов В.А.", 101, "Программист", "19.06.2000", "89882223344");

        System.out.print("Сколько книг ты хочешь взять: ");
        int takeCount = in.nextInt();
        in.nextLine();

        String[] booksToTake = new String[takeCount];
        for (int i = 0; i < takeCount; i++) {
            System.out.print("Введеи книгу которую хотите взять " + (i + 1) + ": ");
            booksToTake[i] = in.nextLine();
        }

        System.out.print("Сколько книг хочешь вернуть: ");
        int returnCount = in.nextInt();
        in.nextLine();

        String[] booksToReturn = new String[returnCount];
        for (int i = 0; i < returnCount; i++) {
            System.out.print("Какую книгу хочешь вернуть " + (i + 1) + ": ");
            booksToReturn[i] = in.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            students[i].takeBook(takeCount);
            students[i].takeBook(booksToTake);
            students[i].returnBook(returnCount);
            students[i].returnBook(booksToReturn);
        }
    }
}

class Reader {
    String name;
    int tickets;
    String direction;
    String birth;
    String numberTel;

    Reader(String name, int tickets, String direction, String birth, String numberTel) {
        this.name = name;
        this.tickets = tickets;
        this.direction = direction;
        this.birth = birth;
        this.numberTel = numberTel;
    }

    public void takeBook(int numbook) {
        if (numbook == 1) {
            System.out.println(name + " взял " + numbook + " книгу");
        } else {
            System.out.println(name + " взял " + numbook + " книги");
        }
    }
    //Изменил
    public void takeBook(String... namebook) {
        System.out.print(name + " взял книги: ");
        for (int i = 0; i < namebook.length; i++) {
            System.out.print(namebook[i]);
            if (i < namebook.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(int numbook) {
        if (numbook == 1) {
            System.out.println(name + " вернул " + numbook + " книгу");
        } else {
            System.out.println(name + " вернул " + numbook + " книги");
        }
    }
    //Изменил
    public void returnBook(String... namebook) {
        System.out.print(name + " вернул книги: ");
        for (int i = 0; i < namebook.length; i++) {
            System.out.print(namebook[i]);
            if (i < namebook.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
