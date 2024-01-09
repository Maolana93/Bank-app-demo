package com.maolana.shittu.bankingappdemo.service.impl;

import com.maolana.shittu.bankingappdemo.dto.BankResponse;
import com.maolana.shittu.bankingappdemo.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}
