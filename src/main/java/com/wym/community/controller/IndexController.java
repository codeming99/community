package com.wym.community.controller;


import com.wym.community.dto.PaginationDTO;
import com.wym.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(value = "page", defaultValue = "1") Integer page,
                        @RequestParam(value = "size", defaultValue = "5") Integer size){

        //页面加载完成之前将提问的数据添加到model中
        PaginationDTO pagination =questionService.list(page,size);
        model.addAttribute("pagination",pagination);

        return "index";
    }
}
