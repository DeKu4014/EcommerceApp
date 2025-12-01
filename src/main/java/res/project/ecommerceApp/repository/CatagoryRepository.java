package res.project.ecommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import res.project.ecommerceApp.entity.Catagory;

@Repository
public interface CatagoryRepository extends JpaRepository<Catagory, Long> {

}
