package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aluno.Aluno;


class AlunoTest {
	
	private Aluno aluno1;
	
	@BeforeEach
    public void setup() {
        aluno1 = new Aluno("Medson", "1111111");
    }	

    @Test
    public void testGetterSetter(){
        assertEquals(aluno1.getMatricula(), "1111111");
        aluno1.setMatricula("2221012313");
        assertEquals(aluno1.getMatricula(), "2221012313");
    }

    @Test
    public void testConstrutor(){
        assertEquals(aluno1.getNome(), "Medson");
        assertEquals(aluno1.getMatricula(), "1111111");
    }

}
