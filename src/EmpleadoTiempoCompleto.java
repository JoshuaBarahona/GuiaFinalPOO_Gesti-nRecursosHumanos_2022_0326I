public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, double salarioAnual){
        super(nombre, numeroIdentificacion); //acceder y llamar funciones de la clase base.
        this.salarioAnual = salarioAnual;
    }

    @Override //anular.
    public double calcularSalario(){
        return salarioAnual / 12; 
    }

}
