package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
