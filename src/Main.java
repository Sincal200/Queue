import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue("pearl");
        queue.enqueue("apple");
        queue.enqueue("banana");
        queue.enqueue("cherry");

        LinkedListQueue linky = new LinkedListQueue();
        linky.enqueue("Apple");
        linky.enqueue("Banana");
        linky.enqueue("Cherry");
        linky.enqueue("Grape");

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
                                System.out.println("Antes de encolar");
                                queue.printQueue();
                                System.out.println("");

                                queue.enqueue(valor);
                                System.out.println("");
                                System.out.println("Despues de encolar");
                                queue.printQueue();
                                break;
                            case 2:
                                System.out.println("Antes de desencolar");
                                queue.printQueue();
                                queue.dequeue();
                                System.out.println("");
                                System.out.println("Despues de desencolar");
                                queue.printQueue();
                                break;
                            case 3:
                                System.out.println("Elemento que se encuentra en la cima:");
                                System.out.println(queue.peek());
                                break;
                            case 4:
                                System.out.println("Tamanio de la cola:");
                                System.out.println(queue.size);
                                break;
                        }
                    } while (option != 5);
                    break;
                case 2:
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
                                System.out.println("Antes de encolar");
                                linky.traverse();
                                System.out.println("");

                                linky.enqueue(valor);
                                System.out.println("");
                                System.out.println("Despues de encolar");
                                linky.traverse();
                                break;
                            case 2:
                                System.out.println("Antes de desencolar");
                                linky.traverse();
                                linky.dequeue();
                                System.out.println("");
                                System.out.println("Despues de desencolar");
                                linky.traverse();
                                break;
                            case 3:
                                System.out.println("Elemento que se encuentra en la cima:");
                                System.out.println(linky.peek());
                                break;
                            case 4:
                                System.out.println("Tamanio de la cola:");
                                System.out.println(linky.size());
                                break;
                        }
                    }while(option != 5);
                    break;
            }

        }while (option != 3) ;
    }
}

