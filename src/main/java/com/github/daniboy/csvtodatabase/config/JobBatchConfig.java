package com.github.daniboy.csvtodatabase.config;

import com.github.daniboy.csvtodatabase.batch.PhoneCleanTask;
import com.github.daniboy.csvtodatabase.model.Phone;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableBatchProcessing
@Configuration
public class JobBatchConfig {

    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory, Step clearTableStep, Step batchStep) {

        return jobBuilderFactory.get("ETL-Load").incrementer(new RunIdIncrementer()).start(clearTableStep)
                .next(batchStep).build();

    }

    @Bean
    public Step clearTableStep(StepBuilderFactory stepBuilderFactory, PhoneCleanTask cleanTask) {
        return stepBuilderFactory.get("CLEAR-TABLE").tasklet(cleanTask).build();
    }

    @Bean
    public Step batchStep(StepBuilderFactory stepBuilderFactory, ItemReader<Phone> itemReader,
            ItemWriter<Phone> itemWriter, ThreadPoolTaskExecutor taskExecutor) {

        return stepBuilderFactory.get("ETL-file-load").<Phone, Phone>chunk(100).reader(itemReader)
                .writer(itemWriter).taskExecutor(taskExecutor)
                .build();
    }

}
