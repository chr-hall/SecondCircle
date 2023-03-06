package com.example.SHSWEDEN.ElasticRepos;

import com.example.SHSWEDEN.Entities.Listing;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListRepo extends ElasticsearchRepository<Listing, Integer> {

    List<Listing> findByDescriptionOrTitle(@Param("keyword") String keyword, @Param("keyword") String keyword2);
}
