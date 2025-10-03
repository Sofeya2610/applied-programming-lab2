package Book;

/**
 * Клас для представлення книги з такими властивостями, як id, назва, автор,
 * видавництво, рік видання, кількість сторінок і ціна.
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
     * Конструктор для створення об'єкта книги з усіма параметрами.
     *
     * @param id        ідентифікатор книги
     * @param title     назва книги
     * @param author    автор книги
     * @param publisher видавництво книги
     * @param year      рік видання книги
     * @param pages     кількість сторінок книги
     * @param price     ціна книги
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
     * Повертає id книги.
     * @return id книги
     */
    public int getId() { return id; }

    /**
     * Встановлює id книги.
     * @param id новий id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Повертає назву книги.
     * @return назва книги
     */
    public String getTitle() { return title; }

    /**
     * Встановлює назву книги.
     * @param title нова назва
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * Повертає автора книги.
     * @return автор книги
     */
    public String getAuthor() { return author; }

    /**
     * Встановлює автора книги.
     * @param author новий автор
     */
    public void setAuthor(String author) { this.author = author; }

    /**
     * Повертає видавництво книги.
     * @return видавництво книги
     */
    public String getPublisher() { return publisher; }

    /**
     * Встановлює видавництво книги.
     * @param publisher нове видавництво
     */
    public void setPublisher(String publisher) { this.publisher = publisher; }

    /**
     * Повертає рік видання книги.
     * @return рік видання
     */
    public int getYear() { return year; }

    /**
     * Встановлює рік видання книги.
     * @param year новий рік видання
     */
    public void setYear(int year) { this.year = year; }

    /**
     * Повертає кількість сторінок книги.
     * @return кількість сторінок
     */
    public int getPages() { return pages; }

    /**
     * Встановлює кількість сторінок.
     * @param pages нова кількість сторінок
     */
    public void setPages(int pages) { this.pages = pages; }

    /**
     * Повертає ціну книги.
     * @return ціна книги
     */
    public double getPrice() { return price; }

    /**
     * Встановлює ціну книги.
     * @param price нова ціна
     */
    public void setPrice(double price) { this.price = price; }

    /**
     * Повертає рядок з усіма полями книги.
     * @return інформація про книгу як текст
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Назва='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Видавництво='" + publisher + '\'' +
                ", Рік=" + year +
                ", Сторінки=" + pages +
                ", Ціна=" + price +
                '}';
    }
}
