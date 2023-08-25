package com.hjwasim.accessors.model;

/**
 * @author Hjwasim
 */
public enum FieldEnum {
    CS("Computer Science"),
    BIO("Biology"),
    ACCOUNTS("Accounts");

    private final String field;
    FieldEnum(final String field){
        this.field = field;
    }

    @Override
    public String toString() {
        return this.field;
    }
}
