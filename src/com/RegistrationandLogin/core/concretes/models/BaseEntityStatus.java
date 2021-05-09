package com.RegistrationandLogin.core.concretes.models;

public enum BaseEntityStatus {
    ACTIVE {
        @Override
        public int getValue() {
            return 0;
        }
    },
    PASSIVE{
        @Override
        public int getValue(){
            return 1;
        }
    };

    public abstract int getValue();
}
