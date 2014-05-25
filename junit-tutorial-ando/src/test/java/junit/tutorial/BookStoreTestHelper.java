// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

public class BookStoreTestHelper {

    public static Book Bookオブジェクトの作成_MartinFowlerのRefactoring() {
        Book book = new Book();
        book.setTitle("Refactoring");
        book.setPrice(4500);
        Author author = new Author();
        author.setLastName("Fowler");
        book.setAuthor(author);
        return book;
    } 
}
