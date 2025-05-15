package controller;

import ScannerSingleton.ScannerSingleton;

import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu() {
        this.sc = ScannerSingleton.getInstance();
    }

    public void Menu() {
        String primerMensaje = """
                Bienvenid/a a la página de tipo de cmabio de moneda
                ¿En que podemos ayudar?
                
                1. Ver la lista de los tipos de moneda
                2. Realizar calculo de una mondea con respecto a al otra.
                3. salir
                
                """;
        int numero;

        do {
            System.out.println(primerMensaje);
            numero = sc.nextInt();
            sc.nextLine();
            switch (numero) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("""
                            Muchas Gracias por visitar nuestra página
                            Esperemos que vuelva nuevamente.
                            """);
                    break;
                default:
                    System.out.println("Porfavor ingrese un numero entre 1 al 3.");
            }

        } while (3 != numero);
        sc.close();
    }
}
