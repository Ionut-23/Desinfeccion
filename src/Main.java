import java.util.ArrayList;

public class Main {
    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args){
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();
        alumno.start();
        profesor.start();
    }
}
