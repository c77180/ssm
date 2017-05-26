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
	@Override
	public List<Category> list(){
		return categoryMapper.list();
	}
	
	@Override
	public List<Category> list(Page page){
		return categoryMapper.list(page);
	}
	@Override
	public int total(){
		return categoryMapper.total();
	}
	

}
