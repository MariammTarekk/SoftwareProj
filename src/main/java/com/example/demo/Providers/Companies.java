package com.example.demo.Providers;

import com.example.demo.service.IService;

public interface Companies {
    public IService createInternet();
    public IService createMobile();
    public IService createDonations();
    public IService createLandline();
}
