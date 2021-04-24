package zup.com.cdc.author

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface AuthorRepository: JpaRepository<Author, Long> {
}