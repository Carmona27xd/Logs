package com.example.logs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/logs")
public class LogEntryController {
    private final LogRecordService service;

    public LogEntryController(LogRecordService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> createLog(@Valid @RequestBody LogRecord logRecord){
        try {
            LogRecord saveLog = service.saveLog(logRecord);
            return new ResponseEntity<>(saveLog, HttpStatus.CREATED);
        } catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
}
