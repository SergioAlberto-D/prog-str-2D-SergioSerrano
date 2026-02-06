public class ShippingCalculator {
    private final double estandar = 50, costoPorKG = 12, express = 90, recargoPorRemoto = .10, iva = .16;
    public double subtotal,ivaAlSub,total;
    public final int condicionServicio =2, condicionDis1 =50,condicionDis2 =200,valorDis1 =20,valorDis2 =60,ValorDis3=120;

    void process(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        this.subtotal += (tipoServicio == condicionServicio)? express : estandar ;
        this.subtotal += (pesoKg*costoPorKG);
        this.subtotal += calcularPrecioDistancia(distanciaKm);
        if(zonaRemota){
            this.subtotal += this.subtotal*recargoPorRemoto;
        }
        calcularIVA();
        calcularTotal();
    }
    void calcularIVA(){
        this.ivaAlSub= this.subtotal * iva ;
    }
    void calcularTotal(){
        this.total = this.ivaAlSub + this.subtotal;
    }
    private double calcularPrecioDistancia(int distanciaKm){
        if (distanciaKm <= condicionDis1) {
            return valorDis1;
        }else if (distanciaKm <= condicionDis2) {
            return valorDis2;
        }else{
            return ValorDis3;
        }
    }
}
