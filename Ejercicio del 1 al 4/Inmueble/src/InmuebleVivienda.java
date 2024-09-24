public class InmuebleVivienda extends Inmuebles{
    protected int numeroHabitaciones;
    protected int numerodeBaños;
    public InmuebleVivienda(int identificadorInmobiliario,int area, String direccion,
                             int numeroHabitaciones,int numerodeBaños){
        super(identificadorInmobiliario,area,direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numerodeBaños = numerodeBaños;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Numero de Habitaciones = " + numeroHabitaciones);
        System.out.println("Numero de baños= " +numerodeBaños);
    }
}
