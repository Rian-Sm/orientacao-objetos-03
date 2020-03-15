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

    }
    public static Correntista criarCorrentista(String nome, String email, Integer idade, Double salario){
        return new Correntista(nome, email, idade, salario);
    }

    public void setSalario(Double salario) {
        if (salario<0){
            throw new IllegalArgumentException("valor ivalido");
        }
        this.salario = salario;
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

    public String ObterDados(){
        return nome + ", " + idade + " anos (" + email + ")";
    }
    public void promover(Double porcentagem){
        if (porcentagem<0 || porcentagem>100)
            throw new IllegalArgumentException("valor ivalido");
        salario = salario + (salario*porcentagem/100);
    }
}
