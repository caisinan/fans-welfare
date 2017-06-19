package com.fans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("Avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("Avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("Avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("Avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("Avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("Avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("Avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("Avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("Avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("Avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("Avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("Avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("Avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("Avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("PhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("PhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("PhoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("PhoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("PhoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("PhoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("PhoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("PhoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("PhoneNumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("PhoneNumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("PhoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("PhoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("PhoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("PhoneNumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("Profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("Profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("Profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("Profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("Profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("Profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("Profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("Profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("Profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("Profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("Profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("Profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("Profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("Profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNull() {
            addCriterion("JobTitle is null");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNotNull() {
            addCriterion("JobTitle is not null");
            return (Criteria) this;
        }

        public Criteria andJobtitleEqualTo(String value) {
            addCriterion("JobTitle =", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotEqualTo(String value) {
            addCriterion("JobTitle <>", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThan(String value) {
            addCriterion("JobTitle >", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("JobTitle >=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThan(String value) {
            addCriterion("JobTitle <", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThanOrEqualTo(String value) {
            addCriterion("JobTitle <=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLike(String value) {
            addCriterion("JobTitle like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotLike(String value) {
            addCriterion("JobTitle not like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleIn(List<String> values) {
            addCriterion("JobTitle in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotIn(List<String> values) {
            addCriterion("JobTitle not in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleBetween(String value1, String value2) {
            addCriterion("JobTitle between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotBetween(String value1, String value2) {
            addCriterion("JobTitle not between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNull() {
            addCriterion("WorkUnit is null");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNotNull() {
            addCriterion("WorkUnit is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunitEqualTo(String value) {
            addCriterion("WorkUnit =", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotEqualTo(String value) {
            addCriterion("WorkUnit <>", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThan(String value) {
            addCriterion("WorkUnit >", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThanOrEqualTo(String value) {
            addCriterion("WorkUnit >=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThan(String value) {
            addCriterion("WorkUnit <", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThanOrEqualTo(String value) {
            addCriterion("WorkUnit <=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLike(String value) {
            addCriterion("WorkUnit like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotLike(String value) {
            addCriterion("WorkUnit not like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitIn(List<String> values) {
            addCriterion("WorkUnit in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotIn(List<String> values) {
            addCriterion("WorkUnit not in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitBetween(String value1, String value2) {
            addCriterion("WorkUnit between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotBetween(String value1, String value2) {
            addCriterion("WorkUnit not between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("Country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("Country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Integer value) {
            addCriterion("Country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Integer value) {
            addCriterion("Country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Integer value) {
            addCriterion("Country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Integer value) {
            addCriterion("Country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Integer value) {
            addCriterion("Country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Integer> values) {
            addCriterion("Country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Integer> values) {
            addCriterion("Country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Integer value1, Integer value2) {
            addCriterion("Country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("Country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("Province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("Location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("Location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("Location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("Location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("Location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("Location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("Location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("Location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("Location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("Location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("Location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("Location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("Location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("Tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("Tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("Tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("Tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("Tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("Tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("Tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("Tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("Tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("Tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("Tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("Tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("Tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("Tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andUsergradeIsNull() {
            addCriterion("UserGrade is null");
            return (Criteria) this;
        }

        public Criteria andUsergradeIsNotNull() {
            addCriterion("UserGrade is not null");
            return (Criteria) this;
        }

        public Criteria andUsergradeEqualTo(Integer value) {
            addCriterion("UserGrade =", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotEqualTo(Integer value) {
            addCriterion("UserGrade <>", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeGreaterThan(Integer value) {
            addCriterion("UserGrade >", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserGrade >=", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLessThan(Integer value) {
            addCriterion("UserGrade <", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLessThanOrEqualTo(Integer value) {
            addCriterion("UserGrade <=", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeIn(List<Integer> values) {
            addCriterion("UserGrade in", values, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotIn(List<Integer> values) {
            addCriterion("UserGrade not in", values, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeBetween(Integer value1, Integer value2) {
            addCriterion("UserGrade between", value1, value2, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotBetween(Integer value1, Integer value2) {
            addCriterion("UserGrade not between", value1, value2, "usergrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeIsNull() {
            addCriterion("ChiefGrade is null");
            return (Criteria) this;
        }

        public Criteria andChiefgradeIsNotNull() {
            addCriterion("ChiefGrade is not null");
            return (Criteria) this;
        }

        public Criteria andChiefgradeEqualTo(Integer value) {
            addCriterion("ChiefGrade =", value, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeNotEqualTo(Integer value) {
            addCriterion("ChiefGrade <>", value, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeGreaterThan(Integer value) {
            addCriterion("ChiefGrade >", value, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChiefGrade >=", value, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeLessThan(Integer value) {
            addCriterion("ChiefGrade <", value, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeLessThanOrEqualTo(Integer value) {
            addCriterion("ChiefGrade <=", value, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeIn(List<Integer> values) {
            addCriterion("ChiefGrade in", values, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeNotIn(List<Integer> values) {
            addCriterion("ChiefGrade not in", values, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeBetween(Integer value1, Integer value2) {
            addCriterion("ChiefGrade between", value1, value2, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andChiefgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("ChiefGrade not between", value1, value2, "chiefgrade");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusIsNull() {
            addCriterion("LegalizeStatus is null");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusIsNotNull() {
            addCriterion("LegalizeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusEqualTo(Short value) {
            addCriterion("LegalizeStatus =", value, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusNotEqualTo(Short value) {
            addCriterion("LegalizeStatus <>", value, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusGreaterThan(Short value) {
            addCriterion("LegalizeStatus >", value, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusGreaterThanOrEqualTo(Short value) {
            addCriterion("LegalizeStatus >=", value, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusLessThan(Short value) {
            addCriterion("LegalizeStatus <", value, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusLessThanOrEqualTo(Short value) {
            addCriterion("LegalizeStatus <=", value, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusIn(List<Short> values) {
            addCriterion("LegalizeStatus in", values, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusNotIn(List<Short> values) {
            addCriterion("LegalizeStatus not in", values, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusBetween(Short value1, Short value2) {
            addCriterion("LegalizeStatus between", value1, value2, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andLegalizestatusNotBetween(Short value1, Short value2) {
            addCriterion("LegalizeStatus not between", value1, value2, "legalizestatus");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("UserType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("UserType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Short value) {
            addCriterion("UserType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Short value) {
            addCriterion("UserType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Short value) {
            addCriterion("UserType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("UserType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Short value) {
            addCriterion("UserType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Short value) {
            addCriterion("UserType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Short> values) {
            addCriterion("UserType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Short> values) {
            addCriterion("UserType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Short value1, Short value2) {
            addCriterion("UserType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Short value1, Short value2) {
            addCriterion("UserType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("IsDel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("IsDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Short value) {
            addCriterion("IsDel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Short value) {
            addCriterion("IsDel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Short value) {
            addCriterion("IsDel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Short value) {
            addCriterion("IsDel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Short value) {
            addCriterion("IsDel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Short value) {
            addCriterion("IsDel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Short> values) {
            addCriterion("IsDel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Short> values) {
            addCriterion("IsDel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Short value1, Short value2) {
            addCriterion("IsDel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Short value1, Short value2) {
            addCriterion("IsDel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andStudyfieldIsNull() {
            addCriterion("StudyField is null");
            return (Criteria) this;
        }

        public Criteria andStudyfieldIsNotNull() {
            addCriterion("StudyField is not null");
            return (Criteria) this;
        }

        public Criteria andStudyfieldEqualTo(String value) {
            addCriterion("StudyField =", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldNotEqualTo(String value) {
            addCriterion("StudyField <>", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldGreaterThan(String value) {
            addCriterion("StudyField >", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldGreaterThanOrEqualTo(String value) {
            addCriterion("StudyField >=", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldLessThan(String value) {
            addCriterion("StudyField <", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldLessThanOrEqualTo(String value) {
            addCriterion("StudyField <=", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldLike(String value) {
            addCriterion("StudyField like", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldNotLike(String value) {
            addCriterion("StudyField not like", value, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldIn(List<String> values) {
            addCriterion("StudyField in", values, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldNotIn(List<String> values) {
            addCriterion("StudyField not in", values, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldBetween(String value1, String value2) {
            addCriterion("StudyField between", value1, value2, "studyfield");
            return (Criteria) this;
        }

        public Criteria andStudyfieldNotBetween(String value1, String value2) {
            addCriterion("StudyField not between", value1, value2, "studyfield");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("Speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("Speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("Speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("Speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("Speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("Speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("Speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("Speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("Speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("Speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("Speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("Speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("Speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("Speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeIsNull() {
            addCriterion("LegalizeTime is null");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeIsNotNull() {
            addCriterion("LegalizeTime is not null");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeEqualTo(Date value) {
            addCriterion("LegalizeTime =", value, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeNotEqualTo(Date value) {
            addCriterion("LegalizeTime <>", value, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeGreaterThan(Date value) {
            addCriterion("LegalizeTime >", value, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LegalizeTime >=", value, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeLessThan(Date value) {
            addCriterion("LegalizeTime <", value, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeLessThanOrEqualTo(Date value) {
            addCriterion("LegalizeTime <=", value, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeIn(List<Date> values) {
            addCriterion("LegalizeTime in", values, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeNotIn(List<Date> values) {
            addCriterion("LegalizeTime not in", values, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeBetween(Date value1, Date value2) {
            addCriterion("LegalizeTime between", value1, value2, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andLegalizetimeNotBetween(Date value1, Date value2) {
            addCriterion("LegalizeTime not between", value1, value2, "legalizetime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateIsNull() {
            addCriterion("FreeDownloadCate is null");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateIsNotNull() {
            addCriterion("FreeDownloadCate is not null");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateEqualTo(String value) {
            addCriterion("FreeDownloadCate =", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateNotEqualTo(String value) {
            addCriterion("FreeDownloadCate <>", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateGreaterThan(String value) {
            addCriterion("FreeDownloadCate >", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateGreaterThanOrEqualTo(String value) {
            addCriterion("FreeDownloadCate >=", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateLessThan(String value) {
            addCriterion("FreeDownloadCate <", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateLessThanOrEqualTo(String value) {
            addCriterion("FreeDownloadCate <=", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateLike(String value) {
            addCriterion("FreeDownloadCate like", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateNotLike(String value) {
            addCriterion("FreeDownloadCate not like", value, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateIn(List<String> values) {
            addCriterion("FreeDownloadCate in", values, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateNotIn(List<String> values) {
            addCriterion("FreeDownloadCate not in", values, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateBetween(String value1, String value2) {
            addCriterion("FreeDownloadCate between", value1, value2, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadcateNotBetween(String value1, String value2) {
            addCriterion("FreeDownloadCate not between", value1, value2, "freedownloadcate");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeIsNull() {
            addCriterion("FreeDownloadTime is null");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeIsNotNull() {
            addCriterion("FreeDownloadTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeEqualTo(Date value) {
            addCriterion("FreeDownloadTime =", value, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeNotEqualTo(Date value) {
            addCriterion("FreeDownloadTime <>", value, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeGreaterThan(Date value) {
            addCriterion("FreeDownloadTime >", value, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FreeDownloadTime >=", value, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeLessThan(Date value) {
            addCriterion("FreeDownloadTime <", value, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeLessThanOrEqualTo(Date value) {
            addCriterion("FreeDownloadTime <=", value, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeIn(List<Date> values) {
            addCriterion("FreeDownloadTime in", values, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeNotIn(List<Date> values) {
            addCriterion("FreeDownloadTime not in", values, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeBetween(Date value1, Date value2) {
            addCriterion("FreeDownloadTime between", value1, value2, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andFreedownloadtimeNotBetween(Date value1, Date value2) {
            addCriterion("FreeDownloadTime not between", value1, value2, "freedownloadtime");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNull() {
            addCriterion("WxOpenId is null");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNotNull() {
            addCriterion("WxOpenId is not null");
            return (Criteria) this;
        }

        public Criteria andWxopenidEqualTo(String value) {
            addCriterion("WxOpenId =", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotEqualTo(String value) {
            addCriterion("WxOpenId <>", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThan(String value) {
            addCriterion("WxOpenId >", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThanOrEqualTo(String value) {
            addCriterion("WxOpenId >=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThan(String value) {
            addCriterion("WxOpenId <", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThanOrEqualTo(String value) {
            addCriterion("WxOpenId <=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLike(String value) {
            addCriterion("WxOpenId like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotLike(String value) {
            addCriterion("WxOpenId not like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidIn(List<String> values) {
            addCriterion("WxOpenId in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotIn(List<String> values) {
            addCriterion("WxOpenId not in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidBetween(String value1, String value2) {
            addCriterion("WxOpenId between", value1, value2, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotBetween(String value1, String value2) {
            addCriterion("WxOpenId not between", value1, value2, "wxopenid");
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