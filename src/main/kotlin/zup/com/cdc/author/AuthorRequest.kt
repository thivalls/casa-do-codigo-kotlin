package zup.com.cdc.author

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
class AuthorRequest(
    @field:NotBlank val name: String,
    @field:NotBlank val email: String,
    @field:NotBlank val description: String
) {

    override fun toString(): String {
        return "AuthorRequest(name='$name', email='$email', description='$description')"
    }

    fun toAuthor(): Author {
        return Author(name, email, description)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthorRequest) return false

        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        return email.hashCode()
    }
}