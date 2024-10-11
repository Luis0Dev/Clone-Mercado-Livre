package com.Luis0DEV.Application.Model_Response;

public class response_models {
    public response_models() {
    }
    public response_models(response_models model) {
        success = model.success;
        error = model.error;
        message = model.message;
    }

    public boolean success;
    public boolean error;
    public String message;

    //GETTERS
    public boolean get_success() {
        return success;
    }
    public boolean get_error() {
        return error;
    }
    public String get_message() {
        return message;
    }
    //SETTERS
    public void set_success(boolean success) {
        this.success = success;
    }
    public void set_error(boolean error) {
        this.error = error;
    }
    public void set_message(String message) {
        this.message = message;
    }
}
