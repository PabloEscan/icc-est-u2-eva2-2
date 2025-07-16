package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Book;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> libros){
        Map<Book, Book> mapaLibros = new HashMap<>();

        for (Book libro : libros) {
            if (!mapaLibros.containsKey(libro)) {
                mapaLibros.put(libro, libro);
            }
        }

        return mapaLibros;
    }
}
