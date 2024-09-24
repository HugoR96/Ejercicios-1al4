public class ApartaEstudio extends Apartamento{
    protected static double valoraArea = 1500000;

    public ApartaEstudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerodeBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerodeBaños);
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
