package com.hnp.springbootactivedirectory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private LdapTemplate ldapTemplate;


    @GetMapping("/test")
    public String test() {
        ldapTemplate.list("emp");
//        ldapTemplate
//                .search(
//                        "ou=emp",
//                        "cn=" + "alia",
//                        (AttributesMapper<String>) attrs -> (String) attrs.get("cn").get());
        return "test";
    }
}
