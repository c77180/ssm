package service.impl;

import service.CategoryService;
import util.Page;
import pojo.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CategoryMapper;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryMapper categoryMapper;

	//add
	@Override
	public void add(Category category){
		categoryMapper.add(category);
	}
	//delete
	@Override
	public void delete(int id){
		categoryMapper.delete(id);
	}
	
	//update
	@Override
	public void update(Category category){
		categoryMapper.update(category);
	}
	
	//get
	@Override
	public Category get(int id){
		return categoryMapper.get(id);
	}
	
	@Override
	public List<Category> list(Page page){
		return categoryMapper.list(page);
	}
	
	@Override
	public List<Category> list()
	{
		return categoryMapper.list();
	}
	@Override
	public int total(){
		return categoryMapper.total();
	}
	

}
