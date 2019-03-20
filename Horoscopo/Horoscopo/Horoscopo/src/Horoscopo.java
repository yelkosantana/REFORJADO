/* @author: Yelko */
import java.util.Scanner;
public class Horoscopo {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el año: ");
    int fecha = teclado.nextInt();
    
    int a = fecha % 19;
    int b = fecha / 100;
    int c = fecha / 100;
    int d = b / 4;
    int e = b % 4;
    int g = (8 * b + 13) / 25;
    int h = (19 * a + b - d - g + 15) %  30;
    int j = c / 4;
    int k = c % 4;
    int m = (a + 11 * h) / 319; 
    int r = (2*e+2*j-k-h+m+32) % 7;
    int n = ((h-m+r+90)/25);
    int p = ((h-m+r+n+19)%32);
    
    System.out.println("El domingo de Pascua es el "+ p + "/" + n + "/" + fecha);
    int HChino = fecha%12;
    switch(HChino) {
        case 1: System.out.println("Año del Gallo"); break;
        case 2: System.out.println("Año del Perro"); break;
        case 3: System.out.println("Año del Jabalí"); break;
        case 4: System.out.println("Año de la rata"); break;
        case 5: System.out.println("Año del Buey"); break;
        case 6: System.out.println("Año del Tigre"); break;
        case 7: System.out.println("Año de la Liebre"); break;
        case 8: System.out.println("Año del Dragón"); break;
        case 9: System.out.println("Año de la Serpiente"); break;
        case 10: System.out.println("Año del Caballo"); break;
        case 11: System.out.println("Año de la Cabra"); break;
        case 0:  System.out.println("Año del Mono"); break;
    }
    }
    
}
