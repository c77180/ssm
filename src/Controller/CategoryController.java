package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Category;
import service.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    
    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav=new ModelAndView();
        List<Category> cs=categoryService.list();
        //放入转发参数
        mav.addObject("cs",cs);
        //放入转发路径
        mav.setViewName("listCategory");
        return mav;
    }
    
}
