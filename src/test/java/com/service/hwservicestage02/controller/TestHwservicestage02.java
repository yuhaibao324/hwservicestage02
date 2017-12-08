package com.service.hwservicestage02.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHwservicestage02 {

        Hwservicestage02Delegate hwservicestage02Delegate = new Hwservicestage02Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = hwservicestage02Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}