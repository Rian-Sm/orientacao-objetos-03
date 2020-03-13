package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    private Retangulo r1;
    @BeforeEach
    public void beforeEach() {
        r1 = new Retangulo(10.0, 15.0);
    }
    @AfterEach
    public void afterEach() {
        r1 = null;
    }

    @Test
    public void criarObjRetangulo(){
        assertNotNull(r1);
    }
    @Test
    public void criarObjRetanguloMetodoEstatico(){
        Retangulo r2 = Retangulo.criarRetangolo(2.0, 4.5);
        assertNotNull(r2);
        assertEquals(2.0, r2.getLado() );
        assertEquals(4.5, r2.getAltura());
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(r1.getAltura());
        assertNotNull(r1.getLado());
    }
    @Test
    public void metodoSetLadoAltura(){
        r1.setAltura(15.0);
        r1.setLado(20.0);
        assertEquals(20.0, r1.getLado());
        assertEquals(15.0, r1.getAltura());
    }
    @Test
    public void metodoSetLadoAlturaInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setLado(-20.0));
        assertEquals("Número deve ser maior que zero.", exception.getMessage());
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> r1.setAltura(-30.0));
        assertEquals("Número deve ser maior que zero.", exception2.getMessage());
    }

    @Test
    public void metodoCalcularArea(){
        assertEquals(150.0, r1.calcularArea());
    }
    @Test void metodoCalcularPerimetro(){
        assertEquals(50.0, r1.calcularPerimetro());
    }
}
