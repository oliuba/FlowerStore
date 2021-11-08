package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender sender1;
    private Sender sender2;
    private PrintStream standardOut = System.out;
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        sender1 = new Sender();
        sender2 = new Sender();
    }


    @Test
    void update() {
        sender1.update("Flowers have arrived");
        sender2.update("Flowers were sent");
        assertEquals("Sender 1: Flowers have arrived\nSender 2: Flowers were sent", outputStreamCaptor.toString().trim());
    }
}