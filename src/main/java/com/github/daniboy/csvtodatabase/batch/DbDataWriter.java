package com.github.daniboy.csvtodatabase.batch;

import java.util.List;

import com.github.daniboy.csvtodatabase.model.Phone;
import com.github.daniboy.csvtodatabase.service.PhoneService;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbDataWriter implements ItemWriter<Phone> {

    @Autowired
    private PhoneService service;

    @Override
    public void write(List<? extends Phone> phones) throws Exception {
        System.out.println("Data Saved for Records: " + phones.size());
        service.salvar((List<Phone>) phones);
    }

}
