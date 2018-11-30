package com.itrigger.springboot.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itrigger.springboot.domain.Area;
import com.itrigger.springboot.service.AreaService;

@Controller
@RequestMapping("/area")
public class AreaController {
	@Resource
    private AreaService areaService;

    @RequestMapping("/showArea")
    @ResponseBody
    public Area toIndex(HttpServletRequest request, Model model){
        String code = request.getParameter("code");
        Area area = areaService.getAreaById(code);
        return area;
    }
}
