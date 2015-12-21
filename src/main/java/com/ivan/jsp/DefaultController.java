package com.ivan.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public String index(ModelAndView modelAndView)
    {
        return "index";
    }

    @RequestMapping("/test")
    public String test(ModelAndView modelAndView)
    {
        return "some-template";
    }
}
