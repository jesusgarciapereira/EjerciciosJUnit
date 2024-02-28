package clases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("primo")
	void testEsPrimo(int num, boolean expected) {
		Numeros numeros = new Numeros(num);
		boolean esPrimo = numeros.esPrimo();
		assertEquals(expected, esPrimo);
	}
	
	private static Stream<Arguments> primo(){
		return Stream.of(
				Arguments.of(1, false),
				Arguments.of(2, true),
				Arguments.of(4, false),
				Arguments.of(5, true),
				Arguments.of(13, true),
				Arguments.of(25, false)
				);
		
	}

	@ParameterizedTest
	@MethodSource("capicua")
	void testEsCapicua(int num, boolean expected) {
		Numeros numero = new Numeros(num);
		boolean esCapicua = numero.esCapicua();
		assertEquals(expected, esCapicua);
	}
	
	private static Stream<Arguments> capicua(){
		return Stream.of(
				Arguments.of(0, true),
				Arguments.of(9,true),
				Arguments.of(10,false),
				Arguments.of(33,true)
				);
		
		
	}
	
	

}
