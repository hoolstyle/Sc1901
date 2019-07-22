package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andComIdIsNull() {
            addCriterion("COM_ID is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("COM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("COM_ID =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("COM_ID <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("COM_ID >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COM_ID >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("COM_ID <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("COM_ID <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("COM_ID in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("COM_ID not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("COM_ID between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COM_ID not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComNameIsNull() {
            addCriterion("COM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andComNameIsNotNull() {
            addCriterion("COM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andComNameEqualTo(String value) {
            addCriterion("COM_NAME =", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotEqualTo(String value) {
            addCriterion("COM_NAME <>", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThan(String value) {
            addCriterion("COM_NAME >", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThanOrEqualTo(String value) {
            addCriterion("COM_NAME >=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThan(String value) {
            addCriterion("COM_NAME <", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThanOrEqualTo(String value) {
            addCriterion("COM_NAME <=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLike(String value) {
            addCriterion("COM_NAME like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotLike(String value) {
            addCriterion("COM_NAME not like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameIn(List<String> values) {
            addCriterion("COM_NAME in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotIn(List<String> values) {
            addCriterion("COM_NAME not in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameBetween(String value1, String value2) {
            addCriterion("COM_NAME between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotBetween(String value1, String value2) {
            addCriterion("COM_NAME not between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComAddressIsNull() {
            addCriterion("COM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andComAddressIsNotNull() {
            addCriterion("COM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andComAddressEqualTo(String value) {
            addCriterion("COM_ADDRESS =", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotEqualTo(String value) {
            addCriterion("COM_ADDRESS <>", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressGreaterThan(String value) {
            addCriterion("COM_ADDRESS >", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COM_ADDRESS >=", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressLessThan(String value) {
            addCriterion("COM_ADDRESS <", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressLessThanOrEqualTo(String value) {
            addCriterion("COM_ADDRESS <=", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressLike(String value) {
            addCriterion("COM_ADDRESS like", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotLike(String value) {
            addCriterion("COM_ADDRESS not like", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressIn(List<String> values) {
            addCriterion("COM_ADDRESS in", values, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotIn(List<String> values) {
            addCriterion("COM_ADDRESS not in", values, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressBetween(String value1, String value2) {
            addCriterion("COM_ADDRESS between", value1, value2, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotBetween(String value1, String value2) {
            addCriterion("COM_ADDRESS not between", value1, value2, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComTelIsNull() {
            addCriterion("COM_TEL is null");
            return (Criteria) this;
        }

        public Criteria andComTelIsNotNull() {
            addCriterion("COM_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andComTelEqualTo(String value) {
            addCriterion("COM_TEL =", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelNotEqualTo(String value) {
            addCriterion("COM_TEL <>", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelGreaterThan(String value) {
            addCriterion("COM_TEL >", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelGreaterThanOrEqualTo(String value) {
            addCriterion("COM_TEL >=", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelLessThan(String value) {
            addCriterion("COM_TEL <", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelLessThanOrEqualTo(String value) {
            addCriterion("COM_TEL <=", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelLike(String value) {
            addCriterion("COM_TEL like", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelNotLike(String value) {
            addCriterion("COM_TEL not like", value, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelIn(List<String> values) {
            addCriterion("COM_TEL in", values, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelNotIn(List<String> values) {
            addCriterion("COM_TEL not in", values, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelBetween(String value1, String value2) {
            addCriterion("COM_TEL between", value1, value2, "comTel");
            return (Criteria) this;
        }

        public Criteria andComTelNotBetween(String value1, String value2) {
            addCriterion("COM_TEL not between", value1, value2, "comTel");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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