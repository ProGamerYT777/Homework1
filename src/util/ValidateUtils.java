package util;

import exceptions.WrongInputException;

public class ValidateUtils {
    public static String checkString(String string) throws WrongInputException {
        if (string == null || string.isEmpty() || string.isBlank()) {
            throw new WrongInputException("Некорректный ввод");
        } else {
            return string;
        }
    }
}
