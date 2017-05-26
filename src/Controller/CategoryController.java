package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mapper.CategoryMapper;
import pojo.Category;
import service.CategoryService;
import util.Page;
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page) {

		ModelAndView mav = new ModelAndView();
//		List<Category> cs=categoryService.list();
		List<Category> cs=categoryService.list(page);
		int total=categoryService.total();
		page.caculateLast(total);
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");

		return mav;
	}
	@RequestMapping("addCategory")
	public ModelAndView add(Category category){
		categoryService.add(category);
		ModelAndView mav= new ModelAndView("redirect:/listCategory");
		return mav;
	}
	@RequestMapping("deleteCategory")
	public ModelAndView delete(int id){
		categoryService.delete(id);
		ModelAndView mav= new ModelAndView("redirect:/listCategory");
		return mav;
	}
	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category category){
		Category c=categoryService.get(category.getId());
		ModelAndView mav= new ModelAndView("editCategory");
		mav.addObject("c",c);
		return mav;
	}
	@RequestMapping("updateCategory")
	public ModelAndView updateCategory(Category category){
		categoryService.update(category);
		ModelAndView mav= new ModelAndView("redirect:/listCategory");
		return mav;
	}
}
