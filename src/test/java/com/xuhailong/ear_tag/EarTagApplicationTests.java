package com.xuhailong.ear_tag;

import com.xuhailong.ear_tag.Mapper.Ear_tagMapper;
import com.xuhailong.ear_tag.Pojo.Ear_tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EarTagApplicationTests {

    @Autowired
    Ear_tagMapper ear_tagMapper;

    @Test
    void contextLoads() {
        System.out.println(ear_tagMapper.query());
    }

}
