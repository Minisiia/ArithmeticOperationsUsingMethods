import java.util.Scanner;

public class Arithmetics {import java.util.Scanner;

    public class Arithmetics {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть перше число");
            int a = scanner.nextInt();
            System.out.println("Введіть друге число");
            int b = scanner.nextInt();
            System.out.println("Введіть символ арифметичної дії");
            char symbol = scanner.next().charAt(0);
            switch (symbol) {
                case '+': {
                    System.out.println(a + " + " + b + " = " + add(a, b));
                    break;
                }
                case '-': {
                    System.out.println(a + " - " + b + " = " + sub(a, b));
                    break;
                }
                case '*': {
                    System.out.println(a + " * " + b + " = " + mul(a, b));
                    break;
                }
                case '/': {
                    System.out.println(a + " / " + b + " = " + div(a, b));
                    break;
                }
                default: {
                    System.out.println("Такого арифметичного знаку не існує");
                    break;
                }
            }
        }

        static int add(int a, int b) {
            int c = a + b;
            return c;
        }

        static int sub(int a, int b) {
            int c = a - b;
            return c;
        }

        static int mul(int a, int b) {
            int c = a * b;
            return c;
        }

        static double div(int a, int b) {
            if (b != 0) {
                double d = (double) a;
                double f = (double) b;
                double c = d / f;
                return c;
            } else {
                System.out.println("Ділення на 0");
                return 0;
            }
        }

    }

}
