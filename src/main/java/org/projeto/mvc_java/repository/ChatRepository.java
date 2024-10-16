package repository;


import org.projeto.mvc_java.Model.Chat;

import org.springframework.data.repository.CrudRepository;

public interface ChatRepository extends CrudRepository<Chat, Long> {
    // Aqui você pode definir métodos adicionais para Chat, se necessário
}
