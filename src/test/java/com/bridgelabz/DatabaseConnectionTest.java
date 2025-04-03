package com.bridgelabz;

import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnection() {
        Assertions.assertTrue(db.isConnected);
    }
}

