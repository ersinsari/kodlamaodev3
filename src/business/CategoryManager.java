package business;

import core.logging.Logger;
import dataAccess.categorydao.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService{
    private List<Category> categories=new ArrayList<>();
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for(Category category1:categories){
            if(category1.getName().equals(category.getName())){
                throw new Exception("bu kategori ismi mevcuttur."+category.getName());
            }
        }
        for(Logger logger1:loggers){
            logger1.log("log");
        }
        categories.add(category);
        categoryDao.add(category);

    }



}
