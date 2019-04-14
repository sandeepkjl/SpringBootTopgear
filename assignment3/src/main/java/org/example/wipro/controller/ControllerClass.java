package org.example.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerClass {

    @RequestMapping("/")
    public String homePage()
    {
        return "home";
    }

    @RequestMapping("/getBankBranches")
    public ModelAndView getBankBranches()
    {
        ModelAndView model = new ModelAndView("bankbranches");
        return model;

    }

    @RequestMapping("/getBankServices")
    public String getBankServices()
    {

        return "bankServices";

    }
}
