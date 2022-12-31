package com.example.demo.service;

    public class LandLine implements IService {
        double cost=10.0;
        public LandLine(){

        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public double getcost() {
            return cost;
        }
    }

