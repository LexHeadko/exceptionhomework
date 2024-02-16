package org.example;

public class LoopChecker implements Checker {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
    @Override
    public void checkLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Длина логина не должна привышать 20 символов");
        }
        for (int i = 0; i < login.length(); i++) {
            if (!ALPHABET.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Логин содержит не допустимый символ: '%c'".formatted(login.charAt(i)));
            }
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        if (password.length() > 20) {
            throw new WrongPasswordException("Длина пароля не должна привышать 20 символов");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!ALPHABET.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException("Пароль содержит не допустимый символ: '%c'".formatted(password.charAt(i)));
            }
        }
    }
}
