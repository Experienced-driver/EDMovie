package scu.edu.cn.dao;

import scu.edu.cn.domain.RecomMovie;

public interface RecomMovieMapper {
    int deleteByPrimaryKey(Integer recomMId);

    int insert(RecomMovie record);

    int insertSelective(RecomMovie record);

    RecomMovie selectByPrimaryKey(Integer recomMId);

    int updateByPrimaryKeySelective(RecomMovie record);

    int updateByPrimaryKey(RecomMovie record);
}