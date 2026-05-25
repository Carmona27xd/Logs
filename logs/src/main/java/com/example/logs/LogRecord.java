package com.example.logs;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@Entity
@Table(name = "log_records")
public class LogRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El campo 'sourceSystem' es obligatorio")
    @Column(name = "source_system", nullable = false)
    private String sourceSystem;

    @NotBlank(message = "El campo 'message' es obligatorio")
    @Column(columnDefinition = "TEXT", nullable = false)
    private String message;

    @NotBlank(message = "El campo 'level' es obligatorio")
    @Column(nullable = false)
    private String level;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    // Constructores vacíos y con parámetros requeridos por JPA
    public LogRecord() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSourceSystem() { return sourceSystem; }
    public void setSourceSystem(String sourceSystem) { this.sourceSystem = sourceSystem; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
