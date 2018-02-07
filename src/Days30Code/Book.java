package Days30Code;

import java.util.Scanner;

/**
 *
 * @author Simone
 */
abstract class Book {

    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    abstract void display();

}

class MyBook extends Book {

    int price;

    public MyBook(String t, String a, int price) {
        super(t, a);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);

    }

}

class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();

    }
}
