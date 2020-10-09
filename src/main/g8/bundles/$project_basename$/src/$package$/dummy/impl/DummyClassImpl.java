package $package$.dummy.impl;

public class DummyClassImpl $if(create_ecore_model.truthy)$extends DummyClassImplGen $endif${

    @Override
    public String toString() {
        return "PREFIX" + super.toString();
    }

}
