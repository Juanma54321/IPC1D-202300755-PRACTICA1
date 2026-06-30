/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author manum
 */
public class Tablero {
    private int filas;
    private int columnas;
    private char[][] tablero;
    public int aciertos;
    public int errores;
    public long puntos;
    
    

    public Tablero() {
        //se define el tamaño del tablero
        this.filas = 25;
        this.columnas = 25;
        //se crea el tablero
        this.tablero = new char [this.filas][this.columnas];
        //generamos el tablero
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                //el signo $ representara una celda vacia
                this.tablero[i][j] = '$';
            }
        }    
    }
    //funcion para llenar el tablero de caracteres aleatorios
    public void Llenar_Tablero(){
        //generamos una letra aleatoria por cada posicion del tablero
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if(this.tablero[i][j] == '$'){
                    //generamos un numero entre 0 y 26
                    int numero = (int) (Math.random() * 26);
                    //lo convertimos en caracter, 97 es 'a' en ascii
                    char letra = (char) (numero + 97);
                    //lo guardamos en el tablero
                    this.tablero[i][j]=letra;
                
                }
            }
        }
    }
    
    //funcion para colocar las palabras en el tablero
    public void IncertarPalabras(PalabrasEscondidas[] list){
        //recorremos cada palabra
        for (int i = 0; i < list.length; i++) {
            boolean ingresada = false;
            PalabrasEscondidas temp = list[i];
            //obtenemos su posicion
            int x = temp.posicionX;
            int y = temp.posicionY;
            //obtenemos su orientacion
            boolean orientacion = temp.orientacion;
            //obtenemos su texto
            String txt = temp.palabra;
            
            
            //si la palabra es vertical
            if(!orientacion){
                
                
            }else{
                while(!ingresada){
                    
                
                }
            }
        }
        
    }

}

