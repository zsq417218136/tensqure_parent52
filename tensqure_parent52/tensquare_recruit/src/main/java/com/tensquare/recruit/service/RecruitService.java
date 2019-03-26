package com.tensquare.recruit.service;

import com.tensquare.recruit.dao.RecruitDao;
import com.tensquare.recruit.pojo.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.List;

@Service
public class RecruitService {
    @Autowired
    private RecruitDao recruitDao;

    @Autowired
    private IdWorker idWorker;

    public List<Recruit> recommend(){
        return recruitDao.findTop6ByStateOrderByCreatetimeDesc("2");
    }

    public List<Recruit> newlist(){

        return recruitDao.findTop6ByStateNotOrderByCreatetimeDesc("0");
    }
}
