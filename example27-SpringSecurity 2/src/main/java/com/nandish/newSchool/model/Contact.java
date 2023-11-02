package com.nandish.newSchool.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/*
@Data annotation is provided by Lombok library which generates getter, setter,
equals(), hashCode(), toString() methods & Constructor at compile time.
This makes our code short and clean.
* */

@Data
public class Contact {

//    we must use the same name given in the contact.html

    /*
   * @NotNull: Checks if a given field is not null but allows empty values & zero elements inside collections.
     @NotEmpty: Checks if a given field is not null and its size/length is greater than zero.
     @NotBlank: Checks if a given field is not null and trimmed length is greater than zero.
   * */
    @NotBlank(message = "Name must not be blank")
    @Size(min = 3,message = "Name must be at least 3 characters long")
    public String name;


    @NotBlank(message = "Mobile number not be blank")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    public String mobileNum;

    @NotBlank(message = "Email must be not blank")
    @Email(message = "please provide proper email address")
    public String email;

    @NotBlank(message = "Subject should not be blank")
    @Size(min = 5, message = "Minimum 5 character should be Present")
    public String subject;

    @NotBlank(message = "Message should not be blank")
    @Size(message = "minimum 10 character should be present")
    public String message;

}
