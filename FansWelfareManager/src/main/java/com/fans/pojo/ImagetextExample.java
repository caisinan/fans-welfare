package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImagetextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImagetextExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andButtontypeIsNull() {
            addCriterion("buttonType is null");
            return (Criteria) this;
        }

        public Criteria andButtontypeIsNotNull() {
            addCriterion("buttonType is not null");
            return (Criteria) this;
        }

        public Criteria andButtontypeEqualTo(String value) {
            addCriterion("buttonType =", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeNotEqualTo(String value) {
            addCriterion("buttonType <>", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeGreaterThan(String value) {
            addCriterion("buttonType >", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeGreaterThanOrEqualTo(String value) {
            addCriterion("buttonType >=", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeLessThan(String value) {
            addCriterion("buttonType <", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeLessThanOrEqualTo(String value) {
            addCriterion("buttonType <=", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeLike(String value) {
            addCriterion("buttonType like", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeNotLike(String value) {
            addCriterion("buttonType not like", value, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeIn(List<String> values) {
            addCriterion("buttonType in", values, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeNotIn(List<String> values) {
            addCriterion("buttonType not in", values, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeBetween(String value1, String value2) {
            addCriterion("buttonType between", value1, value2, "buttontype");
            return (Criteria) this;
        }

        public Criteria andButtontypeNotBetween(String value1, String value2) {
            addCriterion("buttonType not between", value1, value2, "buttontype");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("picUrl is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("picUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("picUrl =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("picUrl <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("picUrl >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("picUrl >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("picUrl <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("picUrl <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("picUrl like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("picUrl not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("picUrl in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("picUrl not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("picUrl between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("picUrl not between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoIsNull() {
            addCriterion("zhaiYao is null");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoIsNotNull() {
            addCriterion("zhaiYao is not null");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoEqualTo(String value) {
            addCriterion("zhaiYao =", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotEqualTo(String value) {
            addCriterion("zhaiYao <>", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoGreaterThan(String value) {
            addCriterion("zhaiYao >", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhaiYao >=", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoLessThan(String value) {
            addCriterion("zhaiYao <", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoLessThanOrEqualTo(String value) {
            addCriterion("zhaiYao <=", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoLike(String value) {
            addCriterion("zhaiYao like", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotLike(String value) {
            addCriterion("zhaiYao not like", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoIn(List<String> values) {
            addCriterion("zhaiYao in", values, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotIn(List<String> values) {
            addCriterion("zhaiYao not in", values, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoBetween(String value1, String value2) {
            addCriterion("zhaiYao between", value1, value2, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotBetween(String value1, String value2) {
            addCriterion("zhaiYao not between", value1, value2, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andSourcelinkIsNull() {
            addCriterion("sourceLink is null");
            return (Criteria) this;
        }

        public Criteria andSourcelinkIsNotNull() {
            addCriterion("sourceLink is not null");
            return (Criteria) this;
        }

        public Criteria andSourcelinkEqualTo(String value) {
            addCriterion("sourceLink =", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkNotEqualTo(String value) {
            addCriterion("sourceLink <>", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkGreaterThan(String value) {
            addCriterion("sourceLink >", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkGreaterThanOrEqualTo(String value) {
            addCriterion("sourceLink >=", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkLessThan(String value) {
            addCriterion("sourceLink <", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkLessThanOrEqualTo(String value) {
            addCriterion("sourceLink <=", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkLike(String value) {
            addCriterion("sourceLink like", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkNotLike(String value) {
            addCriterion("sourceLink not like", value, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkIn(List<String> values) {
            addCriterion("sourceLink in", values, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkNotIn(List<String> values) {
            addCriterion("sourceLink not in", values, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkBetween(String value1, String value2) {
            addCriterion("sourceLink between", value1, value2, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andSourcelinkNotBetween(String value1, String value2) {
            addCriterion("sourceLink not between", value1, value2, "sourcelink");
            return (Criteria) this;
        }

        public Criteria andCreateonIsNull() {
            addCriterion("createOn is null");
            return (Criteria) this;
        }

        public Criteria andCreateonIsNotNull() {
            addCriterion("createOn is not null");
            return (Criteria) this;
        }

        public Criteria andCreateonEqualTo(Date value) {
            addCriterion("createOn =", value, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonNotEqualTo(Date value) {
            addCriterion("createOn <>", value, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonGreaterThan(Date value) {
            addCriterion("createOn >", value, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonGreaterThanOrEqualTo(Date value) {
            addCriterion("createOn >=", value, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonLessThan(Date value) {
            addCriterion("createOn <", value, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonLessThanOrEqualTo(Date value) {
            addCriterion("createOn <=", value, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonIn(List<Date> values) {
            addCriterion("createOn in", values, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonNotIn(List<Date> values) {
            addCriterion("createOn not in", values, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonBetween(Date value1, Date value2) {
            addCriterion("createOn between", value1, value2, "createon");
            return (Criteria) this;
        }

        public Criteria andCreateonNotBetween(Date value1, Date value2) {
            addCriterion("createOn not between", value1, value2, "createon");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIsNull() {
            addCriterion("weekOfYear is null");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIsNotNull() {
            addCriterion("weekOfYear is not null");
            return (Criteria) this;
        }

        public Criteria andWeekofyearEqualTo(Integer value) {
            addCriterion("weekOfYear =", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotEqualTo(Integer value) {
            addCriterion("weekOfYear <>", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearGreaterThan(Integer value) {
            addCriterion("weekOfYear >", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekOfYear >=", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearLessThan(Integer value) {
            addCriterion("weekOfYear <", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearLessThanOrEqualTo(Integer value) {
            addCriterion("weekOfYear <=", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIn(List<Integer> values) {
            addCriterion("weekOfYear in", values, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotIn(List<Integer> values) {
            addCriterion("weekOfYear not in", values, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearBetween(Integer value1, Integer value2) {
            addCriterion("weekOfYear between", value1, value2, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotBetween(Integer value1, Integer value2) {
            addCriterion("weekOfYear not between", value1, value2, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andTwurlIsNull() {
            addCriterion("twUrl is null");
            return (Criteria) this;
        }

        public Criteria andTwurlIsNotNull() {
            addCriterion("twUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTwurlEqualTo(String value) {
            addCriterion("twUrl =", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlNotEqualTo(String value) {
            addCriterion("twUrl <>", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlGreaterThan(String value) {
            addCriterion("twUrl >", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlGreaterThanOrEqualTo(String value) {
            addCriterion("twUrl >=", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlLessThan(String value) {
            addCriterion("twUrl <", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlLessThanOrEqualTo(String value) {
            addCriterion("twUrl <=", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlLike(String value) {
            addCriterion("twUrl like", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlNotLike(String value) {
            addCriterion("twUrl not like", value, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlIn(List<String> values) {
            addCriterion("twUrl in", values, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlNotIn(List<String> values) {
            addCriterion("twUrl not in", values, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlBetween(String value1, String value2) {
            addCriterion("twUrl between", value1, value2, "twurl");
            return (Criteria) this;
        }

        public Criteria andTwurlNotBetween(String value1, String value2) {
            addCriterion("twUrl not between", value1, value2, "twurl");
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