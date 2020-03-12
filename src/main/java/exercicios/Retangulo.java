package exercicios;

public class Retangulo {
    private Double lado;
    private Double altura;

    public Double getAltura() {
        return altura;
    }

    public Double getLado() {
        return lado;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    public Retangulo(Double lado, Double altura){
        this.setLado(lado);
        this.setAltura(altura)
    }
    public static Retangulo criarRetangolo(Double lado, Double altura){
        return new Retangulo(lado, altura);
    }
    public Double calcularArea(){
        return lado*altura;
    }
    public Double calcularPerimetro(){
        return 2*(lado+altura);
    }
}
