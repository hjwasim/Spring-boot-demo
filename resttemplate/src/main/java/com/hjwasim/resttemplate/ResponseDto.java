package com.hjwasim.resttemplate;

import java.io.Serializable;

/**
 * @author Hjwasim
 */
public class ResponseDto implements Serializable {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
