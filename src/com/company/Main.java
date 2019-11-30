package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ANSI_YELLOW="\u001B[33m";
        String ANSI_RESET="\u001B[0m";
        String ANSI_YELLOW_BACKGROUND="\u001B[43m";
        String ANSI_BLACK_BACKGROUND="\u001B[40m";
        String ANSI_BLACK="\u001B[30m";
        String ANSI_BOLD="\u001B[01m";
        String ANSI_NORMAL="\u001B[02m";
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(ANSI_YELLOW);
            System.out.print(ANSI_BOLD);
            System.out.print("  MENÚ EJERCICIOS CADENAS (I)                                                         ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 1. numeroEspacios");
            System.out.print("\t\t2. numeroVocales");
            System.out.print("\t3. esPalindromo");
            System.out.print("\t\t4. contiene          ");
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 5. repiteCaracter ");
            System.out.print("\t6. padLeft-padRight");
            System.out.print("\t7. quitaEspacios");
            System.out.print("\t8. quitaEspaciosTrim ");
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 9. sustituyeCaracter");
            System.out.print("\t10. cuentaPalabras                                           ");
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(ANSI_YELLOW);
            System.out.print(ANSI_BOLD);
            System.out.print("  0. Finalizar                                                                        ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BOLD);
            System.out.print("Indique opcion: ");
            System.out.print(ANSI_RESET);
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1: {
                    String a = "En un lugar de la Mancha";
                    System.out.println(a);
                    System.out.println(numeroEspacios(a));
                }
                break;
                case 2: {
                    String a = "La cigüeña vino de París, pero con el pico vacío";
                    System.out.println(a);
                    System.out.println(numeroVocales(a));
                }
                break;
                case 3: {
                    System.out.print("Introduzca una frase: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    if(esPalindromo(a))
                    {
                        System.out.println("Es Palíndromo");
                    }
                    else
                    {
                        System.out.println("No es Palíndromo");
                    }
                }
                break;
                case 4: {

                }
                break;
                case 5: {

                }
                break;
                case 6: {

                }
                break;
                case 7: {

                }
                break;
                case 8: {

                }
                break;
                case 9: {
                }
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static String quitaAcentos(String a)
    {
        String b = "";
        String compara = "áéíóúü";
        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i))
            {
                case 'á':
                    b = b + 'a';
                    break;
                case 'é':
                    b = b + 'e';
                    break;
                case 'í':
                    b = b + 'i';
                    break;
                case 'ó':
                    b = b + 'o';
                    break;
                case 'ú': case 'ü':
                    b = b + 'u';
                    break;
                default:
                    b = b + a.charAt(i);
            }
        }
        return b;
    }

    public static String quitaEspacios(String a)
    {
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=' ')
            {
                b = b + a.charAt(i);
            }
        }
        return b;
    }

    public static boolean esPalindromo(String a)
    {
        //dabale arroz a la zorra el abad
        // Eliminamos espacios
        a = quitaEspacios(a);
        // Transformamos a minúsculas
        a = a.toLowerCase();
        // Eliminamos acentos
        a = quitaAcentos(a);
        for (int i = 0; i < a.length()/2; i++) {
            char b = a.charAt(i);
            char c = a.charAt(a.length() - (i + 1));
            if(a.charAt(i)!=a.charAt(a.length() - (i + 1)))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean encuentra(String b, char a)
    {
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a ) return true;
        }
        return false;
    }

    public static int numeroVocales(String a)
    {
        int vc = 0;
        String compara = "aáAÁeéEÉiíIÍoóOÓuúüUÚÜ";
        for (int i = 0; i < a.length(); i++) {
            if(encuentra(compara, a.charAt(i))) vc++;
        }
        return vc;
    }

    public static int numeroEspacios(String a)
    {
        int sp = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') sp++;
        }
        return sp;
    }
}