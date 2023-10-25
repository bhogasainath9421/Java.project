import java.util.Scanner;

class QuadraticEqnSolver 
   {
     public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.print("Enter the coefficient of 'p': ");
        double p = scanner.nextDouble();
        System.out.print("Enter the coefficient of 'q': ");
        double q = scanner.nextDouble();
        System.out.print("Enter the coefficient of 'r': ");
        double r = scanner.nextDouble();

        double discriminant = q * q - 4 * p * r;

        if (discriminant > 0) 
          {
            double root1 = (-q + Math.sqrt(discriminant)) / (2 * p);
            double root2 = (-q - Math.sqrt(discriminant)) / (2 * p);
            System.out.println("Two distinct real roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
          }
       else if (discriminant == 0) 
          {
            double root = -q / (2 * p);
            System.out.println("One real root:");
            System.out.println("Root: " + root);
          } 
      else 
         {
            double realPart = -q / (2 * p);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * p);
            System.out.println("Two complex roots:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
         }

        scanner.close();
     }
  }
