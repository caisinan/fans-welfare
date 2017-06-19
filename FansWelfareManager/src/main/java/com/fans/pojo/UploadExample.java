package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadExample() {
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

        public Criteria andUploadidIsNull() {
            addCriterion("uploadId is null");
            return (Criteria) this;
        }

        public Criteria andUploadidIsNotNull() {
            addCriterion("uploadId is not null");
            return (Criteria) this;
        }

        public Criteria andUploadidEqualTo(Long value) {
            addCriterion("uploadId =", value, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidNotEqualTo(Long value) {
            addCriterion("uploadId <>", value, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidGreaterThan(Long value) {
            addCriterion("uploadId >", value, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidGreaterThanOrEqualTo(Long value) {
            addCriterion("uploadId >=", value, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidLessThan(Long value) {
            addCriterion("uploadId <", value, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidLessThanOrEqualTo(Long value) {
            addCriterion("uploadId <=", value, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidIn(List<Long> values) {
            addCriterion("uploadId in", values, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidNotIn(List<Long> values) {
            addCriterion("uploadId not in", values, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidBetween(Long value1, Long value2) {
            addCriterion("uploadId between", value1, value2, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadidNotBetween(Long value1, Long value2) {
            addCriterion("uploadId not between", value1, value2, "uploadid");
            return (Criteria) this;
        }

        public Criteria andUploadstateIsNull() {
            addCriterion("uploadState is null");
            return (Criteria) this;
        }

        public Criteria andUploadstateIsNotNull() {
            addCriterion("uploadState is not null");
            return (Criteria) this;
        }

        public Criteria andUploadstateEqualTo(String value) {
            addCriterion("uploadState =", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotEqualTo(String value) {
            addCriterion("uploadState <>", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateGreaterThan(String value) {
            addCriterion("uploadState >", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateGreaterThanOrEqualTo(String value) {
            addCriterion("uploadState >=", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLessThan(String value) {
            addCriterion("uploadState <", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLessThanOrEqualTo(String value) {
            addCriterion("uploadState <=", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLike(String value) {
            addCriterion("uploadState like", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotLike(String value) {
            addCriterion("uploadState not like", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateIn(List<String> values) {
            addCriterion("uploadState in", values, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotIn(List<String> values) {
            addCriterion("uploadState not in", values, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateBetween(String value1, String value2) {
            addCriterion("uploadState between", value1, value2, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotBetween(String value1, String value2) {
            addCriterion("uploadState not between", value1, value2, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadcodeIsNull() {
            addCriterion("uploadCode is null");
            return (Criteria) this;
        }

        public Criteria andUploadcodeIsNotNull() {
            addCriterion("uploadCode is not null");
            return (Criteria) this;
        }

        public Criteria andUploadcodeEqualTo(String value) {
            addCriterion("uploadCode =", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeNotEqualTo(String value) {
            addCriterion("uploadCode <>", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeGreaterThan(String value) {
            addCriterion("uploadCode >", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeGreaterThanOrEqualTo(String value) {
            addCriterion("uploadCode >=", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeLessThan(String value) {
            addCriterion("uploadCode <", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeLessThanOrEqualTo(String value) {
            addCriterion("uploadCode <=", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeLike(String value) {
            addCriterion("uploadCode like", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeNotLike(String value) {
            addCriterion("uploadCode not like", value, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeIn(List<String> values) {
            addCriterion("uploadCode in", values, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeNotIn(List<String> values) {
            addCriterion("uploadCode not in", values, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeBetween(String value1, String value2) {
            addCriterion("uploadCode between", value1, value2, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andUploadcodeNotBetween(String value1, String value2) {
            addCriterion("uploadCode not between", value1, value2, "uploadcode");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("fileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("fileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("fileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("fileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("fileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("fileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("fileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("fileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("fileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("fileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("fileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("fileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("fileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("fileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadnumIsNull() {
            addCriterion("uploadNum is null");
            return (Criteria) this;
        }

        public Criteria andUploadnumIsNotNull() {
            addCriterion("uploadNum is not null");
            return (Criteria) this;
        }

        public Criteria andUploadnumEqualTo(Integer value) {
            addCriterion("uploadNum =", value, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumNotEqualTo(Integer value) {
            addCriterion("uploadNum <>", value, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumGreaterThan(Integer value) {
            addCriterion("uploadNum >", value, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadNum >=", value, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumLessThan(Integer value) {
            addCriterion("uploadNum <", value, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumLessThanOrEqualTo(Integer value) {
            addCriterion("uploadNum <=", value, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumIn(List<Integer> values) {
            addCriterion("uploadNum in", values, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumNotIn(List<Integer> values) {
            addCriterion("uploadNum not in", values, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumBetween(Integer value1, Integer value2) {
            addCriterion("uploadNum between", value1, value2, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andUploadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadNum not between", value1, value2, "uploadnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumIsNull() {
            addCriterion("investNum is null");
            return (Criteria) this;
        }

        public Criteria andInvestnumIsNotNull() {
            addCriterion("investNum is not null");
            return (Criteria) this;
        }

        public Criteria andInvestnumEqualTo(Integer value) {
            addCriterion("investNum =", value, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumNotEqualTo(Integer value) {
            addCriterion("investNum <>", value, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumGreaterThan(Integer value) {
            addCriterion("investNum >", value, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("investNum >=", value, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumLessThan(Integer value) {
            addCriterion("investNum <", value, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumLessThanOrEqualTo(Integer value) {
            addCriterion("investNum <=", value, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumIn(List<Integer> values) {
            addCriterion("investNum in", values, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumNotIn(List<Integer> values) {
            addCriterion("investNum not in", values, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumBetween(Integer value1, Integer value2) {
            addCriterion("investNum between", value1, value2, "investnum");
            return (Criteria) this;
        }

        public Criteria andInvestnumNotBetween(Integer value1, Integer value2) {
            addCriterion("investNum not between", value1, value2, "investnum");
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