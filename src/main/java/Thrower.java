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
     * Method for throw CustomException
     * @throws CustomException
     */
    public void throwCustomException() throws CustomException {
        throw new CustomException();
    }
}
