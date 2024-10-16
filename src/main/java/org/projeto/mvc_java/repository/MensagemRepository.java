package org.projeto.mvc_java.repository;


import org.projeto.mvc_java.Model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
    Iterable<Mensagem> findByChatId(Long chatId);
}

