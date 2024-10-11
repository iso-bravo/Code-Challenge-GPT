package mx.edu.cetys.iso.chatgptapp.repository;

import mx.edu.cetys.iso.chatgptapp.model.ChatInteraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatInteractionRepository extends JpaRepository<ChatInteraction, Long> {
}
