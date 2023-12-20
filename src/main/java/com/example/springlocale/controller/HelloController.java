package com.example.springlocale.controller;

import com.example.springlocale.i18n.I18nUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    I18nUtil i18nUtil;

    @GetMapping(value = "/{name}")
    public String hello(@PathVariable(name = "name") String name) {
        return i18nUtil.getMessage("hello.message", name);
    }
}
