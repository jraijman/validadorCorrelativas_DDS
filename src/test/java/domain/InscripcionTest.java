package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InscripcionTest {

    @Test
    public void noCumpleCorrelativas(){

        Materia mate = new Materia("mate");
        Materia ingles = new Materia("ingles");
        Materia fisica = new Materia("fisica");
        Materia dds = new Materia("dds");
        Materia paradigmas = new Materia("paradigmas");

        dds.agregarCorrelativa(paradigmas,ingles,fisica);


        Alumno unALumno = new Alumno("jose","1234");
        unALumno.agregarMateriasAprobadas(ingles,mate,paradigmas);

        Inscripcion unaIscripcion = new Inscripcion(unALumno,dds,mate);

        Assert.assertEquals(false,unaIscripcion.aprobada());
    }

    @Test
    public void cumpleConCorrelativas(){

        Materia algebra = new Materia("algebra");
        Materia fisica1 = new Materia("fisica1");
        Materia fisica2 = new Materia("fisica2");

        fisica2.agregarCorrelativa(fisica1,algebra);


        Alumno unALumno = new Alumno("jose","1234");
        unALumno.agregarMateriasAprobadas(algebra,fisica1,fisica2);

        Inscripcion unaIscripcion = new Inscripcion(unALumno,fisica2);

        Assert.assertEquals(true,unaIscripcion.aprobada());

    }
}
