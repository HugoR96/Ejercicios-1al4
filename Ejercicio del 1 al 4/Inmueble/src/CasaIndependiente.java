public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerodeBaños, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerodeBaños, numeroPisos);
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
