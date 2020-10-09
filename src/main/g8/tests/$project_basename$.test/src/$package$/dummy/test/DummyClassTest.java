package $package$.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

$if(create_ecore_model.truthy)$
import $package$.dummy.DummyFactory;
$endif$

public class DummyClassTest {

    @Test
    public void testToStringPrefix() {
$if(create_ecore_model.truthy)$
        var subject = DummyFactory.eINSTANCE.createDummyClass();
        assertTrue(subject.toString()
            .startsWith("PREFIX"));
$endif$
    }

}
