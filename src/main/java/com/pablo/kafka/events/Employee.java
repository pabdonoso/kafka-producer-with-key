package com.pablo.kafka.events;

import lombok.Data;

@Data
public class Employee {

    String name;
    Integer salary;
    Boolean married;

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }
}
