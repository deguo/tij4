package ch20annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface D02_UseCase {
	public int id();

	public String description() default "no description";
}