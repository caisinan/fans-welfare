package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbAttachedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAttachedExample() {
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

        public Criteria andAttachedIdIsNull() {
            addCriterion("ATTACHED_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttachedIdIsNotNull() {
            addCriterion("ATTACHED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttachedIdEqualTo(String value) {
            addCriterion("ATTACHED_ID =", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdNotEqualTo(String value) {
            addCriterion("ATTACHED_ID <>", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdGreaterThan(String value) {
            addCriterion("ATTACHED_ID >", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHED_ID >=", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdLessThan(String value) {
            addCriterion("ATTACHED_ID <", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdLessThanOrEqualTo(String value) {
            addCriterion("ATTACHED_ID <=", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdLike(String value) {
            addCriterion("ATTACHED_ID like", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdNotLike(String value) {
            addCriterion("ATTACHED_ID not like", value, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdIn(List<String> values) {
            addCriterion("ATTACHED_ID in", values, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdNotIn(List<String> values) {
            addCriterion("ATTACHED_ID not in", values, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdBetween(String value1, String value2) {
            addCriterion("ATTACHED_ID between", value1, value2, "attachedId");
            return (Criteria) this;
        }

        public Criteria andAttachedIdNotBetween(String value1, String value2) {
            addCriterion("ATTACHED_ID not between", value1, value2, "attachedId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFdescribeIsNull() {
            addCriterion("FDESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andFdescribeIsNotNull() {
            addCriterion("FDESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andFdescribeEqualTo(String value) {
            addCriterion("FDESCRIBE =", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeNotEqualTo(String value) {
            addCriterion("FDESCRIBE <>", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeGreaterThan(String value) {
            addCriterion("FDESCRIBE >", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("FDESCRIBE >=", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeLessThan(String value) {
            addCriterion("FDESCRIBE <", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeLessThanOrEqualTo(String value) {
            addCriterion("FDESCRIBE <=", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeLike(String value) {
            addCriterion("FDESCRIBE like", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeNotLike(String value) {
            addCriterion("FDESCRIBE not like", value, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeIn(List<String> values) {
            addCriterion("FDESCRIBE in", values, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeNotIn(List<String> values) {
            addCriterion("FDESCRIBE not in", values, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeBetween(String value1, String value2) {
            addCriterion("FDESCRIBE between", value1, value2, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andFdescribeNotBetween(String value1, String value2) {
            addCriterion("FDESCRIBE not between", value1, value2, "fdescribe");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("CTIME is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("CTIME =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("CTIME <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("CTIME >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CTIME >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("CTIME <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("CTIME <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("CTIME like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("CTIME not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("CTIME in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("CTIME not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("CTIME between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("CTIME not between", value1, value2, "ctime");
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