package com.nandish.newSchool.service;

import com.nandish.newSchool.controller.ContactController;
import com.nandish.newSchool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@Service
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactService {
    private int counter=0;

    public ContactService() {
        System.out.println("contact service bean initialised");
    }

    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */

    public boolean saveMessageDetails(Contact contact){
//        taking contact as input and printing it in the toString method
        boolean isSaved=true;
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
