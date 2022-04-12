package com.project.foodOderingSystem.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class AddressDto {
    @NotBlank(message = "Street can't be empty")
    @NotNull(message = "Street can't be empty")
    private String street;
    @NotBlank(message = "City can't be empty")
    @NotNull(message = "City can't be empty")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "City can only contain letters")
    private String city;
    @NotBlank(message = "State can't be empty")
    @NotNull(message = "State can't be empty")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "State can only contain letters")
    private String state;
    @NotBlank(message = "Country can't be empty")
    @NotNull(message = "Country can't be empty")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Country can only contain letters")
    private String country;
    @NotBlank(message = "Zipcode can't be empty")
    @NotNull(message = "Zipcode can't be empty")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
    private String pincode;

    public AddressDto(String street, String city, String state, String country, String pincode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStreet(){
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public AddressDto() {
    }
  
}