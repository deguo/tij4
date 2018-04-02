package ch20annotations;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import java.io.*;
import java.util.*;

/**
 * JDK1.8的tools.jar不包含com.sun.mirror.apt.*<br>
 * APT-based annotation processing.<br>
 * {Exec: apt -factory annotations.InterfaceExtractorProcessorFactory
 * Multiplier.java -s ../annotations}
 */
public class D09_InterfaceExtractorProcessor implements AnnotationProcessor {
	private final AnnotationProcessorEnvironment env;
	private ArrayList<MethodDeclaration> interfaceMethods = new ArrayList<MethodDeclaration>();

	public D09_InterfaceExtractorProcessor(AnnotationProcessorEnvironment env) {
		this.env = env;
	}

	public void process() {
		for (TypeDeclaration typeDecl : env.getSpecifiedTypeDeclarations()) {
			D07_ExtractInterface annot = typeDecl.getAnnotation(D07_ExtractInterface.class);
			if (annot == null)
				break;
			for (MethodDeclaration m : typeDecl.getMethods())
				if (m.getModifiers().contains(Modifier.PUBLIC) && !(m.getModifiers().contains(Modifier.STATIC)))
					interfaceMethods.add(m);
			if (interfaceMethods.size() > 0) {
				try {
					PrintWriter writer = env.getFiler().createSourceFile(annot.value());
					writer.println("package " + typeDecl.getPackage().getQualifiedName() + ";");
					writer.println("public interface " + annot.value() + " {");
					for (MethodDeclaration m : interfaceMethods) {
						writer.print("  public ");
						writer.print(m.getReturnType() + " ");
						writer.print(m.getSimpleName() + " (");
						int i = 0;
						for (ParameterDeclaration parm : m.getParameters()) {
							writer.print(parm.getType() + " " + parm.getSimpleName());
							if (++i < m.getParameters().size())
								writer.print(", ");
						}
						writer.println(");");
					}
					writer.println("}");
					writer.close();
				} catch (IOException ioe) {
					throw new RuntimeException(ioe);
				}
			}
		}
	}
}