package com.HP.ProductsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.HP.ProductsAndCategories.models.Category;
import com.HP.ProductsAndCategories.models.Joint;
import com.HP.ProductsAndCategories.models.Product;
import com.HP.ProductsAndCategories.repositories.CategoryRepository;
import com.HP.ProductsAndCategories.repositories.JointRepository;
import com.HP.ProductsAndCategories.repositories.ProductRepository;

@Service
public class ProductService {

	private ProductRepository _pr;
	private CategoryRepository _cr;
	private JointRepository _jr;
	
	public ProductService(ProductRepository _pr, CategoryRepository _cr, JointRepository _jr) {
		this._pr = _pr;
		this._cr = _cr;
		this._jr = _jr;
	}
	
	public void createProduct(Product product) {
		_pr.save(product);
	}
	
	public Product getProductById(Long id) {
		return _pr.findOne(id);
	}
	
	public List<Category> getAvailableCategoriesById(Long id) {
		List<Category> availableCats = (List<Category>) _cr.findAll();
		Product product = _pr.findOne(id);
		for ( Joint joint : product.getJoints()) {
			availableCats.remove(joint.getCategory());
		}
		return availableCats;
	}
	
	public void appendCategory(Long product_id, Category category) {
		Joint newJoint = new Joint(_pr.findOne(product_id), category);		
		_jr.save(newJoint);
	}
	
	
	public void deleteAll() {
		_pr.deleteAll();
	}
}
