package org.example;

import java.util.Scanner;

public class CheckData {
    public static boolean checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length() > 20){
            throw new WrongLoginException("Ошибка логина");
        }
        if(password.length() > 20 || !password.equals(confirmPassword)){
            throw new WrongPasswordException("Ошибка ввода пароля");
        }
        return true;
    }



}


