package com.nandish.newSchool.model;

import lombok.Data;

/*
@Data annotation is provided by Lombok library which generates getter, setter,
equals(), hashCode(), toString() methods & Constructor at compile time.
This makes our code short and clean.
* */

@Data
public class Contact {

//    we must use the same name given in the contact.html
    public String name;
    public String mobileNum;

    public String email;
    public String subject;
    public String message;

}
