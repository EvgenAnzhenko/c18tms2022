package ru.autorization.service;

public class Main {

    static void checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (length(login) && login.matches(("^[a-zA-Z0-9_]+$"))) {
            System.out.println("Логин введен правильно");
        } else {
            throw new WrongLoginException("Ошибка ввода Логина");
        }
        if (length(password) && login.matches(("^[a-zA-Z0-9_]+$")) && password.equals(confirmPassword)) {
            System.out.println("Пароль введен правильно");
        } else {
            throw new WrongPasswordException("Ошибка ввода пароля");
        }
    }

    static private boolean length(String login) {
        boolean flag = false;
        if (login.length() < 20) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        try {
            Main.checkAuthorization("sdssdsddfddd", "5456461", "545646");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}


