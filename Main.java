package Semana5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = sc.nextInt();
        sc.nextLine();
        Alumno[] alumnos = new Alumno[cantidadAlumnos];
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese los datos del alumno " + (i+1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Curso: ");
            String curso = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            alumnos[i] = new Alumno(nombre, apellido, curso, nota1, nota2, nota3);
            sc.nextLine();
        }
        double promedioTotal = 0;
        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno alumno = alumnos[i];
            System.out.println("Alumno " + (i+1) + ":");
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Curso: " + alumno.getCurso());
            System.out.println("Nota 1: " + alumno.getNota1());
            System.out.println("Nota 2: " + alumno.getNota2());
            System.out.println("Nota 3: " + alumno.getNota3());
            System.out.println("Promedio: " + alumno.getPromedio());
            System.out.println();
            promedioTotal += alumno.getPromedio();
        }
        System.out.println("Promedio total de Alumnos ingresados: " + (promedioTotal / cantidadAlumnos));
    }
}