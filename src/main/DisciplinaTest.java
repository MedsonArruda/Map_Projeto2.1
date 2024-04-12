package main;

import static org.junit.Assert.*;
import org.junit.Test;

import disciplina.Disciplina;

public class DisciplinaTest {

    @Test
    public void testConstrutor() {
        Disciplina disciplina = new Disciplina("Algoritmos", "ALG123", 60);
        assertEquals("Algoritmos", disciplina.getNome());
        assertEquals("ALG123", disciplina.getCodigo());
        assertEquals(60, disciplina.getCargaHoraria());
    }

}
