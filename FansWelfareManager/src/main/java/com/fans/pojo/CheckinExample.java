package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckinExample() {
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

        public Criteria andPlayeridIsNull() {
            addCriterion("playerId is null");
            return (Criteria) this;
        }

        public Criteria andPlayeridIsNotNull() {
            addCriterion("playerId is not null");
            return (Criteria) this;
        }

        public Criteria andPlayeridEqualTo(Long value) {
            addCriterion("playerId =", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotEqualTo(Long value) {
            addCriterion("playerId <>", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridGreaterThan(Long value) {
            addCriterion("playerId >", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridGreaterThanOrEqualTo(Long value) {
            addCriterion("playerId >=", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridLessThan(Long value) {
            addCriterion("playerId <", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridLessThanOrEqualTo(Long value) {
            addCriterion("playerId <=", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridIn(List<Long> values) {
            addCriterion("playerId in", values, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotIn(List<Long> values) {
            addCriterion("playerId not in", values, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridBetween(Long value1, Long value2) {
            addCriterion("playerId between", value1, value2, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotBetween(Long value1, Long value2) {
            addCriterion("playerId not between", value1, value2, "playerid");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andCheckindateIsNull() {
            addCriterion("checkinDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckindateIsNotNull() {
            addCriterion("checkinDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckindateEqualTo(String value) {
            addCriterion("checkinDate =", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateNotEqualTo(String value) {
            addCriterion("checkinDate <>", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateGreaterThan(String value) {
            addCriterion("checkinDate >", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateGreaterThanOrEqualTo(String value) {
            addCriterion("checkinDate >=", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateLessThan(String value) {
            addCriterion("checkinDate <", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateLessThanOrEqualTo(String value) {
            addCriterion("checkinDate <=", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateLike(String value) {
            addCriterion("checkinDate like", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateNotLike(String value) {
            addCriterion("checkinDate not like", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateIn(List<String> values) {
            addCriterion("checkinDate in", values, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateNotIn(List<String> values) {
            addCriterion("checkinDate not in", values, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateBetween(String value1, String value2) {
            addCriterion("checkinDate between", value1, value2, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateNotBetween(String value1, String value2) {
            addCriterion("checkinDate not between", value1, value2, "checkindate");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysIsNull() {
            addCriterion("consecutiveDays is null");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysIsNotNull() {
            addCriterion("consecutiveDays is not null");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysEqualTo(Integer value) {
            addCriterion("consecutiveDays =", value, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysNotEqualTo(Integer value) {
            addCriterion("consecutiveDays <>", value, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysGreaterThan(Integer value) {
            addCriterion("consecutiveDays >", value, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("consecutiveDays >=", value, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysLessThan(Integer value) {
            addCriterion("consecutiveDays <", value, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysLessThanOrEqualTo(Integer value) {
            addCriterion("consecutiveDays <=", value, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysIn(List<Integer> values) {
            addCriterion("consecutiveDays in", values, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysNotIn(List<Integer> values) {
            addCriterion("consecutiveDays not in", values, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysBetween(Integer value1, Integer value2) {
            addCriterion("consecutiveDays between", value1, value2, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andConsecutivedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("consecutiveDays not between", value1, value2, "consecutivedays");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
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