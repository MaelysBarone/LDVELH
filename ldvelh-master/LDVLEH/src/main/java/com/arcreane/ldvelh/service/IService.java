package com.arcreane.ldvelh.service;

import com.arcreane.ldvelh.model.Book;
import com.arcreane.ldvelh.model.Chapter;
import com.arcreane.ldvelh.repository.IRepository;

import java.util.List;

public interface IService {
    void addBookToLibrary(Book book);

    List<Book> getExistingBookList();

    Book getBookWithTitle(String bookTitle);

    void saveBookContent(Book book);

    void parseBookForMissingChapter(Book book);

    void addBookCover(Book scannedBook);

    Chapter addChapter(Book currentBook);

    void setRepository(IRepository myRepository);
}
