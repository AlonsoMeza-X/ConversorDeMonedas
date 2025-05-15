package controller;

import model.TipoDeCambio;
import repository.ConsultaBaseDeDato;
import service.LogicaTipoDeCambio;

import java.io.IOException;


public class ApiTipoDeCambio {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaBaseDeDato consulta = new ConsultaBaseDeDato();
        LogicaTipoDeCambio logica = new LogicaTipoDeCambio();
        Menu menu = new Menu();
        try {
            TipoDeCambio datos = consulta.tipoDeMoneda();
            System.out.println("Moneda base: " + datos.getBase());
            System.out.println("Última actualización: " + datos.getUpdated());

            datos.getResults().forEach((moneda, valor) -> {
                System.out.println(moneda + ": " + valor);
            });

        } catch (Exception e) {
            System.out.println("Error al obtener los datos: " + e.getMessage());
        }

        menu.Menu();

    }
}