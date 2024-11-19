public class VueloCharter extends Vuelo{
    private double precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        precioTotal -= precioTotal * descuento / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vuelo Charter, Precio Total: $" + calcularPrecio();
    }
}
