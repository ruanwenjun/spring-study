package org.example.springframework.importannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ruanwenjun
 * @create 2020/05/15/ 11:15 AM
 */
@Configuration
@Import(value = {Cat.class, DogImportSelector.class})
public class ImportConfig {
}
