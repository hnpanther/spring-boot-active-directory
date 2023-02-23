package com.hnp.springbootactivedirectory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    @Autowired
    private LdapTemplate ldapTemplate;


    @GetMapping("/test")
    public String test() {

        ldapTemplate
                .search(
                        "ou=emp,dc=hnp,dc=local",
                        "cn=" + "ldapuser",
                        (AttributesMapper<String>) attrs -> (String) attrs.get("cn").get());


        return "test";
    }
}
