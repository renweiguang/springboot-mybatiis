package com.rwg.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    //标识主键策略
    @TableId
    private Long articleId;

    private String title;

    private String content;
}


