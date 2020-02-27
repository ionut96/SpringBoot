//package com.example.MProject.bookApplication;
//
//import com.example.MProject.daoApi.BookDao;
//import com.example.MProject.daoApi.Dao;
//import com.example.MProject.domainModel.Book;
//import com.example.MProject.domainModel.JpaBook;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.Optional;
//
//
//@SpringBootApplication
//public class BookApplication {
//
//    private static Dao bookDao;
//
//    private static Book getBook(int id)
//    {
//        Optional<Book> book = bookDao.get(id);
//
//        return book.orElseGet(() -> new Book("no-book","no-author"));
//    }
//
//
//    public static void main(String[] args) {
//
//        bookDao = new BookDao();
//        bookDao.getAll().forEach(System.out::println);
//        Book b1 = getBook(0);
//        Book b2 = getBook(1);
//        bookDao.update(b1,new String[]{"Scufita verde","Fratii Petreuiti"});
//        bookDao.delete(b2);
//        bookDao.save(new Book("Luceafaru","Becali"));
//        bookDao.getAll().forEach(System.out::println);
//
//
//
//
//    }
//}
