package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpontempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpontempExample() {
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

        public Criteria andCponidIsNull() {
            addCriterion("cponId is null");
            return (Criteria) this;
        }

        public Criteria andCponidIsNotNull() {
            addCriterion("cponId is not null");
            return (Criteria) this;
        }

        public Criteria andCponidEqualTo(Long value) {
            addCriterion("cponId =", value, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidNotEqualTo(Long value) {
            addCriterion("cponId <>", value, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidGreaterThan(Long value) {
            addCriterion("cponId >", value, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidGreaterThanOrEqualTo(Long value) {
            addCriterion("cponId >=", value, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidLessThan(Long value) {
            addCriterion("cponId <", value, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidLessThanOrEqualTo(Long value) {
            addCriterion("cponId <=", value, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidIn(List<Long> values) {
            addCriterion("cponId in", values, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidNotIn(List<Long> values) {
            addCriterion("cponId not in", values, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidBetween(Long value1, Long value2) {
            addCriterion("cponId between", value1, value2, "cponid");
            return (Criteria) this;
        }

        public Criteria andCponidNotBetween(Long value1, Long value2) {
            addCriterion("cponId not between", value1, value2, "cponid");
            return (Criteria) this;
        }

        public Criteria andCpontypeIsNull() {
            addCriterion("cponType is null");
            return (Criteria) this;
        }

        public Criteria andCpontypeIsNotNull() {
            addCriterion("cponType is not null");
            return (Criteria) this;
        }

        public Criteria andCpontypeEqualTo(String value) {
            addCriterion("cponType =", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeNotEqualTo(String value) {
            addCriterion("cponType <>", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeGreaterThan(String value) {
            addCriterion("cponType >", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeGreaterThanOrEqualTo(String value) {
            addCriterion("cponType >=", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeLessThan(String value) {
            addCriterion("cponType <", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeLessThanOrEqualTo(String value) {
            addCriterion("cponType <=", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeLike(String value) {
            addCriterion("cponType like", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeNotLike(String value) {
            addCriterion("cponType not like", value, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeIn(List<String> values) {
            addCriterion("cponType in", values, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeNotIn(List<String> values) {
            addCriterion("cponType not in", values, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeBetween(String value1, String value2) {
            addCriterion("cponType between", value1, value2, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCpontypeNotBetween(String value1, String value2) {
            addCriterion("cponType not between", value1, value2, "cpontype");
            return (Criteria) this;
        }

        public Criteria andCponcodeIsNull() {
            addCriterion("cponCode is null");
            return (Criteria) this;
        }

        public Criteria andCponcodeIsNotNull() {
            addCriterion("cponCode is not null");
            return (Criteria) this;
        }

        public Criteria andCponcodeEqualTo(String value) {
            addCriterion("cponCode =", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeNotEqualTo(String value) {
            addCriterion("cponCode <>", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeGreaterThan(String value) {
            addCriterion("cponCode >", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cponCode >=", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeLessThan(String value) {
            addCriterion("cponCode <", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeLessThanOrEqualTo(String value) {
            addCriterion("cponCode <=", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeLike(String value) {
            addCriterion("cponCode like", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeNotLike(String value) {
            addCriterion("cponCode not like", value, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeIn(List<String> values) {
            addCriterion("cponCode in", values, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeNotIn(List<String> values) {
            addCriterion("cponCode not in", values, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeBetween(String value1, String value2) {
            addCriterion("cponCode between", value1, value2, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponcodeNotBetween(String value1, String value2) {
            addCriterion("cponCode not between", value1, value2, "cponcode");
            return (Criteria) this;
        }

        public Criteria andCponnameIsNull() {
            addCriterion("cponName is null");
            return (Criteria) this;
        }

        public Criteria andCponnameIsNotNull() {
            addCriterion("cponName is not null");
            return (Criteria) this;
        }

        public Criteria andCponnameEqualTo(String value) {
            addCriterion("cponName =", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameNotEqualTo(String value) {
            addCriterion("cponName <>", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameGreaterThan(String value) {
            addCriterion("cponName >", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameGreaterThanOrEqualTo(String value) {
            addCriterion("cponName >=", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameLessThan(String value) {
            addCriterion("cponName <", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameLessThanOrEqualTo(String value) {
            addCriterion("cponName <=", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameLike(String value) {
            addCriterion("cponName like", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameNotLike(String value) {
            addCriterion("cponName not like", value, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameIn(List<String> values) {
            addCriterion("cponName in", values, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameNotIn(List<String> values) {
            addCriterion("cponName not in", values, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameBetween(String value1, String value2) {
            addCriterion("cponName between", value1, value2, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponnameNotBetween(String value1, String value2) {
            addCriterion("cponName not between", value1, value2, "cponname");
            return (Criteria) this;
        }

        public Criteria andCponpriceIsNull() {
            addCriterion("cponPrice is null");
            return (Criteria) this;
        }

        public Criteria andCponpriceIsNotNull() {
            addCriterion("cponPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCponpriceEqualTo(Double value) {
            addCriterion("cponPrice =", value, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceNotEqualTo(Double value) {
            addCriterion("cponPrice <>", value, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceGreaterThan(Double value) {
            addCriterion("cponPrice >", value, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cponPrice >=", value, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceLessThan(Double value) {
            addCriterion("cponPrice <", value, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceLessThanOrEqualTo(Double value) {
            addCriterion("cponPrice <=", value, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceIn(List<Double> values) {
            addCriterion("cponPrice in", values, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceNotIn(List<Double> values) {
            addCriterion("cponPrice not in", values, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceBetween(Double value1, Double value2) {
            addCriterion("cponPrice between", value1, value2, "cponprice");
            return (Criteria) this;
        }

        public Criteria andCponpriceNotBetween(Double value1, Double value2) {
            addCriterion("cponPrice not between", value1, value2, "cponprice");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponIsNull() {
            addCriterion("prepNumCoupon is null");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponIsNotNull() {
            addCriterion("prepNumCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponEqualTo(Integer value) {
            addCriterion("prepNumCoupon =", value, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponNotEqualTo(Integer value) {
            addCriterion("prepNumCoupon <>", value, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponGreaterThan(Integer value) {
            addCriterion("prepNumCoupon >", value, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("prepNumCoupon >=", value, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponLessThan(Integer value) {
            addCriterion("prepNumCoupon <", value, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponLessThanOrEqualTo(Integer value) {
            addCriterion("prepNumCoupon <=", value, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponIn(List<Integer> values) {
            addCriterion("prepNumCoupon in", values, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponNotIn(List<Integer> values) {
            addCriterion("prepNumCoupon not in", values, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponBetween(Integer value1, Integer value2) {
            addCriterion("prepNumCoupon between", value1, value2, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepnumcouponNotBetween(Integer value1, Integer value2) {
            addCriterion("prepNumCoupon not between", value1, value2, "prepnumcoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponIsNull() {
            addCriterion("prepMoneyCoupon is null");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponIsNotNull() {
            addCriterion("prepMoneyCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponEqualTo(Double value) {
            addCriterion("prepMoneyCoupon =", value, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponNotEqualTo(Double value) {
            addCriterion("prepMoneyCoupon <>", value, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponGreaterThan(Double value) {
            addCriterion("prepMoneyCoupon >", value, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponGreaterThanOrEqualTo(Double value) {
            addCriterion("prepMoneyCoupon >=", value, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponLessThan(Double value) {
            addCriterion("prepMoneyCoupon <", value, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponLessThanOrEqualTo(Double value) {
            addCriterion("prepMoneyCoupon <=", value, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponIn(List<Double> values) {
            addCriterion("prepMoneyCoupon in", values, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponNotIn(List<Double> values) {
            addCriterion("prepMoneyCoupon not in", values, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponBetween(Double value1, Double value2) {
            addCriterion("prepMoneyCoupon between", value1, value2, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andPrepmoneycouponNotBetween(Double value1, Double value2) {
            addCriterion("prepMoneyCoupon not between", value1, value2, "prepmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponIsNull() {
            addCriterion("realNumCoupon is null");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponIsNotNull() {
            addCriterion("realNumCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponEqualTo(Integer value) {
            addCriterion("realNumCoupon =", value, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponNotEqualTo(Integer value) {
            addCriterion("realNumCoupon <>", value, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponGreaterThan(Integer value) {
            addCriterion("realNumCoupon >", value, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("realNumCoupon >=", value, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponLessThan(Integer value) {
            addCriterion("realNumCoupon <", value, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponLessThanOrEqualTo(Integer value) {
            addCriterion("realNumCoupon <=", value, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponIn(List<Integer> values) {
            addCriterion("realNumCoupon in", values, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponNotIn(List<Integer> values) {
            addCriterion("realNumCoupon not in", values, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponBetween(Integer value1, Integer value2) {
            addCriterion("realNumCoupon between", value1, value2, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealnumcouponNotBetween(Integer value1, Integer value2) {
            addCriterion("realNumCoupon not between", value1, value2, "realnumcoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponIsNull() {
            addCriterion("realMoneyCoupon is null");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponIsNotNull() {
            addCriterion("realMoneyCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponEqualTo(Double value) {
            addCriterion("realMoneyCoupon =", value, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponNotEqualTo(Double value) {
            addCriterion("realMoneyCoupon <>", value, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponGreaterThan(Double value) {
            addCriterion("realMoneyCoupon >", value, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponGreaterThanOrEqualTo(Double value) {
            addCriterion("realMoneyCoupon >=", value, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponLessThan(Double value) {
            addCriterion("realMoneyCoupon <", value, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponLessThanOrEqualTo(Double value) {
            addCriterion("realMoneyCoupon <=", value, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponIn(List<Double> values) {
            addCriterion("realMoneyCoupon in", values, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponNotIn(List<Double> values) {
            addCriterion("realMoneyCoupon not in", values, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponBetween(Double value1, Double value2) {
            addCriterion("realMoneyCoupon between", value1, value2, "realmoneycoupon");
            return (Criteria) this;
        }

        public Criteria andRealmoneycouponNotBetween(Double value1, Double value2) {
            addCriterion("realMoneyCoupon not between", value1, value2, "realmoneycoupon");
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

        public Criteria andValidcardnumIsNull() {
            addCriterion("validCardNum is null");
            return (Criteria) this;
        }

        public Criteria andValidcardnumIsNotNull() {
            addCriterion("validCardNum is not null");
            return (Criteria) this;
        }

        public Criteria andValidcardnumEqualTo(Integer value) {
            addCriterion("validCardNum =", value, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumNotEqualTo(Integer value) {
            addCriterion("validCardNum <>", value, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumGreaterThan(Integer value) {
            addCriterion("validCardNum >", value, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("validCardNum >=", value, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumLessThan(Integer value) {
            addCriterion("validCardNum <", value, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumLessThanOrEqualTo(Integer value) {
            addCriterion("validCardNum <=", value, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumIn(List<Integer> values) {
            addCriterion("validCardNum in", values, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumNotIn(List<Integer> values) {
            addCriterion("validCardNum not in", values, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumBetween(Integer value1, Integer value2) {
            addCriterion("validCardNum between", value1, value2, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andValidcardnumNotBetween(Integer value1, Integer value2) {
            addCriterion("validCardNum not between", value1, value2, "validcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumIsNull() {
            addCriterion("unvalidCardNum is null");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumIsNotNull() {
            addCriterion("unvalidCardNum is not null");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumEqualTo(Integer value) {
            addCriterion("unvalidCardNum =", value, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumNotEqualTo(Integer value) {
            addCriterion("unvalidCardNum <>", value, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumGreaterThan(Integer value) {
            addCriterion("unvalidCardNum >", value, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unvalidCardNum >=", value, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumLessThan(Integer value) {
            addCriterion("unvalidCardNum <", value, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumLessThanOrEqualTo(Integer value) {
            addCriterion("unvalidCardNum <=", value, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumIn(List<Integer> values) {
            addCriterion("unvalidCardNum in", values, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumNotIn(List<Integer> values) {
            addCriterion("unvalidCardNum not in", values, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumBetween(Integer value1, Integer value2) {
            addCriterion("unvalidCardNum between", value1, value2, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andUnvalidcardnumNotBetween(Integer value1, Integer value2) {
            addCriterion("unvalidCardNum not between", value1, value2, "unvalidcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumIsNull() {
            addCriterion("expiredCardNum is null");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumIsNotNull() {
            addCriterion("expiredCardNum is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumEqualTo(Integer value) {
            addCriterion("expiredCardNum =", value, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumNotEqualTo(Integer value) {
            addCriterion("expiredCardNum <>", value, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumGreaterThan(Integer value) {
            addCriterion("expiredCardNum >", value, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiredCardNum >=", value, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumLessThan(Integer value) {
            addCriterion("expiredCardNum <", value, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumLessThanOrEqualTo(Integer value) {
            addCriterion("expiredCardNum <=", value, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumIn(List<Integer> values) {
            addCriterion("expiredCardNum in", values, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumNotIn(List<Integer> values) {
            addCriterion("expiredCardNum not in", values, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumBetween(Integer value1, Integer value2) {
            addCriterion("expiredCardNum between", value1, value2, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andExpiredcardnumNotBetween(Integer value1, Integer value2) {
            addCriterion("expiredCardNum not between", value1, value2, "expiredcardnum");
            return (Criteria) this;
        }

        public Criteria andHascardkeyIsNull() {
            addCriterion("hasCardkey is null");
            return (Criteria) this;
        }

        public Criteria andHascardkeyIsNotNull() {
            addCriterion("hasCardkey is not null");
            return (Criteria) this;
        }

        public Criteria andHascardkeyEqualTo(String value) {
            addCriterion("hasCardkey =", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyNotEqualTo(String value) {
            addCriterion("hasCardkey <>", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyGreaterThan(String value) {
            addCriterion("hasCardkey >", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyGreaterThanOrEqualTo(String value) {
            addCriterion("hasCardkey >=", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyLessThan(String value) {
            addCriterion("hasCardkey <", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyLessThanOrEqualTo(String value) {
            addCriterion("hasCardkey <=", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyLike(String value) {
            addCriterion("hasCardkey like", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyNotLike(String value) {
            addCriterion("hasCardkey not like", value, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyIn(List<String> values) {
            addCriterion("hasCardkey in", values, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyNotIn(List<String> values) {
            addCriterion("hasCardkey not in", values, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyBetween(String value1, String value2) {
            addCriterion("hasCardkey between", value1, value2, "hascardkey");
            return (Criteria) this;
        }

        public Criteria andHascardkeyNotBetween(String value1, String value2) {
            addCriterion("hasCardkey not between", value1, value2, "hascardkey");
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