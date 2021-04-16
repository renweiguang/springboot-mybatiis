package com.rwg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbUser
{
    private Integer id;
    private String name;
    private Integer age;
}
