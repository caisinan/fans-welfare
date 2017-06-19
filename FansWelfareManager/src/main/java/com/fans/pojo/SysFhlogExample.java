package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysFhlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFhlogExample() {
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

        public Criteria andFhlogIdIsNull() {
            addCriterion("FHLOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andFhlogIdIsNotNull() {
            addCriterion("FHLOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFhlogIdEqualTo(String value) {
            addCriterion("FHLOG_ID =", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdNotEqualTo(String value) {
            addCriterion("FHLOG_ID <>", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdGreaterThan(String value) {
            addCriterion("FHLOG_ID >", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("FHLOG_ID >=", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdLessThan(String value) {
            addCriterion("FHLOG_ID <", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdLessThanOrEqualTo(String value) {
            addCriterion("FHLOG_ID <=", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdLike(String value) {
            addCriterion("FHLOG_ID like", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdNotLike(String value) {
            addCriterion("FHLOG_ID not like", value, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdIn(List<String> values) {
            addCriterion("FHLOG_ID in", values, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdNotIn(List<String> values) {
            addCriterion("FHLOG_ID not in", values, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdBetween(String value1, String value2) {
            addCriterion("FHLOG_ID between", value1, value2, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andFhlogIdNotBetween(String value1, String value2) {
            addCriterion("FHLOG_ID not between", value1, value2, "fhlogId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCztimeIsNull() {
            addCriterion("CZTIME is null");
            return (Criteria) this;
        }

        public Criteria andCztimeIsNotNull() {
            addCriterion("CZTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCztimeEqualTo(String value) {
            addCriterion("CZTIME =", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeNotEqualTo(String value) {
            addCriterion("CZTIME <>", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeGreaterThan(String value) {
            addCriterion("CZTIME >", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeGreaterThanOrEqualTo(String value) {
            addCriterion("CZTIME >=", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeLessThan(String value) {
            addCriterion("CZTIME <", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeLessThanOrEqualTo(String value) {
            addCriterion("CZTIME <=", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeLike(String value) {
            addCriterion("CZTIME like", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeNotLike(String value) {
            addCriterion("CZTIME not like", value, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeIn(List<String> values) {
            addCriterion("CZTIME in", values, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeNotIn(List<String> values) {
            addCriterion("CZTIME not in", values, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeBetween(String value1, String value2) {
            addCriterion("CZTIME between", value1, value2, "cztime");
            return (Criteria) this;
        }

        public Criteria andCztimeNotBetween(String value1, String value2) {
            addCriterion("CZTIME not between", value1, value2, "cztime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
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