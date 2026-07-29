package Construtores;

/**
 * Construtores Múltiplos (Sobrecarga de Construtores)
 * Uma classe pode ter múltiplos construtores com listas de parâmetros diferentes. 
 * Isso é conhecido como sobrecarga de construtores. 
 * Permite criar objetos de maneiras diferentes, 
 * proporcionando flexibilidade na inicialização de objetos.
 */

class Book {
    String title;
    String author;
    int publicationYear;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        publicationYear = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor with title and author
    public Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
        publicationYear = 0;
        System.out.println("Parameterized constructor (title, author) called");
    }

    // Parameterized constructor with title, author, and publication year
    public Book(String bookTitle, String bookAuthor, int year) {
        title = bookTitle;
        author = bookAuthor;
        publicationYear = year;
        System.out.println("Parameterized constructor (title, author, year) called");
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        Book book1 = new Book(); // Calls the default constructor
        book1.displayDetails();

        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien"); // Calls the constructor with title and author
        book2.displayDetails();

        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 1813); // Calls the constructor with title, author, and year
        book3.displayDetails();
    }
}

/*
Neste exemplo:
A Bookclasse possui três construtores: um construtor padrão, 
um construtor com titlee author, e um construtor com title, author, e publicationYear.
Dependendo dos argumentos fornecidos ao criar um Bookobjeto, o construtor apropriado é chamado.
*/