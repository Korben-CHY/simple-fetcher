package com.covid.component.mapper;

import com.covid.component.domain.ReadhubDailyNewsAgg;
import com.covid.component.domain.ReadhubDailyNewsAggExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadhubDailyNewsAggMapper {
    long countByExample(ReadhubDailyNewsAggExample example);

    int deleteByExample(ReadhubDailyNewsAggExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReadhubDailyNewsAgg row);

    int insertSelective(ReadhubDailyNewsAgg row);

    List<ReadhubDailyNewsAgg> selectByExample(ReadhubDailyNewsAggExample example);

    ReadhubDailyNewsAgg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ReadhubDailyNewsAgg row, @Param("example") ReadhubDailyNewsAggExample example);

    int updateByExample(@Param("row") ReadhubDailyNewsAgg row, @Param("example") ReadhubDailyNewsAggExample example);

    int updateByPrimaryKeySelective(ReadhubDailyNewsAgg row);

    int updateByPrimaryKey(ReadhubDailyNewsAgg row);
}