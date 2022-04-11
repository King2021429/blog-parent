package com.jiang.blog.controller;

import com.jiang.blog.common.aop.LogAnnotation;

import com.jiang.blog.service.ArticleService;
import com.jiang.blog.vo.Result;
import com.jiang.blog.vo.params.ArticleParam;
import com.jiang.blog.vo.params.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    /*
     首页文章列表
     */
    @PostMapping
    @LogAnnotation(module = "文章", operation = "获取文章列表")

    public Result listArticle(@RequestBody PageParam pageParam){
        return articleService.listArticle(pageParam);
    }

    /**
     * 首页最热文章
     * @return
     */

    @PostMapping("hot")

    public Result hotArticle(){
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /**
     * 最新文章
     * @return
     */
    @PostMapping("new")

    public Result newArticles(){
        int limit = 5;
        return articleService.newArticles(limit);
    }

    /**
     * 文章归档
     * @return
     */
    @PostMapping("listArchives")

    public Result listArchives(){
        return articleService.listArchives();
    }

    /**
     * 文章详情
     */
    @PostMapping("view/{id}")

    public Result findArticleById(@PathVariable("id") Long articleId){
        return articleService.findArticalById(articleId);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParams){
        return articleService.publish(articleParams);
    }
}
