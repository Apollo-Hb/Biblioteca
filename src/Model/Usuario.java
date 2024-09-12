package Model;

public class Usuario {
    private int id;
    private String nome;
    private String matricula;
    // construtor vazio
    // construtor comm todos os atributos
    // getter e setter

    public Usuario() {
    }

    public Usuario(int id, String nome, String matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Usuario\n" +
                "ID:" + this.id + "\n" +
                "Nome: " + nome + "\n" +
                "Matricula: " + matricula;
    }
}
