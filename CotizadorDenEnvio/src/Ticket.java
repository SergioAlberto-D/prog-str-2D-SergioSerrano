public class Ticket {
    public void imprimir(ShippingCalculator shipping,double peso,int distancia, int tipo,boolean remote){
        System.out.println(" Recivo" +
                "\n Servicio: " + ((tipo ==2)? "Express" :"Estandar") +
                "\n Peso (kg): " + peso  +
                "\n Distancia (km): " + distancia +
                "\n Uso de zona remota: " + remote +
                "\n \n Subtotal (NO IVA): " + shipping.subtotal +
                "\n IVA: "+ shipping.ivaAlSub +
                "\n Total: "+shipping.total );
    }
}
