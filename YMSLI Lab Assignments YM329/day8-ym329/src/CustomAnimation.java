import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class CustomAnimation {
	
	public static void readAnnotation(Method[] methods) {
		System.out.println("Method Annotations");
		System.out.println("------------------");
		for(Method method : methods) {
			Annotation[] methodAnnotations = method.getAnnotations();
			for(Annotation annotation : methodAnnotations) {
				if(annotation instanceof Author) {
					Author author = (Author)annotation;
					System.out.println("Author: "+author.name());
				}
				if(annotation instanceof Version) {
					Version version = (Version)annotation;
					System.out.println("Version : "+version.number());
				}
			}
		}

	}
	
	public static void readAnnotation(Class<?> clas) {
		System.out.println("\n\nClass Annotations");
		System.out.println("------------------");
		Annotation[] classAnnotations = clas.getAnnotations();
		for(Annotation annotation : classAnnotations) {
			if(annotation instanceof Author) {
				Author author = (Author)annotation;
				System.out.println("Author: "+author.name());
			}
			if(annotation instanceof Version) {
				Version version = (Version)annotation;
				System.out.println("Version : "+version.number());
			}
		}

	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clas = Class.forName("AnnotatedClass");
		Method[] methods = clas.getDeclaredMethods();
		readAnnotation(clas);
		readAnnotation(methods);
	}
}
