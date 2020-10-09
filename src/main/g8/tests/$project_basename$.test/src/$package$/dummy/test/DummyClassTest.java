package $package$.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import $package$.dummy.DummyFactory;

public class DummyClassTest {

    @Test
    public void testToStringPrefix() {
        var subject = DummyFactory.eINSTANCE.createDummyClass();
        assertTrue(subject.toString()
            .startsWith("PREFIX"));
    }

}
