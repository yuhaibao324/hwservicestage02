package com.service.hwservicestage02.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-19T12:51:38.797Z")

@RestSchema(schemaId = "hwservicestage02")
@RequestMapping(path = "/hwservicestage02", produces = MediaType.APPLICATION_JSON)
public class Hwservicestage02Impl {

    @Autowired
    private Hwservicestage02Delegate userHwservicestage02Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHwservicestage02Delegate.helloworld(name);
    }

}
