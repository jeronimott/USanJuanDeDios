
package usanjuandedios;
import java.util.Scanner;


public class TabletaGrafica {
 
    private String serial;
    private String marca;
    private double tamano;
    private double precio;
    private String almacenamiento;
    private double peso;

    public TabletaGrafica(String serial, String marca, double tamano, double precio, double peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.almacenamiento = seleccionarAlmacenamiento();
        this.peso = peso;
    }

    private String seleccionarAlmacenamiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el almacenamiento:");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                return "256 GB";
            case 2:
                return "512 GB";
            case 3:
                return "1 TB";
            default:
                return "256 GB";
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

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

    

