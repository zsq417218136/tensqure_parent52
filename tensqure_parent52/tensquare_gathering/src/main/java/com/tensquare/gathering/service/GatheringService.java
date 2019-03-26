package com.tensquare.gathering.service;

import com.tensquare.gathering.dao.GatheringDao;
import com.tensquare.gathering.pojo.Gathering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import sun.awt.SunHints;

import javax.transaction.Transactional;

@Service
@Transactional
public class GatheringService {

    @Autowired
    private  GatheringDao gatheringDao;

    @Cacheable(value = "gathering",key ="#id" )
    public Gathering findById(String id){

        return gatheringDao.findById(id).get();
    }

    @CacheEvict(value = "gathering",key ="#Gathering.id" )
    public void update(Gathering Gathering){
        gatheringDao.save(Gathering);
    }
}
