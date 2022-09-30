package com.sts.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.sts.rest.entity.Orders;

public interface orderRepository extends CrudRepository<Orders, Integer>{

}
