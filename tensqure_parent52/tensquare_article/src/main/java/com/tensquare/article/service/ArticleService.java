package com.tensquare.article.service;

import com.tensquare.article.dao.ArticleDao;
import com.tensquare.article.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.IdWorker;

import javax.annotation.Resource;

@Service
@Transactional
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private IdWorker idWorker;

    @Resource
    private RedisTemplate<Object,Object> redisTemplate;



    public void updateState(String id){
        articleDao.updateState(id);
    }

    public void addThumbup(String id){
        articleDao.addThumbup(id);
    }

    public Article findById(String id){


        Article article=(Article) redisTemplate.opsForValue().get("article_"+id);

        if (article==null){
            article=articleDao.findById(id).get();
            redisTemplate.opsForValue().set("article_"+id,article);
        }

        return article;
    }

    //修改
    public void update(Article article){
        redisTemplate.delete("article_"+article.getId());
        articleDao.save(article);
    }

    //删除
    public void deleteById(String id){
        redisTemplate.delete("article_"+id);
        articleDao.deleteById(id);
    }
}
