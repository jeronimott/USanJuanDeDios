
package usanjuandedios;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversidadSanJuanDeDios {
    private static ArrayList<EstudianteIngenieria> estudiantesIngenieria = new ArrayList<>();
    private static ArrayList<EstudianteDiseno> estudiantesDiseno = new ArrayList<>();
    private static ArrayList<TabletaGrafica> tabletasGraficas = new ArrayList<>();
    private static ArrayList<ComputadorPortatil> computadoresPortatiles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    menuEstudiantesIngenieria(scanner);
                    break;
                case 2:
                    menuEstudiantesDiseno(scanner);
                    break;
                case 3:
                    imprimirInventarioTotal();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. ESTUDIANTES DE INGENIERIA");
        System.out.println("2. ESTUDIANTES DE DISEÑO");
        System.out.println("3. IMPRIMIR INVENTARIO TOTAL");
        System.out.println("4. SALIR DEL PROGRAMA");
        System.out.print("Seleccione una opción: ");
    }

    private static void menuEstudiantesIngenieria(Scanner scanner) {
        int opcion;
        do {
            System.out.println("MENU ESTUDIANTES DE INGENIERIA");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    registrarPrestamoIngenieria(scanner);
                    break;
                case 2:
                    modificarPrestamoIngenieria(scanner);
                    break;
                case 3:
                    devolucionEquipoIngenieria(scanner);
                    break;
                case 4:
                    buscarEquipoIngenieria(scanner);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private static void registrarPrestamoIngenieria(Scanner scanner) {
        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el teléfono del estudiante: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el número de semestre: ");
        int numeroSemestre = scanner.nextInt();
        System.out.print("Ingrese el promedio acumulado: ");
        double promedioAcumulado = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Ingrese el serial del equipo: ");
        String serial = scanner.nextLine();
        System.out.println("Ingrese sistema operativo del pc:");
        System.out.println("1. Windows 7 ; "
                + "2. Windows 10 ; "
                + "3. Windows 11");
        String sistemaoperativo = scanner.nextLine();
        System.out.println("Ingrese el tipo de procesador:");
        System.out.println("4. AMD Ryzen ; "
                + "5. Intel® Core™ i5");
        String procesador = scanner.nextLine();
        
        
        // Verificar que no se repita el registro
        for (EstudianteIngenieria estudiante : estudiantesIngenieria) {
            if (estudiante.getCedula().equals(cedula) || estudiante.getSerial().equals(serial)) {
                System.out.println("Error: Ya existe un registro con esa cédula o serial.");
                return;
            }
        }
        
        String sistemaoperativos = null;
        estudiantesIngenieria.add(new EstudianteIngenieria(cedula, nombre, apellido, telefono, numeroSemestre, promedioAcumulado, serial, sistemaoperativos, procesador));
        System.out.println("Préstamo registrado exitosamente.");
    }

    private static void modificarPrestamoIngenieria(Scanner scanner) {
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String identificador = scanner.nextLine();
        EstudianteIngenieria estudiante = buscarEstudianteIngenieria(identificador);
        if (estudiante != null) {
            System.out.print("Ingrese el nuevo número de semestre: ");
            int numeroSemestre = scanner.nextInt();
            System.out.print("Ingrese el nuevo promedio acumulado: ");
            float promedioAcumulado = scanner.nextFloat();
            scanner.nextLine(); 
            estudiante.setNumeroSemestre(numeroSemestre);
            estudiante.setPromedioAcumulado(promedioAcumulado);
            System.out.println("Préstamo modificado exitosamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
    }

    private static void devolucionEquipoIngenieria(Scanner scanner) {
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String identificador = scanner.nextLine();
        EstudianteIngenieria estudiante = buscarEstudianteIngenieria(identificador);
        if (estudiante != null) {
            estudiantesIngenieria.remove(estudiante);
            System.out.println("Devolución de equipo realizada exitosamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
    }

    private static void buscarEquipoIngenieria(Scanner scanner) {
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String identificador = scanner.nextLine();
        EstudianteIngenieria estudiante = buscarEstudianteIngenieria(identificador);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado: ");
            System.out.println("Cédula: " + estudiante.getCedula());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Teléfono: " + estudiante.getTelefono());
            System.out.println("Número de semestre: " + estudiante.getNumeroSemestre());
            System.out.println("Promedio acumulado: " + estudiante.getPromedioAcumulado());
            System.out.println("Serial del equipo: " + estudiante.getSerial());
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
    }

    private static EstudianteIngenieria buscarEstudianteIngenieria(String identificador) {
        for (EstudianteIngenieria estudiante : estudiantesIngenieria) {
            if (estudiante.getCedula().equals(identificador) || estudiante.getSerial().equals(identificador)) {
                return estudiante;
            }
        }
        return null;
    }

    private static void menuEstudiantesDiseno(Scanner scanner) {
        int opcion;
        do {
            System.out.println("MENU ESTUDIANTES DE DISEÑO");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    registrarPrestamoDiseno(scanner);
                    break;
                case 2:
                    modificarPrestamoDiseno(scanner);
                    break;
                case 3:
                    devolucionEquipoDiseno(scanner);
                    break;
                case 4:
                    buscarEquipoDiseno(scanner);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private static void registrarPrestamoDiseno(Scanner scanner) {
        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el teléfono del estudiante: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese la modalidad de estudio (virtual/presencial): ");
        String modalidadEstudio = scanner.nextLine();
        System.out.print("Ingrese la cantidad de asignaturas: ");
        int cantidadAsignaturas = scanner.nextInt();
        System.out.print("Ingrese el serial del equipo: ");
        int serial = scanner.nextInt();
        System.out.println("Ingrese la contidad de gigas deseadas:");
        System.out.println("1. 256GB ; "
                + "2. 512GB ; "
                + "3. 1TB");
        String seleccionaralmacenamiento = scanner.nextLine();
                
        
        
        // comprobante de no repetir registros 
        
        for (EstudianteDiseno estudiante : estudiantesDiseno) {
            if (estudiante.getCedula().equals(cedula) || estudiante.getSerial() == serial) {
                System.out.println("Error: Ya existe un registro con esa cédula o serial.");
                return;
            }
        }

        
        estudiantesDiseno.add(new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidadEstudio, cantidadAsignaturas, serial));
        System.out.println("Préstamo registrado exitosamente.");
    }

    private static void modificarPrestamoDiseno(Scanner scanner) {
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String identificador = scanner.nextLine();
        EstudianteDiseno estudiante = buscarEstudianteDiseno(identificador);
        if (estudiante != null) {
            System.out.print("Ingrese la nueva modalidad de estudio (virtual/presencial): ");
            String modalidadEstudio = scanner.nextLine();
            System.out.print("Ingrese la nueva cantidad de asignaturas: ");
            int cantidadAsignaturas = scanner.nextInt();
            scanner.nextLine(); 
            estudiante.setModalidadEstudio(modalidadEstudio);
            estudiante.setCantidadAsignaturas(cantidadAsignaturas);
            System.out.println("Préstamo modificado exitosamente.");
        } else {
            System.out.println("Error: No existe el estudiante.");
        }
    }

    private static void devolucionEquipoDiseno(Scanner scanner) {
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String identificador = scanner.nextLine();
        EstudianteDiseno estudiante = buscarEstudianteDiseno(identificador);
        if (estudiante != null) {
            estudiantesDiseno.remove(estudiante);
            System.out.println("Devolución de equipo realizada exitosamente.");
        } else {
            System.out.println("Error: No existe el estudiante.");
        }
    }

    private static void buscarEquipoDiseno(Scanner scanner) {
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String identificador = scanner.nextLine();
        EstudianteDiseno estudiante = buscarEstudianteDiseno(identificador);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado: ");
            System.out.println("Cédula: " + estudiante.getCedula());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Teléfono: " + estudiante.getTelefono());
            System.out.println("Modalidad de estudio: " + estudiante.getModalidadEstudio());
            System.out.println("Cantidad de asignaturas: " + estudiante.getCantidadAsignaturas());
            System.out.println("Serial del equipo: " + estudiante.getSerial());
        } else {
            System.out.println("Error: No existe el estudainte.");
        }
    }

    private static EstudianteDiseno buscarEstudianteDiseno(String identificador) {
        for (EstudianteDiseno estudiante : estudiantesDiseno) {
            if (estudiante.getCedula().equals(identificador) || Integer.toString(estudiante.getSerial()).equals(identificador)) {
                return estudiante;
            }
        }
        return null;
    }

    private static void imprimirInventarioTotal() {
        System.out.println("Inventario de Equipos Prestados a Estudiantes de Ingeniería:");
        for (EstudianteIngenieria estudiante : estudiantesIngenieria) {
            System.out.println("Cédula: " + estudiante.getCedula() + ", Nombre: " + estudiante.getNombre() + ", Serial del equipo: " + estudiante.getSerial() + ", Sistema del equipo:" + estudiante.getsietmaoperativos() + ", Procesador del quipo:" + estudiante.procesador());
        }

        System.out.println("\nInventario de Equipos Prestados a Estudiantes de Diseño:");
        for (EstudianteDiseno estudiante : estudiantesDiseno) {
            System.out.println("Cédula: " + estudiante.getCedula() + ", Nombre: " + estudiante.getNombre() + ", Serial del equipo: " + estudiante.getSerial());
        }
    }
}

