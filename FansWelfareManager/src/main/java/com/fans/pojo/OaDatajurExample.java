package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class OaDatajurExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaDatajurExample() {
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

        public Criteria andDatajurIdIsNull() {
            addCriterion("DATAJUR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDatajurIdIsNotNull() {
            addCriterion("DATAJUR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDatajurIdEqualTo(String value) {
            addCriterion("DATAJUR_ID =", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdNotEqualTo(String value) {
            addCriterion("DATAJUR_ID <>", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdGreaterThan(String value) {
            addCriterion("DATAJUR_ID >", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdGreaterThanOrEqualTo(String value) {
            addCriterion("DATAJUR_ID >=", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdLessThan(String value) {
            addCriterion("DATAJUR_ID <", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdLessThanOrEqualTo(String value) {
            addCriterion("DATAJUR_ID <=", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdLike(String value) {
            addCriterion("DATAJUR_ID like", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdNotLike(String value) {
            addCriterion("DATAJUR_ID not like", value, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdIn(List<String> values) {
            addCriterion("DATAJUR_ID in", values, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdNotIn(List<String> values) {
            addCriterion("DATAJUR_ID not in", values, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdBetween(String value1, String value2) {
            addCriterion("DATAJUR_ID between", value1, value2, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDatajurIdNotBetween(String value1, String value2) {
            addCriterion("DATAJUR_ID not between", value1, value2, "datajurId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsIsNull() {
            addCriterion("DEPARTMENT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsIsNotNull() {
            addCriterion("DEPARTMENT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsEqualTo(String value) {
            addCriterion("DEPARTMENT_IDS =", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsNotEqualTo(String value) {
            addCriterion("DEPARTMENT_IDS <>", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsGreaterThan(String value) {
            addCriterion("DEPARTMENT_IDS >", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_IDS >=", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsLessThan(String value) {
            addCriterion("DEPARTMENT_IDS <", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_IDS <=", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsLike(String value) {
            addCriterion("DEPARTMENT_IDS like", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsNotLike(String value) {
            addCriterion("DEPARTMENT_IDS not like", value, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsIn(List<String> values) {
            addCriterion("DEPARTMENT_IDS in", values, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsNotIn(List<String> values) {
            addCriterion("DEPARTMENT_IDS not in", values, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_IDS between", value1, value2, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdsNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_IDS not between", value1, value2, "departmentIds");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("STAFF_ID like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("STAFF_ID not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("DEPARTMENT_ID like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("DEPARTMENT_ID not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
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