package com.maolana.shittu.bankingappdemo.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE="001";
    public static final String ACCOUNT_EXISTS_MESSAGE="This user already exist";
    public static final String ACCOUNT_CREATION_SUCCESS_CODE="002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE="Account as been successfully created";
    public static final String ACCOUNT_NOT_EXIT_CODE ="003";
    public static final String ACCOUNT_NOT_EXIT_MESSAGE ="User with provided Account Number Dose Not Exist";
    public static String ACCOUNT_FOUND_CODE = "004";
    public static String ACCOUNT_FOUND_MESSAGE = "User Account Found";
    public static String ACCOUNT_CREDITED_SUCCESS_CODE = "005";
    public static String ACCOUNT_CREDITED_SUCCESS_MESSAGE ="Your Account Was Successfully Credited";
    public static String INSUFFICIENT_BALANCE_CODE = "006";
    public static  String INSUFFICIENT_BALANCE_MASSAGE ="Insufficient Account Balance";
    public static String ACCOUNT_DEBITED_SUCCESS_CODE ="007";
    public static String ACCOUNT_DEBITED_SUCCESS_MESSAGE =" Account Successfully Debited";




    public static String generateAccountNumber(){
        Year currentYear = Year.now();

        int min = 100000;
        int max = 999999;

        int randNumber = (int)Math.floor(Math.random() * (max-min + 1) + min);

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);

        StringBuilder accountNumber = new StringBuilder();
        return  accountNumber.append(year).append(randomNumber).toString();


    }
}
