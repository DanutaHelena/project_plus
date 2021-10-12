package pl.sdacademy.projectplus.quiz;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.sdacademy.projectplus.quiz.database.entities.PlayerEntity;

import javax.persistence.EntityManager;

@Log
@Component
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String...args) throws Exception {
        log.info("Executing sturtup actions...");

        PlayerEntity player = new PlayerEntity("John");
        log.info("Created player: " + player);

        entityManager.persist(player);
        log.info("Same player after persist: " + player);
    }

}
