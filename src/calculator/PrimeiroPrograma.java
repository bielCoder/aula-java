package calculator;

public class PrimeiroPrograma {

    static int x;
    static int y;

    public static void main(String[] args)
    {
       x = Integer.parseInt(args[1]);
       y = Integer.parseInt(args[2]);

      switch (args[0]) {
        case "somar": sum(x,y);
            break;
        case "subtrair": subtraction(x, y);
            break;
        default: System.out.println("Operador inválido.");
            break;
      }
    }

    static void sum(int number1, int number2)
    {
        System.out.println(number1 + number2);
    }

    static void subtraction(int number1, int number2)
    {
        System.out.println(number1 - number2);
    }
}

