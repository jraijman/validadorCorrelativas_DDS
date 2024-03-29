package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAp;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAp = new ArrayList<>();
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAp,materias);
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAp() {
        return materiasAp;
    }

    public Boolean cumpleCorrelativas(Materia materia){
        //tiene que fijarse que todas las materias de la lista materia.correlativas, este en materiasAP
        return materiasAp.containsAll(materia.getCorrelativas());
    }
}
