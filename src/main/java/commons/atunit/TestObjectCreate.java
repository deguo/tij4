package commons.atunit;

import java.lang.annotation.*;

/**
 * The @Unit @TestObjectCreate tag.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestObjectCreate {
}