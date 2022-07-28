package com.covid.component.mapper;

import com.covid.component.domain.ReadhubDailyNews;
import com.covid.component.domain.ReadhubDailyNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadhubDailyNewsMapper {
    long countByExample(ReadhubDailyNewsExample example);

    int deleteByExample(ReadhubDailyNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReadhubDailyNews row);

    int insertSelective(ReadhubDailyNews row);

    List<ReadhubDailyNews> selectByExample(ReadhubDailyNewsExample example);

    ReadhubDailyNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ReadhubDailyNews row, @Param("example") ReadhubDailyNewsExample example);

    int updateByExample(@Param("row") ReadhubDailyNews row, @Param("example") ReadhubDailyNewsExample example);

    int updateByPrimaryKeySelective(ReadhubDailyNews row);

    int updateByPrimaryKey(ReadhubDailyNews row);
}