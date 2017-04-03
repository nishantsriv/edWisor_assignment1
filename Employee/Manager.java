package com.example.nishant.animation;

/**
 * Created by nishant on 1/27/2017.
 */
public abstract class Manager extends Employee{

    public abstract int teamsize();



    public Manager() {

    }

    @Override
    protected int getSalary() {
        return 0;
    }
}
