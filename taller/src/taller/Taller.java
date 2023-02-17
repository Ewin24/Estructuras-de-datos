package taller;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int menu = 0;
        int encontrado = 0;
        String codigo = "", nombre = "", carrera = "", nCreditos = "";
        ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

        do {
            System.out.println("------------------------- Programa para la gestion de asignaturas -------------------------\n");
            System.out.println("1. Crear Asignatura");
            System.out.println("2. Modificar Asignatura ");
            System.out.println("3. Eliminar Asignatura ");
            System.out.println("4. Consultar Asignatura por codigo");
            menu = lector.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Inserción de asignatura: ");

                    System.out.println("Ingrese el código de asignatura: ");
                    codigo = lector.next();
                    System.out.println("Ingrese el nombre de asignatura: ");
                    nombre = lector.next();
                    System.out.println("Ingrese el carrera de asignatura: ");
                    carrera = lector.next();
                    System.out.println("Ingrese el número de créditos de asignatura: ");
                    nCreditos = lector.next();

                    Asignatura asignatura = new Asignatura(codigo, nombre, carrera, nCreditos);
                    asignaturas.add(asignatura);
                    break;
                case 2:
                    System.out.println("Modificación de asignatura: ");
                    System.out.println("Ingrese el codigo de asignatura a modificar: ");
                    codigo = lector.nextLine();
                    for (int i = 0; i < asignaturas.size(); i++) {
                        if (asignaturas.get(i).codigo.equals(codigo)) {
                            encontrado = i;
                            System.out.println("Los datos de la asignatura son: ");
                            System.out.println(asignaturas.get(i).getCodigo());
                            System.out.println(asignaturas.get(i).getNombre());
                            System.out.println(asignaturas.get(i).getCarrera());
                            System.out.println(asignaturas.get(i).getNcreditos());
                            System.out.println("\n");

                            System.out.println("Ingrese el nuevo código de asignatura: ");
                            codigo = lector.next();
                            System.out.println("Ingrese el nuevo nombre de asignatura: ");
                            nombre = lector.next();
                            System.out.println("Ingrese el nuevo carrera de asignatura: ");
                            carrera = lector.next();
                            System.out.println("Ingrese el nuevo número de créditos de asignatura: ");
                            nCreditos = lector.next();
                        } else {
                            System.out.println("La asignatura no fue encontrada: ");
                        }
                    }
                    asignaturas.remove(encontrado);
                    Asignatura asig = new Asignatura(codigo, nombre, carrera, nCreditos);
                    asignaturas.add(asig);
                    break;
                case 3:
                    System.out.println("Eliminacion de asignaturas: ");
                    System.out.println("Ingrese el codigo de la asignatura a eliminar: ");
                    codigo = lector.next();
                    for (int i = 0; i < asignaturas.size(); i++) {
                        if (asignaturas.get(i).codigo.equals(codigo)) {
                            encontrado = i;
                            System.out.println("Los datos de la asignatura eliminada son: ");
                            System.out.println(asignaturas.get(i).getCodigo());
                            System.out.println(asignaturas.get(i).getNombre());
                            System.out.println(asignaturas.get(i).getCarrera());
                            System.out.println(asignaturas.get(i).getNcreditos());
                            asignaturas.remove(encontrado);
                        } else {
                            System.out.println("La asignatura no fue encontrada: ");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Busqueda de asignaturas por código: ");
                    codigo = lector.next();
                    for (int i = 0; i < asignaturas.size(); i++) {
                        if (asignaturas.get(i).codigo.equals(codigo)) {
                            encontrado = i;
                            System.out.println("Los datos de la asignatura son: ");

                            System.out.println(asignaturas.get(i).getCodigo());
                            System.out.println(asignaturas.get(i).getNombre());
                            System.out.println(asignaturas.get(i).getCarrera());
                            System.out.println(asignaturas.get(i).getNcreditos());
                        } else {
                            System.out.println("La asignatura no fue encontrada: ");
                        }
                    }
                    break;
            }
        } while (menu
                != 0);
    }

}
