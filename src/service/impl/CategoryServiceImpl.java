package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CategoryMapper;
import pojo.Category;
import service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryMapper cagtegoryMapper;;
    @Override
    public List<Category> list() {
        // TODO Auto-generated method stub
        return cagtegoryMapper.list();
    }
    

}
