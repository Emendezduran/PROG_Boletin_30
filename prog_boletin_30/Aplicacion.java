package prog_boletin_30;

import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> equipo = new ArrayList<>();

        equipo.add(new Futbolista(01, "Raul", "Gonzalez", 41, 7, "Delantero"));
        equipo.add(new Entrenador(02, "Fran", "Escriba", 54, 001));
        equipo.add(new Masajista(03, "Ramon", "Rodriguez", 43, "Fisioterapia", 13));
        equipo.add(new Seleccionador(04, "Luis", "Martinez", 48));

        for (SeleccionFutbol seleccionFutbol : equipo) {
            System.out.println(seleccionFutbol);
        }
    }
}
