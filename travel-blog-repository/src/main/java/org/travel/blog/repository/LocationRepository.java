package org.travel.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nm.tb.models.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
