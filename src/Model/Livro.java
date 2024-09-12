package Model;

public class Livro {
    private int id;
    private String titulo;
    private String isbn;
    private String autor;
    private int quantidade;
    // construtor vazio
    // construtor comm todos os atributos
    // getter e setter

    public Livro() {
    }

    public Livro(int id, String titulo, String isbn, Autor autor, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = String.valueOf(autor);
        this.quantidade = quantidade;
    }

    public static void SetQuantidade(String s) {
    }

    public int getId() {
        return 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro\n" +
                "ID:" + this.id + "\n" +
                "Título: " + titulo + "\n" +
                "ISBN: " + isbn + "\n" +
                "Autor: " + autor + "\n" +
                "Quantidade: " + quantidade;
    }
}