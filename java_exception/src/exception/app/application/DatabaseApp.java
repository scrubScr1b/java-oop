package exception.app.application;

import exception.app.exception.DBErrorException;

public class DatabaseApp {
    public static void ConnectDB(String user, String pass) {
        if(user.isEmpty() || pass.isEmpty()) {
            throw new DBErrorException("Fail connect to database");
        }

        System.out.println("Succes connect to database");
    }
    
}
