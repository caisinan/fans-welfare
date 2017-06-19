package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysUserphotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserphotoExample() {
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

        public Criteria andUserphotoIdIsNull() {
            addCriterion("USERPHOTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdIsNotNull() {
            addCriterion("USERPHOTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdEqualTo(String value) {
            addCriterion("USERPHOTO_ID =", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdNotEqualTo(String value) {
            addCriterion("USERPHOTO_ID <>", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdGreaterThan(String value) {
            addCriterion("USERPHOTO_ID >", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("USERPHOTO_ID >=", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdLessThan(String value) {
            addCriterion("USERPHOTO_ID <", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdLessThanOrEqualTo(String value) {
            addCriterion("USERPHOTO_ID <=", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdLike(String value) {
            addCriterion("USERPHOTO_ID like", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdNotLike(String value) {
            addCriterion("USERPHOTO_ID not like", value, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdIn(List<String> values) {
            addCriterion("USERPHOTO_ID in", values, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdNotIn(List<String> values) {
            addCriterion("USERPHOTO_ID not in", values, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdBetween(String value1, String value2) {
            addCriterion("USERPHOTO_ID between", value1, value2, "userphotoId");
            return (Criteria) this;
        }

        public Criteria andUserphotoIdNotBetween(String value1, String value2) {
            addCriterion("USERPHOTO_ID not between", value1, value2, "userphotoId");
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

        public Criteria andPhoto0IsNull() {
            addCriterion("PHOTO0 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto0IsNotNull() {
            addCriterion("PHOTO0 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto0EqualTo(String value) {
            addCriterion("PHOTO0 =", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0NotEqualTo(String value) {
            addCriterion("PHOTO0 <>", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0GreaterThan(String value) {
            addCriterion("PHOTO0 >", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO0 >=", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0LessThan(String value) {
            addCriterion("PHOTO0 <", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0LessThanOrEqualTo(String value) {
            addCriterion("PHOTO0 <=", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0Like(String value) {
            addCriterion("PHOTO0 like", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0NotLike(String value) {
            addCriterion("PHOTO0 not like", value, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0In(List<String> values) {
            addCriterion("PHOTO0 in", values, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0NotIn(List<String> values) {
            addCriterion("PHOTO0 not in", values, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0Between(String value1, String value2) {
            addCriterion("PHOTO0 between", value1, value2, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto0NotBetween(String value1, String value2) {
            addCriterion("PHOTO0 not between", value1, value2, "photo0");
            return (Criteria) this;
        }

        public Criteria andPhoto1IsNull() {
            addCriterion("PHOTO1 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto1IsNotNull() {
            addCriterion("PHOTO1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto1EqualTo(String value) {
            addCriterion("PHOTO1 =", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotEqualTo(String value) {
            addCriterion("PHOTO1 <>", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThan(String value) {
            addCriterion("PHOTO1 >", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO1 >=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThan(String value) {
            addCriterion("PHOTO1 <", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThanOrEqualTo(String value) {
            addCriterion("PHOTO1 <=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Like(String value) {
            addCriterion("PHOTO1 like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotLike(String value) {
            addCriterion("PHOTO1 not like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1In(List<String> values) {
            addCriterion("PHOTO1 in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotIn(List<String> values) {
            addCriterion("PHOTO1 not in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Between(String value1, String value2) {
            addCriterion("PHOTO1 between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotBetween(String value1, String value2) {
            addCriterion("PHOTO1 not between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNull() {
            addCriterion("PHOTO2 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNotNull() {
            addCriterion("PHOTO2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto2EqualTo(String value) {
            addCriterion("PHOTO2 =", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotEqualTo(String value) {
            addCriterion("PHOTO2 <>", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThan(String value) {
            addCriterion("PHOTO2 >", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO2 >=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThan(String value) {
            addCriterion("PHOTO2 <", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThanOrEqualTo(String value) {
            addCriterion("PHOTO2 <=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Like(String value) {
            addCriterion("PHOTO2 like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotLike(String value) {
            addCriterion("PHOTO2 not like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2In(List<String> values) {
            addCriterion("PHOTO2 in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotIn(List<String> values) {
            addCriterion("PHOTO2 not in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Between(String value1, String value2) {
            addCriterion("PHOTO2 between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotBetween(String value1, String value2) {
            addCriterion("PHOTO2 not between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNull() {
            addCriterion("PHOTO3 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNotNull() {
            addCriterion("PHOTO3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto3EqualTo(String value) {
            addCriterion("PHOTO3 =", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotEqualTo(String value) {
            addCriterion("PHOTO3 <>", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThan(String value) {
            addCriterion("PHOTO3 >", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO3 >=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThan(String value) {
            addCriterion("PHOTO3 <", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThanOrEqualTo(String value) {
            addCriterion("PHOTO3 <=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Like(String value) {
            addCriterion("PHOTO3 like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotLike(String value) {
            addCriterion("PHOTO3 not like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3In(List<String> values) {
            addCriterion("PHOTO3 in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotIn(List<String> values) {
            addCriterion("PHOTO3 not in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Between(String value1, String value2) {
            addCriterion("PHOTO3 between", value1, value2, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotBetween(String value1, String value2) {
            addCriterion("PHOTO3 not between", value1, value2, "photo3");
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