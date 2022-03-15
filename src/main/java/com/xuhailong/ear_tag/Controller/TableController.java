package com.xuhailong.ear_tag.Controller;

import com.xuhailong.ear_tag.Mapper.Ear_tagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小徐
 * @Date: 2022/03/14/18:04
 * @Description:
 */
@Controller
public class TableController {

    @Autowired
    Ear_tagMapper ear_tagMapper;

    @RequestMapping("/Table")
    public String index(Model model){
        model.addAttribute("ear_tags",ear_tagMapper.query());
        return "Table";
    }


}
