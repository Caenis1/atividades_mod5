import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

    Fibonacci fib = new Fibonacci();

    @Test
    void deveRetornarZeroParaNZero() {
        assertEquals(0, fib.calcular(0));
    }

    @Test
    void deveRetornarUmParaNUm() {
        assertEquals(1, fib.calcular(1));
    }

    @Test
    void deveCalcularValorCorretoParaNumeroMedio() {
        assertEquals(5, fib.calcular(5));
        assertEquals(13, fib.calcular(7));
    }

    @Test
    void deveLancarExcecaoParaNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> fib.calcular(-1));
    }
}
