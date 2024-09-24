public class Oficina extends Local {
    public static double valorArea = 3500000;
    protected boolean esGobierno;

    public Oficina(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.esGobierno = esGobierno;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
