package Tuan5.PhamHoangLong.repositories;


import Tuan5.PhamHoangLong.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
