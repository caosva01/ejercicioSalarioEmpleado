import  java.util.Scanner;
public class Main {
public static void main(String[] args) {
    /*
    *Una empresa desea registrar la informacion de cada empleado
    * Para ello un empleado debe ingresar con su usuario y contraseña
    * Una vez ingresando el empleado debe registrar la siguiente informacion
    * 1- Nombre completo
    * 2- Documento de identidad
    * 3- Valor de hora
    * 4- Cantidad de horas
    * 5- Seleccionar un dia de descanso a la semana (l-v)
    * El sistema le debe mostrar al empleado:
    * su salario neto, salario bruto, deduccion por pension, deduccion
    * por salud, auxilio de transporte (si aplica) y bonificacion del 10%
    * si no supera 2 SMMLV (sin incluir auxilio de transporte)
    * toda la informacion del empleado de debe mostrar en un mensaje descriptivo
    * */
    // definicion de Variables
    Scanner sc = new Scanner(System.in);
    String nombreEmpleado = "";
    String documentoIdentidad = "";
    String diaDescanso = "";
    String usuarioEmpleado = "";
    String contrasenaUsuario ="";
    double salarioBruto = 0;
    double salarioNeto = 0;
    double retencionSalud = 0;
    double retencionPension = 0;
    double valorHora= 0;
    double cantidadHoras = 0;
    double bonificacionEmpleado = 0;
    double valorsalariominimo = 0;
    int auxilioTransporte = 200000;

    System.out.printf("Ingrese su usuario: ");
    usuarioEmpleado = sc.nextLine();
    System.out.printf("Ingrese su contraseña: ");
    contrasenaUsuario = sc.nextLine();
    if(usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")){
        System.out.println("Ha ingresado de forma correcta");
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.print("Ingrese su documento de identidad: ");
        documentoIdentidad =sc.nextLine();
        System.out.print("Ingrese el dia de descanso (lunes a viernes): ");
        diaDescanso = sc.nextLine();
        System.out.print("Ingrese el valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.printf("Ingrese la cantidad de horas trabajadas: ");
        cantidadHoras =sc.nextDouble();
        salarioBruto = valorHora * cantidadHoras;
        System.out.println("Ingrese el valor del salario minimo para este año: ");
        if(salarioBruto > (valorsalariominimo*2)){
            bonificacionEmpleado =0;
            auxilioTransporte =0;
        } else {
            bonificacionEmpleado = salarioBruto*0.1;
            auxilioTransporte = 200000;

            retencionSalud = salarioBruto*0.04;
            retencionPension = salarioBruto*0.04;
            salarioNeto = salarioBruto - retencionSalud - retencionPension + auxilioTransporte + bonificacionEmpleado;
            System.out.println("detalle de nomina del empleado: ");
            System.out.println("el empleado " + nombreEmpleado + " con documento de identidad " + documentoIdentidad +
            " tiene el siguiente detalle :\nsalarioBruto: " + salarioBruto + "\nsalarioNeto: " + salarioNeto + "\ndeduccion por salud: " + retencionSalud + "\ndeduccion por pension: " + retencionPension + "\nauxilio de transporte: " + auxilioTransporte + "\nbonificacion del 10%: " + bonificacionEmpleado);
        }
        
    } else{
        System.out.printf("Error de credenciales");
    }

}
}
