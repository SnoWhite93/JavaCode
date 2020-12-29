package exceptions;

public class BadIngredientException extends RuntimeException{

    public BadIngredientException(String message) {
        super(message);
    }

}
