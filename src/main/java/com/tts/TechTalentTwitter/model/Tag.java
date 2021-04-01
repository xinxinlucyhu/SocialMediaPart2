package com.tts.TechTalentTwitter.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tag
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phrase;
    
    @ManyToMany(mappedBy="tags")
    private List<Tweet> tweet;
}
