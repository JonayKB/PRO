package es.ies.puerto.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ies.puerto.model.entity.Block;

@Repository
public interface IBlockRepository extends JpaRepository<Block, Integer> {

    List<Block> findAll();

    void deleteById(Integer id);

    Optional<Block> findById(Integer id);

    Block save(Block entity);

}
