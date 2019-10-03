package nodosConcatenados;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prueba {

	@Test
	public void Recargotest() {

		System.out.println("verificar recargo");
		Metodo m= new Metodo();
		
		
		
//		assertTrue (m.DiadelMes(abc) == "Error" );
//		assertTrue (m.DiadelMes(null) == "Error" );
		assertTrue (m.DiadelMes(-4) == "Error" );
//		assertTrue (m.DiadelMes(3.48) == "Error" );
//		assertTrue (m.DiadelMes(1,039) == "Error" );
		
		assertTrue (m.DiadelMes(0) ==  "Error");
		assertTrue (m.DiadelMes(1) ==  "0%" );
		assertTrue (m.DiadelMes(10) == "0%" );
		assertTrue (m.DiadelMes(11) == "2%" );
		assertTrue (m.DiadelMes(20) == "2%" );
		assertTrue (m.DiadelMes(21) == "4%" );
		assertTrue (m.DiadelMes(31) == "4%" );
		assertTrue (m.DiadelMes(32) == "Error");
		
		
		
//		// segundo
//		
//		assertTrue (m.Cant_Mayor(1, -1, -4) == 0 );
//		assertTrue (m.Cant_Mayor(0, 1, 0) == 0 );
//		assertTrue (m.Cant_Mayor(-1, 0, 5) == 0 );
//		assertTrue (m.Cant_Mayor(-10, -8, -5) == 0 );
//		assertTrue (m.Cant_Mayor(1, 1, 0) == 0 );
//		assertTrue (m.Cant_Mayor(1, 1, 1) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 1, 2) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 1, 499) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 1, 500) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 1, 501) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 0, 20) == 0 );
//		assertTrue (m.Cant_Mayor(1, 1, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 2, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 499, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 500, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(1, 501, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(0, 20, 20) == 0 );
//		assertTrue (m.Cant_Mayor(1, 20, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(2, 20, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(499, 20, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(500, 20, 20) == 0 );//calcular
//		assertTrue (m.Cant_Mayor(501, 20, 20) == 0 );//calcular
		
		
		
		
	}

}
