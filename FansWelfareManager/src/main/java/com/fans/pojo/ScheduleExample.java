package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andScheidIsNull() {
            addCriterion("scheId is null");
            return (Criteria) this;
        }

        public Criteria andScheidIsNotNull() {
            addCriterion("scheId is not null");
            return (Criteria) this;
        }

        public Criteria andScheidEqualTo(Long value) {
            addCriterion("scheId =", value, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidNotEqualTo(Long value) {
            addCriterion("scheId <>", value, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidGreaterThan(Long value) {
            addCriterion("scheId >", value, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidGreaterThanOrEqualTo(Long value) {
            addCriterion("scheId >=", value, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidLessThan(Long value) {
            addCriterion("scheId <", value, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidLessThanOrEqualTo(Long value) {
            addCriterion("scheId <=", value, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidIn(List<Long> values) {
            addCriterion("scheId in", values, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidNotIn(List<Long> values) {
            addCriterion("scheId not in", values, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidBetween(Long value1, Long value2) {
            addCriterion("scheId between", value1, value2, "scheid");
            return (Criteria) this;
        }

        public Criteria andScheidNotBetween(Long value1, Long value2) {
            addCriterion("scheId not between", value1, value2, "scheid");
            return (Criteria) this;
        }

        public Criteria andSchetypeIsNull() {
            addCriterion("scheType is null");
            return (Criteria) this;
        }

        public Criteria andSchetypeIsNotNull() {
            addCriterion("scheType is not null");
            return (Criteria) this;
        }

        public Criteria andSchetypeEqualTo(String value) {
            addCriterion("scheType =", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeNotEqualTo(String value) {
            addCriterion("scheType <>", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeGreaterThan(String value) {
            addCriterion("scheType >", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeGreaterThanOrEqualTo(String value) {
            addCriterion("scheType >=", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeLessThan(String value) {
            addCriterion("scheType <", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeLessThanOrEqualTo(String value) {
            addCriterion("scheType <=", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeLike(String value) {
            addCriterion("scheType like", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeNotLike(String value) {
            addCriterion("scheType not like", value, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeIn(List<String> values) {
            addCriterion("scheType in", values, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeNotIn(List<String> values) {
            addCriterion("scheType not in", values, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeBetween(String value1, String value2) {
            addCriterion("scheType between", value1, value2, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchetypeNotBetween(String value1, String value2) {
            addCriterion("scheType not between", value1, value2, "schetype");
            return (Criteria) this;
        }

        public Criteria andSchenameIsNull() {
            addCriterion("scheName is null");
            return (Criteria) this;
        }

        public Criteria andSchenameIsNotNull() {
            addCriterion("scheName is not null");
            return (Criteria) this;
        }

        public Criteria andSchenameEqualTo(String value) {
            addCriterion("scheName =", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameNotEqualTo(String value) {
            addCriterion("scheName <>", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameGreaterThan(String value) {
            addCriterion("scheName >", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameGreaterThanOrEqualTo(String value) {
            addCriterion("scheName >=", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameLessThan(String value) {
            addCriterion("scheName <", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameLessThanOrEqualTo(String value) {
            addCriterion("scheName <=", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameLike(String value) {
            addCriterion("scheName like", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameNotLike(String value) {
            addCriterion("scheName not like", value, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameIn(List<String> values) {
            addCriterion("scheName in", values, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameNotIn(List<String> values) {
            addCriterion("scheName not in", values, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameBetween(String value1, String value2) {
            addCriterion("scheName between", value1, value2, "schename");
            return (Criteria) this;
        }

        public Criteria andSchenameNotBetween(String value1, String value2) {
            addCriterion("scheName not between", value1, value2, "schename");
            return (Criteria) this;
        }

        public Criteria andSchestateIsNull() {
            addCriterion("scheState is null");
            return (Criteria) this;
        }

        public Criteria andSchestateIsNotNull() {
            addCriterion("scheState is not null");
            return (Criteria) this;
        }

        public Criteria andSchestateEqualTo(String value) {
            addCriterion("scheState =", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateNotEqualTo(String value) {
            addCriterion("scheState <>", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateGreaterThan(String value) {
            addCriterion("scheState >", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateGreaterThanOrEqualTo(String value) {
            addCriterion("scheState >=", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateLessThan(String value) {
            addCriterion("scheState <", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateLessThanOrEqualTo(String value) {
            addCriterion("scheState <=", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateLike(String value) {
            addCriterion("scheState like", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateNotLike(String value) {
            addCriterion("scheState not like", value, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateIn(List<String> values) {
            addCriterion("scheState in", values, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateNotIn(List<String> values) {
            addCriterion("scheState not in", values, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateBetween(String value1, String value2) {
            addCriterion("scheState between", value1, value2, "schestate");
            return (Criteria) this;
        }

        public Criteria andSchestateNotBetween(String value1, String value2) {
            addCriterion("scheState not between", value1, value2, "schestate");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isValid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isValid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Integer value) {
            addCriterion("isValid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Integer value) {
            addCriterion("isValid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Integer value) {
            addCriterion("isValid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("isValid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Integer value) {
            addCriterion("isValid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Integer value) {
            addCriterion("isValid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Integer> values) {
            addCriterion("isValid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Integer> values) {
            addCriterion("isValid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Integer value1, Integer value2) {
            addCriterion("isValid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("isValid not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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