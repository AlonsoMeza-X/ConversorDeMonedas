package service;

import ScannerSingleton.ScannerSingleton;
import model.TipoDeCambio;
import repository.ConsultaBaseDeDato;


import java.util.Scanner;

public class LogicaTipoDeCambio {

    private Scanner sc;
    private TipoDeCambio tipoDeCambio;
    private ConsultaBaseDeDato baseDeDato;

    public LogicaTipoDeCambio(TipoDeCambio tipoDeCambio) {
        this.sc = ScannerSingleton.getInstance();
        this.tipoDeCambio = tipoDeCambio;
        this.baseDeDato = new ConsultaBaseDeDato();
    }

    public void listaDeMonedas() {
        for (String moneda : tipoDeCambio.getResults().keySet()) {
            System.out.println("-------------------------");
            System.out.println(moneda);
        }
    }

    public void calculoDeMoneda() {
        double buscarValores;
        double calculo;
        String moneda1;
        String moneda2;

        do {
            System.out.println("----------------------");
            System.out.println("Ingrese la moneda de origen (por ejemplo: CLP):");
            moneda1 = sc.nextLine().toUpperCase();
            if (moneda1.length() != 3) {
                System.out.println("⚠️ Código de moneda inválido. Debe tener exactamente 3 letras.");
            }
        } while (moneda1.length() != 3);


        do {
            System.out.println("----------------------");
            System.out.println("Ingrese la moneda destino (por ejemplo: EUR):");
            moneda2 = sc.nextLine().toUpperCase();
            if (moneda2.length() != 3) {
                System.out.println("⚠️ Código de moneda inválido. Debe tener exactamente 3 letras.");
            }
        } while (moneda2.length() != 3);

        System.out.println("Ingrese cantidad a convertir:");
        double cantidad = sc.nextDouble();
        sc.nextLine();

        buscarValores = baseDeDato.consultaBaseDeDato(moneda1, moneda2);
        calculo = buscarValores * cantidad;
        System.out.println("----------------------");
        System.out.println(cantidad + " " + moneda1 + " = " + calculo + " " + moneda2);
        System.out.println("----------------------");
        System.out.println("Tasa utilizada: " + buscarValores + " " + moneda2);
        System.out.println("----------------------");


    }

}


