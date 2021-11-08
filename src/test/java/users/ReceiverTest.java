package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    private Receiver receiver1;
    private Receiver receiver2;
    private PrintStream standardOut = System.out;
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        receiver1 = new Receiver();
        receiver2 = new Receiver();
    }

    @Test
    void update() {
        receiver1.update("Flowers have arrived");
        receiver2.update("Flowers were sent");
        assertEquals("Receiver 1: Flowers have arrived\nReceiver 2: Flowers were sent", outputStreamCaptor.toString().trim());
    }
}