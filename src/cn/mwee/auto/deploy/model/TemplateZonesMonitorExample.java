package cn.mwee.auto.deploy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TemplateZonesMonitorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public TemplateZonesMonitorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNull() {
            addCriterion("templateId is null");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion("templateId is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo(Integer value) {
            addCriterion("templateId =", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo(Integer value) {
            addCriterion("templateId <>", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan(Integer value) {
            addCriterion("templateId >", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("templateId >=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan(Integer value) {
            addCriterion("templateId <", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo(Integer value) {
            addCriterion("templateId <=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIn(List<Integer> values) {
            addCriterion("templateId in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn(List<Integer> values) {
            addCriterion("templateId not in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween(Integer value1, Integer value2) {
            addCriterion("templateId between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween(Integer value1, Integer value2) {
            addCriterion("templateId not between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andMonitorshellIsNull() {
            addCriterion("monitorShell is null");
            return (Criteria) this;
        }

        public Criteria andMonitorshellIsNotNull() {
            addCriterion("monitorShell is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorshellEqualTo(String value) {
            addCriterion("monitorShell =", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellNotEqualTo(String value) {
            addCriterion("monitorShell <>", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellGreaterThan(String value) {
            addCriterion("monitorShell >", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellGreaterThanOrEqualTo(String value) {
            addCriterion("monitorShell >=", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellLessThan(String value) {
            addCriterion("monitorShell <", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellLessThanOrEqualTo(String value) {
            addCriterion("monitorShell <=", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellLike(String value) {
            addCriterion("monitorShell like", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellNotLike(String value) {
            addCriterion("monitorShell not like", value, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellIn(List<String> values) {
            addCriterion("monitorShell in", values, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellNotIn(List<String> values) {
            addCriterion("monitorShell not in", values, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellBetween(String value1, String value2) {
            addCriterion("monitorShell between", value1, value2, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitorshellNotBetween(String value1, String value2) {
            addCriterion("monitorShell not between", value1, value2, "monitorshell");
            return (Criteria) this;
        }

        public Criteria andMonitoruserIsNull() {
            addCriterion("monitorUser is null");
            return (Criteria) this;
        }

        public Criteria andMonitoruserIsNotNull() {
            addCriterion("monitorUser is not null");
            return (Criteria) this;
        }

        public Criteria andMonitoruserEqualTo(String value) {
            addCriterion("monitorUser =", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserNotEqualTo(String value) {
            addCriterion("monitorUser <>", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserGreaterThan(String value) {
            addCriterion("monitorUser >", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserGreaterThanOrEqualTo(String value) {
            addCriterion("monitorUser >=", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserLessThan(String value) {
            addCriterion("monitorUser <", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserLessThanOrEqualTo(String value) {
            addCriterion("monitorUser <=", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserLike(String value) {
            addCriterion("monitorUser like", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserNotLike(String value) {
            addCriterion("monitorUser not like", value, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserIn(List<String> values) {
            addCriterion("monitorUser in", values, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserNotIn(List<String> values) {
            addCriterion("monitorUser not in", values, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserBetween(String value1, String value2) {
            addCriterion("monitorUser between", value1, value2, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitoruserNotBetween(String value1, String value2) {
            addCriterion("monitorUser not between", value1, value2, "monitoruser");
            return (Criteria) this;
        }

        public Criteria andMonitorreqIsNull() {
            addCriterion("monitorReq is null");
            return (Criteria) this;
        }

        public Criteria andMonitorreqIsNotNull() {
            addCriterion("monitorReq is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorreqEqualTo(String value) {
            addCriterion("monitorReq =", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqNotEqualTo(String value) {
            addCriterion("monitorReq <>", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqGreaterThan(String value) {
            addCriterion("monitorReq >", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqGreaterThanOrEqualTo(String value) {
            addCriterion("monitorReq >=", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqLessThan(String value) {
            addCriterion("monitorReq <", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqLessThanOrEqualTo(String value) {
            addCriterion("monitorReq <=", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqLike(String value) {
            addCriterion("monitorReq like", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqNotLike(String value) {
            addCriterion("monitorReq not like", value, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqIn(List<String> values) {
            addCriterion("monitorReq in", values, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqNotIn(List<String> values) {
            addCriterion("monitorReq not in", values, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqBetween(String value1, String value2) {
            addCriterion("monitorReq between", value1, value2, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitorreqNotBetween(String value1, String value2) {
            addCriterion("monitorReq not between", value1, value2, "monitorreq");
            return (Criteria) this;
        }

        public Criteria andMonitortypeIsNull() {
            addCriterion("monitorType is null");
            return (Criteria) this;
        }

        public Criteria andMonitortypeIsNotNull() {
            addCriterion("monitorType is not null");
            return (Criteria) this;
        }

        public Criteria andMonitortypeEqualTo(Byte value) {
            addCriterion("monitorType =", value, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeNotEqualTo(Byte value) {
            addCriterion("monitorType <>", value, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeGreaterThan(Byte value) {
            addCriterion("monitorType >", value, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("monitorType >=", value, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeLessThan(Byte value) {
            addCriterion("monitorType <", value, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeLessThanOrEqualTo(Byte value) {
            addCriterion("monitorType <=", value, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeIn(List<Byte> values) {
            addCriterion("monitorType in", values, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeNotIn(List<Byte> values) {
            addCriterion("monitorType not in", values, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeBetween(Byte value1, Byte value2) {
            addCriterion("monitorType between", value1, value2, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitortypeNotBetween(Byte value1, Byte value2) {
            addCriterion("monitorType not between", value1, value2, "monitortype");
            return (Criteria) this;
        }

        public Criteria andMonitorparamIsNull() {
            addCriterion("monitorParam is null");
            return (Criteria) this;
        }

        public Criteria andMonitorparamIsNotNull() {
            addCriterion("monitorParam is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorparamEqualTo(String value) {
            addCriterion("monitorParam =", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamNotEqualTo(String value) {
            addCriterion("monitorParam <>", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamGreaterThan(String value) {
            addCriterion("monitorParam >", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamGreaterThanOrEqualTo(String value) {
            addCriterion("monitorParam >=", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamLessThan(String value) {
            addCriterion("monitorParam <", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamLessThanOrEqualTo(String value) {
            addCriterion("monitorParam <=", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamLike(String value) {
            addCriterion("monitorParam like", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamNotLike(String value) {
            addCriterion("monitorParam not like", value, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamIn(List<String> values) {
            addCriterion("monitorParam in", values, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamNotIn(List<String> values) {
            addCriterion("monitorParam not in", values, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamBetween(String value1, String value2) {
            addCriterion("monitorParam between", value1, value2, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andMonitorparamNotBetween(String value1, String value2) {
            addCriterion("monitorParam not between", value1, value2, "monitorparam");
            return (Criteria) this;
        }

        public Criteria andInuseIsNull() {
            addCriterion("inUse is null");
            return (Criteria) this;
        }

        public Criteria andInuseIsNotNull() {
            addCriterion("inUse is not null");
            return (Criteria) this;
        }

        public Criteria andInuseEqualTo(Byte value) {
            addCriterion("inUse =", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseNotEqualTo(Byte value) {
            addCriterion("inUse <>", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseGreaterThan(Byte value) {
            addCriterion("inUse >", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseGreaterThanOrEqualTo(Byte value) {
            addCriterion("inUse >=", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseLessThan(Byte value) {
            addCriterion("inUse <", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseLessThanOrEqualTo(Byte value) {
            addCriterion("inUse <=", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseIn(List<Byte> values) {
            addCriterion("inUse in", values, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseNotIn(List<Byte> values) {
            addCriterion("inUse not in", values, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseBetween(Byte value1, Byte value2) {
            addCriterion("inUse between", value1, value2, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseNotBetween(Byte value1, Byte value2) {
            addCriterion("inUse not between", value1, value2, "inuse");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table template_zones_monitor
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table template_zones_monitor
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}