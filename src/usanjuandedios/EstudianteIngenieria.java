
package usanjuandedios;


public class EstudianteIngenieria {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private int numeroSemestre;
    private double promedioAcumulado;
    private String serial;
    private String sistemaoperativos;
    private String procesador; 
    
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre, double promedioAcumulado, String serial, String sistemaoperativos, String procesador) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
        this.serial = serial;
        this.sistemaoperativos = sistemaoperativos;
        this.procesador = procesador;
    }

  

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
    
    
     public String getsietmaoperativos() {
        return sistemaoperativos;
    }

    public void setsistemaoperativos(String serial) {
        this.sistemaoperativos = sistemaoperativos;
    }
    
    
    public String procesador() {
        return procesador;
    }

    public void procesador(String serial) {
        this.procesador = procesador;
    }
    
    
    
    
}

    

