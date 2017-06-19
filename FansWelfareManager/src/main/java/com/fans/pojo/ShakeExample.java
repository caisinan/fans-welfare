package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShakeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShakeExample() {
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

        public Criteria andPlayeridIsNull() {
            addCriterion("playerId is null");
            return (Criteria) this;
        }

        public Criteria andPlayeridIsNotNull() {
            addCriterion("playerId is not null");
            return (Criteria) this;
        }

        public Criteria andPlayeridEqualTo(Long value) {
            addCriterion("playerId =", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotEqualTo(Long value) {
            addCriterion("playerId <>", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridGreaterThan(Long value) {
            addCriterion("playerId >", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridGreaterThanOrEqualTo(Long value) {
            addCriterion("playerId >=", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridLessThan(Long value) {
            addCriterion("playerId <", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridLessThanOrEqualTo(Long value) {
            addCriterion("playerId <=", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridIn(List<Long> values) {
            addCriterion("playerId in", values, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotIn(List<Long> values) {
            addCriterion("playerId not in", values, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridBetween(Long value1, Long value2) {
            addCriterion("playerId between", value1, value2, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotBetween(Long value1, Long value2) {
            addCriterion("playerId not between", value1, value2, "playerid");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andPlaydateIsNull() {
            addCriterion("playDate is null");
            return (Criteria) this;
        }

        public Criteria andPlaydateIsNotNull() {
            addCriterion("playDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlaydateEqualTo(String value) {
            addCriterion("playDate =", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateNotEqualTo(String value) {
            addCriterion("playDate <>", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateGreaterThan(String value) {
            addCriterion("playDate >", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateGreaterThanOrEqualTo(String value) {
            addCriterion("playDate >=", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateLessThan(String value) {
            addCriterion("playDate <", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateLessThanOrEqualTo(String value) {
            addCriterion("playDate <=", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateLike(String value) {
            addCriterion("playDate like", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateNotLike(String value) {
            addCriterion("playDate not like", value, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateIn(List<String> values) {
            addCriterion("playDate in", values, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateNotIn(List<String> values) {
            addCriterion("playDate not in", values, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateBetween(String value1, String value2) {
            addCriterion("playDate between", value1, value2, "playdate");
            return (Criteria) this;
        }

        public Criteria andPlaydateNotBetween(String value1, String value2) {
            addCriterion("playDate not between", value1, value2, "playdate");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andIswinIsNull() {
            addCriterion("isWin is null");
            return (Criteria) this;
        }

        public Criteria andIswinIsNotNull() {
            addCriterion("isWin is not null");
            return (Criteria) this;
        }

        public Criteria andIswinEqualTo(Boolean value) {
            addCriterion("isWin =", value, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinNotEqualTo(Boolean value) {
            addCriterion("isWin <>", value, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinGreaterThan(Boolean value) {
            addCriterion("isWin >", value, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isWin >=", value, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinLessThan(Boolean value) {
            addCriterion("isWin <", value, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinLessThanOrEqualTo(Boolean value) {
            addCriterion("isWin <=", value, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinIn(List<Boolean> values) {
            addCriterion("isWin in", values, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinNotIn(List<Boolean> values) {
            addCriterion("isWin not in", values, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinBetween(Boolean value1, Boolean value2) {
            addCriterion("isWin between", value1, value2, "iswin");
            return (Criteria) this;
        }

        public Criteria andIswinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isWin not between", value1, value2, "iswin");
            return (Criteria) this;
        }

        public Criteria andWincountIsNull() {
            addCriterion("winCount is null");
            return (Criteria) this;
        }

        public Criteria andWincountIsNotNull() {
            addCriterion("winCount is not null");
            return (Criteria) this;
        }

        public Criteria andWincountEqualTo(Integer value) {
            addCriterion("winCount =", value, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountNotEqualTo(Integer value) {
            addCriterion("winCount <>", value, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountGreaterThan(Integer value) {
            addCriterion("winCount >", value, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("winCount >=", value, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountLessThan(Integer value) {
            addCriterion("winCount <", value, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountLessThanOrEqualTo(Integer value) {
            addCriterion("winCount <=", value, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountIn(List<Integer> values) {
            addCriterion("winCount in", values, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountNotIn(List<Integer> values) {
            addCriterion("winCount not in", values, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountBetween(Integer value1, Integer value2) {
            addCriterion("winCount between", value1, value2, "wincount");
            return (Criteria) this;
        }

        public Criteria andWincountNotBetween(Integer value1, Integer value2) {
            addCriterion("winCount not between", value1, value2, "wincount");
            return (Criteria) this;
        }

        public Criteria andIsshareIsNull() {
            addCriterion("isShare is null");
            return (Criteria) this;
        }

        public Criteria andIsshareIsNotNull() {
            addCriterion("isShare is not null");
            return (Criteria) this;
        }

        public Criteria andIsshareEqualTo(Boolean value) {
            addCriterion("isShare =", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotEqualTo(Boolean value) {
            addCriterion("isShare <>", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThan(Boolean value) {
            addCriterion("isShare >", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isShare >=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThan(Boolean value) {
            addCriterion("isShare <", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThanOrEqualTo(Boolean value) {
            addCriterion("isShare <=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareIn(List<Boolean> values) {
            addCriterion("isShare in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotIn(List<Boolean> values) {
            addCriterion("isShare not in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareBetween(Boolean value1, Boolean value2) {
            addCriterion("isShare between", value1, value2, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isShare not between", value1, value2, "isshare");
            return (Criteria) this;
        }

        public Criteria andPrizeIsNull() {
            addCriterion("prize is null");
            return (Criteria) this;
        }

        public Criteria andPrizeIsNotNull() {
            addCriterion("prize is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeEqualTo(String value) {
            addCriterion("prize =", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotEqualTo(String value) {
            addCriterion("prize <>", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeGreaterThan(String value) {
            addCriterion("prize >", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeGreaterThanOrEqualTo(String value) {
            addCriterion("prize >=", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeLessThan(String value) {
            addCriterion("prize <", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeLessThanOrEqualTo(String value) {
            addCriterion("prize <=", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeLike(String value) {
            addCriterion("prize like", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotLike(String value) {
            addCriterion("prize not like", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeIn(List<String> values) {
            addCriterion("prize in", values, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotIn(List<String> values) {
            addCriterion("prize not in", values, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeBetween(String value1, String value2) {
            addCriterion("prize between", value1, value2, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotBetween(String value1, String value2) {
            addCriterion("prize not between", value1, value2, "prize");
            return (Criteria) this;
        }

        public Criteria andTotalpointsIsNull() {
            addCriterion("totalPoints is null");
            return (Criteria) this;
        }

        public Criteria andTotalpointsIsNotNull() {
            addCriterion("totalPoints is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpointsEqualTo(Integer value) {
            addCriterion("totalPoints =", value, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsNotEqualTo(Integer value) {
            addCriterion("totalPoints <>", value, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsGreaterThan(Integer value) {
            addCriterion("totalPoints >", value, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalPoints >=", value, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsLessThan(Integer value) {
            addCriterion("totalPoints <", value, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsLessThanOrEqualTo(Integer value) {
            addCriterion("totalPoints <=", value, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsIn(List<Integer> values) {
            addCriterion("totalPoints in", values, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsNotIn(List<Integer> values) {
            addCriterion("totalPoints not in", values, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsBetween(Integer value1, Integer value2) {
            addCriterion("totalPoints between", value1, value2, "totalpoints");
            return (Criteria) this;
        }

        public Criteria andTotalpointsNotBetween(Integer value1, Integer value2) {
            addCriterion("totalPoints not between", value1, value2, "totalpoints");
            return (Criteria) this;
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

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
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