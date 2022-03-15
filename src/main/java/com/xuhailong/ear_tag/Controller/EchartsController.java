package com.xuhailong.ear_tag.Controller;

import com.xuhailong.ear_tag.Mapper.Ear_tagMapper;
import com.xuhailong.ear_tag.Pojo.Ear_tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小徐
 * @Date: 2022/03/12/14:47
 * @Description:
 */
@Controller
public class EchartsController {
    @Autowired
    Ear_tagMapper ear_tagMapper;

//    @RequestMapping("/temp")
//    public String kdo(){
//        return "Echats";
//    }

    @RequestMapping("/temp")
    @ResponseBody
    public void temp(Model model){
        List<Ear_tag> list = ear_tagMapper.query1(21);
        model.addAttribute("LIST",list);
//        return model;
    }

    @RequestMapping("/Echats")
    public String echats(){
        return "Echats";
    }

}
