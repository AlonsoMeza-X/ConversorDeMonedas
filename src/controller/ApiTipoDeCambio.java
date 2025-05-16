package controller;

import repository.ConsultaBaseDeDato;

public class ApiTipoDeCambio {
    public static void main(String[] args) {
        ConsultaBaseDeDato consulta = new ConsultaBaseDeDato();
        Menu incioAppi = new Menu(consulta);
        incioAppi.Menu();
    }
}