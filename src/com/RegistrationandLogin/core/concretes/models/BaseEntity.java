package com.RegistrationandLogin.core.concretes.models;

public class BaseEntity {
    private int id;
    private BaseEntityStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseEntityStatus getStatus() {
        return status;
    }

    public void setStatus(BaseEntityStatus status) {
        this.status = status;
    }
}
