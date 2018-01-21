package ch20annotations;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import java.util.*;

/**
 * APT-based annotation processing.
 */
public class D10_InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
	public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds,
			AnnotationProcessorEnvironment env) {
		return new D09_InterfaceExtractorProcessor(env);
	}

	public Collection<String> supportedAnnotationTypes() {
		return Collections.singleton("ch20annotations.D07_ExtractInterface");
	}

	public Collection<String> supportedOptions() {
		return Collections.emptySet();
	}
}