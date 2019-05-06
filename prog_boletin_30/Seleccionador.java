package prog_boletin_30;

public class Seleccionador extends SeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarJugador() {
        System.out.println("Se selecciona a un jugador.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El seleccionador concentandose");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador Entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador jugando un partido");
    }

    @Override
    public String toString() {
        return "Seleccionador{"
                + "id= " + id
                + ", nombre= '" + nombre + '\''
                + ", apellidos= '" + apellidos + '\''
                + ", edad= " + edad
                + '}';
    }
}
