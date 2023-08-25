package com.hjwasim.accessors.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * @author Hjwasim
 */

@Getter
@Setter
public class Student {
    private Integer id;
    private String name;
    private String field;
}
