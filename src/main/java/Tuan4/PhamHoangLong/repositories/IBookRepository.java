package Tuan4.PhamHoangLong.repositories;

import Tuan4.PhamHoangLong.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {



}
