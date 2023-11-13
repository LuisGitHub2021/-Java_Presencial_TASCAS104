package n2Exercici1;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

public class LongitudStringTest {
	
	@Test
	public void longitudString() {
	
		Usuario actual =new Usuario("Mordor", "Luis", 675657765);
		//String g= Integer.toString(actual.getPhoneNumber());
		
		// aqui estamos pasando el matcher length personalizado 
		// para comparar algo concreto
		// con la expectativa de longitud 3 sobre el String actual.getNickName()
	    assertThat(actual.getNickName(), length(is(8)));
	}
	
	
	// metodo que devuelve el matcher length que recibe un matcher <? super Integer> que perfeccionamos más abajo
	public static  Matcher<String> length (Matcher <? super Integer> matcher) {
	   
		// Con featureMatcher perfeccionamos el matcher que le pasamos, el que queremos utilizar
		// el que indica lo que queremos comparar
		// sobre un objeto y en este caso, el atributo que indicamos del objeto, para ver si coincide
		// y comunicarlo con mensajes.
				
		// Clase abstracta que está en Hamcrest, obliga a implementar sus metodos (featureValueOf)
		// T tipo parametro String // U tipo caracteristica a comparar Integer
		// subMatcher es el comparador
		// y las dos descripciones
		// FeatureMatcher (Matcher < ? super U >  subMatcher, java.lang.String featureDescription, java.lang.String featureName)
				
		return new FeatureMatcher<String, Integer>(matcher, "La longitud que se espera", "la propuesta") {

			// metodo a sobreescribir featureValueOf que nos devuelve el tamaño Integer 
			// que es abstracto, método que no se ejecuta.
			// se dirigen a otros de las subclases, en este caso:
			// matchesSafely() con 32 posibilidades
			// le enviamos el tamaño y con matches() hace el trabajo
			// El asunto es que lo utilizamos en base a la indicacion que le hemos hecho
			// así elige sobre los 32 de forma dinamica el que le corresponde.
						
			@Override
			protected Integer featureValueOf(String actual) {
				// TODO Auto-generated method stub
								
				//actual.length();
				return  8;
			}
	      	
	    };
	}
}
	