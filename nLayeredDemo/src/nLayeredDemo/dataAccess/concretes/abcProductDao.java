package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class abcProductDao  implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("abc ile eklendi : " +product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("abc ile silindi : " +product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("abc ile güncellendi : " +product.getName());
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
