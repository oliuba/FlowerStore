package db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    private Connection connection;

    @Test
    void getConnection() {
        assertNull(connection);
        connection = Connection.getConnection();
        assertEquals(connection, Connection.getConnection());
    }
}