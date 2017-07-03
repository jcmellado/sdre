package sdre.repository;

import org.springframework.data.repository.CrudRepository;

import sdre.domain.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
