package cn.mwee.auto.deploy.dao;

import cn.mwee.auto.deploy.model.FlowStrategy;
import cn.mwee.auto.deploy.model.FlowStrategyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowStrategyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int countByExample(FlowStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int deleteByExample(FlowStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int insert(FlowStrategy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int insertSelective(FlowStrategy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    List<FlowStrategy> selectByExample(FlowStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    FlowStrategy selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FlowStrategy record, @Param("example") FlowStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FlowStrategy record, @Param("example") FlowStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FlowStrategy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow_strategy
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FlowStrategy record);
}