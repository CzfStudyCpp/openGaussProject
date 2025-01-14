package com.test.controller;


import com.test.entitys.TbClass;
import com.test.service.TbClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/gadb")
public class TestController {

    @Autowired
    TbClassService tbClassService;

    @GetMapping("/query")
    public List<TbClass> queryData(){
        return tbClassService.query();
    }

}
