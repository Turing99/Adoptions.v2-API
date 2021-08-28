package com.p5.adoptions_v2api.model;

public abstract class AbstractAnimal {

    /**
     * An abstract method allows a method without body
     *<p>
     * Pluses over interface:
     * - we can fields private static, non-static,protected
     * - we can body functions
     * - we can abstract methods == interface methods
     * -constructors
     *
     * Minuses:
     * -IMPORTANT! Limits inheritance, because we need to extend this in child, AND WE CAN ONLY EXTEND ONCE ONE
     */


    protected String customField;

    public abstract String whatDoesItEats();
}
