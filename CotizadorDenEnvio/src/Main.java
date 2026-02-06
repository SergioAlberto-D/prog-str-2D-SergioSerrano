import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        InputDataValidator inputDataValidator = new InputDataValidator();
        ShippingCalculator shipping = new ShippingCalculator();
        Ticket ticket = new Ticket();

        double pesoKG = inputDataValidator.leerDoubleEnRango(sc,"Ingrese el peso representado en KG",.1,50);
        int distanciakm = inputDataValidator.leerIntEnRango(sc,"Ingrese la distancia representado en KM",1,2000);
        int tipoDeServicio = inputDataValidator.leerIntEnRango(sc,"Ingrese el tipo de servicion 1)Estandar 2)Express",1,2);
        boolean esZonaRemota = inputDataValidator.leerBoolean(sc,"Ingrese si es zona remota o no true or false");

        shipping.process(pesoKG,distanciakm,tipoDeServicio,esZonaRemota);

        ticket.imprimir(shipping,pesoKG,distanciakm,tipoDeServicio,esZonaRemota);
    }
}