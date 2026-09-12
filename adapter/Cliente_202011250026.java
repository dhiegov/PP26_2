
import java.util.Scanner;
//import bibego.Calculadora_202011250026;

public class Cliente_202011250026
{
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ICalculadora_Dhiego calc = new Calculadora_Adapter();
        
        System.out.println("Calculadora básica do Dhiego\n");
        System.out.print("Operando a: ");
        int a = input.nextInt();
        System.out.print("Operando b: ");
        int b = input.nextInt();
        System.out.println();
        System.out.println("a + b: " + calc.soma(a, b));
        System.out.println("a - b: " + calc.sub(a, b));
        System.out.println("a * b: " + calc.mult(a, b));
        System.out.println("a / b: " + calc.div(a, b));
        
        input.close();
    }


}