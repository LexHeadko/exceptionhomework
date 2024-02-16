package org.example;

import java.io.IOException;

public class WrongPasswordException extends IOException {
    public WrongPasswordException(String massage) {
        super(massage);
    }
}
