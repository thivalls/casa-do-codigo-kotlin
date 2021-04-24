package zup.com.cdc.author

import io.micronaut.data.jpa.repository.JpaRepository
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.inject.Inject
import javax.validation.Valid

@Validated
@Controller("authors")
class AuthorController(
    val authorRepository: AuthorRepository
) {
    @Post
    fun store(@Body @Valid request: AuthorRequest): String {
        println("Dados validados")
        println("Salvando dados")
        val author = request.toAuthor()
        val save = authorRepository.save(author)
        println("Usuário salvo com sucesso")
        return save.name
    }
}