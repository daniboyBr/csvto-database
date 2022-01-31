package com.github.daniboy.csvtodatabase.service.impl;

import java.util.List;

import com.github.daniboy.csvtodatabase.model.Phone;
import com.github.daniboy.csvtodatabase.repository.PhoneRepository;
import com.github.daniboy.csvtodatabase.service.PhoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    @Transactional(transactionManager = "phoneTransactionManager")
    public void salvar(List<Phone> phones) {
        this.phoneRepository.saveAll(phones);
    }

    @Override
    @Transactional(transactionManager = "phoneTransactionManager")
    public void removerTodos() {
        this.phoneRepository.excluirTodos();
    }
}
