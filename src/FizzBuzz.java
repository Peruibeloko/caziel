import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    int numero;
    int contador = 0 ;

    Scanner s = new Scanner(System.in);
    numero = s.nextInt();
    s.nextLine();
    s.close();

    while (contador <= numero ){
      if (numero % 3 == 0 && numero % 5 == 0 ) {
        System.out.println("FizzBuzz" );
      }
      else if (numero % 3 == 0 ) {
        System.out.println("Fizz" );
      }
      else if (numero % 5 == 0 ) {
        System.out.println("Buzz" );
      }
      else {
        System.out.println("Numero :" + numero );
      }
      contador += 1 ;
    }
  }
}
