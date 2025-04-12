package com.designpatterns.solid.DIP.voilation;
/*
* Definition: High-level modules should not depend on low-level modules. Both should depend on
*  abstractions.
* Problem: Application directly depends on the Database class. Changing the database
* type (e.g., to MongoDB) would require modifying the Application class.
* */
class Database {
    public void connect() {
        // Database connection logic
    }
}

class Application {
    private final Database database = new Database();

    public void start() {
        database.connect();
    }
}
