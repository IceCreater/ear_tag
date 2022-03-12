package com.xuhailong.ear_tag.Mapper;

import com.xuhailong.ear_tag.Pojo.Ear_tag;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小徐
 * @Date: 2022/03/07/21:25
 * @Description:
 */
@Mapper
@Repository
public interface Ear_tagMapper {

    @Select("select * from ear_tag")
    @Results({
            @Result(column = "create_time",property = "create_time"),
            @Result(column = "update_time",property = "update_time")
    })
    List<Ear_tag> query();

    @Select("select * from ear_tag where id = #{param1}")
    Ear_tag select(int id);

    @Insert("insert into ear_tag (temp,sex,age,weight,health,remark,create_time,update_time) \n" +
            "values(#{param1},#{param2},#{param3},#{param4},#{param5},#{param6},NOW(),NOW());")
    Boolean add(double temp, char sex, short age, float weight, int health, int remark);

    @Update("update  ear_tag set temp = 50, update_time = NOW() where id = 2;")
    Boolean update();
}
