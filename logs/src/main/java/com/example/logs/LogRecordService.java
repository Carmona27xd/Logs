package com.example.logs;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class LogRecordService {
    private final LogEntryRepository repository;

    public LogRecordService(LogEntryRepository repository){
        this.repository = repository;
    }

    public LogRecord saveLog (LogRecord logRecord){
        if(logRecord.getTimestamp() != null && logRecord.getTimestamp().isAfter(LocalDateTime.now())){
            throw new IllegalArgumentException("El registro no puede tener fechas futuras");
        }

        if (logRecord.getTimestamp() == null) {
            logRecord.setTimestamp(LocalDateTime.now());

        }
        return repository.save(logRecord);
    }
}
