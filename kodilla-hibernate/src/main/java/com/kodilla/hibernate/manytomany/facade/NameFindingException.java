package com.kodilla.hibernate.manytomany.facade;

public class NameFindingException extends Exception {
    public static String ERR_EMPLOYYE_NOT_FOUND = "Employee not found";
    public static String ERR_COMPANY_NOT_FOUND = "Company not found";

    public NameFindingException(String message) {
        super(message);
    }

}
