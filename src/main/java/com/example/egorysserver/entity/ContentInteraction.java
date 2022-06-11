package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "content_interaction")
public class ContentInteraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contentinteraction_id;
    @ManyToOne
    @JoinColumn(name = "uid", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "content_id", nullable = false)
    private Content content;
    @ManyToOne
    @JoinColumn(name = "reaction_type_id", nullable = false)
    private ReactionType reactionType;

    public ContentInteraction() {
    }
}
