package ch.letterix.letterix_backend.domain.cover_letter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cover_letter")
public class CoverLetterController {
    private final CoverLetterService coverLetterService;
    public CoverLetterController(CoverLetterService coverLetterService) {
        this.coverLetterService = coverLetterService;
    }

    @PostMapping("/")
    public ResponseEntity<String> registerWithoutPassword(@RequestBody CoverLetter coverLetter) {
        return new ResponseEntity<>(coverLetterService.getCoverLetter(coverLetter), HttpStatus.CREATED);
    }
}
