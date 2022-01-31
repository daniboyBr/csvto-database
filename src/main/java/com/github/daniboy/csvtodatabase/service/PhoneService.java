package com.github.daniboy.csvtodatabase.service;

import java.util.List;

import com.github.daniboy.csvtodatabase.model.Phone;

public interface PhoneService {

    public void salvar(List<Phone> phones);

    public void removerTodos();

}
