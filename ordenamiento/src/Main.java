import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int menu = 0, codigo = 0;
        int encontrado = 0;
        String nombre = "", carrera = "", nCreditos = "";
        ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

        do {
            System.out.println("\n------------------------- Programa para la gestion de asignaturas -------------------------\n");
            System.out.println("1. Crear Asignatura");
            System.out.println("2. Modificar Asignatura ");
            System.out.println("3. Eliminar Asignatura ");
            System.out.println("4. Consultar Asignatura por codigo");
            System.out.println("5. Ordenar asignaturas Intercambio (por codigo)");
            System.out.println("6. Ordenar asignaturas Seleccion (por codigo)");
            System.out.println("7. Ordenar asignaturas Insercion (por codigo)");
            System.out.print("Ingrese la opcion que desea realizar :");
            menu = lector.nextInt();
            System.out.println("\n");

            switch (menu) {
                case 1:
                    System.out.println("Inserción de asignatura ");

                    System.out.print("Ingrese el código de asignatura: ");
                    codigo = lector.nextInt();
                    System.out.print("Ingrese el nombre de asignatura: ");
                    nombre = lector.next();
                    System.out.print("Ingrese la carrera de la asignatura: ");
                    carrera = lector.next();
                    System.out.print("Ingrese el número de créditos de asignatura: ");
                    nCreditos = lector.next();

                    Asignatura asignatura = new Asignatura(codigo, nombre, carrera, nCreditos);
                    asignaturas.add(asignatura);
                    break;
                case 2:
                    System.out.println("Modificación de asignatura ");
                    System.out.print("Ingrese el codigo de asignatura a modificar: ");
                    int codigoAsignatura = lector.nextInt();
                    System.out.println("\n");
                    for (int i = 0; i < asignaturas.size(); i++) {
                        if (asignaturas.get(i).codigo == codigoAsignatura) {
                            encontrado = i;
                            System.out.print("Los datos de la asignatura son: ");
                            System.out.print("Codigo :" + asignaturas.get(i).getCodigo() + ",");
                            System.out.print("Nombre :" + asignaturas.get(i).getNombre() + ",");
                            System.out.print("Carrera :" + asignaturas.get(i).getCarrera() + ",");
                            System.out.print("Numero de Creditos :" + asignaturas.get(i).getNcreditos() + " ");
                            System.out.println("\n");

                            System.out.print("Ingrese el nuevo código de asignatura: ");
                            int cod = lector.nextInt();
                            System.out.print("Ingrese el nuevo nombre de asignatura: ");
                            String nom = lector.next();
                            System.out.print("Ingrese la nueva carrera de la asignatura: ");
                            String car = lector.next();
                            System.out.print("Ingrese el nuevo número de créditos de asignatura: ");
                            String nCred = lector.next();

                            asignaturas.remove(encontrado);
                            Asignatura asig = new Asignatura(cod, nom, car, nCred);
                            asignaturas.add(asig);
                        } else {
                            System.out.println("La asignatura no fue encontrada: ");
                        }
                    }
                    ;
                    break;
                case 3:
                    System.out.println("Eliminacion de asignaturas ");
                    System.out.print("Ingrese el codigo de la asignatura a eliminar: ");
                    codigo = lector.nextInt();
                    for (int i = 0; i < asignaturas.size(); i++) {
                        if (asignaturas.get(i).codigo == codigo) {
                            encontrado = i;
                            System.out.println("Los datos de la asignatura eliminada son: ");

                            System.out.print("Codigo :" + asignaturas.get(i).getCodigo() + ",");
                            System.out.print("Nombre :" + asignaturas.get(i).getNombre() + ",");
                            System.out.print("Carrera :" + asignaturas.get(i).getCarrera() + ",");
                            System.out.print("Numero de Creditos :" + asignaturas.get(i).getNcreditos() + " ");

                            asignaturas.remove(encontrado);
                        } else {
                            System.out.println("La asignatura no fue encontrada: ");
                        }
                    }

                    break;
                case 4:
                    System.out.print("Ingrese el codigo de la asignatura que desea buscar: ");
                    codigo = lector.nextInt();
                    for (int i = 0; i < asignaturas.size(); i++) {
                        if (asignaturas.get(i).codigo == codigo) {
                            encontrado = i;
                            System.out.println("Los datos de la asignatura son: ");
                            System.out.println("\n");
                            System.out.print("Codigo :" + asignaturas.get(i).getCodigo() + ",");
                            System.out.print("Nombre :" + asignaturas.get(i).getNombre() + ",");
                            System.out.print("Carrera :" + asignaturas.get(i).getCarrera() + ",");
                            System.out.print("Numero de Creditos :" + asignaturas.get(i).getNcreditos() + " ");
                        } else {
                            System.out.println("La asignatura no fue encontrada: ");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Su eleccion fue un ordenamiento por intercambio");
                    Ordenamiento.bubbleSort(asignaturas);
                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.println("Los datos de la asignatura son: ");
                        System.out.println("\n");
                        System.out.print("Codigo :" + asignaturas.get(i).getCodigo() + ",");
                        System.out.print("Nombre :" + asignaturas.get(i).getNombre() + ",");
                        System.out.print("Carrera :" + asignaturas.get(i).getCarrera() + ",");
                        System.out.print("Numero de Creditos :" + asignaturas.get(i).getNcreditos() + " ");
                    }
                    break;
                case 6:
                    System.out.println("Su eleccion fue un ordenamiento por seleccion");
                    Ordenamiento.selectionSort(asignaturas);
                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.println("Los datos de la asignatura son: ");
                        System.out.println("\n");
                        System.out.print("Codigo :" + asignaturas.get(i).getCodigo() + ",");
                        System.out.print("Nombre :" + asignaturas.get(i).getNombre() + ",");
                        System.out.print("Carrera :" + asignaturas.get(i).getCarrera() + ",");
                        System.out.print("Numero de Creditos :" + asignaturas.get(i).getNcreditos() + " ");
                    }
                    break;
                case 7:
                    System.out.println("Su eleccion fue un ordenamiento por insercion");
                    Ordenamiento.insertionSort(asignaturas);
                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.println("Los datos de la asignatura son: ");
                        System.out.println("\n");
                        System.out.print("Codigo :" + asignaturas.get(i).getCodigo() + ",");
                        System.out.print("Nombre :" + asignaturas.get(i).getNombre() + ",");
                        System.out.print("Carrera :" + asignaturas.get(i).getCarrera() + ",");
                        System.out.print("Numero de Creditos :" + asignaturas.get(i).getNcreditos() + " ");
                    }
                    break;
            }
        } while (menu != 0);
    }
}