package br.com.fiap.productmvc.repositories;

import br.com.fiap.productmvc.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Anotação opcional
public interface ProdutoReposiory extends JpaRepository<Produto, Long> {

}
