
package proyecto1;
import java.util.Scanner;

/**
 *
 * @author manum
 */
public class Proyecto1 { 
    
    public static void ClearOutput(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void main(String[] args) {   
        //generamos el tablero de juego
        Tablero tablero = new Tablero();
        
        //lista global para guardar las partidas
        Partidas[] listaPartidas = new Partidas[5];
        //llenamos la lista
        for (int i = 0; i < 5; i++) {
            Partidas n = new Partidas();
            listaPartidas[i] = n;
        }
        Partidas PartidaActual = listaPartidas[0];
        
        //lista global para guardar las palabras que se jugaran
        PalabrasEscondidas[] listaPalabras = new PalabrasEscondidas[1];
        listaPalabras[0] = null;        
        
        //variables usadas para el ingreso de datos
        int menu1;
        Scanner scanner = new Scanner(System.in);

        //menu principal        
        do {    
            ClearOutput();
            
            System.out.println("--------------MENU DE JUEGO--------------");
            System.out.println("1. Nueva Partida");
            System.out.println("2. Jugar");
            System.out.println("3. Terminar");
            System.out.println("4. Salir");
            System.out.println("******SE ESTA UTILIZANDO"+PartidaActual.nombre+"******");
            menu1=scanner.nextInt();
            switch (menu1){
                case 1:
                    do{
                        
                        ClearOutput();
                        
                        System.out.println("--------------Nueva Partida--------------");
                        System.out.println("1. Modificar Palabras");
                        System.out.println("2. Modificar Partida");
                        System.out.println("3. Regresar");
                        
                        
                        menu1 = scanner.nextInt();
                        
                        switch(menu1){
                            case 1:
                                do{
                                    ClearOutput();

                                    System.out.println("--------------Modificar Palabras--------------");
                                    System.out.println("1. Insertar palabras");
                                    System.out.println("2. Modificar palabras");
                                    System.out.println("3. Eliminar palabras");
                                    System.out.println("4. regresar");
                                    System.out.println("----------------------------------------------");
                                    PartidaActual.MostrarPalabras(listaPalabras);
                                    
                                    menu1 = scanner.nextInt();
                                    switch(menu1){
                                        case 1:
                                            PartidaActual.IngresarPalabras(PartidaActual, listaPalabras);
                                            break;
                                        case 2:
                                            //si no hay palabras
                                            if(listaPalabras[0] == null) break;
                                            PartidaActual.ModificarPalabra(listaPalabras);
                                            break;
                                        case 3:
                                            //si no hay palabras
                                            if(listaPalabras[0] == null) break;
                                            listaPalabras = PartidaActual.EliminarPalabra(listaPalabras);
                                            break;
                                    }
                                }while(menu1 != 4);
                                menu1 = 0;
                                break;
                                
                            case 2:
                                do {
                                    
                                    ClearOutput();

                                    System.out.println("--------------Modificar Partida--------------");
                                    System.out.println("1. Cambiar Partida");
                                    System.out.println("2. Renombrar Partida");
                                    System.out.println("3. Formatear Partida");
                                    System.out.println("4. Salir");
                                    
                                    PartidaActual.MostrarPartidas(listaPartidas);
                                    
                                    //obtenemos el valor
                                    menu1 = scanner.nextInt();
                                    switch(menu1){
                                        case 1:
                                            ClearOutput();
                                            PartidaActual = PartidaActual.CambiarPartida(listaPartidas);
                                            break;
                                        case 2:
                                            ClearOutput();
                                            PartidaActual = PartidaActual.RenombrarPartida(listaPartidas);
                                            break;
                                        case 3:
                                            ClearOutput();
                                            PartidaActual.FormatearPartida(listaPartidas);
                                            break;
                                    }
                                } while (menu1 != 4);
                                
                                menu1 = 0;
                                break;
                        }
                    }while(menu1 != 3);
                    break; 
                //Menu jugar    
                case 2:
                    do {
                        ClearOutput();
                        
                        System.out.println("--------------JUGAR--------------");
                        if(listaPalabras[0] == null){
                            System.out.println("1. Jugar (primero Ingresa Palabras)");
                        }else{
                            System.out.println("1. jugar");
                        }
                        System.out.println("2. Historial de partidas");
                        System.out.println("3. Regresar");
                        menu1=scanner.nextInt();
                        
                        switch(menu1){
                            
                            //iniciando juego 
                            case 1:
                                //verificamos si hay palabras ingresada
                                if(listaPalabras[0] == null){
                                    break;
                                }
                                
                                //creamos el tablero de juego
                                Tablero tab = new Tablero();
                                
                                //incertamos las palabras
                                tab.IncertarPalabras(listaPalabras);
                                
                                
                                
                                    //jugando
                                    //mostrando en pantalla el juego
                                        ClearOutput();
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("--------¿Encuentras alguna palabra?--------");
                                        System.out.println();
                                        System.out.println("Palabras encontradas:");
                                        for (int i = 0; i < n; i++) {
                                            System.out.println(palabraEncontrada[i]);
                                        }
                                        System.out.println();
                                        System.out.println("*******Tu Puntuacion: "+puntos+"*******");
                                        System.out.println("intentos:"+(4-errores));
                                        //refrescando el tablero
                                        for(int i=0 ; i<25;i++){
                                            for(int j=0; j<25; j++){
                                                System.out.print(tablero[i][j] + "|");
                                            }
                                            System.out.println();
                                        }                                        
                                    do {
                                        longitud=0;
                                        condicionError=true;
                                        
                                        System.out.println();
                                        System.out.println("--------ESCRIBE LA PALABRA QUE VEAS--------");
                                        entrada = palabraEntrada.nextLine();
                                        
                                        //n parablra encontrada
                                        for (int i = 0; i < n; i++) {
                                            if(palabra[i].equals(entrada) && condicion[i]){
                                                //condicion para que la palabra sea horizontal
                                                if(posicionHorizontal[i]%2==0){
                                                            for(int j=0; j<25; j++){
                                                                if(longitud< palabra[i].length()){
                                                                    tablero[posicionHorizontal[i]][posicionVertical[i]+j]='#';
                                                                    longitud++;
                                                                }
                                                            }
                                                    acierto=acierto+1;    
                                                }
                                        
                                                //condicion para que la palabra sea vertical
                                                if(posicionHorizontal[i]%2!=0){
                                                        for(int j=0; j<25; j++){
                                                            if(longitud< palabra[i].length()){
                                                                tablero[posicionHorizontal[i]+j][posicionVertical[i]]= '#';
                                                                longitud++;
                                                            
                                                        }
                                                    }
                                                    acierto=acierto+1;
                                                }
                                            //cambiando la condicion para que no usen la misma palabra
                                            condicion[i]=false;
                                            //sumando puntos segun la palabra y no contar como error
                                            puntos= puntos+(int)(entrada.length());
                                            condicionError=false;
                                            //anotando la palabra encontrada
                                            palabraEncontrada[x]=entrada;
                                            x++;
                                            } 
                                        }
                                        //restando oportunidades
                                        if(condicionError){
                                            errores++;
                                            puntos=puntos-5;
                                        }
                                        
                                        //mostrando en pantalla el juego
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("--------¿Encuentras alguna palabra?--------");
                                        System.out.println();
                                        System.out.println("Palabras encontradas:");
                                        for (int i = 0; i < n; i++) {
                                            System.out.println(palabraEncontrada[i]);
                                        }
                                        System.out.println();
                                        System.out.println("*******Tu Puntuacion: "+puntos+"*******");
                                        System.out.println("intentos:"+(4-errores));
                                        
                                        //refrescando el tablero
                                        for(int i=0 ; i<25;i++){
                                            for(int j=0; j<25; j++){
                                                System.out.print(tablero[i][j] + "|");
                                            }
                                            System.out.println();
                                        }
                                        if(acierto==n){
                                            System.out.println();
                                            System.out.println("--------GANASTEEEEE--------");
                                            System.out.println("presiona cualquier tecla para salir");
                                            entrada = palabraEntrada.nextLine();
                                            
                                            //sumando las estadisticas a la partida
                                            erroresPartidas[contadorDinamico2]=erroresPartidas[contadorDinamico2]+errores;
                                            puntosPartidas[contadorDinamico2]=puntosPartidas[contadorDinamico2]+puntos;
                                            partidasJugadas[contadorDinamico2]=partidasJugadas[contadorDinamico2]+partida;
                                            
                                        }else if(errores==4){
                                            System.out.println("--------PERDISTE--------");
                                            System.out.println("presiona cualquier tecla para salir");
                                            entrada = palabraEntrada.nextLine();
                                        }
                                    }while (errores!=4 && acierto!=n);
                                contadorDinamico=0;
                                break;
                                
                            case 2:
                                //mostrando todas las partidas
                                System.out.println("JUGADOR         PARTIDAS JUGADAS      PUNTOS       ERRORES" );
                                for (int i = 0; i < 4; i++) {
                                    System.out.println(partidas[i]+"                  "+partidasJugadas[i]+"                  "+puntosPartidas[i]+"       "+erroresPartidas[i]);
                                    
                                } 
                                System.out.println("presiona cualquier tecla para salir");
                                    palabraEntrada.next();
                            break;
                            case 3:
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA");
                        }
                        
                    }while (menu1!=3);    
                    menu1=0; 
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("hola");
                default:
                    System.out.println("opcion invalida");
            }
        }while (menu1 != 3);
    }
    
}
