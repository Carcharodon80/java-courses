package com.petclinic;

/**
 * Класс-исключение
 */
public class UserException extends Exception {

    public UserException(final String message){
        super(message);
    }
}
