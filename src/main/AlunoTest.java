package main;

import static org.junit.Assert.*;
import org.junit.Test;

import aluno.Aluno;

public class AlunoTest {

    @Test
    public void testConstrutor() {
        Aluno aluno = new Aluno("Medson", "2024124");
        assertEquals("Medson", aluno.getNome());
        assertEquals("2024124", aluno.getMatricula());
    }

}
