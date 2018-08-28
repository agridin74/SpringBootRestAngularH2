package com.example.flower.repository;
import com.example.flower.entity.Flower;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface FlowerRepository extends CrudRepository<Flower, Long> {
	List<Flower> findByPrice(double price);

}
