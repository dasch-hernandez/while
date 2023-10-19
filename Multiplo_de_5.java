//Programa No. 1 Ciclo While
//Fecha: 19 de Octubre del 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Multiplo_de_5{

        public static void main(String[] args) {

            try (Scanner leer = new Scanner(System.in)) {
                System.out.print("Ingrese un numero: (Si desea terminar el programa presione 0): ");
                int x = leer.nextInt();

                while(x>0){

                    if (x>0){
                        if(x%5==0){
                            System.out.println("El numero es multiplo de 5");
                        } else {
                            System.out.println("El numero no es multiplo de 5");
                        }
                    } else {
                        System.out.println("Gracias por usar el programa");
                    }
                    System.out.print("Ingrese un numero entero: ");
                    x = leer.nextInt();
                }
            }
            
        }

    }