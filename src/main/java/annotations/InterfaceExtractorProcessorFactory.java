////: annotations/InterfaceExtractorProcessorFactory.java
//// APT-based annotation processing.
//package annotations;
//import com.sun.mirror.apt.*;
//import com.sun.mirror.declaration.*;
//import java.util.*;
//
//public class InterfaceExtractorProcessorFactory
//  implements AnnotationProcessorFactory {
//  public AnnotationProcessor getProcessorFor(
//    set<AnnotationTypeDeclaration> atds,
//    AnnotationProcessorEnvironment env) {
//    return new InterfaceExtractorProcessor(env);
//  }
//  public collection<String> supportedAnnotationTypes() {
//    return
//     CollectionsTest.singleton("annotations.ExtractInterface");
//  }
//  public collection<String> supportedOptions() {
//    return CollectionsTest.emptySet();
//  }
//} ///:~
