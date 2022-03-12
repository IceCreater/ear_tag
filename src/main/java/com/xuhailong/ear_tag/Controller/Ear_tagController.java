package com.xuhailong.ear_tag.Controller;

import com.xuhailong.ear_tag.Mapper.Ear_tagMapper;
import com.xuhailong.ear_tag.Service.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小徐
 * @Date: 2022/03/07/21:36
 * @Description:
 */
@Controller
public class Ear_tagController {

    @Autowired
    Ear_tagMapper ear_tagMapper;

    @RequestMapping("/Random")
    public String Rand() {
//        Random random = new Random();
//        random.Rand();

            for(int i = 0; i < 1000; i++) {
                double temp = 38.5 + Math.random();
                char  sex = '公';
                if (Math.random()*2 < 1) {
                    sex = '母';
                }
                short age = (short) ((short)1+ (short)(Math.random()*4));
                float weight = (float)420.0 + (float)(Math.random()*160);
                boolean b = ear_tagMapper.add(temp,sex,age,weight,1,1);
            }

        return "index";
    }

    @RequestMapping({"/index","/"})
    public String index(Model model){
        model.addAttribute("ear_tags",ear_tagMapper.query());
        return "index";
    }

}
