package com.nandish.newSchool.service;

import com.nandish.newSchool.controller.ContactController;
import com.nandish.newSchool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class ContactService {



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
}
