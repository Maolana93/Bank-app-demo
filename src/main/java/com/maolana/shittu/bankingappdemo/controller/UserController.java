package com.maolana.shittu.bankingappdemo.controller;

import com.maolana.shittu.bankingappdemo.dto.BankResponse;
import com.maolana.shittu.bankingappdemo.dto.CreditDebitRequest;
import com.maolana.shittu.bankingappdemo.dto.EnquiryRequest;
import com.maolana.shittu.bankingappdemo.dto.UserRequest;
import com.maolana.shittu.bankingappdemo.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        return userService.balanceEnquiry(enquiryRequest);
    }
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        return userService.nameEnquiry(enquiryRequest);
    }
     @PostMapping ("/credit")
        public BankResponse creditAccount(@RequestBody CreditDebitRequest creditDebitRequest){
        return userService.creditAccount(creditDebitRequest);
        }
}
