package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private Integer poder;
    private String tipo;

    public Artefacto(String unNombre, int unPoder, String unTipo) {
        nombre = unNombre;
        poder = unPoder;
        tipo = unTipo;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public Integer getPoder() {
        return poder;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artefacto artefacto = (Artefacto) obj;
        return Objects.equals(nombre, artefacto.nombre);
    }

    public int hashCode() {
        return Objects.hash(nombre);
    }
}
