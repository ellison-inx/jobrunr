package org.jobrunr.jobs.details;

import org.jobrunr.jobs.JobDetails;
import org.jobrunr.jobs.lambdas.IocJobLambdaFromStream;
import org.jobrunr.jobs.lambdas.JobLambdaFromStream;

import java.io.Serializable;

public interface JobDetailsGenerator {

    <T extends Serializable> JobDetails toJobDetails(T lambda);

    <TItem> JobDetails toJobDetails(TItem x, JobLambdaFromStream<TItem> consumer);

    <TService, TItem> JobDetails toJobDetails(TItem x, IocJobLambdaFromStream<TService, TItem> consumer);
}
