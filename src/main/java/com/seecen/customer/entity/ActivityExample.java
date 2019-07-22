package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActIdIsNull() {
            addCriterion("ACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("ACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("ACT_ID =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("ACT_ID <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("ACT_ID >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACT_ID >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("ACT_ID <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACT_ID <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("ACT_ID in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("ACT_ID not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("ACT_ID between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACT_ID not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActNameIsNull() {
            addCriterion("ACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("ACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("ACT_NAME =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("ACT_NAME <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("ACT_NAME >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NAME >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("ACT_NAME <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("ACT_NAME <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("ACT_NAME like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("ACT_NAME not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("ACT_NAME in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("ACT_NAME not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("ACT_NAME between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("ACT_NAME not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActDateIsNull() {
            addCriterion("ACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActDateIsNotNull() {
            addCriterion("ACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActDateEqualTo(Date value) {
            addCriterion("ACT_DATE =", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotEqualTo(Date value) {
            addCriterion("ACT_DATE <>", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThan(Date value) {
            addCriterion("ACT_DATE >", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACT_DATE >=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThan(Date value) {
            addCriterion("ACT_DATE <", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThanOrEqualTo(Date value) {
            addCriterion("ACT_DATE <=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateIn(List<Date> values) {
            addCriterion("ACT_DATE in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotIn(List<Date> values) {
            addCriterion("ACT_DATE not in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateBetween(Date value1, Date value2) {
            addCriterion("ACT_DATE between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotBetween(Date value1, Date value2) {
            addCriterion("ACT_DATE not between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andActContentIsNull() {
            addCriterion("ACT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andActContentIsNotNull() {
            addCriterion("ACT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andActContentEqualTo(String value) {
            addCriterion("ACT_CONTENT =", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotEqualTo(String value) {
            addCriterion("ACT_CONTENT <>", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThan(String value) {
            addCriterion("ACT_CONTENT >", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_CONTENT >=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThan(String value) {
            addCriterion("ACT_CONTENT <", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThanOrEqualTo(String value) {
            addCriterion("ACT_CONTENT <=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLike(String value) {
            addCriterion("ACT_CONTENT like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotLike(String value) {
            addCriterion("ACT_CONTENT not like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentIn(List<String> values) {
            addCriterion("ACT_CONTENT in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotIn(List<String> values) {
            addCriterion("ACT_CONTENT not in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentBetween(String value1, String value2) {
            addCriterion("ACT_CONTENT between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotBetween(String value1, String value2) {
            addCriterion("ACT_CONTENT not between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andActRemarkIsNull() {
            addCriterion("ACT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andActRemarkIsNotNull() {
            addCriterion("ACT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andActRemarkEqualTo(String value) {
            addCriterion("ACT_REMARK =", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkNotEqualTo(String value) {
            addCriterion("ACT_REMARK <>", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkGreaterThan(String value) {
            addCriterion("ACT_REMARK >", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_REMARK >=", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkLessThan(String value) {
            addCriterion("ACT_REMARK <", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkLessThanOrEqualTo(String value) {
            addCriterion("ACT_REMARK <=", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkLike(String value) {
            addCriterion("ACT_REMARK like", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkNotLike(String value) {
            addCriterion("ACT_REMARK not like", value, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkIn(List<String> values) {
            addCriterion("ACT_REMARK in", values, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkNotIn(List<String> values) {
            addCriterion("ACT_REMARK not in", values, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkBetween(String value1, String value2) {
            addCriterion("ACT_REMARK between", value1, value2, "actRemark");
            return (Criteria) this;
        }

        public Criteria andActRemarkNotBetween(String value1, String value2) {
            addCriterion("ACT_REMARK not between", value1, value2, "actRemark");
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