package com.bridgelabz;

class DatabaseConnection {
    boolean isConnected = false;

    void connect() {
        isConnected = true;
    }

    void disconnect() {
        isConnected = false;
    }
}

