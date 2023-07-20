/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package sema10;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el nombre de la iglesia: ");
        String nombreIglesia = scanner.nextLine();
        
        System.out.print("Digite el nombre del pastor: ");
        String nombrePastor = scanner.nextLine();

        Pastor pastor = new Pastor(nombrePastor);
        Iglesia iglesia = new Iglesia(nombreIglesia, pastor);

        System.out.print("Ingrese la cantidad de feligreses: ");
        int cantidadFeligreses = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < cantidadFeligreses; i++) {
            System.out.print("Digite el nombre del feligrés " + (i + 1) + ": ");
            String nombreFeligres = scanner.nextLine();

            System.out.print("Digite la cédula del feligrés " + (i + 1) + ": ");
            String cedulaFeligres = scanner.nextLine();

            System.out.print("Digite el diezmo del feligrés " + (i + 1) + ": ");
            double diezmoFeligres = scanner.nextDouble();

            scanner.nextLine();

            Feligres feligres = new Feligres(nombreFeligres, cedulaFeligres, diezmoFeligres);
            iglesia.agregarFeligres(feligres);
        }

        double gananciasIglesia = iglesia.calcularGananciasIglesia();
        double impuestoMunicipalidad = iglesia.calcularImpuestoMunicipalidad();
        double impuestoComedorMunicipal = iglesia.calcularImpuestoComedorMunicipal();
        double gananciaPastor = iglesia.calcularGananciaPastor();
        ArrayList<Feligres> diezmoCero = iglesia.obtenerFeligresesDiezmoCero();
        ArrayList<Feligres> diezmoMayor100000 = iglesia.obtenerFeligresesDiezmoMayor100000();

        System.out.println("\nInforme de la iglesia " + nombreIglesia + " y su pastor " + nombrePastor + ":");
        System.out.println("Monto total de ganancias de la iglesia: " + gananciasIglesia);
        System.out.println("Monto para la municipalidad (infraestructura): " + impuestoMunicipalidad);
        System.out.println("Monto para el comedor municipal: " + impuestoComedorMunicipal);
        System.out.println("Monto de ganancia para el pastor: " + gananciaPastor);

        System.out.println("\nFeligreses con diezmo igual a 0:");
        for (Feligres feligres : diezmoCero) {
            System.out.println("Nombre: " + feligres.getNombre() + ", Cédula: " + feligres.getCedula());
        }

        System.out.println("\nFeligreses con diezmo mayor a 100000:");
        for (Feligres feligres : diezmoMayor100000) {
            System.out.println("Nombre: " + feligres.getNombre() + ", Cédula: " + feligres.getCedula());
        }
    }
}

