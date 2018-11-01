package it.infocamere.test.batch;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
@Qualifier
public @interface Cold {

}
