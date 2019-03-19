package pl.mchyb.mypage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.mchyb.mypage.entity.Run;

public interface RunRepository extends JpaRepository<Run, Long> {
	Run findById (long id);
}
