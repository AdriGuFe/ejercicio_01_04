import java.util.concurrent.atomic.AtomicMarkableReference;

public class App {
    // Códigos ANSI para colores de texto
public static final String NEGRO = "\u001B[30m";
public static final String ROJO = "\u001B[31m";
public static final String VERDE = "\u001B[32m";
public static final String AMARILLO = "\u001B[33m";
public static final String AZUL = "\u001B[34m";
public static final String PURPURA = "\u001B[35m";
public static final String BLANCO = "\u001B[37m";
public static final String CYAN = "\033[0;36m";
public static final String RESET = "\033[0m";  // Text Reset
    
    public static void main(String[] args) throws Exception {
        System.out.println(BLANCO);
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "LUNES", "MARTES", "MIERCOLES","JUEVES","VIERNES");
        System.out.println(RESET);
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n",AMARILLO+"SI", AZUL+"PROG", AMARILLO+"SI",ROJO+"IPE",PURPURA+"BD");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", AMARILLO+"SI",AZUL+"PROG",AMARILLO+"SI",ROJO+"IPE",PURPURA+"BD");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", BLANCO+"LM", AZUL+"PROG", ROJO+"IPE",AZUL+"PROG",AMARILLO+"SI");
        System.out.printf("%-20s%-20s%-22s%-20s%-20s%n", BLANCO+"LM", PURPURA+"BD", CYAN +"DIG",AZUL+"PROG",NEGRO+"ED");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", PURPURA+"BD", PURPURA+"BD", AZUL+"PROG",AZUL+"PROG",NEGRO+"ED");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", PURPURA+"BD", VERDE+"SOS", AZUL+"PROG",BLANCO+"LM",NEGRO+"ED");
    }
}
