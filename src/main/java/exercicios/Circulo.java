package exercicios;

public class Circulo {
    private Double raio;

    public Circulo(Double raio){
        setRaio(raio);
    }
    public static Circulo criarCirculo(Double raio){
        return new Circulo(raio);
    }

    public Double getRaio(){
        return raio;
    }

    public void setRaio(Double raio){
        if(raio<=0)
            throw new IllegalArgumentException("valor invalido para raio");
        this.raio = raio;
    }

    public Double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public Double calcularPerimetro(){
        return Math.PI * raio * 2;
    }
}
