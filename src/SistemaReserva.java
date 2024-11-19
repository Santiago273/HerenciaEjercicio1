public class SistemaReserva {
        public static void main(String[] args) {
            // Crear el sistema de reservas
            Reservas reservas = new Reservas();

            // Crear vuelos regulares y charter
            VueloRegular vuelo1 = new VueloRegular(101, "Buenos Aires", "Córdoba", "2024-11-20", 100, 500);
            VueloCharter vuelo2 = new VueloCharter(202, "Mendoza", "Santiago", "2024-12-15", 20000);

            // Agregar vuelos al sistema de reservas
            reservas.agregarVuelo(vuelo1);
            reservas.agregarVuelo(vuelo2);

            // Mostrar vuelos antes de aplicar promociones
            System.out.println("Vuelos antes de aplicar promociones:");
            reservas.mostrarVuelos();

            // Aplicar promociones a todos los vuelos promocionables
            reservas.aplicarPromociones(10); // Aplicar un 10% de descuento
            System.out.println("\nVuelos después de aplicar promociones:");
            reservas.mostrarVuelos();

            // Calcular y mostrar el precio total de las reservas
            System.out.println("\nPrecio total de las reservas: $" + reservas.calcularTotalReservas());
        }

    }
