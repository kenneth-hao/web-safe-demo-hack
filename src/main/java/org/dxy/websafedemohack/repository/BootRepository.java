package org.dxy.websafedemohack.repository;

import org.dxy.websafedemohack.domain.BootDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BootRepository<T extends BootDomain> extends JpaRepository<T, Integer>, JpaSpecificationExecutor<T> {

}
