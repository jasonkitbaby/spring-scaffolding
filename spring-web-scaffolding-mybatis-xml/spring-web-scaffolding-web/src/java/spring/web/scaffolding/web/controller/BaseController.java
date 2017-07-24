package spring.web.scaffolding.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/************************************************************
 * Copy Right Information : 
 * Project : ${ProjectName}
 * JDK version used : ${SDK}
 * Comments : 
 *
 * Modification history : 
 *
 * Sr *** Date      *** Modified By *** Why & What is modified
 * 1. *** 2017/7/24  *** fulongwen   *** Initial
 ***********************************************************/

@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping(value = "/ping")
    @ResponseBody
    public String ping(){
        return "hello world";
    }

}
