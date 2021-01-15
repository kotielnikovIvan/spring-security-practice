package com.mycompany.springsecuritypractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ivan Kotielnikov
 */
@Data
@AllArgsConstructor
public class Friend {

    private Long id;
    private String firstName;
    private String lastName;
}
