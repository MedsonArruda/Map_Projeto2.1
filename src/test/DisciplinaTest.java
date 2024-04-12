package test;
import disciplina.Disciplina;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class DisciplinaTest {

    private Disciplina disciplina;

    @BeforeEach
    public void setup() {
        disciplina = new Disciplina("Metodos Avançados em Programação", "MAP001", 60);
    }

    @Test
    public void testGetterSetter() {
        disciplina.setCargaHoraria(30);
        assertEquals(30, disciplina.getCargaHoraria());
    }

    @Test
    public void testConstrutor() {
        assertEquals("Metodos Avançados em Programação", disciplina.getNome());
        assertEquals("MAP001", disciplina.getCodigo());
        assertEquals(60, disciplina.getCargaHoraria());
    }
}
