package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno,Materia ... materias) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
        Collections.addAll(this.materias,materias);
    }

   public Boolean aprobada(){
        //para cada materia de la lista de materias, corroborar si alumno.cumpleCorrelativas y si cumple todas, return true
       return
       this.materias.stream().allMatch(materia -> alumno.cumpleCorrelativas((materia)));
   }
}
