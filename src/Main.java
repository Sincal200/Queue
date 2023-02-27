import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue("pearl");
        queue.enqueue("apple");
        queue.enqueue("banana");
        queue.enqueue("cherry");

        int option;
        do {
            //Menu
            System.out.println("1. Basado en arrays");
            System.out.println("2. Basado en listas");
            System.out.println("3. Salir");
            System.out.println("Ingrese opcion");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    do {
                        System.out.println("1. Encolar");
                        System.out.println("2. Desencolar");
                        System.out.println("3. Cima");
                        System.out.println("4. Tamanio");
                        System.out.println("5. Regresar");
                        System.out.println("Ingrese opcion");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Ingrese valor a encolar");
                                String valor = sc.next();
                                queue.enqueue(valor);
                                option = 0;
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    } while (option != 5);
                    break;
                case 2:
                    System.out.println("1. Encolar");
                    System.out.println("2. Desencolar");
                    System.out.println("3. Cima");
                    System.out.println("4. Tamanio");
                    System.out.println("5. Regresar");
                    System.out.println("Ingrese opcion");
                    option = sc.nextInt();
                    break;
            }

        }while (option != 3) ;
    }
}

