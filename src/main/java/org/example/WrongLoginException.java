package org.example;

import java.io.IOException;

public class WrongLoginException extends IOException {
    public WrongLoginException(String massage) {
        super(massage);
    }

}
