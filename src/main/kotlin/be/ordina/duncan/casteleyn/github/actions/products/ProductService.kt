package be.ordina.duncan.casteleyn.github.actions.products

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux

@Service
class ProductService(val productRepository: ProductRepository) {
    companion object {
        private val LOG = LoggerFactory.getLogger(ProductService::class.java)
    }

    @Transactional(readOnly = true)
    fun retrieveAllProducts(): Flux<Product> {
        return productRepository.findAll()
    }

    @Transactional
    fun addProduct(products: Flux<Product>): Flux<Product> {
        return productRepository.saveAll(products)
    }
}
