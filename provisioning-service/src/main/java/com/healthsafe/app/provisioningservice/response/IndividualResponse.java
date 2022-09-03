package com.healthsafe.app.provisioningservice.response;

public class IndividualResponse  <T extends Object> extends StatusResponse{

    private T value;

    public IndividualResponse(){

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
