package service;

import java.util.List;

import pojo.Category;
import util.Page;
public interface CategoryService {
	void add(Category c);
	
	void delete(int id);
	
	void update(Category c);
	
	Category  get(int id);
	
	int total();
	
	List<Category> list();
	
	List<Category> list(Page page);
}
