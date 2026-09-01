package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {

    public Set<Artefacto> catalogo;

    public void agregarArtefacto(Artefacto unArtefacto) {
        Set<Artefacto> catalogo = new HashSet<>();

        catalogo.add(unArtefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return catalogo;
    }

    public List<Artefacto> listaArtefactos;

    public List<Artefacto> buscarArtefactosPorTipo(String unTipo) {
        List<Artefacto> listaArtefactos = new ArrayList<>();

    }

    public Map<String, Integer> artefactosPorTipo;
    public String getTipo;

    public Map<String, Integer> contarArtefactosPorTipo() {
        Map<String, Integer> artefactosPorTipo = new HashMap<>();

        int conteo = artefactosPorTipo.get(String);
        artefactosPorTipo.put(String, conteo + 1);
    }
}
