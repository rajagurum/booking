package com.adhi.booking.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by rajaguru on 1/4/22.
 */
@Component
@Slf4j
public class Validator {

    public String isValideUser(String firstName , String lastName , String email , Integer numberOfTickets , Integer remainingTickets ) {
        Boolean isValidName = firstName.length() > 2 || lastName.length() > 2;
        Boolean isValidEmail = email.contains("@");
        Boolean isValidNumber = numberOfTickets > 0 && numberOfTickets <= remainingTickets;

        StringBuilder message = new StringBuilder();
        if (!isValidName ){
            log.debug("Please Enter valid user name");
            message.append(" Invalid firstName ");
        }
        if (!isValidEmail) {
            log.debug("Please Enter valid email");
            message.append(" Invalid email ");
        }
        if (!isValidNumber) {
            log.debug("Please Enter valid number of tickets");
            message.append(" Invalid Mobile Number ");

        }
        return (isValidName && isValidEmail && isValidNumber) ? "" : message.toString();
    }

}
