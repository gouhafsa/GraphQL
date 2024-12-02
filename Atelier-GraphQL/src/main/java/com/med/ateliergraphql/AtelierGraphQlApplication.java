package com.med.ateliergraphql;

import com.med.ateliergraphql.entity.Creator;
import com.med.ateliergraphql.entity.Video;
import com.med.ateliergraphql.repository.CreatorRepository;
import com.med.ateliergraphql.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class AtelierGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtelierGraphQlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
            List<Creator> creators = List.of(
                    Creator.builder().name("Alice").email("alice@example.com").build(),
                    Creator.builder().name("Bob").email("bob@example.com").build()
            );
            creatorRepository.saveAll(creators);

            List<Video> videos = List.of(
                    Video.builder()
                            .name("Java Tutorial")
                            .url("http://example.com/java")
                            .description("Java basics")
                            .datePublication(LocalDate.now())
                            .creator(creators.get(0))
                            .build(),
                    Video.builder()
                            .name("Spring Boot Guide")
                            .url("http://example.com/spring")
                            .description("Spring Boot introduction")
                            .datePublication(LocalDate.now())
                            .creator(creators.get(1))
                            .build()
            );
            videoRepository.saveAll(videos);
        };
    }

}
