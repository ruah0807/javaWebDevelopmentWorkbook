package org.zerock.api01_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.api01_1.domain.APIUser;

public interface APIUserRepository extends JpaRepository<APIUser, String > {
}
