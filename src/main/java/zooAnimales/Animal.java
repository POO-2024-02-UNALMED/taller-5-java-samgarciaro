package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }


    public Animal() {
        totalAnimales++;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        return String.format("Mamíferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d",
            Mamifero.getListado().size(),
            Ave.getListado().size(),
            Reptil.getListado().size(),
            Pez.getListado().size(),
            Anfibio.getListado().size()
        );
    }

    @Override
    public String toString() {
        if (zona != null) {
            return String.format(
                "Mi nombre es %s, tengo una edad de %d, habito en %s y mi género es %s, la zona en la que me ubico es %s, en el %s.",
                nombre, edad, habitat, genero, zona.getNombre(), zona.getZoo().getNombre()
            );
        } else {
            return String.format(
                "Mi nombre es %s, tengo una edad de %d, habito en %s y mi género es %s.",
                nombre, edad, habitat, genero
            );
        }
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
