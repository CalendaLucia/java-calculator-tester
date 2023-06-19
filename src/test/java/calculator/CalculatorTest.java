package calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setup() {
        // Operazioni iniziali comuni a tutti i test
        // Ad esempio, creazione di una nuova istanza della calcolatrice
        calculator = new Calculator();
    }

    @Test
    @DisplayName("NegativeNumbers")
    void add() {
        // Chiamiamo il metodo add() della calcolatrice passando due numeri negativi (-2.5 e -3.7) come argomenti
        float result = calculator.add(-2.5f, -3.7f);
        // Definiamo il risultato atteso, che nel caso di questo test è -6.2
        float expected = -6.2f;
        // Verifichiamo se il risultato ottenuto (result) è uguale al risultato atteso (expected) con una tolleranza di 0.0001
        assertEquals(expected, result, 0.0001);
    }

    @Test
    void subtract() {
        float result = calculator.subtract(5.9f, 1.2f);
        float expected = 4.7f;
        assertEquals(expected, result, 0.0001);
    }


    @Test
    void divide() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10.0f, 0.0f));
    }

    @Test
    void multiply() {
        float result = calculator.multiply(2.5f, 3.0f);
        float expected = 7.5f;
        assertEquals(expected, result, 0.0001);
    }


}