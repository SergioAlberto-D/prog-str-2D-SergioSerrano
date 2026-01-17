import java.util.*;
public class Main{
    //Constantes
    public static double IVA=.16;
    public static double Descuento = .10;
    public static double LimitDescuento = 1000;
    //Mi Main
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double Subtotal = Obtenerdouble(sc,"Ingrese el subtotal de la compra");
        double totalConIva = CalcularTot(Subtotal);
        System.out.println("total: "+ totalConIva);
    }
    //Bienvenida y obtencion del mondo inicial
    public static double Obtenerdouble(Scanner sc, String mensaje){
        System.out.println(mensaje+"\n");
        return sc.nextDouble();
    }
    //Al monto incial se le suma el porcentaje de IVA
    public static double CalcularTot(double Subtotal){
        double totalConIva= Subtotal+(Subtotal*IVA);
        return CalDescuento(totalConIva);
    }
    //En caso de superar cierta cantidad se hace un descuento
    public static double CalDescuento(double totalConIva){
        if (totalConIva>LimitDescuento){
            totalConIva = totalConIva-(totalConIva*Descuento);
        }
        return totalConIva;
    }
}