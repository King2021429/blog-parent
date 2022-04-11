package com.jiang.blog.service;

import com.jiang.blog.vo.Result;
import com.jiang.blog.vo.TagVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TagService {


    Result findAllDetail();

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    Result findAll();

    Result findDetailById(Long id);
}
