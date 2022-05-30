package be.ordina.duncan.casteleyn.github.actions.products

import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : R2dbcRepository<Product, Long>
