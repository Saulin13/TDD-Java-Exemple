package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RelogioTest {

	@Test
	public void testHora(){
		
		Relogio relogio = new Relogio();
		
		relogio.setHoras(10);
		
		 Assertions.assertEquals(10, relogio.getHoras());
			
	}
	
	@Test
	public void testMinuto(){
		
		Relogio relogio = new Relogio();
		
		relogio.setMinutos(20);
		
		 Assertions.assertEquals(20, relogio.getMinutos());
			
	}
	
	@Test
	public void testSegundo(){
		
		Relogio relogio = new Relogio();
		
		relogio.setSegundos(40);
		
		 Assertions.assertEquals(40, relogio.getSegundos());
			
	}

}
 