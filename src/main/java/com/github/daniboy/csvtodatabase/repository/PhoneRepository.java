package com.github.daniboy.csvtodatabase.repository;

import com.github.daniboy.csvtodatabase.model.Phone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM phones WHERE 1=1", nativeQuery = true)
    void excluirTodos();
}
