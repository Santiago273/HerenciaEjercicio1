public class VueloRegular extends Vuelo implements Promocionable{
    private int numeroAsientos;
    private double precioBase;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBase) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBase;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        precioBase -= precioBase * descuento / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vuelo Regular, Asientos: " + numeroAsientos + ", Precio Total: $" + calcularPrecio();
    }
}
