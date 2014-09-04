/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocomputador;

import edu.co.sena.ejemplocomputador.dispositivos.entrada.Mouse;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Teclado;
import edu.co.sena.ejemplocomputador.dispositivos.salida.Monitor;
import edu.co.sena.ejemplocomputador.partes.torre.DiscoDuro;
import edu.co.sena.ejemplocomputador.partes.torre.Disipador;
import edu.co.sena.ejemplocomputador.partes.torre.Fuente;
import edu.co.sena.ejemplocomputador.partes.torre.MotherBoard;
import edu.co.sena.ejemplocomputador.partes.torre.Procesador;
import edu.co.sena.ejemplocomputador.partes.torre.RAM;
import edu.co.sena.ejemplocomputador.partes.torre.TargetaVideo;
import edu.co.sena.ejemplocomputador.partes.torre.Torre;

/**
 *
 * @author Enrique Moreno
 */
public class ComputadorAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        
        RAM memoria1 =new RAM("123", "Kingstong");
        DiscoDuro discoDuro1 =new DiscoDuro("142563", "Toshiba");
        MotherBoard targetaMadre1 = new MotherBoard("1234124", "Asus");
        Fuente fuente1 = new Fuente("afsdfa3242", "tremalteg");
        Procesador procesador1 = new Procesador("dasfsdf088", "Intel Ie hq 47750");
        Disipador disipador1 = new Disipador("adsfasd", "pajarito");
        Torre torre1= new Torre(memoria1, discoDuro1, targetaMadre1,fuente1 , procesador1 , disipador1,"34123412", "corsair");
        
        Mouse raton1 = new Mouse("dfasd5", "Razer");
        Teclado teclado = new Teclado("adsfasdf89789", "razer");
        Monitor pantalla1 = new Monitor("asdfasdf7987", "Samsumg");
        ComputadorEscritorio c1 = new ComputadorEscritorio(torre1, raton1,teclado, pantalla1 );
        
        System.out.println("DD marca:"+c1.torre.getDisco().getMarca());
        System.out.println("DD serial:"+c1.torre.getDisco().getSerial());
        TargetaVideo tvideo1 = new TargetaVideo("asdfasd3241", "nvidia");
        c1.torre.setTargetaVideo(tvideo1);
        System.out.println(c1.torre.getTargetaVideo().getSerial());
        System.out.println(c1.torre.getTargetaVideo().getMarca());
        
        System.out.println(c1.torre.getTargetaSonido().getMarca());
        System.out.println(c1.getClass().getName());
        System.out.println(c1.torre.getClass().getName());
        System.out.println(c1.torre.getDisipadorProcesador().getClass().getName());
        System.out.println(c1.torre.getLector().getClass().getName());
        
    }
    
}
