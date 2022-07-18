/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    public ArrayList<Matricula> obtenerMatricula() {
        return matriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatricula().size(); i++) {
            suma = suma + obtenerMatricula().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatricula().size();

    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
    
    @Override
    public String toString() {
        String cadena = "       ***** Listado  De Matriculas *****\n";
        
        
        for (Matricula m : obtenerMatricula()) {
            
            cadena = String.format("%s%s\n", cadena,
                    m);
        }
        cadena = String.format("%sPromedio Total De Las Matriculas: %.2f\n",
                cadena,
                promedioMatriculas);
                
    
        return cadena;
    
    
    }
}
