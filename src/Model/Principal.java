package Model;

import javax.swing.*;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do livro:")));
        livro.setTitulo(JOptionPane.showInputDialog("Digite o título do livro:"));;
        livro.setIsbn(JOptionPane.showInputDialog("Digite a ISBN do livro:"));;
        livro.setAutor(JOptionPane.showInputDialog("Digite o nome do autor do livro:"));
        livro.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de livros:")));

        Autor autor = new Autor();
        autor.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do autor:")));
        autor.setNome(JOptionPane.showInputDialog("Digite o nome do autor:"));

        Usuario usuario = new Usuario();
        usuario.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do usuário:")));
        usuario.setNome(JOptionPane.showInputDialog("Digite o nome do usuário:"));
        usuario.setMatricula(JOptionPane.showInputDialog("Digite a matrícula do usuário:"));

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do empréstimo:")));
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);

        Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do empréstimo:"));
        Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do empréstimo:"));
        Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do empréstimo:"));


        Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da devolução:"));
        Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da devolução:"));
        Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da devolução:"));

        System.out.println("Livro:");
        System.out.println("ID: " + livro.getId());
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Quantidade: " + livro.getQuantidade());

        System.out.println("\nAutor:");
        System.out.println("ID: " + autor.getId());
        System.out.println("Nome: " + autor.getNome());

        System.out.println("\nUsuário:");
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Matrícula: " + usuario.getMatricula());

        System.out.println("\nEmpréstimo:");
        System.out.println("ID: " + emprestimo.getId());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo().getTime());
        System.out.println("Data Prevista de Devolução: " + emprestimo.getDataPrevistaDevolucao().getTime());
    }
}
