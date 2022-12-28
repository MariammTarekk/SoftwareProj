package com.example.demo.service;

    public class LandLine implements IService {
        double cost=10.0;
        LandLine(){
            System.out.println("You shoud Pay 10 dollar for LandLine monthly");
        }

        @Override
        public double getcost() {
            return cost;
        }
    }

