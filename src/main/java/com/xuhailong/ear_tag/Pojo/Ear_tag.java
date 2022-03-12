package com.xuhailong.ear_tag.Pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小徐
 * @Date: 2022/03/07/21:15
 * @Description:
 */
@Getter
@Setter
@ToString
public class Ear_tag {
    private Long id;
    private Float temp;
    private Character sex;
    private Short age;
    private Float weight;
    private Short health;
    private Short remark;
    private Timestamp create_time;
    private Timestamp update_time;
 }
