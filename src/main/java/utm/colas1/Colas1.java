package utm.colas1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Colas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear una cola para almacenar los valores
        Queue<Integer> cola = new LinkedList<>();
        
        // Solicitar al usuario que ingrese 10 valores
        System.out.println("Ingrese 10 valores:");
        for (int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();
            cola.add(valor);
        }
        
        // Crear una cola de prioridad (min-heap) para ordenar los valores
        PriorityQueue<Integer> colaOrdenada = new PriorityQueue<>(cola);
        
        // Mostrar los valores ordenados
        System.out.println("La cola ordenada en forma ascendente es:");
        while (!colaOrdenada.isEmpty()) {
            System.out.print(colaOrdenada.poll() + " ");
        }
    }
}
