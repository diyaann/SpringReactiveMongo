package com.Ust.SpringReactiveMongo.repository;

import com.Ust.SpringReactiveMongo.dto.ProductDto;
import com.Ust.SpringReactiveMongo.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    Flux<ProductDto> findByPriceBetween(Range<Double> closed);
}
