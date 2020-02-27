//package com.example.MProject.daoApi;
//
//import com.example.MProject.domainModel.Book;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
//public class BookDao implements Dao<Book> {
//
//    private List<Book> books = new ArrayList<>();
//
//    public BookDao() {
//       books.add(new Book("Shtorfita Rosie","Fratii Buzescu"));
//       books.add(new Book("Moartea Codului","Soti Marin cu Familia"));
//    }
//
//    @Override
//    public Optional<Book> get(int id) {
//        return Optional.ofNullable(books.get((int) id));
//    }
//
//    @Override
//    public List<Book> getAll() {
//        return books;
//    }
//
//    @Override
//    public void save(Book b) {
//        books.add(b);
//    }
//
//    @Override
//    public void update(Book b, String[] params) {
//        b.setName(Objects.requireNonNull(params[0],"Name cannot be null"));
//        b.setAuthor(Objects.requireNonNull(params[1],"Author cannot be null"));
//    }
//
//    @Override
//    public void delete(Book b) {
//        books.remove(b);
//    }
//}
