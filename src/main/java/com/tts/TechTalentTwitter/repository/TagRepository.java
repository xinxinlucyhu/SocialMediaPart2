package com.tts.TechTalentTwitter.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.tts.TechTalentTwitter.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>
{
    Tag findByPhrase(String phrase);
}
