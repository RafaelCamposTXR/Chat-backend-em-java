package repository;


import org.projeto.mvc_java.Model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

public interface MensagemRepository extends CrudRepository<Mensagem, Long> {
    Iterable<Mensagem> findByChatId(Long chatId);
}

