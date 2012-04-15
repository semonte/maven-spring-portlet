package sample.portlet.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Controller
@RequestMapping(value = "VIEW")
public class SampleController {

    @RenderMapping
    public ModelAndView home(RenderRequest request, RenderResponse response) {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("message", "Hello Spring portlet!");
        return mv;
    }
}
