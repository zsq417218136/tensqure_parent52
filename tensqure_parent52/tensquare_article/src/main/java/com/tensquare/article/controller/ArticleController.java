package com.tensquare.article.controller;

import com.tensquare.article.pojo.Article;
import com.tensquare.article.service.ArticleService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/examine/{articleId}",method = RequestMethod.PUT)
    public Result examine(@PathVariable String articleId){
        articleService.updateState(articleId);
        return new Result(true,StatusCode.OK,"审核成功");
    }

    @RequestMapping(value = "/thumbup/{articleId}",method = RequestMethod.PUT)
    public Result thumbup(@PathVariable String articleId){
        articleService.addThumbup(articleId);
        return new Result(true,StatusCode.OK,"点赞成功");
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id){


        return new Result(true,StatusCode.OK,"通过",articleService.findById(id));
    }
}
