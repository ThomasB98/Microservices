package com.thomasbansod.accounts.service;

import com.thomasbansod.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto -CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber -String mobile number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto -CustomerDto Object
     * @return boolean indicates if the update of Accout details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - takes input as mobile number in string form
     * @return oolean indicates if the account is deleted or not
     */
    boolean deleteAccount(String mobileNumber);
}
