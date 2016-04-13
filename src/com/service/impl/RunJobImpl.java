package com.service.impl;

import com.service.RunJob;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.Result;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;
import org.springframework.stereotype.Service;


@Service
public class RunJobImpl implements RunJob{
    public String runJob(String filename) {
        try {
            //StepLoader.init();  // 3.2以前版本
            KettleEnvironment.init();
            EnvUtil.environmentInit();
//       JobEntryLoader.init();
//       JobMeta jobMeta = new JobMeta(LogWriter.getInstance(),filename,null);
            JobMeta jobMeta = new JobMeta(filename,null);
            //Job job = new Job(LogWriter.getInstance(),StepLoader.getInstance() ,null,jobMeta);
            Job job = new Job(null, jobMeta);

            //job.getJobMeta().setInternalKettleVariables(job);
            job.start(); // You can pass arguments instead of null.
            job.waitUntilFinished();
            Result result=job.getResult();
            if(job!=null){
                return result.toString();
            }
            if ( job.getErrors() > 0 )
            {
                System.out.println("jobError : " + job.getErrors());
                throw new RuntimeException( "There were errors during transformation execution." );
            }
        }
        catch ( KettleXMLException e ) {
            // TODO Put your exception-handling code here.
            System.out.println("KettleXMLException : " + e);
            System.out.println("KettleXMLException : " + e.getMessage());
        }
        catch ( KettleException e ) {
            // TODO Put your exception-handling code here.
            System.out.println("KettleException : " + e);
        }
        return null;
    }

    public void runTransformation(String filename) {
        try {
            //StepLoader.init();  // 3.2以前版本
            KettleEnvironment.init();
            EnvUtil.environmentInit();
            TransMeta transMeta = new TransMeta(filename);
            Trans trans = new Trans(transMeta);

            trans.execute(null); // You can pass arguments instead of null.
            trans.waitUntilFinished();
            //Result  result=trans.getResult();
            Result  result=trans.getResult();
            if(trans!=null){
                System.out.println(result.toString());
            }
            if ( trans.getErrors() > 0 )
            {
                System.out.println("transError : " + trans.getErrors());
                throw new RuntimeException( "There were errors during transformation execution." );
            }
        }
        catch ( KettleXMLException e ) {
            // TODO Put your exception-handling code here.
            System.out.println("KettleXMLException : " + e);
            System.out.println("KettleXMLException : " + e.getMessage());
            System.out.println("KettleXMLException : " + e.getStackTrace());
        }
        catch ( KettleException e ) {
            // TODO Put your exception-handling code here.
            System.out.println("KettleException : " + e);
        }
    }
}
