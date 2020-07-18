package org.pierre.mandator;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RuleRepository extends JpaRepository<RuleImpl, String> {
}
