package calificaciones;
import java.util.Scanner;

public class PruebaLibroCalificaciones {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

        LibroCalificaciones miLibroCalificacionesIniciado =
                new LibroCalificaciones("Programación II", "Ana Luisa", 4);

        System.out.printf(
                "\nEl nombre inicial del curso: %s\nEl profesor es: %s\nY las horas a la semana son: %d\n\n",
                miLibroCalificacionesIniciado.getNombreDelCurso(),
                miLibroCalificacionesIniciado.getNombreDelProfesor(),
                miLibroCalificacionesIniciado.getHorasDelCurso());

        System.out.print("Escribe el nombre del curso: ");
        String elNombre = entrada.nextLine();

        System.out.print("Escribe el nombre del profesor: ");
        String elProfe = entrada.nextLine();

        System.out.print("Escribe las horas por semana del curso: ");
        int horasSemana = entrada.nextInt();

        entrada.nextLine();

        // Asignar los valores al primer objeto
        miLibroCalificaciones.setNombreDelCurso(elNombre);
        miLibroCalificaciones.setNombreDelProfesor(elProfe);
        miLibroCalificaciones.setHorasDelCurso(horasSemana);

        miLibroCalificaciones.mostrarMensaje();

        entrada.nextLine();

        System.out.printf("\nVamos a cambiar los valores del objeto mLCIniciado");

        System.out.print("\nEscribe el nuevo nombre del curso para el objeto mLCIniciado: ");
        elNombre = entrada.nextLine();

        System.out.print("Escribe el nuevo nombre del profesor para el objeto mLCIniciado: ");
        elProfe = entrada.nextLine();

        System.out.print("Escribe la nueva cantidad de horas por semana del curso para el objeto mLCIniciado: ");
        horasSemana = entrada.nextInt();

        // Asignar los nuevos valores al segundo objeto
        miLibroCalificacionesIniciado.setNombreDelCurso(elNombre);
        miLibroCalificacionesIniciado.setNombreDelProfesor(elProfe);
        miLibroCalificacionesIniciado.setHorasDelCurso(horasSemana);

        miLibroCalificacionesIniciado.mostrarMensaje();

        entrada.close();

    } // fin de main

} // fin de la clase PruebaLibroCalificaciones
