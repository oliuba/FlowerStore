package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy payment;

    @BeforeEach
    void setUp() {
        payment = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payment.pay(100));
    }
}