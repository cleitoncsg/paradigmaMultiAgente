package teste;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import comportamentos.LeituraArquivo;

public class LeituraArquivoTest {

	public LeituraArquivo leituraArquivo;
	
	@Before
	public void setUp() throws Exception {
		leituraArquivo = new LeituraArquivo();
	}

	@Test
	public void test() throws IOException {
		assertEquals("0.957736.", leituraArquivo.leituraArquivo());
	}

}
