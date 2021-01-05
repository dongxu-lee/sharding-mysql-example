package com.ldx.repository;

import com.ldx.entity.Position;
import com.ldx.entity.PositionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDetailRepository extends JpaRepository<PositionDetail, Long> {
}
