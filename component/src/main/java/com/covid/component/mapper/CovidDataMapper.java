package com.covid.component.mapper;

import com.covid.component.domain.CovidData;
import com.covid.component.domain.CovidDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CovidDataMapper {
    long countByExample(CovidDataExample example);

    int deleteByExample(CovidDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CovidData row);

    int insertSelective(CovidData row);

    List<CovidData> selectByExample(CovidDataExample example);

    CovidData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CovidData row, @Param("example") CovidDataExample example);

    int updateByExample(@Param("row") CovidData row, @Param("example") CovidDataExample example);

    int updateByPrimaryKeySelective(CovidData row);

    int updateByPrimaryKey(CovidData row);
}