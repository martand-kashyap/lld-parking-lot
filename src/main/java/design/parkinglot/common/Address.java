package design.parkinglot.common;

import lombok.Data;

@Data
public class Address {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
}
