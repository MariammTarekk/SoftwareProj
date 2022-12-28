package com.example.demo.Providers;

import com.example.demo.service.IService;
import com.example.demo.service.Internet;
import com.example.demo.service.Mobile;
import com.example.demo.service.Null;
public class We implements Companies{
    @Override
    public IService createInternet() {
        return new Internet();
    }

    @Override
    public IService createMobile() {
        return new Mobile();
    }

    @Override
    public IService createDonations() {
        return new Null();
    }

    @Override
    public IService createLandline() {
        return new Null();
    }
}
