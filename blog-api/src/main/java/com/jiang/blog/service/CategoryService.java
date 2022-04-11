package com.jiang.blog.service;

import com.jiang.blog.vo.CategoryVo;
import com.jiang.blog.vo.Result;

import java.util.List;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);
}
