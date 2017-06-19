package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardExample() {
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

        public Criteria andCardidIsNull() {
            addCriterion("cardId is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("cardId is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(Long value) {
            addCriterion("cardId =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(Long value) {
            addCriterion("cardId <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(Long value) {
            addCriterion("cardId >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(Long value) {
            addCriterion("cardId >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(Long value) {
            addCriterion("cardId <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(Long value) {
            addCriterion("cardId <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<Long> values) {
            addCriterion("cardId in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<Long> values) {
            addCriterion("cardId not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(Long value1, Long value2) {
            addCriterion("cardId between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(Long value1, Long value2) {
            addCriterion("cardId not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIsNull() {
            addCriterion("couponCode is null");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIsNotNull() {
            addCriterion("couponCode is not null");
            return (Criteria) this;
        }

        public Criteria andCouponcodeEqualTo(String value) {
            addCriterion("couponCode =", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeNotEqualTo(String value) {
            addCriterion("couponCode <>", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeGreaterThan(String value) {
            addCriterion("couponCode >", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeGreaterThanOrEqualTo(String value) {
            addCriterion("couponCode >=", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeLessThan(String value) {
            addCriterion("couponCode <", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeLessThanOrEqualTo(String value) {
            addCriterion("couponCode <=", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeLike(String value) {
            addCriterion("couponCode like", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeNotLike(String value) {
            addCriterion("couponCode not like", value, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIn(List<String> values) {
            addCriterion("couponCode in", values, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeNotIn(List<String> values) {
            addCriterion("couponCode not in", values, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeBetween(String value1, String value2) {
            addCriterion("couponCode between", value1, value2, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponcodeNotBetween(String value1, String value2) {
            addCriterion("couponCode not between", value1, value2, "couponcode");
            return (Criteria) this;
        }

        public Criteria andCouponnameIsNull() {
            addCriterion("couponName is null");
            return (Criteria) this;
        }

        public Criteria andCouponnameIsNotNull() {
            addCriterion("couponName is not null");
            return (Criteria) this;
        }

        public Criteria andCouponnameEqualTo(String value) {
            addCriterion("couponName =", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameNotEqualTo(String value) {
            addCriterion("couponName <>", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameGreaterThan(String value) {
            addCriterion("couponName >", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameGreaterThanOrEqualTo(String value) {
            addCriterion("couponName >=", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameLessThan(String value) {
            addCriterion("couponName <", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameLessThanOrEqualTo(String value) {
            addCriterion("couponName <=", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameLike(String value) {
            addCriterion("couponName like", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameNotLike(String value) {
            addCriterion("couponName not like", value, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameIn(List<String> values) {
            addCriterion("couponName in", values, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameNotIn(List<String> values) {
            addCriterion("couponName not in", values, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameBetween(String value1, String value2) {
            addCriterion("couponName between", value1, value2, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponnameNotBetween(String value1, String value2) {
            addCriterion("couponName not between", value1, value2, "couponname");
            return (Criteria) this;
        }

        public Criteria andCouponpriceIsNull() {
            addCriterion("couponPrice is null");
            return (Criteria) this;
        }

        public Criteria andCouponpriceIsNotNull() {
            addCriterion("couponPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCouponpriceEqualTo(Double value) {
            addCriterion("couponPrice =", value, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceNotEqualTo(Double value) {
            addCriterion("couponPrice <>", value, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceGreaterThan(Double value) {
            addCriterion("couponPrice >", value, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("couponPrice >=", value, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceLessThan(Double value) {
            addCriterion("couponPrice <", value, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceLessThanOrEqualTo(Double value) {
            addCriterion("couponPrice <=", value, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceIn(List<Double> values) {
            addCriterion("couponPrice in", values, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceNotIn(List<Double> values) {
            addCriterion("couponPrice not in", values, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceBetween(Double value1, Double value2) {
            addCriterion("couponPrice between", value1, value2, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCouponpriceNotBetween(Double value1, Double value2) {
            addCriterion("couponPrice not between", value1, value2, "couponprice");
            return (Criteria) this;
        }

        public Criteria andCardstateIsNull() {
            addCriterion("cardState is null");
            return (Criteria) this;
        }

        public Criteria andCardstateIsNotNull() {
            addCriterion("cardState is not null");
            return (Criteria) this;
        }

        public Criteria andCardstateEqualTo(String value) {
            addCriterion("cardState =", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateNotEqualTo(String value) {
            addCriterion("cardState <>", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateGreaterThan(String value) {
            addCriterion("cardState >", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateGreaterThanOrEqualTo(String value) {
            addCriterion("cardState >=", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateLessThan(String value) {
            addCriterion("cardState <", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateLessThanOrEqualTo(String value) {
            addCriterion("cardState <=", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateLike(String value) {
            addCriterion("cardState like", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateNotLike(String value) {
            addCriterion("cardState not like", value, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateIn(List<String> values) {
            addCriterion("cardState in", values, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateNotIn(List<String> values) {
            addCriterion("cardState not in", values, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateBetween(String value1, String value2) {
            addCriterion("cardState between", value1, value2, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardstateNotBetween(String value1, String value2) {
            addCriterion("cardState not between", value1, value2, "cardstate");
            return (Criteria) this;
        }

        public Criteria andCardcodeIsNull() {
            addCriterion("cardCode is null");
            return (Criteria) this;
        }

        public Criteria andCardcodeIsNotNull() {
            addCriterion("cardCode is not null");
            return (Criteria) this;
        }

        public Criteria andCardcodeEqualTo(String value) {
            addCriterion("cardCode =", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotEqualTo(String value) {
            addCriterion("cardCode <>", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeGreaterThan(String value) {
            addCriterion("cardCode >", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cardCode >=", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLessThan(String value) {
            addCriterion("cardCode <", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLessThanOrEqualTo(String value) {
            addCriterion("cardCode <=", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLike(String value) {
            addCriterion("cardCode like", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotLike(String value) {
            addCriterion("cardCode not like", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeIn(List<String> values) {
            addCriterion("cardCode in", values, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotIn(List<String> values) {
            addCriterion("cardCode not in", values, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeBetween(String value1, String value2) {
            addCriterion("cardCode between", value1, value2, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotBetween(String value1, String value2) {
            addCriterion("cardCode not between", value1, value2, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardpwdIsNull() {
            addCriterion("cardPwd is null");
            return (Criteria) this;
        }

        public Criteria andCardpwdIsNotNull() {
            addCriterion("cardPwd is not null");
            return (Criteria) this;
        }

        public Criteria andCardpwdEqualTo(String value) {
            addCriterion("cardPwd =", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdNotEqualTo(String value) {
            addCriterion("cardPwd <>", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdGreaterThan(String value) {
            addCriterion("cardPwd >", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdGreaterThanOrEqualTo(String value) {
            addCriterion("cardPwd >=", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdLessThan(String value) {
            addCriterion("cardPwd <", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdLessThanOrEqualTo(String value) {
            addCriterion("cardPwd <=", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdLike(String value) {
            addCriterion("cardPwd like", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdNotLike(String value) {
            addCriterion("cardPwd not like", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdIn(List<String> values) {
            addCriterion("cardPwd in", values, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdNotIn(List<String> values) {
            addCriterion("cardPwd not in", values, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdBetween(String value1, String value2) {
            addCriterion("cardPwd between", value1, value2, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdNotBetween(String value1, String value2) {
            addCriterion("cardPwd not between", value1, value2, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andValidtimestartIsNull() {
            addCriterion("validTimeStart is null");
            return (Criteria) this;
        }

        public Criteria andValidtimestartIsNotNull() {
            addCriterion("validTimeStart is not null");
            return (Criteria) this;
        }

        public Criteria andValidtimestartEqualTo(Date value) {
            addCriterion("validTimeStart =", value, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartNotEqualTo(Date value) {
            addCriterion("validTimeStart <>", value, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartGreaterThan(Date value) {
            addCriterion("validTimeStart >", value, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartGreaterThanOrEqualTo(Date value) {
            addCriterion("validTimeStart >=", value, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartLessThan(Date value) {
            addCriterion("validTimeStart <", value, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartLessThanOrEqualTo(Date value) {
            addCriterion("validTimeStart <=", value, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartIn(List<Date> values) {
            addCriterion("validTimeStart in", values, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartNotIn(List<Date> values) {
            addCriterion("validTimeStart not in", values, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartBetween(Date value1, Date value2) {
            addCriterion("validTimeStart between", value1, value2, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimestartNotBetween(Date value1, Date value2) {
            addCriterion("validTimeStart not between", value1, value2, "validtimestart");
            return (Criteria) this;
        }

        public Criteria andValidtimeendIsNull() {
            addCriterion("validTimeEnd is null");
            return (Criteria) this;
        }

        public Criteria andValidtimeendIsNotNull() {
            addCriterion("validTimeEnd is not null");
            return (Criteria) this;
        }

        public Criteria andValidtimeendEqualTo(Date value) {
            addCriterion("validTimeEnd =", value, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendNotEqualTo(Date value) {
            addCriterion("validTimeEnd <>", value, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendGreaterThan(Date value) {
            addCriterion("validTimeEnd >", value, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendGreaterThanOrEqualTo(Date value) {
            addCriterion("validTimeEnd >=", value, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendLessThan(Date value) {
            addCriterion("validTimeEnd <", value, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendLessThanOrEqualTo(Date value) {
            addCriterion("validTimeEnd <=", value, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendIn(List<Date> values) {
            addCriterion("validTimeEnd in", values, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendNotIn(List<Date> values) {
            addCriterion("validTimeEnd not in", values, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendBetween(Date value1, Date value2) {
            addCriterion("validTimeEnd between", value1, value2, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andValidtimeendNotBetween(Date value1, Date value2) {
            addCriterion("validTimeEnd not between", value1, value2, "validtimeend");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeIsNull() {
            addCriterion("cardGrantTime is null");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeIsNotNull() {
            addCriterion("cardGrantTime is not null");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeEqualTo(Date value) {
            addCriterion("cardGrantTime =", value, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeNotEqualTo(Date value) {
            addCriterion("cardGrantTime <>", value, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeGreaterThan(Date value) {
            addCriterion("cardGrantTime >", value, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cardGrantTime >=", value, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeLessThan(Date value) {
            addCriterion("cardGrantTime <", value, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeLessThanOrEqualTo(Date value) {
            addCriterion("cardGrantTime <=", value, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeIn(List<Date> values) {
            addCriterion("cardGrantTime in", values, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeNotIn(List<Date> values) {
            addCriterion("cardGrantTime not in", values, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeBetween(Date value1, Date value2) {
            addCriterion("cardGrantTime between", value1, value2, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardgranttimeNotBetween(Date value1, Date value2) {
            addCriterion("cardGrantTime not between", value1, value2, "cardgranttime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeIsNull() {
            addCriterion("cardValidTime is null");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeIsNotNull() {
            addCriterion("cardValidTime is not null");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeEqualTo(Date value) {
            addCriterion("cardValidTime =", value, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeNotEqualTo(Date value) {
            addCriterion("cardValidTime <>", value, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeGreaterThan(Date value) {
            addCriterion("cardValidTime >", value, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cardValidTime >=", value, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeLessThan(Date value) {
            addCriterion("cardValidTime <", value, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeLessThanOrEqualTo(Date value) {
            addCriterion("cardValidTime <=", value, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeIn(List<Date> values) {
            addCriterion("cardValidTime in", values, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeNotIn(List<Date> values) {
            addCriterion("cardValidTime not in", values, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeBetween(Date value1, Date value2) {
            addCriterion("cardValidTime between", value1, value2, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andCardvalidtimeNotBetween(Date value1, Date value2) {
            addCriterion("cardValidTime not between", value1, value2, "cardvalidtime");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isValid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isValid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(String value) {
            addCriterion("isValid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(String value) {
            addCriterion("isValid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(String value) {
            addCriterion("isValid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(String value) {
            addCriterion("isValid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(String value) {
            addCriterion("isValid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(String value) {
            addCriterion("isValid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLike(String value) {
            addCriterion("isValid like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotLike(String value) {
            addCriterion("isValid not like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<String> values) {
            addCriterion("isValid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<String> values) {
            addCriterion("isValid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(String value1, String value2) {
            addCriterion("isValid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(String value1, String value2) {
            addCriterion("isValid not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("isActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("isActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("isActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("isActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("isActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("isActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("isActive like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("isActive not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("isActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("isActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("isActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("isActive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andActividIsNull() {
            addCriterion("activId is null");
            return (Criteria) this;
        }

        public Criteria andActividIsNotNull() {
            addCriterion("activId is not null");
            return (Criteria) this;
        }

        public Criteria andActividEqualTo(Long value) {
            addCriterion("activId =", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividNotEqualTo(Long value) {
            addCriterion("activId <>", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividGreaterThan(Long value) {
            addCriterion("activId >", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividGreaterThanOrEqualTo(Long value) {
            addCriterion("activId >=", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividLessThan(Long value) {
            addCriterion("activId <", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividLessThanOrEqualTo(Long value) {
            addCriterion("activId <=", value, "activid");
            return (Criteria) this;
        }

        public Criteria andActividIn(List<Long> values) {
            addCriterion("activId in", values, "activid");
            return (Criteria) this;
        }

        public Criteria andActividNotIn(List<Long> values) {
            addCriterion("activId not in", values, "activid");
            return (Criteria) this;
        }

        public Criteria andActividBetween(Long value1, Long value2) {
            addCriterion("activId between", value1, value2, "activid");
            return (Criteria) this;
        }

        public Criteria andActividNotBetween(Long value1, Long value2) {
            addCriterion("activId not between", value1, value2, "activid");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNull() {
            addCriterion("couponId is null");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNotNull() {
            addCriterion("couponId is not null");
            return (Criteria) this;
        }

        public Criteria andCouponidEqualTo(Long value) {
            addCriterion("couponId =", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotEqualTo(Long value) {
            addCriterion("couponId <>", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThan(Long value) {
            addCriterion("couponId >", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThanOrEqualTo(Long value) {
            addCriterion("couponId >=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThan(Long value) {
            addCriterion("couponId <", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThanOrEqualTo(Long value) {
            addCriterion("couponId <=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidIn(List<Long> values) {
            addCriterion("couponId in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotIn(List<Long> values) {
            addCriterion("couponId not in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidBetween(Long value1, Long value2) {
            addCriterion("couponId between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotBetween(Long value1, Long value2) {
            addCriterion("couponId not between", value1, value2, "couponid");
            return (Criteria) this;
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

        public Criteria andCpontempidIsNull() {
            addCriterion("cpontempId is null");
            return (Criteria) this;
        }

        public Criteria andCpontempidIsNotNull() {
            addCriterion("cpontempId is not null");
            return (Criteria) this;
        }

        public Criteria andCpontempidEqualTo(Long value) {
            addCriterion("cpontempId =", value, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidNotEqualTo(Long value) {
            addCriterion("cpontempId <>", value, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidGreaterThan(Long value) {
            addCriterion("cpontempId >", value, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidGreaterThanOrEqualTo(Long value) {
            addCriterion("cpontempId >=", value, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidLessThan(Long value) {
            addCriterion("cpontempId <", value, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidLessThanOrEqualTo(Long value) {
            addCriterion("cpontempId <=", value, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidIn(List<Long> values) {
            addCriterion("cpontempId in", values, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidNotIn(List<Long> values) {
            addCriterion("cpontempId not in", values, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidBetween(Long value1, Long value2) {
            addCriterion("cpontempId between", value1, value2, "cpontempid");
            return (Criteria) this;
        }

        public Criteria andCpontempidNotBetween(Long value1, Long value2) {
            addCriterion("cpontempId not between", value1, value2, "cpontempid");
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