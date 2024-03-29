package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private List<Materia> correlativas;
    private String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }
    public void agregarCorrelativa(Materia ... materias){
        Collections.addAll(this.correlativas,materias);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
