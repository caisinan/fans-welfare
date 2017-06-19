package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class DbFhdbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbFhdbExample() {
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

        public Criteria andFhdbIdIsNull() {
            addCriterion("FHDB_ID is null");
            return (Criteria) this;
        }

        public Criteria andFhdbIdIsNotNull() {
            addCriterion("FHDB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFhdbIdEqualTo(String value) {
            addCriterion("FHDB_ID =", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdNotEqualTo(String value) {
            addCriterion("FHDB_ID <>", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdGreaterThan(String value) {
            addCriterion("FHDB_ID >", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdGreaterThanOrEqualTo(String value) {
            addCriterion("FHDB_ID >=", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdLessThan(String value) {
            addCriterion("FHDB_ID <", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdLessThanOrEqualTo(String value) {
            addCriterion("FHDB_ID <=", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdLike(String value) {
            addCriterion("FHDB_ID like", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdNotLike(String value) {
            addCriterion("FHDB_ID not like", value, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdIn(List<String> values) {
            addCriterion("FHDB_ID in", values, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdNotIn(List<String> values) {
            addCriterion("FHDB_ID not in", values, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdBetween(String value1, String value2) {
            addCriterion("FHDB_ID between", value1, value2, "fhdbId");
            return (Criteria) this;
        }

        public Criteria andFhdbIdNotBetween(String value1, String value2) {
            addCriterion("FHDB_ID not between", value1, value2, "fhdbId");
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

        public Criteria andBackupTimeIsNull() {
            addCriterion("BACKUP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBackupTimeIsNotNull() {
            addCriterion("BACKUP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBackupTimeEqualTo(String value) {
            addCriterion("BACKUP_TIME =", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeNotEqualTo(String value) {
            addCriterion("BACKUP_TIME <>", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeGreaterThan(String value) {
            addCriterion("BACKUP_TIME >", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BACKUP_TIME >=", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeLessThan(String value) {
            addCriterion("BACKUP_TIME <", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeLessThanOrEqualTo(String value) {
            addCriterion("BACKUP_TIME <=", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeLike(String value) {
            addCriterion("BACKUP_TIME like", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeNotLike(String value) {
            addCriterion("BACKUP_TIME not like", value, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeIn(List<String> values) {
            addCriterion("BACKUP_TIME in", values, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeNotIn(List<String> values) {
            addCriterion("BACKUP_TIME not in", values, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeBetween(String value1, String value2) {
            addCriterion("BACKUP_TIME between", value1, value2, "backupTime");
            return (Criteria) this;
        }

        public Criteria andBackupTimeNotBetween(String value1, String value2) {
            addCriterion("BACKUP_TIME not between", value1, value2, "backupTime");
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

        public Criteria andSqlpathIsNull() {
            addCriterion("SQLPATH is null");
            return (Criteria) this;
        }

        public Criteria andSqlpathIsNotNull() {
            addCriterion("SQLPATH is not null");
            return (Criteria) this;
        }

        public Criteria andSqlpathEqualTo(String value) {
            addCriterion("SQLPATH =", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathNotEqualTo(String value) {
            addCriterion("SQLPATH <>", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathGreaterThan(String value) {
            addCriterion("SQLPATH >", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathGreaterThanOrEqualTo(String value) {
            addCriterion("SQLPATH >=", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathLessThan(String value) {
            addCriterion("SQLPATH <", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathLessThanOrEqualTo(String value) {
            addCriterion("SQLPATH <=", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathLike(String value) {
            addCriterion("SQLPATH like", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathNotLike(String value) {
            addCriterion("SQLPATH not like", value, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathIn(List<String> values) {
            addCriterion("SQLPATH in", values, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathNotIn(List<String> values) {
            addCriterion("SQLPATH not in", values, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathBetween(String value1, String value2) {
            addCriterion("SQLPATH between", value1, value2, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andSqlpathNotBetween(String value1, String value2) {
            addCriterion("SQLPATH not between", value1, value2, "sqlpath");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDbsizeIsNull() {
            addCriterion("DBSIZE is null");
            return (Criteria) this;
        }

        public Criteria andDbsizeIsNotNull() {
            addCriterion("DBSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andDbsizeEqualTo(String value) {
            addCriterion("DBSIZE =", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeNotEqualTo(String value) {
            addCriterion("DBSIZE <>", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeGreaterThan(String value) {
            addCriterion("DBSIZE >", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeGreaterThanOrEqualTo(String value) {
            addCriterion("DBSIZE >=", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeLessThan(String value) {
            addCriterion("DBSIZE <", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeLessThanOrEqualTo(String value) {
            addCriterion("DBSIZE <=", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeLike(String value) {
            addCriterion("DBSIZE like", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeNotLike(String value) {
            addCriterion("DBSIZE not like", value, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeIn(List<String> values) {
            addCriterion("DBSIZE in", values, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeNotIn(List<String> values) {
            addCriterion("DBSIZE not in", values, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeBetween(String value1, String value2) {
            addCriterion("DBSIZE between", value1, value2, "dbsize");
            return (Criteria) this;
        }

        public Criteria andDbsizeNotBetween(String value1, String value2) {
            addCriterion("DBSIZE not between", value1, value2, "dbsize");
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