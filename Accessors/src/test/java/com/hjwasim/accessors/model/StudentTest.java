package com.hjwasim.accessors.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Hjwasim
 */
class StudentTest {

    @Test
    public void standard_getter_setter() {
        Student student = new Student();
        student.setId(1);
        student.setName("Hjwasim");
        student.setField(FieldEnum.CS.toString());

        assertEquals(1, student.getId());
        assertEquals("Hjwasim", student.getName());
        assertEquals(FieldEnum.CS.toString(), student.getField());
    }

    @Test
    public void getter_setter_with_accessors_fluent_with_no_chaining() {
        //it wouldn't be able to chain the getters and setters as we set the chain option to false
        FluentStudent student = new FluentStudent();
        student.id(1);
        student.name("Hjwasim");
        student.field(FieldEnum.BIO.toString());

        // getters and setters prefixes have disappeared -  that's what Fluent mean!
        assertEquals(1, student.id());
        assertEquals("Hjwasim", student.name());
        assertEquals(FieldEnum.BIO.toString(), student.field());
    }

    @Test
    public void getter_setter_with_accessors_chain_with_no_fluent() {
        //simple chain - chaining the standard setters&getters
        ChainedStudent student = new ChainedStudent()
                .setId(1)
                .setName("Hjwasim")
                .setField(FieldEnum.ACCOUNTS.toString());

        assertEquals(1, student.getId());
        assertEquals("Hjwasim", student.getName());
        assertEquals(FieldEnum.ACCOUNTS.toString(), student.getField());
    }

    @Test
    public void getter_setter_with_accessors_chain_with_fluent() {
        FluentChainedStudent student = new FluentChainedStudent()
                .id(1)
                .name("Hjwasim")
                .field(FieldEnum.CS.toString());
        assertEquals(1, student.id());
        assertEquals("Hjwasim", student.name());
        assertEquals(FieldEnum.CS.toString(), student.field());
    }
}