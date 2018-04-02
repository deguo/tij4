package commons.atunit;

import java.lang.annotation.*;

/**
 * The @Test tag.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}