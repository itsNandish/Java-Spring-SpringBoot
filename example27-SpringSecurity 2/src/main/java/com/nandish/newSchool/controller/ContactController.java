package com.nandish.newSchool.controller;
import com.nandish.newSchool.model.Contact;
import com.nandish.newSchool.service.ContactService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Slf4j
@Controller
public class ContactController {

//    private  static Logger log=LoggerFactory.getLogger(ContactController.class);


    private  final ContactService contactService;
@Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @RequestMapping("/contact")
    public String displayContact(Model model){
    model.addAttribute("contact", new Contact());
        return "contact.html";
    }
//    @RequestMapping(value = "/saveMsg",method = POST)
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
//                                    @RequestParam String email, @RequestParam String subject,
//                                    @RequestParam String message){
//        log.info("Name : " + name);
//        log.info("mobile Number : " + mobileNum);
//        log.info("email : " + email);
//        log.info("subject : " + subject);
//        log.info("Message : " + message);
//
////        this new modelAndView this will redirect it to a contact itself after submitting the
////        information rather going to home page
//        return new ModelAndView("redirect:/contact");
//    }

        //Method-2 creating using pogo class
@RequestMapping(value = "/saveMsg",method = POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors){
    if(errors.hasErrors()){
        log.error("Contact form validation failed due to : " + errors.toString());
        return "contact.html";
    }
        contactService.saveMessageDetails(contact);
    contactService.setCounter(contactService.getCounter()+1);
    log.info("Number of times the contact form is submitted : " + contactService.getCounter());
        return  "redirect:/contact";
    }
}
