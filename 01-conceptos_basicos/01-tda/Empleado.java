package mx.edu.uttt.tda.vectores;

public class Empleado {
    private String numeroNomina;
    private String sexo;
    private double salario;
    private boolean activo;
    private static int contadorEmpleados;
    private String nombre;

    public Empleado(String numeroNomina, String nombre, String masculino, double v, boolean b) {
        contadorEmpleados++;
    }

    public Empleado(String numeroNomina, String sexo, double salario, boolean activo, String nombre) {
        this.numeroNomina = numeroNomina;
        this.sexo = sexo;
        this.salario = salario;
        this.activo = activo;
        this.nombre = nombre;
        contadorEmpleados++;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static int getContadorEmpleados() {
        return Empleado.contadorEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroNomina='" + numeroNomina + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                ", activo=" + (activo ? "Activo" : "Inactivo") +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
