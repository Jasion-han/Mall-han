package com.net.han.mapper;

import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * @author han @Date 2024/10/27 18:06
 */

public interface BaseMapper<K, V> {

    List<K> searchByCondition(V v) throws DataAccessException;
}
