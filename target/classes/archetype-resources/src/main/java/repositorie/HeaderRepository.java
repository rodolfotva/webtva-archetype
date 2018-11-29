package ${package}.repositorie;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import ${package}.model.Header;

@Repository
public interface HeaderRepository extends MongoRepository<Header, String> {

  @Query("{'id':?0}")
  Header findByid(String id);

  @Query("{'key':?0}")
  List<Header> findByKey(String key);

}
