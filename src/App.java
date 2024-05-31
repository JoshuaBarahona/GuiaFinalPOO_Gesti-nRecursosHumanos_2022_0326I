public class App {
    public static void main(String[] args) throws Exception {
        
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new EmpleadoTiempoCompleto("Juan Pérez", "123", 48000.0);
        empleados[1] = new EmpleadoMedioTiempo("María López", "456", 15.0, 20);
        //Se agrega el tercer empleado.
        empleados[2] = new EmpleadoTiempoCompleto("Emanuel Martínez", "890", 25000.0);
        //Se agrega el cuarto empleado.
        empleados[3] = new EmpleadoMedioTiempo("Gerundio Escobar", "675", 50.0, 25);
        

        for (Empleado empleado : empleados){
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $" + empleado.calcularSalario());
        }

        //Ciclo for que recorre los 4 empleados.
        for (int i = 0; i < empleados.length; i++) {
            Empleado empleado = empleados[i];
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $" + empleado.calcularSalario());
        }
    
    }
    
}
