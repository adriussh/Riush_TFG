package PrimerAnyo.ExamenRecu1TrimestreProgramacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double[][] matriz = new double[4][4];
        System.out.println("> Bienvenido al programa de gestion de operaciones <");
        System.out.println(" ");
        double[][] matriz_rellena = rellenar(matriz,sc);
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("0 - Salir.");
            System.out.println("2 - Suma de una fila específica.");
            System.out.println("3 - Suma de una columna específica.");
            System.out.println("4 - Suma de diagonal principal.");
            System.out.println("5 - Resta de diagonal principal.");
            System.out.println("6 - Imprimir matriz.");
            System.out.println("7 - Sumar la diagonaal inversa.");
            System.out.println("8 - Media de toda la matriz.");
            System.out.println("----------------------------Esperando opcion...-----");

            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    break;

                case 2:
                    int fila;
                    System.out.println("¿De qué fila desea sumar todos los números?");
                    fila = sc.nextInt();
                    double suma_vals_fila = suma_fila(matriz_rellena,fila);
                    System.out.println("El resultado de la suma de los valores de la fila "+fila+" es: "+suma_vals_fila+".");
                    break;

                case 3:
                    int columna;
                    System.out.println("¿De qué columna desea sumar todos los números?");
                    columna = sc.nextInt();
                    double suma_vals_column  = suma_columna(matriz_rellena,columna);
                    System.out.println("El resultado de la suma de los valores de la columna "+columna+" es: "+suma_vals_column+".");
                    break;

                case 4:
                    double suma_columna_ppal  = suma_diagonal_principal(matriz_rellena);
                    System.out.println("El resultado de la suma de la diagonal principal es: "+suma_columna_ppal+".");
                    break;

                case 5:
                    double resta_columna_ppal  = resta_diagonal_principal(matriz_rellena);
                    System.out.println("El resultado de la resta de la diagonal principal es: "+resta_columna_ppal+".");
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                default:
                    System.out.println("Elija una opción valida."); break;
            }
        }while (opcion!=0);
    }

    private static double resta_diagonal_principal(double[][] matriz_rellena) {
        double resul_final;
        resul_final=matriz_rellena[0][0]-matriz_rellena[1][1]-matriz_rellena[2][2]-matriz_rellena[3][3];
        return resul_final;
    }

    private static double suma_diagonal_principal(double[][] matriz_rellena) {
        double resul_final;
        resul_final=matriz_rellena[0][0]+matriz_rellena[1][1]+matriz_rellena[2][2]+matriz_rellena[3][3];
        return resul_final;
    }

    private static double suma_columna(double[][] matriz_rellena, int columna) {
        double resul_final=0;
        for (int i=0; i<matriz_rellena.length; i++){
            for (int j=0; j<matriz_rellena[i].length; j++){
                switch (columna){
                    case 0:
                        resul_final=matriz_rellena[0][0]+matriz_rellena[1][0]+matriz_rellena[2][0]+matriz_rellena[3][0];break;
                    case 1:
                        resul_final=matriz_rellena[0][1]+matriz_rellena[1][1]+matriz_rellena[2][1]+matriz_rellena[3][1];break;
                    case 2:
                        resul_final=matriz_rellena[0][2]+matriz_rellena[1][2]+matriz_rellena[2][2]+matriz_rellena[3][2];break;
                    case 3:
                        resul_final=matriz_rellena[0][3]+matriz_rellena[1][3]+matriz_rellena[2][3]+matriz_rellena[3][3];break;
                    default:
                        System.out.println("Ha elegido una fila incorrecta.");break;
                }
            }
        }
        return resul_final;
    }

    private static double suma_fila(double[][] matriz_rellena, int fila) {
        double resul_final=0;
        for (int i=0; i<matriz_rellena.length; i++){
            for (int j=0; j<matriz_rellena[i].length; j++){
                switch (fila){
                    case 0:
                        resul_final=matriz_rellena[0][0]+matriz_rellena[0][1]+matriz_rellena[0][2]+matriz_rellena[0][3];break;
                    case 1:
                        resul_final=matriz_rellena[1][0]+matriz_rellena[1][1]+matriz_rellena[1][2]+matriz_rellena[1][3];break;
                    case 2:
                        resul_final=matriz_rellena[2][0]+matriz_rellena[2][1]+matriz_rellena[2][2]+matriz_rellena[2][3];break;
                    case 3:
                        resul_final=matriz_rellena[3][0]+matriz_rellena[3][1]+matriz_rellena[3][2]+matriz_rellena[3][3];break;
                    default:
                        System.out.println("Ha elegido una fila incorrecta.");break;
                }
            }
        }
        return resul_final;
    }

    private static double[][] rellenar(double[][] matriz, Scanner sc) {
        double recoge_val;
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.println("Escribe un número para la posición ("+i+","+j+").");
                recoge_val = sc.nextDouble();
                matriz[i][j]=recoge_val;
            }
        }
        return matriz;
    }
}
