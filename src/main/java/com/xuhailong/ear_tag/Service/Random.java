package com.xuhailong.ear_tag.Service;

import com.xuhailong.ear_tag.Mapper.Ear_tagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小徐
 * @Date: 2022/03/11/14:08
 * @Description:
 */

public class Random {


    Ear_tagMapper ear_tagMapper;

    public void Rand() {
        for(int i = 0; i < 1000; i++) {
            double temp = 38.5 + Math.random();
            char  sex = '公';
            if (Math.random()*2 < 1) {
                sex = '母';
            }
            short age = (short) ((short)1+ (short)(Math.random()*3));
            float weight = (float)420.0 + (float)(Math.random()*160);
            boolean b = ear_tagMapper.add(temp,sex,age,weight,1,1);
        }
    }
}
