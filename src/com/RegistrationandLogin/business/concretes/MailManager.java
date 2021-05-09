package com.RegistrationandLogin.business.concretes;

import com.RegistrationandLogin.business.abstracts.MailService;
import com.RegistrationandLogin.models.entities.concretes.User;

public class MailManager implements MailService {
    @Override
    public String registrationMail(User entity) {
        return "Thanks for joining our community." + entity.getSurname();
    }
}
