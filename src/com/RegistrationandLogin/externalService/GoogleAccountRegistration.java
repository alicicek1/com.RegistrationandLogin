package com.RegistrationandLogin.externalService;

import com.RegistrationandLogin.models.entities.concretes.User;

public class GoogleAccountRegistration {

    public void registerWGoogleAccount(User entity) {
        User us = new User();
        us.setName("aaa");
        us.setSurname("bbb");
        us.setEmail("aaa@gmail.com");
        us.setPassword("1111111111111");
    }
}
