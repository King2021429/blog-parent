package com.jiang.blog.service;

import com.jiang.blog.vo.Result;
import com.jiang.blog.vo.params.CommentParam;

public interface CommentsService {
    /**
     * 根据文章id查询所有的评论列表
     * @param
     * @return
     */
    Result commentsByArticleId(Long id);


    Result comment(CommentParam commentParam);
}
