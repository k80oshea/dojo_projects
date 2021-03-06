package com.katieoshea.dojosninjas.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.katieoshea.dojosninjas.models.Ninja;
import com.katieoshea.dojosninjas.models.Dojo;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {

}
