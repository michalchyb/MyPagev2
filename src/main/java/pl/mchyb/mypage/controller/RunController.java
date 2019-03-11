package pl.mchyb.mypage.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<Run>> getRuns() {
		return new ResponseEntity<>(runRepository.findAll(), HttpStatus.OK);
	}

	@PostMapping("runs")
	public ResponseEntity<Run> addRun(@RequestBody Run run) {
		return new ResponseEntity<Run>(runRepository.save(run), HttpStatus.OK);
	}
}
