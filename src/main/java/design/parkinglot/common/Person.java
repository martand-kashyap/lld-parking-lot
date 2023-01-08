package design.parkinglot.common;

import lombok.Data;

@Data
public class Person {
    private String name;
    private Address address;
    private String phone;
    private String email;
}