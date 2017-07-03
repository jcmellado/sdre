package sdre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import sdre.domain.Comment;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
}
