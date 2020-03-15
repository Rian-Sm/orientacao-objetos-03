package exercicios;

public class Correntista {
    private String nome;
    private String email;
    private Integer idade;
    private Double salario;

    public Correntista(String nome, String email, Integer idade,Double salario){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.salario = salario;
    }
    public static Correntista criarCorrentista(String nome, String email, Integer idade, Double salario){
        return new Correntista(nome, email, idade, salario);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getSalario() {
        return salario;
    }

}
