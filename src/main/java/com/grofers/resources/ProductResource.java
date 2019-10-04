package com.grofers.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.grofers.model.Product;
import com.grofers.service.ProductService;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
	
	private ProductService ps = new ProductService();
	
	@GET
	public Product getProduct(@QueryParam("id") int productId) {
		return ps.getProduct(productId);
	}
	
	@PUT
	public Product addOrUpdateProduct(Product product) {
		return ps.addOrUpdateProduct(product);
	}
}
