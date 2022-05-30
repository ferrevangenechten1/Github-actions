package be.ordina.duncan.casteleyn.github.actions.products

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.concurrent.Flow

@RestController
@RequestMapping("/products")
class ProductController(val productService: ProductService) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getProducts(): Flux<Product> {
        return productService.retrieveAllProducts()
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun addProducts(@RequestBody products: Flux<Product>): Flux<Product> {
        return productService.addProduct(products)
    }
}
