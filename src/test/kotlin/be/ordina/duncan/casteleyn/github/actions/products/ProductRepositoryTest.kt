package be.ordina.duncan.casteleyn.github.actions.products

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest

@DataR2dbcTest
class ProductRepositoryTest {
    @Autowired
    lateinit var productRepository: ProductRepository

    @Test
    fun `Test save returns ids`() {
        // Given
        val productToSave = Product(name = "test", description = "a test product")
        // When
        val mono = productRepository.save(productToSave)
        // Then
        val product = mono.block()
        assert(product != null)
        assert(product?.name == "test")
        assert(product?.description == "a test product")
    }


}
