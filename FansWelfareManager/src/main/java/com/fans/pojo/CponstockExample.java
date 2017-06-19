package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CponstockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CponstockExample() {
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

        public Criteria andCoupontypeIsNull() {
            addCriterion("couponType is null");
            return (Criteria) this;
        }

        public Criteria andCoupontypeIsNotNull() {
            addCriterion("couponType is not null");
            return (Criteria) this;
        }

        public Criteria andCoupontypeEqualTo(String value) {
            addCriterion("couponType =", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeNotEqualTo(String value) {
            addCriterion("couponType <>", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeGreaterThan(String value) {
            addCriterion("couponType >", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeGreaterThanOrEqualTo(String value) {
            addCriterion("couponType >=", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeLessThan(String value) {
            addCriterion("couponType <", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeLessThanOrEqualTo(String value) {
            addCriterion("couponType <=", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeLike(String value) {
            addCriterion("couponType like", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeNotLike(String value) {
            addCriterion("couponType not like", value, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeIn(List<String> values) {
            addCriterion("couponType in", values, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeNotIn(List<String> values) {
            addCriterion("couponType not in", values, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeBetween(String value1, String value2) {
            addCriterion("couponType between", value1, value2, "coupontype");
            return (Criteria) this;
        }

        public Criteria andCoupontypeNotBetween(String value1, String value2) {
            addCriterion("couponType not between", value1, value2, "coupontype");
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