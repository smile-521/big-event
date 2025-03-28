package com.itheima.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;

@Data
public class User {
    @NotNull
    private Integer id;//主键ID
    @Pattern(regexp = "^\\S{5,16}$", message = "用户名必须是5-16位非空白字符")
    private String username;//用户名
    @JsonIgnore//让springmvc把当前对象转换成JSON字符串的时候，
    // 忽略password，最终的Json字符串就没有password这个属性了
    private String password;//密码
    @Pattern(regexp = "^[^\\s]{2,10}$")
    private String nickname;//昵称
    @NotEmpty
    @Email
    private String email;//邮箱
    private String userPic;//用户头像地址
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
