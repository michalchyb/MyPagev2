package pl.mchyb.mypage.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.mchyb.mypage.entity.Run;
import pl.mchyb.mypage.repository.RunRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class RunController {

	private RunRepository runRepository;

	public RunController(RunRepository runRepository) {
		this.runRepository = runRepository;
	}

	@GetMapping("runs")
	public ResponseEntity<List<Run>> getBooks() {
		return new ResponseEntity<>(runRepository.findAll(), HttpStatus.OK);
	}
}
