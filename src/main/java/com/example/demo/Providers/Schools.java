package com.example.demo.Providers;

import com.example.demo.service.*;

public class Schools implements Companies{
    @Override
    public IService createInternet() {
        return new Null();
    }

    @Override
    public IService createMobile() {
        return new Null();
    }

    @Override
    public IService createDonations() {
        return new Donations();
    }

    @Override
    public IService createLandline() {
        return new Null();
    }
}
