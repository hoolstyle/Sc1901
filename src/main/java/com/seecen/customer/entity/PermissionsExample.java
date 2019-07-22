package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionsExample() {
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

        public Criteria andPerIdIsNull() {
            addCriterion("PER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("PER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(Short value) {
            addCriterion("PER_ID =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(Short value) {
            addCriterion("PER_ID <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(Short value) {
            addCriterion("PER_ID >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(Short value) {
            addCriterion("PER_ID >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(Short value) {
            addCriterion("PER_ID <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(Short value) {
            addCriterion("PER_ID <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<Short> values) {
            addCriterion("PER_ID in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<Short> values) {
            addCriterion("PER_ID not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(Short value1, Short value2) {
            addCriterion("PER_ID between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(Short value1, Short value2) {
            addCriterion("PER_ID not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionIsNull() {
            addCriterion("PER_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionIsNotNull() {
            addCriterion("PER_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionEqualTo(String value) {
            addCriterion("PER_DESCRIPTION =", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionNotEqualTo(String value) {
            addCriterion("PER_DESCRIPTION <>", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionGreaterThan(String value) {
            addCriterion("PER_DESCRIPTION >", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PER_DESCRIPTION >=", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionLessThan(String value) {
            addCriterion("PER_DESCRIPTION <", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PER_DESCRIPTION <=", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionLike(String value) {
            addCriterion("PER_DESCRIPTION like", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionNotLike(String value) {
            addCriterion("PER_DESCRIPTION not like", value, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionIn(List<String> values) {
            addCriterion("PER_DESCRIPTION in", values, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionNotIn(List<String> values) {
            addCriterion("PER_DESCRIPTION not in", values, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionBetween(String value1, String value2) {
            addCriterion("PER_DESCRIPTION between", value1, value2, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerDescriptionNotBetween(String value1, String value2) {
            addCriterion("PER_DESCRIPTION not between", value1, value2, "perDescription");
            return (Criteria) this;
        }

        public Criteria andPerRoleidIsNull() {
            addCriterion("PER_ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andPerRoleidIsNotNull() {
            addCriterion("PER_ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andPerRoleidEqualTo(Short value) {
            addCriterion("PER_ROLEID =", value, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidNotEqualTo(Short value) {
            addCriterion("PER_ROLEID <>", value, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidGreaterThan(Short value) {
            addCriterion("PER_ROLEID >", value, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidGreaterThanOrEqualTo(Short value) {
            addCriterion("PER_ROLEID >=", value, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidLessThan(Short value) {
            addCriterion("PER_ROLEID <", value, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidLessThanOrEqualTo(Short value) {
            addCriterion("PER_ROLEID <=", value, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidIn(List<Short> values) {
            addCriterion("PER_ROLEID in", values, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidNotIn(List<Short> values) {
            addCriterion("PER_ROLEID not in", values, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidBetween(Short value1, Short value2) {
            addCriterion("PER_ROLEID between", value1, value2, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerRoleidNotBetween(Short value1, Short value2) {
            addCriterion("PER_ROLEID not between", value1, value2, "perRoleid");
            return (Criteria) this;
        }

        public Criteria andPerAvailableIsNull() {
            addCriterion("PER_AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andPerAvailableIsNotNull() {
            addCriterion("PER_AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andPerAvailableEqualTo(Integer value) {
            addCriterion("PER_AVAILABLE =", value, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableNotEqualTo(Integer value) {
            addCriterion("PER_AVAILABLE <>", value, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableGreaterThan(Integer value) {
            addCriterion("PER_AVAILABLE >", value, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("PER_AVAILABLE >=", value, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableLessThan(Integer value) {
            addCriterion("PER_AVAILABLE <", value, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableLessThanOrEqualTo(Integer value) {
            addCriterion("PER_AVAILABLE <=", value, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableIn(List<Integer> values) {
            addCriterion("PER_AVAILABLE in", values, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableNotIn(List<Integer> values) {
            addCriterion("PER_AVAILABLE not in", values, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableBetween(Integer value1, Integer value2) {
            addCriterion("PER_AVAILABLE between", value1, value2, "perAvailable");
            return (Criteria) this;
        }

        public Criteria andPerAvailableNotBetween(Integer value1, Integer value2) {
            addCriterion("PER_AVAILABLE not between", value1, value2, "perAvailable");
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