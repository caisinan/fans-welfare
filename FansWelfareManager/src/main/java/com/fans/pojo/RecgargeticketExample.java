package com.fans.pojo;

import java.util.ArrayList;
import java.util.List;

public class RecgargeticketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecgargeticketExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIsNull() {
            addCriterion("RechargeMoney is null");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIsNotNull() {
            addCriterion("RechargeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyEqualTo(Long value) {
            addCriterion("RechargeMoney =", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotEqualTo(Long value) {
            addCriterion("RechargeMoney <>", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyGreaterThan(Long value) {
            addCriterion("RechargeMoney >", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("RechargeMoney >=", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyLessThan(Long value) {
            addCriterion("RechargeMoney <", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyLessThanOrEqualTo(Long value) {
            addCriterion("RechargeMoney <=", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIn(List<Long> values) {
            addCriterion("RechargeMoney in", values, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotIn(List<Long> values) {
            addCriterion("RechargeMoney not in", values, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyBetween(Long value1, Long value2) {
            addCriterion("RechargeMoney between", value1, value2, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotBetween(Long value1, Long value2) {
            addCriterion("RechargeMoney not between", value1, value2, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargeticketIsNull() {
            addCriterion("RechargeTicket is null");
            return (Criteria) this;
        }

        public Criteria andRechargeticketIsNotNull() {
            addCriterion("RechargeTicket is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeticketEqualTo(Long value) {
            addCriterion("RechargeTicket =", value, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketNotEqualTo(Long value) {
            addCriterion("RechargeTicket <>", value, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketGreaterThan(Long value) {
            addCriterion("RechargeTicket >", value, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketGreaterThanOrEqualTo(Long value) {
            addCriterion("RechargeTicket >=", value, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketLessThan(Long value) {
            addCriterion("RechargeTicket <", value, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketLessThanOrEqualTo(Long value) {
            addCriterion("RechargeTicket <=", value, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketIn(List<Long> values) {
            addCriterion("RechargeTicket in", values, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketNotIn(List<Long> values) {
            addCriterion("RechargeTicket not in", values, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketBetween(Long value1, Long value2) {
            addCriterion("RechargeTicket between", value1, value2, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andRechargeticketNotBetween(Long value1, Long value2) {
            addCriterion("RechargeTicket not between", value1, value2, "rechargeticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketIsNull() {
            addCriterion("ActivitTicket is null");
            return (Criteria) this;
        }

        public Criteria andActivitticketIsNotNull() {
            addCriterion("ActivitTicket is not null");
            return (Criteria) this;
        }

        public Criteria andActivitticketEqualTo(Long value) {
            addCriterion("ActivitTicket =", value, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketNotEqualTo(Long value) {
            addCriterion("ActivitTicket <>", value, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketGreaterThan(Long value) {
            addCriterion("ActivitTicket >", value, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketGreaterThanOrEqualTo(Long value) {
            addCriterion("ActivitTicket >=", value, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketLessThan(Long value) {
            addCriterion("ActivitTicket <", value, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketLessThanOrEqualTo(Long value) {
            addCriterion("ActivitTicket <=", value, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketIn(List<Long> values) {
            addCriterion("ActivitTicket in", values, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketNotIn(List<Long> values) {
            addCriterion("ActivitTicket not in", values, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketBetween(Long value1, Long value2) {
            addCriterion("ActivitTicket between", value1, value2, "activitticket");
            return (Criteria) this;
        }

        public Criteria andActivitticketNotBetween(Long value1, Long value2) {
            addCriterion("ActivitTicket not between", value1, value2, "activitticket");
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