package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("CUSTOMER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("CUSTOMER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(Integer value) {
            addCriterion("CUSTOMER_SEX =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_SEX <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(Integer value) {
            addCriterion("CUSTOMER_SEX >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_SEX >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(Integer value) {
            addCriterion("CUSTOMER_SEX <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_SEX <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<Integer> values) {
            addCriterion("CUSTOMER_SEX in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_SEX not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_SEX between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_SEX not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("CUSTOMER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("CUSTOMER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("CUSTOMER_PHONE >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("CUSTOMER_PHONE <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("CUSTOMER_PHONE like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("CUSTOMER_PHONE not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("CUSTOMER_PHONE in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("CUSTOMER_PHONE not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PHONE between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PHONE not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerImgIsNull() {
            addCriterion("CUSTOMER_IMG is null");
            return (Criteria) this;
        }

        public Criteria andCustomerImgIsNotNull() {
            addCriterion("CUSTOMER_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerImgEqualTo(String value) {
            addCriterion("CUSTOMER_IMG =", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotEqualTo(String value) {
            addCriterion("CUSTOMER_IMG <>", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgGreaterThan(String value) {
            addCriterion("CUSTOMER_IMG >", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IMG >=", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgLessThan(String value) {
            addCriterion("CUSTOMER_IMG <", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IMG <=", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgLike(String value) {
            addCriterion("CUSTOMER_IMG like", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotLike(String value) {
            addCriterion("CUSTOMER_IMG not like", value, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgIn(List<String> values) {
            addCriterion("CUSTOMER_IMG in", values, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotIn(List<String> values) {
            addCriterion("CUSTOMER_IMG not in", values, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IMG between", value1, value2, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerImgNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IMG not between", value1, value2, "customerImg");
            return (Criteria) this;
        }

        public Criteria andCustomerDateIsNull() {
            addCriterion("CUSTOMER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDateIsNotNull() {
            addCriterion("CUSTOMER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDateEqualTo(Date value) {
            addCriterion("CUSTOMER_DATE =", value, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateNotEqualTo(Date value) {
            addCriterion("CUSTOMER_DATE <>", value, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateGreaterThan(Date value) {
            addCriterion("CUSTOMER_DATE >", value, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CUSTOMER_DATE >=", value, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateLessThan(Date value) {
            addCriterion("CUSTOMER_DATE <", value, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateLessThanOrEqualTo(Date value) {
            addCriterion("CUSTOMER_DATE <=", value, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateIn(List<Date> values) {
            addCriterion("CUSTOMER_DATE in", values, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateNotIn(List<Date> values) {
            addCriterion("CUSTOMER_DATE not in", values, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateBetween(Date value1, Date value2) {
            addCriterion("CUSTOMER_DATE between", value1, value2, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDateNotBetween(Date value1, Date value2) {
            addCriterion("CUSTOMER_DATE not between", value1, value2, "customerDate");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagIsNull() {
            addCriterion("CUSTOMER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagIsNotNull() {
            addCriterion("CUSTOMER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagEqualTo(Integer value) {
            addCriterion("CUSTOMER_FLAG =", value, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_FLAG <>", value, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagGreaterThan(Integer value) {
            addCriterion("CUSTOMER_FLAG >", value, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_FLAG >=", value, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagLessThan(Integer value) {
            addCriterion("CUSTOMER_FLAG <", value, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_FLAG <=", value, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagIn(List<Integer> values) {
            addCriterion("CUSTOMER_FLAG in", values, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_FLAG not in", values, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_FLAG between", value1, value2, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_FLAG not between", value1, value2, "customerFlag");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andCenterIdIsNull() {
            addCriterion("CENTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCenterIdIsNotNull() {
            addCriterion("CENTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCenterIdEqualTo(Integer value) {
            addCriterion("CENTER_ID =", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotEqualTo(Integer value) {
            addCriterion("CENTER_ID <>", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThan(Integer value) {
            addCriterion("CENTER_ID >", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CENTER_ID >=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThan(Integer value) {
            addCriterion("CENTER_ID <", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("CENTER_ID <=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdIn(List<Integer> values) {
            addCriterion("CENTER_ID in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotIn(List<Integer> values) {
            addCriterion("CENTER_ID not in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdBetween(Integer value1, Integer value2) {
            addCriterion("CENTER_ID between", value1, value2, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CENTER_ID not between", value1, value2, "centerId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("TEAM_ID =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("TEAM_ID <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("TEAM_ID >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEAM_ID >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("TEAM_ID <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEAM_ID <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("TEAM_ID in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("TEAM_ID not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_ID between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_ID not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIsNull() {
            addCriterion("CUSTOMER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIsNotNull() {
            addCriterion("CUSTOMER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK =", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK <>", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkGreaterThan(String value) {
            addCriterion("CUSTOMER_REMARK >", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK >=", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLessThan(String value) {
            addCriterion("CUSTOMER_REMARK <", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK <=", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLike(String value) {
            addCriterion("CUSTOMER_REMARK like", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotLike(String value) {
            addCriterion("CUSTOMER_REMARK not like", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIn(List<String> values) {
            addCriterion("CUSTOMER_REMARK in", values, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotIn(List<String> values) {
            addCriterion("CUSTOMER_REMARK not in", values, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkBetween(String value1, String value2) {
            addCriterion("CUSTOMER_REMARK between", value1, value2, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_REMARK not between", value1, value2, "customerRemark");
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