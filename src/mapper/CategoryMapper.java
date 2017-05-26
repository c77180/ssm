package mapper;
import java.util.List;

import pojo.Category;
import util.Page;

public interface CategoryMapper {
	public void add(Category category);
	
	public void delete(int id);
	
	public void update(Category category);
	
	public Category get(int id);
	
	public List<Category> list();
	
	public int total();
	
	public List<Category> list(Page page);
	
}
