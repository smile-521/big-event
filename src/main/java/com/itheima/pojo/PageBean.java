package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ author: bin
 * @ version :1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    private Long total;//总条数
    private List<T> items;//当前页数据集合
}
