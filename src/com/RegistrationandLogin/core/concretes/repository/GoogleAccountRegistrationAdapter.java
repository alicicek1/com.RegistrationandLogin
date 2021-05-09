package com.RegistrationandLogin.core.concretes.repository;


import com.RegistrationandLogin.externalService.GoogleAccountRegistration;
import com.RegistrationandLogin.models.entities.concretes.User;

public class GoogleAccountRegistrationAdapter {

    public void registerWGoogleAccount(User entity){
        GoogleAccountRegistration gA=new GoogleAccountRegistration();
        gA.registerWGoogleAccount(entity);
    }

}
