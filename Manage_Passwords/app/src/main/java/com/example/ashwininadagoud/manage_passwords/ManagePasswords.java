package com.example.ashwininadagoud.manage_passwords;

public class ManagePasswords {

    private String account;
    private String password;

    //set account and password
    public ManagePasswords(String account, String password)
    {
        this.account=account;
        this.password=password;
    }

    //get account
    public String getAccount()
    {
        return account;
    }

    //get password
    public String getPassword()
    {
        return password;
    }

}

