
package proyecto1;
import java.util.Scanner;

/**
 *
 * @author manum
 */
public class Proyecto1 { 
    public static void main(String[] args) {   
        //generamos el tablero de juego
        Tablero tablero = new Tablero();
        
        
        int [] posicionHorizontal;
        int [] posicionVertical;
        int longitud=0;
        int contadorDinamico=0;
        String [] palabraEncontrada;
        boolean [] condicion;
        //arreglos para almacenar las partidas y variables
        String [] partidas= new String[4];
        int[] puntosPartidas = new int[4];
        int[] partidasJugadas= new int[4];
        int[] erroresPartidas=new int[4];
        int contadorDinamico2=0;
        for (int i = 0; i < 4; i++) {
                partidas[i]="nueva partida";
        }
        //variables usadas para poder jugar
        boolean condicionError;
        int puntos;
        int partida=0;
        int n = 0;
        int x;
        int errores=0;
        int acierto=0;
        //arreglo para almacenar n palabras
        String [] palabra = null;
        //variables usadas para el ingreso de datos
        int menu1;
        String entrada;
        Scanner scanner = new Scanner(System.in);
        Scanner palabraEntrada = new Scanner(System.in);
        //menu principal        
        do {
            
            
            
            System.out.println("--------------MENU DE JUEGO--------------");
            System.out.println("1. Menu de palabras");
            System.out.println("2. Jugar");
            System.out.println("3. Terminar");
            System.out.println("4. imprimir");
            System.out.println("ingrese un valor numerico****");
            
            
            menu1=scanner.nextInt();
            
            
            
            switch (menu1){
                
                
                case 1:
                    
                    //Menu nueva partida
                    while(palabra==null&& menu1!=4){
                            do {
                                System.out.println("--------------NUEVA PARTIDA--------------");
                                System.out.println("1. Insertar palabras");
                                System.out.println("2. Modificar palabras");
                                System.out.println("3. Eliminar palabras");
                                System.out.println("4. regresar");
                                System.out.println("ingrese un valor numerico****");
                       
                                menu1=scanner.nextInt();
                            
                                switch (menu1){
                                    //menu para ingresar palabras
                                    case 1:
                                        //creando una partida
                                        System.out.println("--------Quieres CARGAR o CREAR una partida--------");
                                        System.out.println("escribelo en MAYUSCULA***");
                                        entrada= palabraEntrada.nextLine();
                                        if(entrada.equals("CREAR")){
                                            System.out.println("que numero de partida quieres borrar?");
                                            for (int i = 0; i < 4; i++) {
                                                System.out.println((i+1)+". "+partidas[i]);
                                            }
                                            System.out.println("ingrese un valor numerico****");
                                            contadorDinamico2= scanner.nextInt();
                                            contadorDinamico2=contadorDinamico2-1;
                                            System.out.println("Ingresa tu Nombre y tu carné");
                                            partidas[contadorDinamico2]=palabraEntrada.nextLine();
                                            puntosPartidas[contadorDinamico2]=0;
                                            partidasJugadas[contadorDinamico2]=0;
                                            erroresPartidas[contadorDinamico2]=0;
                                            System.out.println("cuantas palabras desea ingresar??");
                                            System.out.println("ingrese un valor numerico****");
                                            n = scanner.nextInt();
                                            palabra= new String[n];
                                        }else if(entrada.equals("CARGAR")){
                                            System.out.println("no hay partidas creadas");  
                                        }else{
                                            System.out.println("opcion no valida");
                                        }
                                       
                                        
                                        //se registraran las palabras usadas para jugar
                                        if(n!=0){
                                        for(int i=0; i<n;i++){
                                            System.out.println("Porfavor ingrese " +n+" palabras de 6 a 15 caracteres");
                                            System.out.print(i+1+". ");
                                            palabra[i]= palabraEntrada.nextLine();
                                            
                                            //se confirmara si los palabras ingresadas cumplen con los requisitos
                                            while (palabra[i].length()<6 || palabra[i].length() >15){
                                                System.out.println("la palabra #"+(i+1)+" no es valida, ingresa otra ");
                                                System.out.print((i+1)+". ");
                                                palabra[i] = palabraEntrada.nextLine();
                                            }
                                            
                                        }}
                                    break;
                                    case 2:
                                        System.out.println("ERROR");
                                        System.out.println("ERROR");
                                        System.out.println("Priemro tienes que ingresar las palabras!!");
                                    break;
                                    case 3:
                                        System.out.println("ERROR");
                                        System.out.println("ERROR");
                                        System.out.println("Priemro tienes que ingresar las palabras!!");
                                    break;
                                    case 4:
                                    break;
                                    default: 
                                        System.out.println("ERROR");
                                        System.out.println("ERROR");
                                        System.out.println("Priemro tienes que ingresar las palabras!!");

                                }
                            }while(palabra==null && menu1!=4);
                    }
                        
                    //Menu palabras ya cargadas   
                    while(palabra!=null && menu1!=4){
                            do{
                                //menu con palabras ya ingresadas
                                System.out.println("--------------NUEVA PARTIDA--------------");
                                System.out.println("Palabras Ingresadas");
                                for(int i =0;i<n;i++){
                                    System.out.println("+"+palabra[i]);
                                }
                                System.out.println("1. Ingresar nuevas palabra");
                                System.out.println("2. Modificar palabras");
                                System.out.println("3. Eliminar palabras");
                                System.out.println("4. regresar");
                                System.out.println("ingrese un valor numerico****");
                    
                                menu1 = scanner.nextInt();
                       
                       
                                switch(menu1){
                               
                                    case 1:
                                        //creando una partida
                                        System.out.println("--------Quieres CARGAR o CREAR una partida--------");
                                        System.out.println("escribelo en MAYUSCULA***");
                                        entrada= palabraEntrada.nextLine();
                                        
                                        if(entrada.equals("CREAR")){
                                            System.out.println("que numero de partida quieres borrar?");
                                            for (int i = 0; i < 4; i++) {
                                                System.out.println((i+1)+". "+partidas[i]);
                                            }
                                            System.out.println("ingrese un valor numerico****");
                                            contadorDinamico2= scanner.nextInt();
                                            contadorDinamico2=contadorDinamico2-1;
                                            System.out.println("Ingresa tu Nombre y tu carné");
                                            partidas[contadorDinamico2]=palabraEntrada.nextLine();
                                            puntosPartidas[contadorDinamico2]=0;
                                            partidasJugadas[contadorDinamico2]=0;
                                            erroresPartidas[contadorDinamico2]=0;
                                            
                                            System.out.println("cuantas palabras desea ingresar??");
                                            System.out.println("ingrese un valor numerico****");
                                            n = scanner.nextInt();
                                            palabra= new String[n];
                                        }
                                        else if(entrada.equals("CARGAR")){
                                            for (int i = 0; i < 4; i++) {
                                                System.out.println((i+1)+". "+partidas[i]);
                                            }
                                            System.out.println("que numero de partida quieres borrar?");
                                            contadorDinamico2= scanner.nextInt()-1;
                                            System.out.println("partida cargada");
                                            System.out.println("hola "+ partidas[contadorDinamico2]);
                                            
                                            System.out.println("cuantas palabras desea ingresar??");
                                            System.out.println("ingrese un valor numerico****");
                                            n = scanner.nextInt();
                                            palabra= new String[n];
                                        }else{
                                            System.out.println("por favor, escoge una opcion valida");
                                        }
                                        if(n!=0){
                                        //se registraran las palabras usadas para jugar
                                        for(int i=0; i<n;i++){
                                            System.out.println("Porfavor ingrese " +n+" palabras de 6 a 15 caracteres");
                                            System.out.print(i+1+". ");
                                            palabra[i]= palabraEntrada.nextLine();
                                            
                                            //se confirmara si los palabras ingresadas cumplen con los requisitos
                                            while (palabra[i].length()<6 || palabra[i].length() >15){
                                                System.out.println("la palabra #"+i+1+" no es valida, ingresa otra ");
                                                System.out.print(i+1+". ");
                                                palabra[i] = palabraEntrada.nextLine();
                                            }
                                            
                                        }}
                                    break;
                                    //menu para modificar palabras
                                    case 2:
                                        
                                            System.out.println("Que numero de palabra quieres modificar??");
                                            for(int i =0;i<n;i++){
                                                System.out.println(i+1+". "+palabra[i]);
                                            }
                                            System.out.println("ingrese un valor numerico****");
                                            System.out.println("ingrese cualquier numero distinto para regresar");

                                            menu1 = scanner.nextInt();
                                            
                                            //sistema para cambiar palabras
                                            if (menu1<=n) {
                                                System.out.println("ingresa la nueva palabra:");
                                                palabra[menu1-1]= palabraEntrada.nextLine();
                                                //verificando si la palabra es valida
                                                while (palabra[menu1-1].length()<6 || palabra[menu1-1].length() >15){
                                                    System.out.println("la palabra #"+(menu1)+" no es valida, ingresa otra ");
                                                    System.out.print(menu1+". ");
                                                    palabra[menu1-1] = palabraEntrada.nextLine();
                                            }
                                            break;
                                            }   
                                         
                                        
                                    break;    
    
                                    //menu para eliminar palabras   
                                    case 3:
                                        System.out.println("que parablra deceas eliminar??");
                                        for(int i =0;i<n;i++){
                                                System.out.println(i+1+". "+palabra[i]);
                                            }
                                            System.out.println("ingrese un valor numerico****");
                                            System.out.println("ingrese un numero distinto para salir");

                                        menu1 = scanner.nextInt();
                                        
                                        //sistema para eliminar palabras
                                            if (menu1<=n) {
                                                palabra[menu1-1]="";
                                                break;
                                            }
                                    break;

                                        
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("ERROR");
                                        System.out.println("ERROR");
                                        System.out.println("opccion no valida");
                                }

                            }while(menu1!=4);
                    }
                    break;
                    
                    
                //Menu jugar    
                case 2:
                    do {
                        System.out.println("--------------JUGAR--------------");
                        System.out.println("1. jugar");
                        System.out.println("2. Historial de partidas");
                        System.out.println("3. Regresar");
                        System.out.println("ingrese un valor numerico****");
                        menu1=scanner.nextInt();
                        
                        switch(menu1){
                            
                            //iniciando juego 
                            case 1:
                                //verificador si hay una palabra vacia
                                for(int i=0;i<n;i++){
                                    if(palabra[i]!= ""){
                                        contadorDinamico++;
                                    }
                                }
                                //juego corriendo despues de verificar
                                if(contadorDinamico==n && n!=0){
                                    //restablecemos las variablres usadas para jugar
                                    acierto=0;
                                    errores=0;
                                    puntos=25;
                                    x=0;
                                    palabraEncontrada = new String[n];
                                    condicion = new boolean[n];
                                    for (int i = 0; i < n; i++){
                                        palabraEncontrada[i]="**********";
                                        condicion[i]=true;
                                    }
                                    
                                    //sumano el numero de partida
                                    partida=1;
                                    
                                    //variables para determinar la posicion aleatoria de las palabras
                                    posicionVertical= new int [n];
                                    posicionHorizontal= new int[n];
                                    
                                    //generando una matriz vacia
                                    for(int i = 0; i<25; i++){
                                        for(int j=0; j<25; j++){
                                            tablero[i][j] ='!';
                                        }
                                    }
                                    //ingresando las n palabras adentro de la matriz
                                    for(int i=0; i<n; i++){
                                        do{
                                            //restablecemos nuestras variables de control
                                            longitud=0;
                                            contadorDinamico=0;

                                            posicionVertical[i] =(int)(Math.random()*25);
                                            posicionHorizontal[i] =(int)(Math.random()*25);


                                            //condicion para que la palabra sea horizontal
                                            if(posicionHorizontal[i]%2==0 && (posicionVertical[i] + palabra[i].length())<25){
                                                //verificando si las celdas estan vacias
                                                for (int j = 0; j <palabra[i].length(); j++) {
                                                    if(tablero[posicionHorizontal[i]][posicionVertical[i]+j]=='!'){
                                                        contadorDinamico++;
                                                    }
                                                }

                                                if(contadorDinamico==palabra[i].length()){
                                                    for(int k=0; k<25; k++){
                                                        for(int j=0; j<25; j++){
                                                            if(longitud< palabra[i].length()){
                                                            tablero[posicionHorizontal[i]][posicionVertical[i]+j]= palabra[i].charAt(longitud);
                                                            longitud++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                            //condicion para que la palabra sea vertical
                                            if(posicionHorizontal[i]%2!=0 && (posicionHorizontal[i] + palabra[i].length())<26){

                                                //verificando si las celdas estan vacias
                                                for (int j = 0; j <palabra[i].length(); j++) {
                                                    if(tablero[posicionHorizontal[i]+j][posicionVertical[i]]=='!'){
                                                        contadorDinamico++;
                                                    }
                                                }
                                                if(contadorDinamico==palabra[i].length()){
                                                    for(int k=0; k<25; k++){
                                                        for(int j=0; j<25; j++){
                                                            if(longitud< palabra[i].length()){
                                                            tablero[posicionHorizontal[i]+j][posicionVertical[i]]=palabra[i].charAt(longitud);
                                                            longitud++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }while(longitud!=palabra[i].length());
                                    }
                                    //generando el tablero de juego
                                    for(int i = 0; i<25; i++){
                                        for(int j=0; j<25; j++){
                                            if(tablero[i][j]=='!'){
                                        int letras =(int) (System.nanoTime() % 26);
                                        tablero[i][j] =(char) ('a'+letras);
                                            }
                                        }
                                    }
                                    //jugando
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
                                }else{
                                    System.out.println("porfavor, revisa si estan todas las palabras ingresadas");
                                    break;
                                }
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
