import java.util.Scanner;

public class Main {
    /**
     * Datos constantes a lo largo del codigo
     */
    public static Scanner scanner = new Scanner(System.in);
    public static double rangoBajo = 18.5;
    public static double rangoMedio = 25;
    public static double rangoAlto = 30;
    public static double paramfaren = 1.8;
    public static double paramFaren = 32;
    public static double Pi = 3.1416;

    static void main(String[] args) {
        int choice;
        do {
            mensaje();
            choice = obtenerEleccion( "Que quieres hacer");
            System.out.println(MenuDesplega(choice));
        }while(choice != 5);
    }

    //Inicio
    /**
     *Mensaje de bienvenida y despliegue del menu
     */
    public static void mensaje(){
        System.out.println("""
                Bienvenido al Menu \
            
                1. Calcular IMC
                2. Calcular área de un rectángulo
                3. Convertir °C a °F
                4. Calcular area de un circulo
                5. Salir"""
        );
    }
    /**
     *Ejecucion de las acciones relacionadas con el menu
     * @param choice --> La eleccion del usuario de la accion a realizar
     * @return String
     */
    public static String MenuDesplega(int choice){
        String mensaje;
        switch (choice){
            case 1:
                double pesokg = obtenerDoubleREct( "ingrese  el peso en kilogramso ");
                double AlturaM = obtenerDoubleREct( "ingrese  la altura en Metros");
                double imc = IMC(pesokg,AlturaM);
                mensaje = ( "Tu IMC es:" + imc + "Claificacion: " + obtenerUnaClasificacion(imc));
                break;
            case 2:
                double altura = obtenerDoubleREct( "ingrese la altura del rectangulo");
                double base = obtenerDoubleREct( "ingrese la altura del rectangulo");
                mensaje = ("El area del rectangulo es " + AreaRect(base,altura));
                break;
            case 3:
                double celsius = obtenerDoubleREct("Ingrese el valor a convertir a fahrenheit");
                double fahrenheit = calcularfarenehit(celsius);
                mensaje = ("La conversion de: " + celsius + " Grados celsius a farenheit es: " + fahrenheit);
                break;
            case 4:
                double RadioCirculo = obtenerDoubleREct( "Ingrese la medida del radio del circulo");
                double AreaCirculo = calcularRadia(RadioCirculo);
                mensaje = ("El area del Circulo " + AreaCirculo);
                break;
            default:
                mensaje = "Adios";
                break;
        }
        return mensaje;
    }

    //obtencion de variables
    /**
     *Funcion para recibir la opcion elegida por el usuario
     * @param mensaje --> Mensaje especifico para iniciar
     * @return  Int
     */
    public static int obtenerEleccion( String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    /**
     *Funcion Para obtener los parametros varibales para las distintas ecuaciones
     * @param mensaje --> Texto recibido desde el bloque principal para contextualizar
     * @return Double
     */
    public static double obtenerDoubleREct(String mensaje){
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    //Metodos referentes al IMC
    /**
     *Funcion para mediante la division de peso y altura obtener el Indice de Masa Corporal
     * @param pesoKG --> parametro representado en Kilogramos
     * @param alturaM --> Parametro representado en Metro
     * @return double IMC
     */
    public static double IMC(double pesoKG,double alturaM){
        return (pesoKG / (alturaM * alturaM));
    }
    /**
     * Metodo para clasificar tu peso de acuerdo con las especificacion
     * @param IMC --> parametro calculado previamente
     * @return string
     */
    public static String obtenerUnaClasificacion (double IMC){
        if (IMC < rangoBajo) return "Bajo peso";
        else if (IMC < rangoMedio) return "Paso medio";
        else if (IMC < rangoAlto) return "Peso alto";
        else return "Obecidad";
    }

    //Metodo referente al area del rectangulo
    /**
     * Metodo de calculo basico del area de un rectangulo multiplicado base por altura
     * @param base --> Parametro de un aspecto cuantitativo longitudinal del rectangulo por lo general referente a lo ancho
     * @param altura -->Parametro de un aspecto cuantitativo longitudinal del rectangulo por lo general referente a lo alto
     * @return double
     */
    public static double AreaRect(double base, double altura){
        return (base * altura);
    }

    //Metodo referente al celsius a fahrenheit
    /**
     * Metodo de conversion equivalente de los grados celsius a fahrenheit mediante la formula (°C × 9/5) + 32
     * @param celsius --> Parametro dado por el usuario
     * @return double
     */
    public static double calcularfarenehit(double celsius){
        return (celsius * paramfaren) + paramFaren;
    }

    //Metodo referente al Area Del Circulo
    /**
     * Metodo para calcular el area del circulo mediante la formula πr²
     * @param RCirculo --> Parametro recibido con anterioridad por el usuario
     * @return double
     */
    public static double calcularRadia (double RCirculo) {
        return (Pi*(RCirculo*RCirculo));
    }
}