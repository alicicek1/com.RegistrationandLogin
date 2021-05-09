package com.RegistrationandLogin;

import com.RegistrationandLogin.core.concretes.models.BaseEntity;
import com.RegistrationandLogin.core.concretes.models.BaseEntityStatus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseEntity bs=new BaseEntity();
        bs.setStatus(BaseEntityStatus.ACTIVE);
        System.out.println(bs.getStatus());
    }
}
