package fptis.bnk.sw3.kiosBankingbackend.repository;

import fptis.bnk.sw3.kiosBankingbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findAllByUsername(String username);
    User findAllByConfirmationToken(String confirmationToken);
}
