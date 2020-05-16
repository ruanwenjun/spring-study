package org.example.springframework.importannotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @author ruanwenjun
 * @create 2020/05/15/ 11:23 AM
 */
public class DogImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		String dog = "org.example.springframework.importannotation.Dog";
		String[] strings = {dog};
		return strings;
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
