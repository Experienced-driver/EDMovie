package scu.edu.cn.dao;

import scu.edu.cn.domain.Catalog;

public interface CatalogMapper {
    int deleteByPrimaryKey(Integer cataId);

    int insert(Catalog record);

    int insertSelective(Catalog record);

    Catalog selectByPrimaryKey(Integer cataId);

    int updateByPrimaryKeySelective(Catalog record);

    int updateByPrimaryKey(Catalog record);
}