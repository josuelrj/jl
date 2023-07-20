/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sema10;

import java.util.ArrayList;

public class Iglesia {
    private String nombre;
    private Pastor pastor;
    private ArrayList<Feligres> feligreses;

    public Iglesia(String nombre, Pastor pastor) {
        this.nombre = nombre;
        this.pastor = pastor;
        this.feligreses = new ArrayList<>();
    }

    public void agregarFeligres(Feligres feligres) {
        feligreses.add(feligres);
    }

    public double calcularGananciasIglesia() {
        double gananciasIglesia = 0;
        for (Feligres feligres : feligreses) {
            gananciasIglesia += feligres.getDiezmo();
        }
        return gananciasIglesia;
    }

    public double calcularImpuestoMunicipalidad() {
        return calcularGananciasIglesia() * 0.09;
    }

    public double calcularImpuestoComedorMunicipal() {
        return calcularGananciasIglesia() * 0.21;
    }

    public double calcularGananciaPastor() {
        return calcularGananciasIglesia() * 0.7;
    }

    public ArrayList<Feligres> obtenerFeligresesDiezmoCero() {
        ArrayList<Feligres> diezmoCero = new ArrayList<>();
        for (Feligres feligres : feligreses) {
            if (feligres.getDiezmo() == 0) {
                diezmoCero.add(feligres);
            }
        }
        return diezmoCero;
    }

    public ArrayList<Feligres> obtenerFeligresesDiezmoMayor100000() {
        ArrayList<Feligres> diezmoMayor100000 = new ArrayList<>();
        for (Feligres feligres : feligreses) {
            if (feligres.getDiezmo() > 100000) {
                diezmoMayor100000.add(feligres);
            }
        }
        return diezmoMayor100000;
    }

    public String getNombre() {
        return nombre;
    }

    public Pastor getPastor() {
        return pastor;
    }
}