/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author manum
 */
public class Partidas {
    public String nombre = "nueva Partida";
    public long puntos = 0;
    public int errores = 0;
    public int intentos = 0;
    
    //funcion para poder agregar palabras a la lista
    public void IngresarPalabras(Partidas p,PalabrasEscondidas[] list){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Cuantas Palabras Quieres Ingresar? ");
        int n = input.nextInt();
        
        //reconstruimos la lista de palabras
        list = new PalabrasEscondidas[n];
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        String palabraIngresada;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa una palabra: ");
            palabraIngresada = input.nextLine();
            System.out.println();
            
            //verificamos la longitud de la palabra
            int Tamano = palabraIngresada.length();
            if(Tamano < 5 || Tamano >16){
                System.out.println("Porfavor ingrese una palabra de 6 a 15 caracteres");
                i--;
                continue;
            }
            //si es valida, la creamos
            PalabrasEscondidas palabra = new PalabrasEscondidas();
            palabraIngresada = palabraIngresada.toLowerCase();
            palabra.Crear(palabraIngresada);
            //guardamos
            list[i] = palabra;
            
        }
        
    }
    
    //funcion para poder modificar una palabra de la lista
    public void ModificarPalabra(PalabrasEscondidas[] list){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------Modificar Palabra--------------");
        //verificamos que no este vacia la lista
        if (list[0] == null){
            System.out.println("***No hay palabras ingresadas aun");
            return;
        }
        //mostramos las palabras
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". "+list[i].palabra);
            
        }
        System.out.print("Cual quieres modificar? ");
        //obtenemos el indice de la palabra que se desea guardar
        int num = input.nextInt()-1;
        System.out.println();
        int tamano = 0;
        do {
            System.out.print("Ingresa la nueva palabra: ");
            
            String entrada = input.nextLine();
            entrada = entrada.toLowerCase();
            
            tamano = entrada.length();
            
            if(tamano <5 || tamano > 16)
            
        } while (tamano > 5 && tamano < 16);
        
        
        
    }
}
