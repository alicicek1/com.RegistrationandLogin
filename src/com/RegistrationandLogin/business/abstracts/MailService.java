package com.RegistrationandLogin.business.abstracts;

import com.RegistrationandLogin.models.entities.concretes.User;

public interface MailService {
    String registrationMail(User entity);
}
