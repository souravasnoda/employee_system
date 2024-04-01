package com.fullStack.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//to communicate with ui
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
