// Use a custom exception.

// Create an exception.
class NonIntResultException extends Exception {

  int n;
  int d;
   
  NonIntResultException(int i, int j) {

    super("Result is not an integer.");
    n = i;
    d = j;

  }

  public String toString() {

    return "Result of " + n + " / " + d +
           " is non-integer.";

  }

}

class CustomExceptDemo {

  public static void main(String[] args) {

    // Here, numer contains some odd values.
    int[] numer = { 4, 8, 15, 32, 64, 127, 256, 512 };
    int[] denom = { 2, 0, 4, 4, 0, 8 };

    for (int i = 0; i < numer.length; i++) {

      try {
        if ((numer[i]%denom[i]) != 0)
          throw new
            NonIntResultException(numer[i], denom[i]);

        System.out.println(numer[i] + " / " +
                           denom[i] + " is " +
                           numer[i]/denom[i]);

       }
       catch (ArithmeticException exc) {

         System.out.println("Can't divide by Zero!"); 

       }
       catch (ArrayIndexOutOfBoundsException exc) {

         System.out.println("No matching element found.");

       }
       catch (NonIntResultException exc) {

         System.out.println(exc);

       }

    }

  }

}
