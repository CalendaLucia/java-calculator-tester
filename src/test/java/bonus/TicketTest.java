package bonus;

import calculator.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void testValidTicket() {
        // Creazione di un ticket valido con 100 km e un'età di 30 anni
        Ticket ticket = new Ticket(100, 30);
        BigDecimal result = ticket.getFullPrice();
        BigDecimal expected = BigDecimal.valueOf(21.0);
        assertEquals(expected, result);
    }

    @Test
    void testInvalidKilometers() {
        // Creazione di un ticket con numero di chilometri negativo
        assertThrows(IllegalArgumentException.class, () -> {
            Ticket ticket = new Ticket(-100, 30);
        });
    }

    @Test
    void testInvalidAge() {
        // Creazione di un ticket con età negativa
        assertThrows(IllegalArgumentException.class, () -> {
            Ticket ticket = new Ticket(100, -30);
        });
    }

    @Test
    void testMinorsDiscount() {
        // Creazione di un ticket con 100 km e un'età minore di 18 anni (sconto del 20%)
        Ticket ticket = new Ticket(100, 16);
        BigDecimal result = ticket.getFullPrice();
        BigDecimal expected = BigDecimal.valueOf(16.8);
        assertEquals(expected, result);
    }

    @Test
    void testOver60Discount() {
        // Creazione di un ticket con 100 km e un'età maggiore o uguale a 65 anni (sconto del 40%)
        Ticket ticket = new Ticket(100, 70);
        BigDecimal result = ticket.getFullPrice();
        BigDecimal expected = BigDecimal.valueOf(12.6);
        assertEquals(expected, result);
    }
}