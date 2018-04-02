package ch20annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface D05_SimulatingNull {
	public int id() default -1;

	public String description() default "";
}