package ch20annotations;

import java.lang.annotation.*;

/**
 * APT-based annotation processing.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface D07_ExtractInterface {
	public String value();
}