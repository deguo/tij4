package commons.atunit;

import java.lang.annotation.*;

/**
 * The @Unit @TestProperty tag.<br>
 * Both fields and methods may be tagged as properties:
 */
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TestProperty {
}
