package com.RegistrationandLogin.business.concretes;

import com.RegistrationandLogin.business.abstracts.MailService;
import com.RegistrationandLogin.business.abstracts.UserService;
import com.RegistrationandLogin.core.concretes.repository.GoogleAccountRegistrationAdapter;
import com.RegistrationandLogin.models.entities.concretes.User;
import com.RegistrationandLogin.models.models.LoginModel;

import java.util.List;

import static com.RegistrationandLogin.core.concretes.extetions.BooleanExtesion.validateEmail;

public class UserManager implements UserService {

    private MailService mailService;


    public UserManager(MailService mailService) {
        this.mailService = mailService;
    }

    @Override
    public void add(User entity) {
        if (!this.validUser(entity)) {
            System.out.println("User not added.");
        }
        System.out.println("User added.");
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public User getOne(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void register(User entity) {
        if (this.validUser(entity)) {
            mailService.registrationMail(entity);
        }
    }

    @Override
    public void login(LoginModel model) {
        if (model.getEmail()!=null||model.getPassword()!=null){
            if (model.getEmail() != "a.a@gmail.com"&&model.getPassword() != "123"){
                System.out.println("Check your email and password.");
            }
        }
        System.out.println("Email and password field must be filled.");
    }

    @Override
    public void registerWGoogleAccount(User entity) {
        GoogleAccountRegistrationAdapter gA=new GoogleAccountRegistrationAdapter();
        gA.registerWGoogleAccount(entity);
        if(this.validUser(entity)){
            this.add(entity);
        }
        System.out.println("Check your google account.");
    }

    private boolean validUser(User entity) {
        if (entity.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters.");
            return false;
        }
        if (!validateEmail(entity.getEmail())) {
            System.out.println("Email format is wrong.");
            return false;
        }
        if (entity.getName().length() < 2 || entity.getSurname().length() < 2) {
            System.out.println("Name and surname must be at least 2 characters.");
            return false;
        }
        return true;
    }
}
