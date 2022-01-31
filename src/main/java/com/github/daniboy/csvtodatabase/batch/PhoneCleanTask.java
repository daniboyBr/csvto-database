
package com.github.daniboy.csvtodatabase.batch;

import com.github.daniboy.csvtodatabase.service.PhoneService;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhoneCleanTask implements Tasklet {

    @Autowired
    private PhoneService phoneService;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        phoneService.removerTodos();
        System.out.println("Limpando a tabela");
        return RepeatStatus.FINISHED;
    }

}
