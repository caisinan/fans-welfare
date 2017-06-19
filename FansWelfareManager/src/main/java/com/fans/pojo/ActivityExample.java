package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andActividIsNull() {
            addCriterion("activId is null");
            return (Criteria) this;
        }

        public Criteria andActividIsNotNull() {
            addCriterion("activId is not null");
            return (Criteria) this;
        }

        public Criteria andActividEqualTo(Long value) {
            addCriterion("activId =", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividNotEqualTo(Long value) {
            addCriterion("activId <>", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividGreaterThan(Long value) {
            addCriterion("activId >", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividGreaterThanOrEqualTo(Long value) {
            addCriterion("activId >=", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividLessThan(Long value) {
            addCriterion("activId <", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividLessThanOrEqualTo(Long value) {
            addCriterion("activId <=", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividIn(List<Long> values) {
            addCriterion("activId in", values, "activid");
            return (Criteria) this;
        }

        public Criteria andActividNotIn(List<Long> values) {
            addCriterion("activId not in", values, "activid");
            return (Criteria) this;
        }

        public Criteria andActividBetween(Long value1, Long value2) {
            addCriterion("activId between", value1, value2, "activid");
            return (Criteria) this;
        }

        public Criteria andActividNotBetween(Long value1, Long value2) {
            addCriterion("activId not between", value1, value2, "activid");
            return (Criteria) this;
        }

        public Criteria andActivcodeIsNull() {
            addCriterion("activCode is null");
            return (Criteria) this;
        }

        public Criteria andActivcodeIsNotNull() {
            addCriterion("activCode is not null");
            return (Criteria) this;
        }

        public Criteria andActivcodeEqualTo(String value) {
            addCriterion("activCode =", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeNotEqualTo(String value) {
            addCriterion("activCode <>", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeGreaterThan(String value) {
            addCriterion("activCode >", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeGreaterThanOrEqualTo(String value) {
            addCriterion("activCode >=", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeLessThan(String value) {
            addCriterion("activCode <", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeLessThanOrEqualTo(String value) {
            addCriterion("activCode <=", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeLike(String value) {
            addCriterion("activCode like", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeNotLike(String value) {
            addCriterion("activCode not like", value, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeIn(List<String> values) {
            addCriterion("activCode in", values, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeNotIn(List<String> values) {
            addCriterion("activCode not in", values, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeBetween(String value1, String value2) {
            addCriterion("activCode between", value1, value2, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivcodeNotBetween(String value1, String value2) {
            addCriterion("activCode not between", value1, value2, "activcode");
            return (Criteria) this;
        }

        public Criteria andActivstateIsNull() {
            addCriterion("activState is null");
            return (Criteria) this;
        }

        public Criteria andActivstateIsNotNull() {
            addCriterion("activState is not null");
            return (Criteria) this;
        }

        public Criteria andActivstateEqualTo(String value) {
            addCriterion("activState =", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateNotEqualTo(String value) {
            addCriterion("activState <>", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateGreaterThan(String value) {
            addCriterion("activState >", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateGreaterThanOrEqualTo(String value) {
            addCriterion("activState >=", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateLessThan(String value) {
            addCriterion("activState <", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateLessThanOrEqualTo(String value) {
            addCriterion("activState <=", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateLike(String value) {
            addCriterion("activState like", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateNotLike(String value) {
            addCriterion("activState not like", value, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateIn(List<String> values) {
            addCriterion("activState in", values, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateNotIn(List<String> values) {
            addCriterion("activState not in", values, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateBetween(String value1, String value2) {
            addCriterion("activState between", value1, value2, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivstateNotBetween(String value1, String value2) {
            addCriterion("activState not between", value1, value2, "activstate");
            return (Criteria) this;
        }

        public Criteria andActivtypeIsNull() {
            addCriterion("activType is null");
            return (Criteria) this;
        }

        public Criteria andActivtypeIsNotNull() {
            addCriterion("activType is not null");
            return (Criteria) this;
        }

        public Criteria andActivtypeEqualTo(String value) {
            addCriterion("activType =", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeNotEqualTo(String value) {
            addCriterion("activType <>", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeGreaterThan(String value) {
            addCriterion("activType >", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeGreaterThanOrEqualTo(String value) {
            addCriterion("activType >=", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeLessThan(String value) {
            addCriterion("activType <", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeLessThanOrEqualTo(String value) {
            addCriterion("activType <=", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeLike(String value) {
            addCriterion("activType like", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeNotLike(String value) {
            addCriterion("activType not like", value, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeIn(List<String> values) {
            addCriterion("activType in", values, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeNotIn(List<String> values) {
            addCriterion("activType not in", values, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeBetween(String value1, String value2) {
            addCriterion("activType between", value1, value2, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivtypeNotBetween(String value1, String value2) {
            addCriterion("activType not between", value1, value2, "activtype");
            return (Criteria) this;
        }

        public Criteria andActivnameIsNull() {
            addCriterion("activName is null");
            return (Criteria) this;
        }

        public Criteria andActivnameIsNotNull() {
            addCriterion("activName is not null");
            return (Criteria) this;
        }

        public Criteria andActivnameEqualTo(String value) {
            addCriterion("activName =", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameNotEqualTo(String value) {
            addCriterion("activName <>", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameGreaterThan(String value) {
            addCriterion("activName >", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameGreaterThanOrEqualTo(String value) {
            addCriterion("activName >=", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameLessThan(String value) {
            addCriterion("activName <", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameLessThanOrEqualTo(String value) {
            addCriterion("activName <=", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameLike(String value) {
            addCriterion("activName like", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameNotLike(String value) {
            addCriterion("activName not like", value, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameIn(List<String> values) {
            addCriterion("activName in", values, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameNotIn(List<String> values) {
            addCriterion("activName not in", values, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameBetween(String value1, String value2) {
            addCriterion("activName between", value1, value2, "activname");
            return (Criteria) this;
        }

        public Criteria andActivnameNotBetween(String value1, String value2) {
            addCriterion("activName not between", value1, value2, "activname");
            return (Criteria) this;
        }

        public Criteria andActivdateIsNull() {
            addCriterion("activDate is null");
            return (Criteria) this;
        }

        public Criteria andActivdateIsNotNull() {
            addCriterion("activDate is not null");
            return (Criteria) this;
        }

        public Criteria andActivdateEqualTo(String value) {
            addCriterion("activDate =", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateNotEqualTo(String value) {
            addCriterion("activDate <>", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateGreaterThan(String value) {
            addCriterion("activDate >", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateGreaterThanOrEqualTo(String value) {
            addCriterion("activDate >=", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateLessThan(String value) {
            addCriterion("activDate <", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateLessThanOrEqualTo(String value) {
            addCriterion("activDate <=", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateLike(String value) {
            addCriterion("activDate like", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateNotLike(String value) {
            addCriterion("activDate not like", value, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateIn(List<String> values) {
            addCriterion("activDate in", values, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateNotIn(List<String> values) {
            addCriterion("activDate not in", values, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateBetween(String value1, String value2) {
            addCriterion("activDate between", value1, value2, "activdate");
            return (Criteria) this;
        }

        public Criteria andActivdateNotBetween(String value1, String value2) {
            addCriterion("activDate not between", value1, value2, "activdate");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNull() {
            addCriterion("organizer is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNotNull() {
            addCriterion("organizer is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerEqualTo(String value) {
            addCriterion("organizer =", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotEqualTo(String value) {
            addCriterion("organizer <>", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThan(String value) {
            addCriterion("organizer >", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThanOrEqualTo(String value) {
            addCriterion("organizer >=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThan(String value) {
            addCriterion("organizer <", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThanOrEqualTo(String value) {
            addCriterion("organizer <=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLike(String value) {
            addCriterion("organizer like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotLike(String value) {
            addCriterion("organizer not like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerIn(List<String> values) {
            addCriterion("organizer in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotIn(List<String> values) {
            addCriterion("organizer not in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerBetween(String value1, String value2) {
            addCriterion("organizer between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotBetween(String value1, String value2) {
            addCriterion("organizer not between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
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

        public Criteria andVerifytimeIsNull() {
            addCriterion("verifyTime is null");
            return (Criteria) this;
        }

        public Criteria andVerifytimeIsNotNull() {
            addCriterion("verifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andVerifytimeEqualTo(Date value) {
            addCriterion("verifyTime =", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeNotEqualTo(Date value) {
            addCriterion("verifyTime <>", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeGreaterThan(Date value) {
            addCriterion("verifyTime >", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verifyTime >=", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeLessThan(Date value) {
            addCriterion("verifyTime <", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeLessThanOrEqualTo(Date value) {
            addCriterion("verifyTime <=", value, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeIn(List<Date> values) {
            addCriterion("verifyTime in", values, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeNotIn(List<Date> values) {
            addCriterion("verifyTime not in", values, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeBetween(Date value1, Date value2) {
            addCriterion("verifyTime between", value1, value2, "verifytime");
            return (Criteria) this;
        }

        public Criteria andVerifytimeNotBetween(Date value1, Date value2) {
            addCriterion("verifyTime not between", value1, value2, "verifytime");
            return (Criteria) this;
        }

        public Criteria andPartnernumIsNull() {
            addCriterion("partnerNum is null");
            return (Criteria) this;
        }

        public Criteria andPartnernumIsNotNull() {
            addCriterion("partnerNum is not null");
            return (Criteria) this;
        }

        public Criteria andPartnernumEqualTo(Integer value) {
            addCriterion("partnerNum =", value, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumNotEqualTo(Integer value) {
            addCriterion("partnerNum <>", value, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumGreaterThan(Integer value) {
            addCriterion("partnerNum >", value, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("partnerNum >=", value, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumLessThan(Integer value) {
            addCriterion("partnerNum <", value, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumLessThanOrEqualTo(Integer value) {
            addCriterion("partnerNum <=", value, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumIn(List<Integer> values) {
            addCriterion("partnerNum in", values, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumNotIn(List<Integer> values) {
            addCriterion("partnerNum not in", values, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumBetween(Integer value1, Integer value2) {
            addCriterion("partnerNum between", value1, value2, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPartnernumNotBetween(Integer value1, Integer value2) {
            addCriterion("partnerNum not between", value1, value2, "partnernum");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivIsNull() {
            addCriterion("prepNumActiv is null");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivIsNotNull() {
            addCriterion("prepNumActiv is not null");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivEqualTo(Integer value) {
            addCriterion("prepNumActiv =", value, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivNotEqualTo(Integer value) {
            addCriterion("prepNumActiv <>", value, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivGreaterThan(Integer value) {
            addCriterion("prepNumActiv >", value, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivGreaterThanOrEqualTo(Integer value) {
            addCriterion("prepNumActiv >=", value, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivLessThan(Integer value) {
            addCriterion("prepNumActiv <", value, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivLessThanOrEqualTo(Integer value) {
            addCriterion("prepNumActiv <=", value, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivIn(List<Integer> values) {
            addCriterion("prepNumActiv in", values, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivNotIn(List<Integer> values) {
            addCriterion("prepNumActiv not in", values, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivBetween(Integer value1, Integer value2) {
            addCriterion("prepNumActiv between", value1, value2, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepnumactivNotBetween(Integer value1, Integer value2) {
            addCriterion("prepNumActiv not between", value1, value2, "prepnumactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivIsNull() {
            addCriterion("prepMoneyActiv is null");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivIsNotNull() {
            addCriterion("prepMoneyActiv is not null");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivEqualTo(Double value) {
            addCriterion("prepMoneyActiv =", value, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivNotEqualTo(Double value) {
            addCriterion("prepMoneyActiv <>", value, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivGreaterThan(Double value) {
            addCriterion("prepMoneyActiv >", value, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivGreaterThanOrEqualTo(Double value) {
            addCriterion("prepMoneyActiv >=", value, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivLessThan(Double value) {
            addCriterion("prepMoneyActiv <", value, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivLessThanOrEqualTo(Double value) {
            addCriterion("prepMoneyActiv <=", value, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivIn(List<Double> values) {
            addCriterion("prepMoneyActiv in", values, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivNotIn(List<Double> values) {
            addCriterion("prepMoneyActiv not in", values, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivBetween(Double value1, Double value2) {
            addCriterion("prepMoneyActiv between", value1, value2, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andPrepmoneyactivNotBetween(Double value1, Double value2) {
            addCriterion("prepMoneyActiv not between", value1, value2, "prepmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivIsNull() {
            addCriterion("realNumActiv is null");
            return (Criteria) this;
        }

        public Criteria andRealnumactivIsNotNull() {
            addCriterion("realNumActiv is not null");
            return (Criteria) this;
        }

        public Criteria andRealnumactivEqualTo(Integer value) {
            addCriterion("realNumActiv =", value, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivNotEqualTo(Integer value) {
            addCriterion("realNumActiv <>", value, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivGreaterThan(Integer value) {
            addCriterion("realNumActiv >", value, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivGreaterThanOrEqualTo(Integer value) {
            addCriterion("realNumActiv >=", value, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivLessThan(Integer value) {
            addCriterion("realNumActiv <", value, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivLessThanOrEqualTo(Integer value) {
            addCriterion("realNumActiv <=", value, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivIn(List<Integer> values) {
            addCriterion("realNumActiv in", values, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivNotIn(List<Integer> values) {
            addCriterion("realNumActiv not in", values, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivBetween(Integer value1, Integer value2) {
            addCriterion("realNumActiv between", value1, value2, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealnumactivNotBetween(Integer value1, Integer value2) {
            addCriterion("realNumActiv not between", value1, value2, "realnumactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivIsNull() {
            addCriterion("realMoneyActiv is null");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivIsNotNull() {
            addCriterion("realMoneyActiv is not null");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivEqualTo(Double value) {
            addCriterion("realMoneyActiv =", value, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivNotEqualTo(Double value) {
            addCriterion("realMoneyActiv <>", value, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivGreaterThan(Double value) {
            addCriterion("realMoneyActiv >", value, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivGreaterThanOrEqualTo(Double value) {
            addCriterion("realMoneyActiv >=", value, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivLessThan(Double value) {
            addCriterion("realMoneyActiv <", value, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivLessThanOrEqualTo(Double value) {
            addCriterion("realMoneyActiv <=", value, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivIn(List<Double> values) {
            addCriterion("realMoneyActiv in", values, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivNotIn(List<Double> values) {
            addCriterion("realMoneyActiv not in", values, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivBetween(Double value1, Double value2) {
            addCriterion("realMoneyActiv between", value1, value2, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRealmoneyactivNotBetween(Double value1, Double value2) {
            addCriterion("realMoneyActiv not between", value1, value2, "realmoneyactiv");
            return (Criteria) this;
        }

        public Criteria andRushtimesIsNull() {
            addCriterion("rushTimes is null");
            return (Criteria) this;
        }

        public Criteria andRushtimesIsNotNull() {
            addCriterion("rushTimes is not null");
            return (Criteria) this;
        }

        public Criteria andRushtimesEqualTo(Long value) {
            addCriterion("rushTimes =", value, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesNotEqualTo(Long value) {
            addCriterion("rushTimes <>", value, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesGreaterThan(Long value) {
            addCriterion("rushTimes >", value, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesGreaterThanOrEqualTo(Long value) {
            addCriterion("rushTimes >=", value, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesLessThan(Long value) {
            addCriterion("rushTimes <", value, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesLessThanOrEqualTo(Long value) {
            addCriterion("rushTimes <=", value, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesIn(List<Long> values) {
            addCriterion("rushTimes in", values, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesNotIn(List<Long> values) {
            addCriterion("rushTimes not in", values, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesBetween(Long value1, Long value2) {
            addCriterion("rushTimes between", value1, value2, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andRushtimesNotBetween(Long value1, Long value2) {
            addCriterion("rushTimes not between", value1, value2, "rushtimes");
            return (Criteria) this;
        }

        public Criteria andOnetimeIsNull() {
            addCriterion("oneTime is null");
            return (Criteria) this;
        }

        public Criteria andOnetimeIsNotNull() {
            addCriterion("oneTime is not null");
            return (Criteria) this;
        }

        public Criteria andOnetimeEqualTo(Integer value) {
            addCriterion("oneTime =", value, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeNotEqualTo(Integer value) {
            addCriterion("oneTime <>", value, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeGreaterThan(Integer value) {
            addCriterion("oneTime >", value, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("oneTime >=", value, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeLessThan(Integer value) {
            addCriterion("oneTime <", value, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeLessThanOrEqualTo(Integer value) {
            addCriterion("oneTime <=", value, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeIn(List<Integer> values) {
            addCriterion("oneTime in", values, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeNotIn(List<Integer> values) {
            addCriterion("oneTime not in", values, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeBetween(Integer value1, Integer value2) {
            addCriterion("oneTime between", value1, value2, "onetime");
            return (Criteria) this;
        }

        public Criteria andOnetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("oneTime not between", value1, value2, "onetime");
            return (Criteria) this;
        }

        public Criteria andTwotimesIsNull() {
            addCriterion("twoTimes is null");
            return (Criteria) this;
        }

        public Criteria andTwotimesIsNotNull() {
            addCriterion("twoTimes is not null");
            return (Criteria) this;
        }

        public Criteria andTwotimesEqualTo(Integer value) {
            addCriterion("twoTimes =", value, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesNotEqualTo(Integer value) {
            addCriterion("twoTimes <>", value, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesGreaterThan(Integer value) {
            addCriterion("twoTimes >", value, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("twoTimes >=", value, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesLessThan(Integer value) {
            addCriterion("twoTimes <", value, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesLessThanOrEqualTo(Integer value) {
            addCriterion("twoTimes <=", value, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesIn(List<Integer> values) {
            addCriterion("twoTimes in", values, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesNotIn(List<Integer> values) {
            addCriterion("twoTimes not in", values, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesBetween(Integer value1, Integer value2) {
            addCriterion("twoTimes between", value1, value2, "twotimes");
            return (Criteria) this;
        }

        public Criteria andTwotimesNotBetween(Integer value1, Integer value2) {
            addCriterion("twoTimes not between", value1, value2, "twotimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesIsNull() {
            addCriterion("threeTimes is null");
            return (Criteria) this;
        }

        public Criteria andThreetimesIsNotNull() {
            addCriterion("threeTimes is not null");
            return (Criteria) this;
        }

        public Criteria andThreetimesEqualTo(Integer value) {
            addCriterion("threeTimes =", value, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesNotEqualTo(Integer value) {
            addCriterion("threeTimes <>", value, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesGreaterThan(Integer value) {
            addCriterion("threeTimes >", value, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("threeTimes >=", value, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesLessThan(Integer value) {
            addCriterion("threeTimes <", value, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesLessThanOrEqualTo(Integer value) {
            addCriterion("threeTimes <=", value, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesIn(List<Integer> values) {
            addCriterion("threeTimes in", values, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesNotIn(List<Integer> values) {
            addCriterion("threeTimes not in", values, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesBetween(Integer value1, Integer value2) {
            addCriterion("threeTimes between", value1, value2, "threetimes");
            return (Criteria) this;
        }

        public Criteria andThreetimesNotBetween(Integer value1, Integer value2) {
            addCriterion("threeTimes not between", value1, value2, "threetimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesIsNull() {
            addCriterion("fourTimes is null");
            return (Criteria) this;
        }

        public Criteria andFourtimesIsNotNull() {
            addCriterion("fourTimes is not null");
            return (Criteria) this;
        }

        public Criteria andFourtimesEqualTo(Integer value) {
            addCriterion("fourTimes =", value, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesNotEqualTo(Integer value) {
            addCriterion("fourTimes <>", value, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesGreaterThan(Integer value) {
            addCriterion("fourTimes >", value, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("fourTimes >=", value, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesLessThan(Integer value) {
            addCriterion("fourTimes <", value, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesLessThanOrEqualTo(Integer value) {
            addCriterion("fourTimes <=", value, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesIn(List<Integer> values) {
            addCriterion("fourTimes in", values, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesNotIn(List<Integer> values) {
            addCriterion("fourTimes not in", values, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesBetween(Integer value1, Integer value2) {
            addCriterion("fourTimes between", value1, value2, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andFourtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("fourTimes not between", value1, value2, "fourtimes");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("remark4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("remark4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("remark4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("remark4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("remark4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("remark4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("remark4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("remark4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("remark4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("remark4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("remark4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("remark4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("remark4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("remark4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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