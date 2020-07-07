package com.triples.project.scheduler.crawling.festa;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 */
public class FestaJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 크롤링 로직 작성 to do
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
