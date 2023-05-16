package ru.tinkoff.edu.java.scrapper.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;

@Entity
@DynamicInsert
@Table(name = "link", schema = "link_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    , generator = "link_seq")
//    @SequenceGenerator(name = "link_seq", sequenceName = "link_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "url")
    private String url;

    @Column(name = "type")
    private String type;

    //    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update")
    private OffsetDateTime lastUpdate;

    @Column(name = "last_check")
    private OffsetDateTime lastCheck;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_id")
    @ToString.Exclude
    private Chat chat;
}
