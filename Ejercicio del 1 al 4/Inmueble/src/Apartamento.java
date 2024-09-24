public class Apartamento extends InmuebleVivienda{
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerodeBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerodeBaños);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}
