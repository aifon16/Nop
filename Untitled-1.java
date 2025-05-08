
import java.util.*;

public class EstudianteService {
    private List<Estudiante> estudiantes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarEstudiante() {
        System.out.print("ID: ");
        int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt(); scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();

        estudiantes.add(new Estudiante(id, nombre, edad, carrera));
        System.out.println("Estudiante agregado.");
    }

si
