/**
 * Class for exception handling
 */
public class Main {
    /**
     * Handling
     * @param args array args
     */
    public static void main(String[] args) {
        Thrower thrower = new Thrower();

        try {
            thrower.throwCustomException();
        } catch (CustomException e) {
            System.out.println(e.exception);
        }
    }
}
