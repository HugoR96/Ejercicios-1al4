public class ApartamentoFamiliar  extends Apartamento{
    protected static double valorArea =20000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerodeBaños, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerodeBaños);
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    void imprimir() {
        System.out.println("Valor de la Administracion = $ "+valorAdministracion);
        System.out.println();
    }
}
