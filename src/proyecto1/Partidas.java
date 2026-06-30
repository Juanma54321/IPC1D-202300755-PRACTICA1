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
    public String nombre = "Nueva Partida";
    public long puntos = 0;
    public int errores = 0;
    public int aciertos = 0;
    public int partidas_jugadas = 0;
    
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
        input.nextLine();
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
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
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
        int tamano;
        input.nextLine();
        do {
            System.out.print("Ingresa la nueva palabra: ");
            
            String entrada = input.nextLine();
            entrada = entrada.toLowerCase();
            
            tamano = entrada.length();
            
            //si el tamaño es valido
            if(tamano >5 && tamano < 16){
                list[num].Crear(nombre);
                break;
            }
            System.out.println("***Porfavor ingrese una palabra de 6 a 15 caracteres");
        } while (tamano < 5 || tamano > 16);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public PalabrasEscondidas[] EliminarPalabra(PalabrasEscondidas[] list){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------Eliminar Palabra--------------");
        //verificamos que no este vacia la lista
        if (list[0] == null){
            System.out.println("***No hay palabras ingresadas aun");
            return list;
        }
        //mostramos las palabras
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". "+list[i].palabra);
        }
        
        System.out.print("Cual quieres eliminar? ");
        //obtenemos el indice de la palabra que se desea guardar
        int num = input.nextInt()-1;
        System.out.println();
        
        //eliminamos la palabra
        list[num] = null;
        
        //verificamos si la lista quedo vacia
        if(list.length == 1){
            return list;
        }
        
        
        //creamos una lista temporal
        PalabrasEscondidas[] temp = new PalabrasEscondidas[list.length-1];
        
        //llenamos la lista temporal
        int contTemp = 0;
        for (int i = 0; i < temp.length; i++) {
            if(contTemp == num){
                contTemp++;
            }
            temp[i] = list[contTemp];
            contTemp++; 
        }
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        return temp;
    }
    
    public void MostrarPalabras(PalabrasEscondidas[] list){
        //si la lista esta vacia, no imprimimos nada
        if(list[0] == null){
            System.out.println("***No hay palabras Ingresadas");
            return;
        }
        
        System.out.println("Palabras Ingresadas:");
        
        for (int i = 0; i < list.length; i++) {
            System.out.println("    "+list[i].palabra);
        }
        System.out.println();
    }
    
    public void MostrarPartidas(Partidas[] list){
        System.out.println("Partidas Cargadas:");
        for (int i = 0; i < list.length; i++) {
            System.out.println("    "+list[i].nombre);
        }
        System.out.println();
    }
    
    public Partidas CambiarPartida(Partidas[] list){
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------Cambiar Partida--------------");
        //mostramos las partidas enumeradas
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". "+list[i].nombre);
        }
        System.out.print("Que numero de partida quieres utilizar? ");
        //obtenemos el indice
        int num = input.nextInt() -1;
        //retornamos la partida
        return list[num];
    }
    
    public Partidas RenombrarPartida(Partidas[] list){
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------Renombrar Partida--------------");
        //mostramos las partidas enumeradas
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". "+list[i].nombre);
        }
        System.out.print("Que numero de partida quieres renombrar? ");
        //obtenemos el indice
        int num = input.nextInt() -1;
        System.out.println();
        input.nextLine();
        //Obtenemos la partida
        Partidas temp = list[num];
        //cambiamos el nombre
        System.out.print("Ingresa el nuevo nombre: ");
        temp.nombre = input.nextLine();
        //guardamos
        list[num] = temp;
        //retornamos para que actualice la partida cargada
        return temp;
    }
    
    public void FormatearPartida(Partidas[] list){
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------Formatear Partida--------------");
        //mostramos las partidas enumeradas
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". "+list[i].nombre);
        }
        System.out.print("Que numero de partida quieres Formatear? ");
        //obtenemos el indice
        int num = input.nextInt() -1;
        System.out.println();
        //creamos una nueva instancea del objeto
        list[num] = new Partidas();
    }
}
