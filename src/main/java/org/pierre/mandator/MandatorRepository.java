package org.pierre.mandator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MandatorRepository extends JpaRepository<MandatorEntity, String> {
}
