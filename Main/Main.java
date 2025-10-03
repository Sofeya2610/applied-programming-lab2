package Main;

import Book.Book;
import java.util.Scanner;

/**
 * Основний клас програми для роботи з масивом книг і виводу даних за різними критеріями.
 */
public class Main {

    /**
     * Виводить список книг заданого автора.
     *
     * @param books  масив книг
     * @param author автор для пошуку
     */
    public static void printBooksByAuthor(Book[] books, String author) {
        System.out.println("Книги автора: " + author);
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b);
            }
        }
    }

    /**
     * Виводить список книг заданого видавництва.
     *
     * @param books     масив книг
     * @param publisher назва видавництва для пошуку
     */
    public static void printBooksByPublisher(Book[] books, String publisher) {
        System.out.println("Книги видавництва: " + publisher);
        for (Book b : books) {
            if (b.getPublisher().equalsIgnoreCase(publisher)) {
                System.out.println(b);
            }
        }
    }

    /**
     * Виводить список книг, що видані після заданого року.
     *
     * @param books масив книг
     * @param year  рік, після якого мають бути видані книги
     */
    public static void printBooksAfterYear(Book[] books, int year) {
        System.out.println("Книги після року: " + year);
        for (Book b : books) {
            if (b.getYear() > year) {
                System.out.println(b);
            }
        }
    }

    /**
     * Точка входу в програму. Запитує користувача щодо автора, видавництва та року
     * і виводить відповідні книги.
     *
     * @param args параметри командного рядка
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {
                new Book(1, "Місто", "Валер'ян Підмогильний", "Книгоспілка", 1928, 350, 250.50),
                new Book(2, "Кобзар", "Тарас Шевченко", "Веселка", 1840, 500, 300.00),
                new Book(3, "Хіба ревуть воли...", "Панас Мирний", "Освіта", 1880, 450, 280.75),
                new Book(4, "Записки українського самашедшого", "Ліна Костенко", "А-БА-БА-ГА-ЛА-МА-ГА", 2010, 400, 350.00),
                new Book(5, "Маруся Чурай", "Ліна Костенко", "Дніпро", 1979, 300, 220.40)
        };

        System.out.print("Введіть ім'я автора: ");
        String author = scanner.nextLine();
        printBooksByAuthor(books, author);
        System.out.println();

        System.out.print("Введіть назву видавництва: ");
        String publisher = scanner.nextLine();
        printBooksByPublisher(books, publisher);
        System.out.println();

        System.out.print("Введіть рік: ");
        int year = scanner.nextInt();
        printBooksAfterYear(books, year);

        scanner.close();
    }
}
