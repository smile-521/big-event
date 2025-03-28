package com.itheima.service;

import com.itheima.pojo.Article;
import com.itheima.pojo.PageBean;

/**
 * @ author: bin
 * @ version :1.0
 */
public interface ArticleService {
    //新增文章
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);

    //根据id查询
    Article findById(Integer id);

    //更新文章内容
    void update(Article article);

    //根据id删除
    void delete(Integer id);

}
