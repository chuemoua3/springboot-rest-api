package com.win.restapi.Payroll;

public class OrderNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    OrderNotFoundException(Long id) {
      super("Could not find employee " + id);
    }
}