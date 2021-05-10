package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

//C# TARAFINDA IENTITYREPOSITORY JAVADA KENDI PAKETİ VAR JPAREPOSITORY
public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
