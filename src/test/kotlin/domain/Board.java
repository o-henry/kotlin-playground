package domain;

import org.junit.jupiter.api.Test;

@Test
/**
 * TODO user-story
 * publisher 가 글을 게시한다.
 * 게시에 성공하면 일반 사용자에게 알림을 전송한다.
 */

public class Board {


    void createPost() {

        // Arrange
        Publisher publisher = new Publisher();

        // Act TODO - design the port
        publisher.create("10% discount from 3p.m");

        // Assert
    }

}
