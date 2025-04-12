package com.designpatterns.solid.DIP.solution;
/*
* The Application now depends on the Database interface (abstraction), not its implementation,
* making it easier to swap database types.
* */
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        // MySQL connection logic
    }
}

class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}
