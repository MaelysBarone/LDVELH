package com.arcreane.ldvelh.repository.db;

import com.arcreane.ldvelh.model.Book;
import com.arcreane.ldvelh.model.Chapter;
import com.arcreane.ldvelh.repository.IRepository;

import java.util.List;

//@Repository
public class DBRepository implements IRepository {
    public DBRepository() {
    }

    public void saveBookToDatabase(Book book) {
        //Access to database and save book information
    }

    public void recordChanges() {
        //Save changes to database
    }

    public void loadSavePages() {
        //access to the database to retrieve the work done up until now
    }

    public void saveCover(Book book) {
        // Save image as big object
    }

    public void addChapter(Chapter chapter) {
        //Save chapter information
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void saveBook(Book book) {

    }

    @Override
    public List<Book> listLibraryBooks() {
        return null;
    }

    @Override
    public Book getBook(int index) {
        return null;
    }

    @Override
    public Book findBookWithTitle(String bookTitle) {
        return null;
    }
}
