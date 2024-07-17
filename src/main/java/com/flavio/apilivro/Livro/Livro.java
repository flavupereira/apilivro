package com.flavio.apilivro.Livro;

public class Livro {
    private Long id;
    private String titulo;
    private String autor;
    private String idioma;
    int numero_Downloads;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNumero_Downloads() {
        return numero_Downloads;
    }

    public void setNumero_Downloads(int numero_Downloads) {
        this.numero_Downloads = numero_Downloads;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idioma='" + idioma + '\'' +
                ", numero_Downloads=" + numero_Downloads +
                '}';
    }
}
