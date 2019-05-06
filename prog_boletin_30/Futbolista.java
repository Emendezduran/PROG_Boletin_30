package prog_boletin_30;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("El futbolista responde a una entrevista");
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista jugando un partido");
    }

    @Override
    public String toString() {
        return "Futbolista{"
                + "dorsal= " + dorsal
                + ", demarcacion= '" + demarcacion + '\''
                + ", id= " + id
                + ", nombre= '" + nombre + '\''
                + ", apellidos= '" + apellidos + '\''
                + ", edad= " + edad
                + '}';
    }
}
