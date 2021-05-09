package com.RegistrationandLogin.business.abstracts;

import com.RegistrationandLogin.core.abstracts.repository.BaseService;
import com.RegistrationandLogin.models.entities.concretes.User;
import com.RegistrationandLogin.models.models.LoginModel;

public interface UserService extends BaseService<User> {
    void register(User entity);
    void login(LoginModel model);
    void registerWGoogleAccount(User entity);
}
