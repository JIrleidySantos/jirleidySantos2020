/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.jirleidysantos2020;

import java.util.Scanner;

/**
 *
 * @author mundo
 */
public class JirleidySantos2020 {

    public static void main(String[] args) {

        float[] ventas = new float[7];

        float totalVent = 0;
        float promVent = 0;

        Scanner sc = new Scanner(System.in);

        int dato = 0;
        int i = 0;
        do {
            System.out.println("Ingrese los datos de venta ");
            dato = sc.nextInt();
            if (dato > 0) {
                ventas[i] = dato;
                i++;
            } else {
                System.out.println("El valor es negativo");
            }
        } while (i < 7);

        int menu = 0;

        System.out.println("");
        System.out.println("--Escoja una opcion del 1 al 5---");
        System.out.println("Opcion 1: Calcular el total de ventas de la semana");
        System.out.println("Opcion 2: Calcular el dia con ventas mas cercnas al promedio");
        System.out.println("Opcion 3: Mostrar el dia con la venta mas alta y el dia con la venta mas baja");
        System.out.println("Opcion 4: Calcular el monto acumulado de ventas durante los primeros tres dias y los ultimos 3 dias");
        System.out.println("Opcion 5: Salir");

        menu = sc.nextInt();
        float suma = 0;

        switch (menu) {
            case 1 -> {
                System.out.println("Calcular el total de ventas de la semana");
                for (int j = 0; j < 7; j++) {
                    suma = ventas[j] + suma;
                    System.out.println("El promedio de los de vetas es: " + suma);
                }
            }
            case 2 -> {
                int difMin = 0;
                System.out.println("El promedio de ls ventas es: " + (suma / 7));
                float prom=(suma/7);
                for (int j = 0; j < 7; j++) {
                    if (ventas[i] > prom) {
                        difMin = prom - ventas[i];
                        
                    }
                }
            }

        }

    }

}
