package kiritsu.auth;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
