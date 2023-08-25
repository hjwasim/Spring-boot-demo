package com.hjwasim.accessors.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Hjwasim
 */

// Beauty of this is that getters and setters prefixes would disappear -  that's what Fluent means!
// Chaining enabled by default, Now I intentionally disabled the chaining (chain = false)
@Getter
@Setter
@Accessors(fluent = true,chain = false)
public class FluentStudent {
    private Integer id;
    private String name;
    private String field;
}
