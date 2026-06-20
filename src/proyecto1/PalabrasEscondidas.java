/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author manum
 */
public class PalabrasEscondidas {
    public int longitud;
    public int posicionY;
    public int posicionX;
    public boolean orientacion;
    
    public PalabrasEscondidas(){
        //generamos un numero aleatorio para decir si la palabra es horizontal o vertical (0 o 1)
        this.orientacion = (Math.random()*2) != 0;
        //0 horizontal y 1 vertical
        //generamos la posicion de la palabra
        this.posicionY = (int)(Math.random()*26);
        this.posicionX = (int)(Math.random()*26);
        //verificamos que la palabra no se encuentre fuera de rango
        
        
    }
}
