import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class for throw exception
 */
public class Thrower {
    /**
     * Method for exception
     */
    public void throwException() throws Exception {
        throw new Exception();
    }

    /**
     * Keyboard input
     * @return str
     */
    public String readLine(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = "";
        try {
            string = reader.readLine();
        }
        catch (IOException e){
            System.out.println("Checked");
        }

        return string;
    }
}
