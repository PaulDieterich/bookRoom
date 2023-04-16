package de.die.bookbackend.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
@MappedSuperclass
public class Media {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Id
    @SequenceGenerator(name = "media_id_seq", sequenceName = "media_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "media_id_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @UpdateTimestamp
    @Column(nullable = false)
    private Instant modifiedAt;

    @CreationTimestamp
    @Column(nullable = false)
    private Instant createdAt;

}