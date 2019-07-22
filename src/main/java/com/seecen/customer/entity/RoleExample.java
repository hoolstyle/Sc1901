package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIsNull() {
            addCriterion("ROLE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIsNotNull() {
            addCriterion("ROLE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION =", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION <>", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionGreaterThan(String value) {
            addCriterion("ROLE_DESCRIPTION >", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION >=", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLessThan(String value) {
            addCriterion("ROLE_DESCRIPTION <", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION <=", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLike(String value) {
            addCriterion("ROLE_DESCRIPTION like", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotLike(String value) {
            addCriterion("ROLE_DESCRIPTION not like", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIn(List<String> values) {
            addCriterion("ROLE_DESCRIPTION in", values, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotIn(List<String> values) {
            addCriterion("ROLE_DESCRIPTION not in", values, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionBetween(String value1, String value2) {
            addCriterion("ROLE_DESCRIPTION between", value1, value2, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotBetween(String value1, String value2) {
            addCriterion("ROLE_DESCRIPTION not between", value1, value2, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRolePidIsNull() {
            addCriterion("ROLE_PID is null");
            return (Criteria) this;
        }

        public Criteria andRolePidIsNotNull() {
            addCriterion("ROLE_PID is not null");
            return (Criteria) this;
        }

        public Criteria andRolePidEqualTo(Integer value) {
            addCriterion("ROLE_PID =", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidNotEqualTo(Integer value) {
            addCriterion("ROLE_PID <>", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidGreaterThan(Integer value) {
            addCriterion("ROLE_PID >", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_PID >=", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidLessThan(Integer value) {
            addCriterion("ROLE_PID <", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_PID <=", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidIn(List<Integer> values) {
            addCriterion("ROLE_PID in", values, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidNotIn(List<Integer> values) {
            addCriterion("ROLE_PID not in", values, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_PID between", value1, value2, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_PID not between", value1, value2, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableIsNull() {
            addCriterion("ROLE_AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableIsNotNull() {
            addCriterion("ROLE_AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableEqualTo(Integer value) {
            addCriterion("ROLE_AVAILABLE =", value, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableNotEqualTo(Integer value) {
            addCriterion("ROLE_AVAILABLE <>", value, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableGreaterThan(Integer value) {
            addCriterion("ROLE_AVAILABLE >", value, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_AVAILABLE >=", value, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableLessThan(Integer value) {
            addCriterion("ROLE_AVAILABLE <", value, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_AVAILABLE <=", value, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableIn(List<Integer> values) {
            addCriterion("ROLE_AVAILABLE in", values, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableNotIn(List<Integer> values) {
            addCriterion("ROLE_AVAILABLE not in", values, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_AVAILABLE between", value1, value2, "roleAvailable");
            return (Criteria) this;
        }

        public Criteria andRoleAvailableNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_AVAILABLE not between", value1, value2, "roleAvailable");
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