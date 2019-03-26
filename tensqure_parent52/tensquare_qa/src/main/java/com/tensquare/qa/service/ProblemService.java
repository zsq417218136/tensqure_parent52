package com.tensquare.qa.service;

import com.tensquare.qa.dao.ProblemDao;
import com.tensquare.qa.pojo.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.List;

@Service
public class ProblemService {

    @Autowired
    private ProblemDao problemDao;

    @Autowired
    private IdWorker idWorker;

    public Page<Problem> newlist(String labelid, int page, int rows){

        Pageable pageable=PageRequest.of(page-1,rows);
        return problemDao.newlist(labelid,pageable);
    }

    public Page<Problem> hotlist(String labelid, int page, int rows){

        Pageable pageable=PageRequest.of(page-1,rows);
        return problemDao.hotlist(labelid,pageable);
    }
    public Page<Problem> waitlist(String labelid, int page, int rows){

        Pageable pageable=PageRequest.of(page-1,rows);
        return problemDao.waitlist(labelid,pageable);
    }
}
