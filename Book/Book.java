package Book;

/**
 * Клас представляє книгу з такими властивостями, як ідентифікатор, назва, автор, видавництво, рік видання,
 * кількість сторінок і ціна.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    /**
     * Конструктор для створення об'єкта Book.
     *
     * @param id        Ідентифікатор книги
     * @param title     Назва книги
     * @param author    Автор книги
     * @param publisher Видавництво
     * @param year      Рік видання
     * @param pages     Кількість сторінок
     * @param price     Ціна книги
     */
    public Book(int id, String title, String author, String publisher, int year, int pages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    /**
     * Повертає ідентифікатор книги.
     *
     * @return id книги
     */
    public int getId() { return id; }

    /**
     * Встановлює ідентифікатор книги.
     *
     * @param id новий ідентифікатор
     */
    public void setId(int id) { this.id = id; }

    /**
     * Повертає назву книги.
     *
     * @return назва книги
     */
    public String getTitle() { return title; }

    /**
     * Встановлює назву книги.
     *
     * @param title нова назва
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * Повертає автора книги.
     *
     * @return автор книги
     */
    public String getAuthor() { return author; }

    /**
     * Встановлює автора книги.
     *
     * @param author новий автор
     */
    public void setAuthor(String author) { this.author = author; }

    /**
     * Повертає видавництво книги.
     *
     * @return назва видавництва
     */
    public String getPublisher() { return publisher; }

    /**
     * Встановлює видавництво книги.
     *
     * @param publisher нове видавництво
     */
    public void setPublisher(String publisher) { this.publisher = publisher; }

    /**
     * Повертає рік видання книги.
     *
     * @return рік видання
     */
    public int getYear() { return year; }

    /**
     * Встановлює рік видання книги.
     *
     * @param year новий рік видання
     */
    public void setYear(int year) { this.year = year; }

    /**
     * Повертає кількість сторінок у книзі.
     *
     * @return кількість сторінок
     */
    public int getPages() { return pages; }

/**
 * Встанов
