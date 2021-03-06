package com.wym.community.controller;


import com.wym.community.cache.HotTagCache;
import com.wym.community.dto.PaginationDTO;
import com.wym.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private HotTagCache hotTagCache;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(value = "page", defaultValue = "1") Integer page,
                        @RequestParam(value = "size", defaultValue = "5") Integer size,
                        @RequestParam(value = "search",required = false) String search,
                        @RequestParam(value = "tag",required = false) String tag,
                        @RequestParam(value = "sort",required = false) String sort){

        //页面加载完成之前将提问的数据添加到model中
        PaginationDTO pagination = questionService.list(search,tag,sort,page,size);
        List<String> tags = hotTagCache.getHots();
        model.addAttribute("pagination",pagination);
        model.addAttribute("search",search);
        model.addAttribute("tag",tag);
        model.addAttribute("tags",tags);
        model.addAttribute("sort",sort);

        return "index";
    }
}
