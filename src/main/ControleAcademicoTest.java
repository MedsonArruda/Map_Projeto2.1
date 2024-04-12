package main;

import static org.junit.Assert.*;
import org.junit.Test;

import controleacademico.ControleAcademico;


public class ControleAcademicoTest {

    @Test
    public void testAdicionarDisciplina() throws Exception {
        ControleAcademico ca = new ControleAcademico();
        ca.addDisciplina("Algoritmos", "ALG123", 60);
        assertNotNull(ca.buscaDisciplina("ALG123"));
    }

    @Test
    public void testAdicionarTurma() throws Exception {
        ControleAcademico ca = new ControleAcademico();
        ca.addDisciplina("Algoritmos", "ALG123", 60);
        ca.addTurma("ALG123", "B104", "Segunda 14h-16h");
        assertNotNull(ca.buscaTurma(1));
    }

}
