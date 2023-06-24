package com.crud.tasks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class StaticWebPageController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("variable", "My Thymeleaf variable");
        model.put("one", 1);
        model.put("two", 2);

        model.put("first", "2 * 2 = 4");
        model.put("second", "2 * 2 + 2 = 6");
        model.put("third", "2 - 2 * 2 = -2");
        return "index";
    }
}
