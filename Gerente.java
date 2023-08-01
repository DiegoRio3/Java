public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() { }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion,
                   double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion,
                   double remuneracion, int empleadoId, int presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", presupuesto= " + presupuesto;
    }
}
