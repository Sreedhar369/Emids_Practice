package com.emids.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.emids.Model.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

}
