package pl.mchyb.mypage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.mchyb.mypage.entity.Triathlon;

public interface TriathlonRepository extends JpaRepository<Triathlon, Long> {
	Triathlon findById(long id);
}
