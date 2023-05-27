package exception.app.utils;

import exception.app.data.LoginRequest;
import exception.app.exception.MyCustomException;

public class ValidationUtils {
    public static void LoginValidate(LoginRequest request) throws MyCustomException{
        if (request.username.isEmpty()) {
            throw new MyCustomException("username is blank");
        } else if(request.password.isEmpty()) {
            throw new MyCustomException("password is blank");
        }
        
    }
}
