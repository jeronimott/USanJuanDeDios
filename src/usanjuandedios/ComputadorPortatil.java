
package usanjuandedios;
import java.util.Scanner;


public class ComputadorPortatil {
    
    private String serial;
    private String marca;
    private double tamano;
    private double precio;
    private String sistemaOperativo;
    private String procesador;

    public ComputadorPortatil(String serial, String marca, double tamano, double precio) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistemaOperativo = seleccionarSistemaOperativo();
        this.procesador = seleccionarProcesador();
    }

    private String seleccionarSistemaOperativo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el sistema operativo:");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                return "Windows 7";
            case 2:
                return "Windows 10";
            case 3:
                return "Windows 11";
            default:
                return "Windows 10";
        }
    }

    private String seleccionarProcesador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el procesador:");
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel® Core™ i5");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                return "AMD Ryzen";
            case 2:
                return "Intel® Core™ i5";
            default:
                return "Intel® Core™ i5";
        }
    }

 
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}

    
    
    

