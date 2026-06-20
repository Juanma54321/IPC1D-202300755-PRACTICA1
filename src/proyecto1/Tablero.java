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
    private String[] Palabras;
    private char[][] tablero;

    public Tablero() {
        //se define el tamaño del tablero
        this.filas = 25;
        this.columnas = 25;
        //se crea el tablero
        this.tablero = new char [25][25];
        //generamos el tablero
        this.Llenar_Tablero();
        
    }
    //funcion para llenar el tablero de caracteres aleatorios
    private void Llenar_Tablero(){
        //generamos una letra aleatoria por cada posicion del tablero
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
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

