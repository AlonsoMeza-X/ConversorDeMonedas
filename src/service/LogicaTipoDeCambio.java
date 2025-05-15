package service;

import model.TipoDeCambio;

public class LogicaTipoDeCambio {

    TipoDeCambio tipoDeCambio = new TipoDeCambio();

    public void listaDeMonedas() {
        if (tipoDeCambio.getResults() != null){
            for (String moneda : tipoDeCambio.getResults().keySet()) {
                System.out.println(moneda);

            }
        }
    }

}
