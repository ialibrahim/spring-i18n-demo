package com.example.springlocale.i18n;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LocalHolder {
    private Locale currentLocale;
}
