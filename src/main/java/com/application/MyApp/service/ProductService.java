package com.application.MyApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.MyApp.entity.Product;
import com.application.MyApp.productDTO.ProductDTO;
import com.application.MyApp.repository.ProductRepository;

@Service
public class ProductService {
//    private final Map<Long, Product> productRepo = new HashMap<>();
	@Autowired
	private ProductRepository productRepo;
	private long currentId = 1;

	public List<Product> getAllProducts() {
//        return new ArrayList<>(productRepo.values());
		return productRepo.findAll();
	}

	public Product getProductById(Long id) {
		Product addedProduct = productRepo.findProductById(id);
		return addedProduct;

	}

	public String deleteProduct(Long id) {
		productRepo.deleteById(id);
		return ("delted successfully");
	}

	public Product saveProducts(ProductDTO productdto) {
		// TODO Auto-generated method stub
		Product savedProduct = createProduct(productdto);
		return productRepo.save(savedProduct);
	}

	public Product updateProducts(Long id, ProductDTO updatedProductdto) {
		// TODO Auto-generated method stub
		Product existingProduct = getProductById(id);
		existingProduct.setName(updatedProductdto.getName());
		existingProduct.setPrice(updatedProductdto.getPrice());
		existingProduct.setSize(updatedProductdto.getSize());
		System.out.println(existingProduct.toString());
		return productRepo.save(existingProduct);
	}

	public Product createProduct(ProductDTO dto) {
		Product product = new Product();
		product.setName(dto.getName());
		product.setPrice(dto.getPrice());
		product.setSize(dto.getSize());
		System.out.println(dto.toString());
		return productRepo.save(product);
	}

	public Product createProduct(Product product, ProductDTO dto) {
		product.setName(dto.getName());
		product.setPrice(dto.getPrice());
		product.setSize(dto.getSize());
		System.out.println(dto.toString());
		return productRepo.save(product);
	}

}