package microservices.book.multiplication.challenge;

import lombok.*;
import microservices.book.multiplication.user.User;

/**
 * Identifies the attempt from {@link User} to solve a challenge
 */

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
    private Long id;
    //private Long userId;
    private User user;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
