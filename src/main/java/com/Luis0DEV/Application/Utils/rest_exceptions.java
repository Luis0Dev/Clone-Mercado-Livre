package com.Luis0DEV.Application.Utils;

import com.Luis0DEV.Application.Model_Response.response_models;

import lombok.Getter;
import lombok.Setter;

import org.springframework.dao.DataIntegrityViolationException;

@Getter
@Setter
public class rest_exceptions extends Exception {
    public String name;
    public Exception inner_exception;

    public rest_exceptions(Exception inner_exception) {

    }
    public response_models tratar_erro() {
        response_models model = new response_models();

        if (inner_exception instanceof DataIntegrityViolationException) {
            DataIntegrityViolationException exception = (DataIntegrityViolationException) inner_exception;

            if (exception.getCause() != null) {
                String exceptionMessage = exception.getCause().getMessage();
                if (exceptionMessage.contains("REFERENCE Constraint")) {
                    model.set_message(String.format("%s It has a connection and cannot be removed or altered.", name));
                } else if (exceptionMessage.contains("Cannot insert duplicate key")) {
                    model.set_message(String.format("%s Already existing", name));
                }
            }
            model.set_success(false);
            model.set_error(false);
        }

        if (model.get_message() == null || model.get_message().isEmpty()) {
            if (inner_exception.getCause() != null) {
                model.set_message(inner_exception.getCause().getMessage());
            } else {
                model.set_message(inner_exception.getMessage());
            }
            model.set_success(false);
            model.set_error(true);
        }
        return model;
    }
}
