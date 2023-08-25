package com.hjwasim.accessors.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Hjwasim
 */
@Getter
@Setter
@Accessors(fluent = true,chain = true) // we can chain our setters. setXXX().setXXX()....
public class FluentChainedStudent {
    private Integer id;
    private String name;
    private String field;
}