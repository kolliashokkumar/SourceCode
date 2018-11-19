package com.primesoft.pivotalsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "<!DOCTYPE html><html><body><h1>Welcome to Concourse Pipeline - Deploy Sample Java App to PWS</h1><p><h2><font color='red'>Version 2.4</font></h2></p></body></html>";
    }
}
