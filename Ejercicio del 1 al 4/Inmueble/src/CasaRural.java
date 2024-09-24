public class CasaRural extends Casa{
    protected static double valorArea =15000000;
        protected int distanciaCabera;
        protected int altitud;

    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerodeBaños, int numeroPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerodeBaños, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Distancia la cabecera municipal = " +
                numeroHabitaciones + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud +
 "metros.");
        System.out.println();
    }
}

