package com.example.springlocale.i18n;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class I18nUtil {

    @Autowired
    MessageSource messageSource;

    @Resource(name = "localHolder")
    LocalHolder localHolder;

    public String getMessage(String code, String... args){
        return messageSource.getMessage(code, args, localHolder.getCurrentLocale());
    }

}
