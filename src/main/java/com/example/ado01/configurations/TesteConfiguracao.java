package com.example.ado01.configurations;

import com.example.ado01.services.DBService;
import com.example.ado01.services.MyNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("teste")
public class TesteConfiguracao {
    @Autowired
    MyNameService myNameService;

    private boolean instanciar() throws ParseException {
        this.myNameService.instanciarDB();
        return true;
    }
}
