package com.itheima.mapper;

import com.itheima.pojo.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ author: bin
 * @ version :1.0
 */
@Mapper
public interface ArticleMapper {
    //新增
    @Insert("insert into article(title,content,cover_img,state,category_id,create_user,create_time,update_time)" +
            "values(#{title},#{content},#{coverImg},#{state},#{categoryId},#{createUser},#{createTime},#{updateTime})")
    void add(Article article);

    //文章列表
    List<Article> list(Integer userId, Integer categoryId, String state);

    //根据id查询文章内容
    @Select("select * from article where id = #{id}")
    Article findById(Integer id);

    //更新文章内容
    @Update("update article set title=#{title},content=#{content}," +
            "cover_img=#{coverImg},state=#{state} where id = #{id}")
    void update(Article article);

    //根据id删除文章
    @Delete("delete from article where id=#{id}")
    void delete(Integer id);
}
