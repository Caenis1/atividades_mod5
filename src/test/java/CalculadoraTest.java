import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import atividades_mod5.Calculadora;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void deveSomarCorretamente() {
        assertEquals(5, calc.adicionar(2, 3));
    }

    @Test
    void deveSubtrairCorretamente() {
        assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    void deveMultiplicarCorretamente() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void deveDividirCorretamente() {
        assertEquals(2, calc.dividir(4, 2));
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(4, 0));
    }

    @Test
    void deveFuncionarComNumerosNegativos() {
        assertEquals(-6, calc.multiplicar(-2, 3));
    }
}
