package com.jiang.blog.service;

import com.jiang.blog.vo.Result;
import com.jiang.blog.vo.params.ArticleParam;
import com.jiang.blog.vo.params.PageParam;

public interface ArticleService {
    /**
     * 分页查询文章页表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParam pageParams);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 最新文章
     * @param limit
     * @return
     */
    Result newArticles(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    Result findArticalById(Long articleId);

    /**
     * 文章发布服务
     * @param articleParams
     * @return
     */
    Result publish(ArticleParam articleParams);
}
