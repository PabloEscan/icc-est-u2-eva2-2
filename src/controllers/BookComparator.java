package controllers;

import java.util.Comparator;

import models.Book;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int cmpTitulo = b2.getTitulo().compareToIgnoreCase(b1.getTitulo());
        if (cmpTitulo != 0) return cmpTitulo;

        int cmpAnio = Integer.compare(b1.getAnio(), b2.getAnio());
        if (cmpAnio != 0) return cmpAnio;

        return 0;
    }
}
