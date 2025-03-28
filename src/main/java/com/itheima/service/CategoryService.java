package com.itheima.service;

import com.itheima.pojo.Category;

import java.util.List;

/**
 * @ author: bin
 * @ version :1.0
 */
public interface CategoryService {
    //新增分类
    void add(Category category);

    //列表查询
    List<Category> list();

    //根据id查询分类信息
    Category findById(Integer id);

    //更新分类
    void update(Category category);

    //根据分类名字删除
    void delete(Integer id);
}
