package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class OaStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaStaffExample() {
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

        public Criteria andNameEnIsNull() {
            addCriterion("NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("NAME_EN =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("NAME_EN <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("NAME_EN >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("NAME_EN <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("NAME_EN like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("NAME_EN not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("NAME_EN in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("NAME_EN not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("NAME_EN between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("NAME_EN not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNull() {
            addCriterion("BIANMA is null");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNotNull() {
            addCriterion("BIANMA is not null");
            return (Criteria) this;
        }

        public Criteria andBianmaEqualTo(String value) {
            addCriterion("BIANMA =", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotEqualTo(String value) {
            addCriterion("BIANMA <>", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThan(String value) {
            addCriterion("BIANMA >", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThanOrEqualTo(String value) {
            addCriterion("BIANMA >=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThan(String value) {
            addCriterion("BIANMA <", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThanOrEqualTo(String value) {
            addCriterion("BIANMA <=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLike(String value) {
            addCriterion("BIANMA like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotLike(String value) {
            addCriterion("BIANMA not like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaIn(List<String> values) {
            addCriterion("BIANMA in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotIn(List<String> values) {
            addCriterion("BIANMA not in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaBetween(String value1, String value2) {
            addCriterion("BIANMA between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotBetween(String value1, String value2) {
            addCriterion("BIANMA not between", value1, value2, "bianma");
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

        public Criteria andFunctionsIsNull() {
            addCriterion("FUNCTIONS is null");
            return (Criteria) this;
        }

        public Criteria andFunctionsIsNotNull() {
            addCriterion("FUNCTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionsEqualTo(String value) {
            addCriterion("FUNCTIONS =", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsNotEqualTo(String value) {
            addCriterion("FUNCTIONS <>", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsGreaterThan(String value) {
            addCriterion("FUNCTIONS >", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONS >=", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsLessThan(String value) {
            addCriterion("FUNCTIONS <", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONS <=", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsLike(String value) {
            addCriterion("FUNCTIONS like", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsNotLike(String value) {
            addCriterion("FUNCTIONS not like", value, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsIn(List<String> values) {
            addCriterion("FUNCTIONS in", values, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsNotIn(List<String> values) {
            addCriterion("FUNCTIONS not in", values, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsBetween(String value1, String value2) {
            addCriterion("FUNCTIONS between", value1, value2, "functions");
            return (Criteria) this;
        }

        public Criteria andFunctionsNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONS not between", value1, value2, "functions");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("JOBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("JOBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(String value) {
            addCriterion("JOBTYPE =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(String value) {
            addCriterion("JOBTYPE <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(String value) {
            addCriterion("JOBTYPE >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("JOBTYPE >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(String value) {
            addCriterion("JOBTYPE <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(String value) {
            addCriterion("JOBTYPE <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLike(String value) {
            addCriterion("JOBTYPE like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotLike(String value) {
            addCriterion("JOBTYPE not like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<String> values) {
            addCriterion("JOBTYPE in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<String> values) {
            addCriterion("JOBTYPE not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(String value1, String value2) {
            addCriterion("JOBTYPE between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(String value1, String value2) {
            addCriterion("JOBTYPE not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobjointimeIsNull() {
            addCriterion("JOBJOINTIME is null");
            return (Criteria) this;
        }

        public Criteria andJobjointimeIsNotNull() {
            addCriterion("JOBJOINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andJobjointimeEqualTo(String value) {
            addCriterion("JOBJOINTIME =", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeNotEqualTo(String value) {
            addCriterion("JOBJOINTIME <>", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeGreaterThan(String value) {
            addCriterion("JOBJOINTIME >", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeGreaterThanOrEqualTo(String value) {
            addCriterion("JOBJOINTIME >=", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeLessThan(String value) {
            addCriterion("JOBJOINTIME <", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeLessThanOrEqualTo(String value) {
            addCriterion("JOBJOINTIME <=", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeLike(String value) {
            addCriterion("JOBJOINTIME like", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeNotLike(String value) {
            addCriterion("JOBJOINTIME not like", value, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeIn(List<String> values) {
            addCriterion("JOBJOINTIME in", values, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeNotIn(List<String> values) {
            addCriterion("JOBJOINTIME not in", values, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeBetween(String value1, String value2) {
            addCriterion("JOBJOINTIME between", value1, value2, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andJobjointimeNotBetween(String value1, String value2) {
            addCriterion("JOBJOINTIME not between", value1, value2, "jobjointime");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNull() {
            addCriterion("FADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNotNull() {
            addCriterion("FADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFaddressEqualTo(String value) {
            addCriterion("FADDRESS =", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotEqualTo(String value) {
            addCriterion("FADDRESS <>", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThan(String value) {
            addCriterion("FADDRESS >", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FADDRESS >=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThan(String value) {
            addCriterion("FADDRESS <", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThanOrEqualTo(String value) {
            addCriterion("FADDRESS <=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLike(String value) {
            addCriterion("FADDRESS like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotLike(String value) {
            addCriterion("FADDRESS not like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressIn(List<String> values) {
            addCriterion("FADDRESS in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotIn(List<String> values) {
            addCriterion("FADDRESS not in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressBetween(String value1, String value2) {
            addCriterion("FADDRESS between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotBetween(String value1, String value2) {
            addCriterion("FADDRESS not between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNull() {
            addCriterion("POLITICAL is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNotNull() {
            addCriterion("POLITICAL is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalEqualTo(String value) {
            addCriterion("POLITICAL =", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotEqualTo(String value) {
            addCriterion("POLITICAL <>", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThan(String value) {
            addCriterion("POLITICAL >", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICAL >=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThan(String value) {
            addCriterion("POLITICAL <", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThanOrEqualTo(String value) {
            addCriterion("POLITICAL <=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLike(String value) {
            addCriterion("POLITICAL like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotLike(String value) {
            addCriterion("POLITICAL not like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalIn(List<String> values) {
            addCriterion("POLITICAL in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotIn(List<String> values) {
            addCriterion("POLITICAL not in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalBetween(String value1, String value2) {
            addCriterion("POLITICAL between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotBetween(String value1, String value2) {
            addCriterion("POLITICAL not between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPjointimeIsNull() {
            addCriterion("PJOINTIME is null");
            return (Criteria) this;
        }

        public Criteria andPjointimeIsNotNull() {
            addCriterion("PJOINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPjointimeEqualTo(String value) {
            addCriterion("PJOINTIME =", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeNotEqualTo(String value) {
            addCriterion("PJOINTIME <>", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeGreaterThan(String value) {
            addCriterion("PJOINTIME >", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeGreaterThanOrEqualTo(String value) {
            addCriterion("PJOINTIME >=", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeLessThan(String value) {
            addCriterion("PJOINTIME <", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeLessThanOrEqualTo(String value) {
            addCriterion("PJOINTIME <=", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeLike(String value) {
            addCriterion("PJOINTIME like", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeNotLike(String value) {
            addCriterion("PJOINTIME not like", value, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeIn(List<String> values) {
            addCriterion("PJOINTIME in", values, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeNotIn(List<String> values) {
            addCriterion("PJOINTIME not in", values, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeBetween(String value1, String value2) {
            addCriterion("PJOINTIME between", value1, value2, "pjointime");
            return (Criteria) this;
        }

        public Criteria andPjointimeNotBetween(String value1, String value2) {
            addCriterion("PJOINTIME not between", value1, value2, "pjointime");
            return (Criteria) this;
        }

        public Criteria andSfidIsNull() {
            addCriterion("SFID is null");
            return (Criteria) this;
        }

        public Criteria andSfidIsNotNull() {
            addCriterion("SFID is not null");
            return (Criteria) this;
        }

        public Criteria andSfidEqualTo(String value) {
            addCriterion("SFID =", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotEqualTo(String value) {
            addCriterion("SFID <>", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThan(String value) {
            addCriterion("SFID >", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThanOrEqualTo(String value) {
            addCriterion("SFID >=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThan(String value) {
            addCriterion("SFID <", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThanOrEqualTo(String value) {
            addCriterion("SFID <=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLike(String value) {
            addCriterion("SFID like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotLike(String value) {
            addCriterion("SFID not like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidIn(List<String> values) {
            addCriterion("SFID in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotIn(List<String> values) {
            addCriterion("SFID not in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidBetween(String value1, String value2) {
            addCriterion("SFID between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotBetween(String value1, String value2) {
            addCriterion("SFID not between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNull() {
            addCriterion("MARITAL is null");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNotNull() {
            addCriterion("MARITAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalEqualTo(String value) {
            addCriterion("MARITAL =", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotEqualTo(String value) {
            addCriterion("MARITAL <>", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThan(String value) {
            addCriterion("MARITAL >", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL >=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThan(String value) {
            addCriterion("MARITAL <", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThanOrEqualTo(String value) {
            addCriterion("MARITAL <=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLike(String value) {
            addCriterion("MARITAL like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotLike(String value) {
            addCriterion("MARITAL not like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalIn(List<String> values) {
            addCriterion("MARITAL in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotIn(List<String> values) {
            addCriterion("MARITAL not in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalBetween(String value1, String value2) {
            addCriterion("MARITAL between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotBetween(String value1, String value2) {
            addCriterion("MARITAL not between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andDjointimeIsNull() {
            addCriterion("DJOINTIME is null");
            return (Criteria) this;
        }

        public Criteria andDjointimeIsNotNull() {
            addCriterion("DJOINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDjointimeEqualTo(String value) {
            addCriterion("DJOINTIME =", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeNotEqualTo(String value) {
            addCriterion("DJOINTIME <>", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeGreaterThan(String value) {
            addCriterion("DJOINTIME >", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeGreaterThanOrEqualTo(String value) {
            addCriterion("DJOINTIME >=", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeLessThan(String value) {
            addCriterion("DJOINTIME <", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeLessThanOrEqualTo(String value) {
            addCriterion("DJOINTIME <=", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeLike(String value) {
            addCriterion("DJOINTIME like", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeNotLike(String value) {
            addCriterion("DJOINTIME not like", value, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeIn(List<String> values) {
            addCriterion("DJOINTIME in", values, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeNotIn(List<String> values) {
            addCriterion("DJOINTIME not in", values, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeBetween(String value1, String value2) {
            addCriterion("DJOINTIME between", value1, value2, "djointime");
            return (Criteria) this;
        }

        public Criteria andDjointimeNotBetween(String value1, String value2) {
            addCriterion("DJOINTIME not between", value1, value2, "djointime");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPojointimeIsNull() {
            addCriterion("POJOINTIME is null");
            return (Criteria) this;
        }

        public Criteria andPojointimeIsNotNull() {
            addCriterion("POJOINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPojointimeEqualTo(String value) {
            addCriterion("POJOINTIME =", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeNotEqualTo(String value) {
            addCriterion("POJOINTIME <>", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeGreaterThan(String value) {
            addCriterion("POJOINTIME >", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeGreaterThanOrEqualTo(String value) {
            addCriterion("POJOINTIME >=", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeLessThan(String value) {
            addCriterion("POJOINTIME <", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeLessThanOrEqualTo(String value) {
            addCriterion("POJOINTIME <=", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeLike(String value) {
            addCriterion("POJOINTIME like", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeNotLike(String value) {
            addCriterion("POJOINTIME not like", value, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeIn(List<String> values) {
            addCriterion("POJOINTIME in", values, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeNotIn(List<String> values) {
            addCriterion("POJOINTIME not in", values, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeBetween(String value1, String value2) {
            addCriterion("POJOINTIME between", value1, value2, "pojointime");
            return (Criteria) this;
        }

        public Criteria andPojointimeNotBetween(String value1, String value2) {
            addCriterion("POJOINTIME not between", value1, value2, "pojointime");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNull() {
            addCriterion("FTITLE is null");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNotNull() {
            addCriterion("FTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFtitleEqualTo(String value) {
            addCriterion("FTITLE =", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotEqualTo(String value) {
            addCriterion("FTITLE <>", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThan(String value) {
            addCriterion("FTITLE >", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThanOrEqualTo(String value) {
            addCriterion("FTITLE >=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThan(String value) {
            addCriterion("FTITLE <", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThanOrEqualTo(String value) {
            addCriterion("FTITLE <=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLike(String value) {
            addCriterion("FTITLE like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotLike(String value) {
            addCriterion("FTITLE not like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleIn(List<String> values) {
            addCriterion("FTITLE in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotIn(List<String> values) {
            addCriterion("FTITLE not in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleBetween(String value1, String value2) {
            addCriterion("FTITLE between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotBetween(String value1, String value2) {
            addCriterion("FTITLE not between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("CERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("CERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("CERTIFICATE =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("CERTIFICATE <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("CERTIFICATE >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("CERTIFICATE <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("CERTIFICATE like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("CERTIFICATE not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("CERTIFICATE in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("CERTIFICATE not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("CERTIFICATE between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andContractlengthIsNull() {
            addCriterion("CONTRACTLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andContractlengthIsNotNull() {
            addCriterion("CONTRACTLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andContractlengthEqualTo(Integer value) {
            addCriterion("CONTRACTLENGTH =", value, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthNotEqualTo(Integer value) {
            addCriterion("CONTRACTLENGTH <>", value, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthGreaterThan(Integer value) {
            addCriterion("CONTRACTLENGTH >", value, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTRACTLENGTH >=", value, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthLessThan(Integer value) {
            addCriterion("CONTRACTLENGTH <", value, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthLessThanOrEqualTo(Integer value) {
            addCriterion("CONTRACTLENGTH <=", value, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthIn(List<Integer> values) {
            addCriterion("CONTRACTLENGTH in", values, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthNotIn(List<Integer> values) {
            addCriterion("CONTRACTLENGTH not in", values, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthBetween(Integer value1, Integer value2) {
            addCriterion("CONTRACTLENGTH between", value1, value2, "contractlength");
            return (Criteria) this;
        }

        public Criteria andContractlengthNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTRACTLENGTH not between", value1, value2, "contractlength");
            return (Criteria) this;
        }

        public Criteria andCstarttimeIsNull() {
            addCriterion("CSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCstarttimeIsNotNull() {
            addCriterion("CSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCstarttimeEqualTo(String value) {
            addCriterion("CSTARTTIME =", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeNotEqualTo(String value) {
            addCriterion("CSTARTTIME <>", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeGreaterThan(String value) {
            addCriterion("CSTARTTIME >", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CSTARTTIME >=", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeLessThan(String value) {
            addCriterion("CSTARTTIME <", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeLessThanOrEqualTo(String value) {
            addCriterion("CSTARTTIME <=", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeLike(String value) {
            addCriterion("CSTARTTIME like", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeNotLike(String value) {
            addCriterion("CSTARTTIME not like", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeIn(List<String> values) {
            addCriterion("CSTARTTIME in", values, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeNotIn(List<String> values) {
            addCriterion("CSTARTTIME not in", values, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeBetween(String value1, String value2) {
            addCriterion("CSTARTTIME between", value1, value2, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeNotBetween(String value1, String value2) {
            addCriterion("CSTARTTIME not between", value1, value2, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNull() {
            addCriterion("CENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNotNull() {
            addCriterion("CENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCendtimeEqualTo(String value) {
            addCriterion("CENDTIME =", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotEqualTo(String value) {
            addCriterion("CENDTIME <>", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThan(String value) {
            addCriterion("CENDTIME >", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CENDTIME >=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThan(String value) {
            addCriterion("CENDTIME <", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThanOrEqualTo(String value) {
            addCriterion("CENDTIME <=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLike(String value) {
            addCriterion("CENDTIME like", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotLike(String value) {
            addCriterion("CENDTIME not like", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIn(List<String> values) {
            addCriterion("CENDTIME in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotIn(List<String> values) {
            addCriterion("CENDTIME not in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeBetween(String value1, String value2) {
            addCriterion("CENDTIME between", value1, value2, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotBetween(String value1, String value2) {
            addCriterion("CENDTIME not between", value1, value2, "cendtime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
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