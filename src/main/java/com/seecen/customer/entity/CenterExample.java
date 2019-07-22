package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class CenterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCenterNameIsNull() {
            addCriterion("CENTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCenterNameIsNotNull() {
            addCriterion("CENTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCenterNameEqualTo(String value) {
            addCriterion("CENTER_NAME =", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotEqualTo(String value) {
            addCriterion("CENTER_NAME <>", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameGreaterThan(String value) {
            addCriterion("CENTER_NAME >", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_NAME >=", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLessThan(String value) {
            addCriterion("CENTER_NAME <", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLessThanOrEqualTo(String value) {
            addCriterion("CENTER_NAME <=", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLike(String value) {
            addCriterion("CENTER_NAME like", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotLike(String value) {
            addCriterion("CENTER_NAME not like", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameIn(List<String> values) {
            addCriterion("CENTER_NAME in", values, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotIn(List<String> values) {
            addCriterion("CENTER_NAME not in", values, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameBetween(String value1, String value2) {
            addCriterion("CENTER_NAME between", value1, value2, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotBetween(String value1, String value2) {
            addCriterion("CENTER_NAME not between", value1, value2, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterAddressIsNull() {
            addCriterion("CENTER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCenterAddressIsNotNull() {
            addCriterion("CENTER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCenterAddressEqualTo(String value) {
            addCriterion("CENTER_ADDRESS =", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressNotEqualTo(String value) {
            addCriterion("CENTER_ADDRESS <>", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressGreaterThan(String value) {
            addCriterion("CENTER_ADDRESS >", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_ADDRESS >=", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressLessThan(String value) {
            addCriterion("CENTER_ADDRESS <", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressLessThanOrEqualTo(String value) {
            addCriterion("CENTER_ADDRESS <=", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressLike(String value) {
            addCriterion("CENTER_ADDRESS like", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressNotLike(String value) {
            addCriterion("CENTER_ADDRESS not like", value, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressIn(List<String> values) {
            addCriterion("CENTER_ADDRESS in", values, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressNotIn(List<String> values) {
            addCriterion("CENTER_ADDRESS not in", values, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressBetween(String value1, String value2) {
            addCriterion("CENTER_ADDRESS between", value1, value2, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterAddressNotBetween(String value1, String value2) {
            addCriterion("CENTER_ADDRESS not between", value1, value2, "centerAddress");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneIsNull() {
            addCriterion("CENTER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneIsNotNull() {
            addCriterion("CENTER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneEqualTo(String value) {
            addCriterion("CENTER_PHONE =", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneNotEqualTo(String value) {
            addCriterion("CENTER_PHONE <>", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneGreaterThan(String value) {
            addCriterion("CENTER_PHONE >", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_PHONE >=", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneLessThan(String value) {
            addCriterion("CENTER_PHONE <", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneLessThanOrEqualTo(String value) {
            addCriterion("CENTER_PHONE <=", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneLike(String value) {
            addCriterion("CENTER_PHONE like", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneNotLike(String value) {
            addCriterion("CENTER_PHONE not like", value, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneIn(List<String> values) {
            addCriterion("CENTER_PHONE in", values, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneNotIn(List<String> values) {
            addCriterion("CENTER_PHONE not in", values, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneBetween(String value1, String value2) {
            addCriterion("CENTER_PHONE between", value1, value2, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterPhoneNotBetween(String value1, String value2) {
            addCriterion("CENTER_PHONE not between", value1, value2, "centerPhone");
            return (Criteria) this;
        }

        public Criteria andCenterFlagIsNull() {
            addCriterion("CENTER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCenterFlagIsNotNull() {
            addCriterion("CENTER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCenterFlagEqualTo(Integer value) {
            addCriterion("CENTER_FLAG =", value, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagNotEqualTo(Integer value) {
            addCriterion("CENTER_FLAG <>", value, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagGreaterThan(Integer value) {
            addCriterion("CENTER_FLAG >", value, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("CENTER_FLAG >=", value, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagLessThan(Integer value) {
            addCriterion("CENTER_FLAG <", value, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagLessThanOrEqualTo(Integer value) {
            addCriterion("CENTER_FLAG <=", value, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagIn(List<Integer> values) {
            addCriterion("CENTER_FLAG in", values, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagNotIn(List<Integer> values) {
            addCriterion("CENTER_FLAG not in", values, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagBetween(Integer value1, Integer value2) {
            addCriterion("CENTER_FLAG between", value1, value2, "centerFlag");
            return (Criteria) this;
        }

        public Criteria andCenterFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("CENTER_FLAG not between", value1, value2, "centerFlag");
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