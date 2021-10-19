package pl.sdacademy.projectplus.quiz;

import lombok.extern.java.Log;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.sdacademy.projectplus.quiz.database.entities.PlayerEntity;
import pl.sdacademy.projectplus.quiz.database.repositories.PlayerRepository;
import pl.sdacademy.projectplus.quiz.services.QuizDataService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Log
@Component
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private QuizDataService quizDataService;

    @Override
    @Transactional
    public void run(String...args) throws Exception {
        log.info("Executing sturtup actions...");
        playerRepository.save(new PlayerEntity("John"));
        playerRepository.save(new PlayerEntity("Harry"));
        playerRepository.save(new PlayerEntity("George"));
        quizDataService.getQuizCategories();

        log.info("List of players from database:");
        List<PlayerEntity> playersFromDb = playerRepository.findAll();
        for (PlayerEntity player : playersFromDb) {
            log.info("Retrieved player: " + player);
        }
    }
}
