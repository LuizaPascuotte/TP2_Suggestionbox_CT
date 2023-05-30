package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.services;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model.entities.Category;
import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.repositories.CategoryRepository;

@Service
public class CategoryService {
    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category salvar(Category category) {
        return repository.save(category);
    }

    public Category atualizar(Integer id, Category pCategory) {
        Optional<Category> optCategory = repository.findById(id);

        if (optCategory.isPresent()) {
            Category category = optCategory.get();
            category.setDescription(pCategory.getDescription());
            return repository.save(category);
        }

        throw new RuntimeException("Categoria não encontrada. ID: " + id);
    }

}

public Category buscarPorId(Integer pId){
    Optional<Category> optional = repository.findById(pId);
    if (optional.isEmpty()){
        throw new RuntimeException("Categoria não encontrada. ID: " + id);
    return optional.get();
    }

    public List<Category> BuscarTodos() {
        return repository.findAll();
    }

    public void remover(Integer id) {
        repository.deleteById(id);
    }
}