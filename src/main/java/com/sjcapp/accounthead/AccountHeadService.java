package com.sjcapp.accounthead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sjcapp/AccountHead")
public class AccountHeadService {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(value = "/AccountHead")
    public List<AccountHead> getAll() {
        return accountRepository.findAll();
    }

    @PostMapping(value = "/AccountHead")
    public void addAccountHead(@RequestBody final AccountHead accountHead) {
        System.out.println(accountHead);
        accountRepository.save(accountHead);
    }

}
