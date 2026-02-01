package pt.example.banking;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "pt.example.banking", importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchitectureTest {
    @ArchTest
    static final ArchRule layer_dependencies_are_respected = layeredArchitecture().consideringAllDependencies()
            .layer("Config").definedBy("pt.example.banking.config..")
            .layer("API").definedBy("pt.example.banking.api..")
            .layer("Domain").definedBy("pt.example.banking.domain..")

            .whereLayer("API").mayOnlyBeAccessedByLayers("Config", "Domain")
            .whereLayer("Domain").mayOnlyBeAccessedByLayers("Config", "API")
            .whereLayer("Config").mayNotBeAccessedByAnyLayer();
}