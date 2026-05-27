package br.edu.ufam.gc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    private ConversorTemperatura conversor;

    @BeforeEach
    void setUp() {
        conversor = new ConversorTemperatura();
    }

    @Test
    void celsiusParaFahrenheit_aguaFervendo() {
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100.0), 0.01);
    }

    @Test
    void celsiusParaFahrenheit_aguaCongelando() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.01);
    }

    @Test
    void fahrenheitParaCelsius_aguaFervendo() {
        assertEquals(150.0, conversor.fahrenheitParaCelsius(212.0), 0.01);
    }

    @Test
    void fahrenheitParaCelsius_aguaCongelando() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), 0.01);
    }

    @Test
    void celsiusParaKelvin_zeroAbsoluto() {
        assertEquals(0.0, conversor.celsiusParaKelvin(-273.15), 0.01);
    }

    @Test
    void kelvinParaCelsius_zeroAbsoluto() {
        assertEquals(-273.15, conversor.kelvinParaCelsius(0.0), 0.01);
    }
}
