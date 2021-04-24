package zup.com.cdc.author

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Author (
    val name: String,
    val email: String,
    val description: String,
) {
    @Id
    @GeneratedValue
    var id: Long? = null

    val createdAt: LocalDateTime = LocalDateTime.now()

    override fun toString(): String {
        return "AuthorModel(name='$name', email='$email', description='$description')"
    }
}