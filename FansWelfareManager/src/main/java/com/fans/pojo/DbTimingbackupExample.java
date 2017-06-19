package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class DbTimingbackupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbTimingbackupExample() {
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

        public Criteria andTimingbackupIdIsNull() {
            addCriterion("TIMINGBACKUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdIsNotNull() {
            addCriterion("TIMINGBACKUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdEqualTo(String value) {
            addCriterion("TIMINGBACKUP_ID =", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdNotEqualTo(String value) {
            addCriterion("TIMINGBACKUP_ID <>", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdGreaterThan(String value) {
            addCriterion("TIMINGBACKUP_ID >", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIMINGBACKUP_ID >=", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdLessThan(String value) {
            addCriterion("TIMINGBACKUP_ID <", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdLessThanOrEqualTo(String value) {
            addCriterion("TIMINGBACKUP_ID <=", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdLike(String value) {
            addCriterion("TIMINGBACKUP_ID like", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdNotLike(String value) {
            addCriterion("TIMINGBACKUP_ID not like", value, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdIn(List<String> values) {
            addCriterion("TIMINGBACKUP_ID in", values, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdNotIn(List<String> values) {
            addCriterion("TIMINGBACKUP_ID not in", values, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdBetween(String value1, String value2) {
            addCriterion("TIMINGBACKUP_ID between", value1, value2, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andTimingbackupIdNotBetween(String value1, String value2) {
            addCriterion("TIMINGBACKUP_ID not between", value1, value2, "timingbackupId");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("JOBNAME is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("JOBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("JOBNAME =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("JOBNAME <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("JOBNAME >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("JOBNAME >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("JOBNAME <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("JOBNAME <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("JOBNAME like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("JOBNAME not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("JOBNAME in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("JOBNAME not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("JOBNAME between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("JOBNAME not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNull() {
            addCriterion("TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("TABLENAME =", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("TABLENAME <>", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("TABLENAME >", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLENAME >=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("TABLENAME <", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("TABLENAME <=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLike(String value) {
            addCriterion("TABLENAME like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotLike(String value) {
            addCriterion("TABLENAME not like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("TABLENAME in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("TABLENAME not in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("TABLENAME between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("TABLENAME not between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFhtimeIsNull() {
            addCriterion("FHTIME is null");
            return (Criteria) this;
        }

        public Criteria andFhtimeIsNotNull() {
            addCriterion("FHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFhtimeEqualTo(String value) {
            addCriterion("FHTIME =", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeNotEqualTo(String value) {
            addCriterion("FHTIME <>", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeGreaterThan(String value) {
            addCriterion("FHTIME >", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeGreaterThanOrEqualTo(String value) {
            addCriterion("FHTIME >=", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeLessThan(String value) {
            addCriterion("FHTIME <", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeLessThanOrEqualTo(String value) {
            addCriterion("FHTIME <=", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeLike(String value) {
            addCriterion("FHTIME like", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeNotLike(String value) {
            addCriterion("FHTIME not like", value, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeIn(List<String> values) {
            addCriterion("FHTIME in", values, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeNotIn(List<String> values) {
            addCriterion("FHTIME not in", values, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeBetween(String value1, String value2) {
            addCriterion("FHTIME between", value1, value2, "fhtime");
            return (Criteria) this;
        }

        public Criteria andFhtimeNotBetween(String value1, String value2) {
            addCriterion("FHTIME not between", value1, value2, "fhtime");
            return (Criteria) this;
        }

        public Criteria andTimeexplainIsNull() {
            addCriterion("TIMEEXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andTimeexplainIsNotNull() {
            addCriterion("TIMEEXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andTimeexplainEqualTo(String value) {
            addCriterion("TIMEEXPLAIN =", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainNotEqualTo(String value) {
            addCriterion("TIMEEXPLAIN <>", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainGreaterThan(String value) {
            addCriterion("TIMEEXPLAIN >", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEEXPLAIN >=", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainLessThan(String value) {
            addCriterion("TIMEEXPLAIN <", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainLessThanOrEqualTo(String value) {
            addCriterion("TIMEEXPLAIN <=", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainLike(String value) {
            addCriterion("TIMEEXPLAIN like", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainNotLike(String value) {
            addCriterion("TIMEEXPLAIN not like", value, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainIn(List<String> values) {
            addCriterion("TIMEEXPLAIN in", values, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainNotIn(List<String> values) {
            addCriterion("TIMEEXPLAIN not in", values, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainBetween(String value1, String value2) {
            addCriterion("TIMEEXPLAIN between", value1, value2, "timeexplain");
            return (Criteria) this;
        }

        public Criteria andTimeexplainNotBetween(String value1, String value2) {
            addCriterion("TIMEEXPLAIN not between", value1, value2, "timeexplain");
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