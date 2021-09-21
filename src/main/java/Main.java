/**
 * Calss for exception handling
 */
public class Main {
    /**
     * Handling
     * @param args array args
     */
    public static void main(String[] args) {
        Thrower thrower = new Thrower();

        try {
            thrower.throwException();
        } catch (Exception e) {
            System.out.println("Checked");
        }
    }
}
