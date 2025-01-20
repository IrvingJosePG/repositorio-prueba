import java.util.Scanner;

public class copianumberpar{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean espar = false;
        System.out.print("Ingrese un numero:  ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Gracias por el numero.");
        if(num%2==0){
            espar = true;
        }
        if(espar){
            System.out.println("El numero " + num + " es par");
        } else{
            System.out.println("El numero " + num + " es impar");
        }

        if(num  > 100){
            System.out.println("El numero es mayor o igual que 100");
        } else System.out.println("El numero es menor que 100");
        System.out.println("Buena Suerte");
    }
}
