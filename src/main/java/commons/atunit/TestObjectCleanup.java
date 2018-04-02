package commons.atunit;

import java.lang.annotation.*;

/**
 * The @Unit @TestObjectCleanup tag.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestObjectCleanup {
}