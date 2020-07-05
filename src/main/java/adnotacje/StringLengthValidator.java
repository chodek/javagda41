package adnotacje;

import java.lang.reflect.Field;

public class StringLengthValidator {
    public static boolean validate(Object o) throws IllegalAccessException {
        // z obiektu pobieram jego pola
        Field[] fields = o.getClass().getDeclaredFields();
        // dla każdego pola robie sprawdzenie czy posiada moja adnotacje
        for (Field field : fields) {
            MaxLength annotation = field.getAnnotation(MaxLength.class);
            if (annotation != null) {
                // dla adnotacji weryfikuje czy istnieje (jeśli nie istnieje: annotation == null)
                field.setAccessible(true); // upubliczniam pole
                int length = ((String) field.get(o)).length(); // pobieram wartość pola field z obiektu o
                field.setAccessible(false);
                if (length > annotation.maxLength()) { // weryfikuje wartość z min/max z adnotacji
                    return false; // wartość wykracza poza zakres
                }
            }
        }
        return true;
    }
}