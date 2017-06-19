package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargerecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargerecordExample() {
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

        public Criteria andRechargeidIsNull() {
            addCriterion("RechargeId is null");
            return (Criteria) this;
        }

        public Criteria andRechargeidIsNotNull() {
            addCriterion("RechargeId is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeidEqualTo(Long value) {
            addCriterion("RechargeId =", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotEqualTo(Long value) {
            addCriterion("RechargeId <>", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidGreaterThan(Long value) {
            addCriterion("RechargeId >", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidGreaterThanOrEqualTo(Long value) {
            addCriterion("RechargeId >=", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidLessThan(Long value) {
            addCriterion("RechargeId <", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidLessThanOrEqualTo(Long value) {
            addCriterion("RechargeId <=", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidIn(List<Long> values) {
            addCriterion("RechargeId in", values, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotIn(List<Long> values) {
            addCriterion("RechargeId not in", values, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidBetween(Long value1, Long value2) {
            addCriterion("RechargeId between", value1, value2, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotBetween(Long value1, Long value2) {
            addCriterion("RechargeId not between", value1, value2, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRusernameIsNull() {
            addCriterion("RuserName is null");
            return (Criteria) this;
        }

        public Criteria andRusernameIsNotNull() {
            addCriterion("RuserName is not null");
            return (Criteria) this;
        }

        public Criteria andRusernameEqualTo(String value) {
            addCriterion("RuserName =", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameNotEqualTo(String value) {
            addCriterion("RuserName <>", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameGreaterThan(String value) {
            addCriterion("RuserName >", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameGreaterThanOrEqualTo(String value) {
            addCriterion("RuserName >=", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameLessThan(String value) {
            addCriterion("RuserName <", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameLessThanOrEqualTo(String value) {
            addCriterion("RuserName <=", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameLike(String value) {
            addCriterion("RuserName like", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameNotLike(String value) {
            addCriterion("RuserName not like", value, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameIn(List<String> values) {
            addCriterion("RuserName in", values, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameNotIn(List<String> values) {
            addCriterion("RuserName not in", values, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameBetween(String value1, String value2) {
            addCriterion("RuserName between", value1, value2, "rusername");
            return (Criteria) this;
        }

        public Criteria andRusernameNotBetween(String value1, String value2) {
            addCriterion("RuserName not between", value1, value2, "rusername");
            return (Criteria) this;
        }

        public Criteria andRwxopenidIsNull() {
            addCriterion("RwxOpenId is null");
            return (Criteria) this;
        }

        public Criteria andRwxopenidIsNotNull() {
            addCriterion("RwxOpenId is not null");
            return (Criteria) this;
        }

        public Criteria andRwxopenidEqualTo(String value) {
            addCriterion("RwxOpenId =", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidNotEqualTo(String value) {
            addCriterion("RwxOpenId <>", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidGreaterThan(String value) {
            addCriterion("RwxOpenId >", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidGreaterThanOrEqualTo(String value) {
            addCriterion("RwxOpenId >=", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidLessThan(String value) {
            addCriterion("RwxOpenId <", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidLessThanOrEqualTo(String value) {
            addCriterion("RwxOpenId <=", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidLike(String value) {
            addCriterion("RwxOpenId like", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidNotLike(String value) {
            addCriterion("RwxOpenId not like", value, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidIn(List<String> values) {
            addCriterion("RwxOpenId in", values, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidNotIn(List<String> values) {
            addCriterion("RwxOpenId not in", values, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidBetween(String value1, String value2) {
            addCriterion("RwxOpenId between", value1, value2, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRwxopenidNotBetween(String value1, String value2) {
            addCriterion("RwxOpenId not between", value1, value2, "rwxopenid");
            return (Criteria) this;
        }

        public Criteria andRmoneyIsNull() {
            addCriterion("Rmoney is null");
            return (Criteria) this;
        }

        public Criteria andRmoneyIsNotNull() {
            addCriterion("Rmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRmoneyEqualTo(Long value) {
            addCriterion("Rmoney =", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotEqualTo(Long value) {
            addCriterion("Rmoney <>", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyGreaterThan(Long value) {
            addCriterion("Rmoney >", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("Rmoney >=", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyLessThan(Long value) {
            addCriterion("Rmoney <", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyLessThanOrEqualTo(Long value) {
            addCriterion("Rmoney <=", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyIn(List<Long> values) {
            addCriterion("Rmoney in", values, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotIn(List<Long> values) {
            addCriterion("Rmoney not in", values, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyBetween(Long value1, Long value2) {
            addCriterion("Rmoney between", value1, value2, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotBetween(Long value1, Long value2) {
            addCriterion("Rmoney not between", value1, value2, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRgiftticketIsNull() {
            addCriterion("RGiftTicket is null");
            return (Criteria) this;
        }

        public Criteria andRgiftticketIsNotNull() {
            addCriterion("RGiftTicket is not null");
            return (Criteria) this;
        }

        public Criteria andRgiftticketEqualTo(Long value) {
            addCriterion("RGiftTicket =", value, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketNotEqualTo(Long value) {
            addCriterion("RGiftTicket <>", value, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketGreaterThan(Long value) {
            addCriterion("RGiftTicket >", value, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketGreaterThanOrEqualTo(Long value) {
            addCriterion("RGiftTicket >=", value, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketLessThan(Long value) {
            addCriterion("RGiftTicket <", value, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketLessThanOrEqualTo(Long value) {
            addCriterion("RGiftTicket <=", value, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketIn(List<Long> values) {
            addCriterion("RGiftTicket in", values, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketNotIn(List<Long> values) {
            addCriterion("RGiftTicket not in", values, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketBetween(Long value1, Long value2) {
            addCriterion("RGiftTicket between", value1, value2, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRgiftticketNotBetween(Long value1, Long value2) {
            addCriterion("RGiftTicket not between", value1, value2, "rgiftticket");
            return (Criteria) this;
        }

        public Criteria andRordersnIsNull() {
            addCriterion("RorderSn is null");
            return (Criteria) this;
        }

        public Criteria andRordersnIsNotNull() {
            addCriterion("RorderSn is not null");
            return (Criteria) this;
        }

        public Criteria andRordersnEqualTo(String value) {
            addCriterion("RorderSn =", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnNotEqualTo(String value) {
            addCriterion("RorderSn <>", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnGreaterThan(String value) {
            addCriterion("RorderSn >", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnGreaterThanOrEqualTo(String value) {
            addCriterion("RorderSn >=", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnLessThan(String value) {
            addCriterion("RorderSn <", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnLessThanOrEqualTo(String value) {
            addCriterion("RorderSn <=", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnLike(String value) {
            addCriterion("RorderSn like", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnNotLike(String value) {
            addCriterion("RorderSn not like", value, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnIn(List<String> values) {
            addCriterion("RorderSn in", values, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnNotIn(List<String> values) {
            addCriterion("RorderSn not in", values, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnBetween(String value1, String value2) {
            addCriterion("RorderSn between", value1, value2, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRordersnNotBetween(String value1, String value2) {
            addCriterion("RorderSn not between", value1, value2, "rordersn");
            return (Criteria) this;
        }

        public Criteria andRaddtimeIsNull() {
            addCriterion("RaddTime is null");
            return (Criteria) this;
        }

        public Criteria andRaddtimeIsNotNull() {
            addCriterion("RaddTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaddtimeEqualTo(Date value) {
            addCriterion("RaddTime =", value, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeNotEqualTo(Date value) {
            addCriterion("RaddTime <>", value, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeGreaterThan(Date value) {
            addCriterion("RaddTime >", value, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RaddTime >=", value, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeLessThan(Date value) {
            addCriterion("RaddTime <", value, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("RaddTime <=", value, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeIn(List<Date> values) {
            addCriterion("RaddTime in", values, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeNotIn(List<Date> values) {
            addCriterion("RaddTime not in", values, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeBetween(Date value1, Date value2) {
            addCriterion("RaddTime between", value1, value2, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("RaddTime not between", value1, value2, "raddtime");
            return (Criteria) this;
        }

        public Criteria andRpaystateIsNull() {
            addCriterion("RpayState is null");
            return (Criteria) this;
        }

        public Criteria andRpaystateIsNotNull() {
            addCriterion("RpayState is not null");
            return (Criteria) this;
        }

        public Criteria andRpaystateEqualTo(Integer value) {
            addCriterion("RpayState =", value, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateNotEqualTo(Integer value) {
            addCriterion("RpayState <>", value, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateGreaterThan(Integer value) {
            addCriterion("RpayState >", value, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RpayState >=", value, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateLessThan(Integer value) {
            addCriterion("RpayState <", value, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateLessThanOrEqualTo(Integer value) {
            addCriterion("RpayState <=", value, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateIn(List<Integer> values) {
            addCriterion("RpayState in", values, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateNotIn(List<Integer> values) {
            addCriterion("RpayState not in", values, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateBetween(Integer value1, Integer value2) {
            addCriterion("RpayState between", value1, value2, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaystateNotBetween(Integer value1, Integer value2) {
            addCriterion("RpayState not between", value1, value2, "rpaystate");
            return (Criteria) this;
        }

        public Criteria andRpaywayIsNull() {
            addCriterion("RPayWay is null");
            return (Criteria) this;
        }

        public Criteria andRpaywayIsNotNull() {
            addCriterion("RPayWay is not null");
            return (Criteria) this;
        }

        public Criteria andRpaywayEqualTo(Integer value) {
            addCriterion("RPayWay =", value, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayNotEqualTo(Integer value) {
            addCriterion("RPayWay <>", value, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayGreaterThan(Integer value) {
            addCriterion("RPayWay >", value, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayGreaterThanOrEqualTo(Integer value) {
            addCriterion("RPayWay >=", value, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayLessThan(Integer value) {
            addCriterion("RPayWay <", value, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayLessThanOrEqualTo(Integer value) {
            addCriterion("RPayWay <=", value, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayIn(List<Integer> values) {
            addCriterion("RPayWay in", values, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayNotIn(List<Integer> values) {
            addCriterion("RPayWay not in", values, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayBetween(Integer value1, Integer value2) {
            addCriterion("RPayWay between", value1, value2, "rpayway");
            return (Criteria) this;
        }

        public Criteria andRpaywayNotBetween(Integer value1, Integer value2) {
            addCriterion("RPayWay not between", value1, value2, "rpayway");
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