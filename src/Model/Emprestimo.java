package Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Emprestimo {
    private int id;
    private Livro livro;
    private Usuario usuario;
    private Calendar dataEmprestimo;
    private Calendar dataPrevistaDevolucao;

    public Emprestimo() {
        this.dataEmprestimo = Calendar.getInstance();
        this.dataPrevistaDevolucao = Calendar.getInstance();
    }

    public Emprestimo(int id, Livro livro, Usuario usuario, Calendar dataEmprestimo, Calendar dataPrevistaDevolucao) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int ano, int mes, int dia) {
        this.dataEmprestimo = Calendar.getInstance();
        this.dataEmprestimo.set(ano, mes - 1, dia);
    }

    public Calendar getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(int ano, int mes, int dia) {
        this.dataPrevistaDevolucao = Calendar.getInstance();
        this.dataPrevistaDevolucao.set(ano, mes - 1, dia);
    }

    @Override
    public String toString() {
        return "Emprestimo\n" +
                "ID: " + this.id + "\n" +
                "Livro: " + livro + "\n" +
                "Usuario: " + usuario + "\n" +
                "Data Emprestimo: " + (dataEmprestimo) + "\n" +
                "Data Prevista Devolucao: " + (dataPrevistaDevolucao);
    }

    public void setDataEmprestimo() {
    }

    public void setDataPrevistaDevolucao() {
    }
}
