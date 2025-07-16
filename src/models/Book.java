package models;

public class Book {
    private String titulo;
    private String autor;
    private int anio;
    
    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.toLowerCase().hashCode());
        result = prime * result + anio;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equalsIgnoreCase(other.titulo))
            return false;
        return anio == other.anio;
    }


    @Override
    public String toString() {
        return "Book [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + "]";
    }
}
