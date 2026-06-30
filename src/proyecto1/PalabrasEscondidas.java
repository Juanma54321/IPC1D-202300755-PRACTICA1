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
    public boolean orientacion = (Math.random()*2) != 0;; //false=vertical true=horizontal
    public String palabra;
    
    public void Crear(String palabra){
        this.palabra  = palabra;
        this.longitud = this.palabra.length();
        //0 horizontal y 1 vertical
        //generamos la posicion de la palabra
        this.posicionY = (int)(Math.random()*24);
        this.posicionX = (int)(Math.random()*24);
        //verificamos que no este fuera del limite del tablero
        if(!this.orientacion){
            while(true){
                //si es vertical, no puede estar en y + longitud < 25
                if((this.posicionY + this.longitud) <= 24){
                    break;
                }
                //de lo contrario generamos otra posicion Y que sea valdia
                this.posicionY = (int) (Math.random()*24);
            }
        }else{
            while(true){
                //si es horizontal, verificamos que X + longitud < 25
                if((this.posicionX + this.longitud) <= 24){
                    break;
                }
                //de lo contrario generamos otra posicion X que sea valida
                this.posicionX = (int) (Math.random()*26);
            }
        }
    }
}
