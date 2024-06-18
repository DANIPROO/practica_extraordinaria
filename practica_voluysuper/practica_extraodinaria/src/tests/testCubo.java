package tests;

import org.junit.Test;
import clases.cubo;
import static org.junit.jupiter.api.Assertions.*;

public class testCubo {
    @Test
    public void testCuboConstructor() {
        cubo cubo = new cubo(5);
        assertEquals(5, cubo.getLado());

        assertThrows(IllegalArgumentException.class, () -> new cubo(0));

        assertThrows(IllegalArgumentException.class, () -> new cubo(-5));
    }

    @Test
    public void testCuboMetodos() {
        cubo cubo = new cubo(3);
        assertEquals(54.0, cubo.Superficie(), 0.01);
        assertEquals(27.0, cubo.Volumen(), 0.01);
    }
}