package com.example.luisr.dadomatematico.core;

import java.io.Serializable;

/**
 * Created by luisr on 10/12/2016.
 */
@SuppressWarnings("serial")
public class Partida implements Serializable {
    private Dado dado6;
    private int objetivo;
    private String jugador1;
    private String jugador2;
    private String resultado1;
    private String resultado2;

    public Partida(String j1, String j2){
        jugador1 = j1;
        jugador2 = j2;
    }

    public void setDados(Dado d, int ob){
        dado6 = d;
        objetivo = ob;
    }

    public void setResultado1(String r){
        resultado1 = r;
    }

    public void setResultado2(String r){
        resultado2 = r;
    }

    public String ganador(){
        String toRet = "";
        int r1 = Integer.parseInt(resultado1);
        int r2 = Integer.parseInt(resultado2);
        if(r1==r2){
            toRet = "Empate entre "+jugador1+" y "+jugador2;
        } else if(r1<objetivo && r2<objetivo){
            if(r1>r2){
                toRet = jugador1+" gana a "+jugador2;
            } else{
                toRet = jugador2+" gana a "+jugador1;
            }
        } else if(r1>objetivo && r2>objetivo){
            if(r1<r2){
                toRet = jugador1+" gana a "+jugador2;
            } else{
                toRet = jugador2+" gana a "+jugador1;
            }
        } else if(r1>objetivo && r2<objetivo){
            if((r1-objetivo)==(objetivo-r2)){
                toRet = "Empate entre "+jugador1+" y "+jugador2;
            } else if((r1-objetivo)<(objetivo-r2)){
                toRet = jugador1+" gana a "+jugador2;
            } else if((r1-objetivo)>(objetivo-r2)){
                toRet = jugador2+" gana a "+jugador1;
            }
        } else if(r1<objetivo && r2>objetivo){
            if((r2-objetivo)==(objetivo-r1)){
                toRet = "Empate entre "+jugador1+" y "+jugador2;
            } else if((r2-objetivo)<(objetivo-r1)){
                toRet = jugador2+" gana a "+jugador1;
            } else if((r2-objetivo)>(objetivo-r1)){
                toRet = jugador1+" gana a "+jugador2;
            }
        }
        return toRet;
    }

    public String getResultado1() {
        return resultado1;
    }

    public String getResultado2() {
        return resultado2;
    }

    public Dado getDado6() {
        return dado6;
    }

    public int getObjetivo() {
        return objetivo;
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }


}