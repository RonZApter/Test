import java.lang.invoke.StringConcatException;

    public class ExceptionPractice {

        private static class MustHaveException extends Exception {
            public MustHaveException(String message) {
                super(message);
            }
        }

        private static void fooA(int num) throws MustHaveException {
            System.out.println("fooA - START");
            if (num < 0) {
             throw new ArithmeticException("this is an error");
            }
            System.out.println("fooA - Done");
        }

        public static void main(String[] args) {
            System.out.println("main - START");
            try {
                fooA(-1);
            } catch (MustHaveException e) {
              System.out.println(e.getMessage()); // what should be written here?
            }
            System.out.println("main - DONE");
        }
    }
