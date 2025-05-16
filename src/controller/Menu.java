package controller;

import ScannerSingleton.ScannerSingleton;
import model.TipoDeCambio;
import repository.ConsultaBaseDeDato;
import service.LogicaTipoDeCambio;

import java.util.Scanner;

public class Menu {
    private ConsultaBaseDeDato consulta;
    private Scanner sc;
    private LogicaTipoDeCambio tipoDeCambio;

    public Menu(ConsultaBaseDeDato consulta) {
        this.consulta = consulta;
        this.sc = ScannerSingleton.getInstance();
    }


    public void Menu() {
        TipoDeCambio datos = null;

        try {
            datos = consulta.tipoDeMoneda();
        } catch (Exception e) {
            System.out.println("Error al obtener los datos: " + e.getMessage());
            return;
        }

        tipoDeCambio = new LogicaTipoDeCambio(datos);


        String primerMensaje = """
                Bienvenido/a a la página de tipo de cambio de moneda
                """;
        String segundoMensaje= """
                ¿En que podemos ayudar?
                
                1. Ver la lista de los tipos de moneda en la bolsa
                2. Realizar calculo de una mondea con respecto a al otra.
                3. salir
                
                """;

        String mensajeDefault = """
                **************************************************
                   Porfavor ingrese un numero entre 1 al 3.
                **************************************************
                """;

        String mensajeFinal = """
                **************************************************
                    Muchas Gracias por visitar nuestra página
                    Esperemos que vuelva nuevamente.
                **************************************************
                """;
        int numero;

        System.out.println(primerMensaje);

        do {

            System.out.println(segundoMensaje);
            numero = sc.nextInt();
            sc.nextLine();
            switch (numero) {
                case 1:
                    tipoDeCambio.listaDeMonedas();
                    break;
                case 2:tipoDeCambio.calculoDeMoneda();
                    break;
                case 3:
                    System.out.println(mensajeFinal);
                    break;
                default:
                    System.out.println(mensajeDefault);
            }

        } while (3 != numero);
        sc.close();
    }
}
