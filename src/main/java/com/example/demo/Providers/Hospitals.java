package com.example.demo.Providers;

import com.example.demo.service.Donations;
import com.example.demo.service.IService;
import com.example.demo.service.Null;

public class Hospitals implements Companies{
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
