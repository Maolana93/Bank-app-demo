package com.maolana.shittu.bankingappdemo.service.impl;

import com.maolana.shittu.bankingappdemo.dto.BankResponse;
import com.maolana.shittu.bankingappdemo.dto.CreditDebitRequest;
import com.maolana.shittu.bankingappdemo.dto.EnquiryRequest;
import com.maolana.shittu.bankingappdemo.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount (CreditDebitRequest creditDebitRequest);
    BankResponse debitAccount (CreditDebitRequest creditDebitRequest);

}
