package com.xtel.training.webproduct.dao;

import com.xtel.training.webproduct.entities.Account;

public interface AccountDAO {
    public Account findAccount(String userName );
}