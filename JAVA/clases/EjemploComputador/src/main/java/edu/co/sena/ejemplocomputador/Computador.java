/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocomputador;

import edu.co.sena.ejemplocomputador.dispositivos.entrada.Camara;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Mouse;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Teclado;
import edu.co.sena.ejemplocomputador.dispositivos.entradasalida.Multifuncional;
import edu.co.sena.ejemplocomputador.dispositivos.salida.Impresora;
import edu.co.sena.ejemplocomputador.dispositivos.salida.Monitor;
import edu.co.sena.ejemplocomputador.partes.torre.Torre;

/**
 *
 * @author Enrique Moreno
 */
public class Computador {
    Torre torre;
    Mouse mouse;
    Teclado teclado;
    Monitor pantalla;
    Camara camara;
    Impresora impresora;
    Multifuncional multifuncional;
    
    
    public Computador(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla) {
        this.torre = torre;
        this.mouse = mouse;
        this.teclado = teclado;
        this.pantalla = pantalla;
    }
    
     public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }
    
}
