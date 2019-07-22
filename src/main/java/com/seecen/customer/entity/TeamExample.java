package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTeamNameIsNull() {
            addCriterion("TEAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("TEAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("TEAM_NAME =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("TEAM_NAME <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("TEAM_NAME >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("TEAM_NAME <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("TEAM_NAME like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("TEAM_NAME not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("TEAM_NAME in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("TEAM_NAME not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("TEAM_NAME between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("TEAM_NAME not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceIsNull() {
            addCriterion("TEAM_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceIsNotNull() {
            addCriterion("TEAM_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceEqualTo(String value) {
            addCriterion("TEAM_INTRODUCE =", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceNotEqualTo(String value) {
            addCriterion("TEAM_INTRODUCE <>", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceGreaterThan(String value) {
            addCriterion("TEAM_INTRODUCE >", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_INTRODUCE >=", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceLessThan(String value) {
            addCriterion("TEAM_INTRODUCE <", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceLessThanOrEqualTo(String value) {
            addCriterion("TEAM_INTRODUCE <=", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceLike(String value) {
            addCriterion("TEAM_INTRODUCE like", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceNotLike(String value) {
            addCriterion("TEAM_INTRODUCE not like", value, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceIn(List<String> values) {
            addCriterion("TEAM_INTRODUCE in", values, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceNotIn(List<String> values) {
            addCriterion("TEAM_INTRODUCE not in", values, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceBetween(String value1, String value2) {
            addCriterion("TEAM_INTRODUCE between", value1, value2, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamIntroduceNotBetween(String value1, String value2) {
            addCriterion("TEAM_INTRODUCE not between", value1, value2, "teamIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkIsNull() {
            addCriterion("TEAM_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkIsNotNull() {
            addCriterion("TEAM_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkEqualTo(String value) {
            addCriterion("TEAM_REMARK =", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotEqualTo(String value) {
            addCriterion("TEAM_REMARK <>", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkGreaterThan(String value) {
            addCriterion("TEAM_REMARK >", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_REMARK >=", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkLessThan(String value) {
            addCriterion("TEAM_REMARK <", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkLessThanOrEqualTo(String value) {
            addCriterion("TEAM_REMARK <=", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkLike(String value) {
            addCriterion("TEAM_REMARK like", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotLike(String value) {
            addCriterion("TEAM_REMARK not like", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkIn(List<String> values) {
            addCriterion("TEAM_REMARK in", values, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotIn(List<String> values) {
            addCriterion("TEAM_REMARK not in", values, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkBetween(String value1, String value2) {
            addCriterion("TEAM_REMARK between", value1, value2, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotBetween(String value1, String value2) {
            addCriterion("TEAM_REMARK not between", value1, value2, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamDateIsNull() {
            addCriterion("TEAM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTeamDateIsNotNull() {
            addCriterion("TEAM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTeamDateEqualTo(Date value) {
            addCriterion("TEAM_DATE =", value, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateNotEqualTo(Date value) {
            addCriterion("TEAM_DATE <>", value, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateGreaterThan(Date value) {
            addCriterion("TEAM_DATE >", value, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TEAM_DATE >=", value, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateLessThan(Date value) {
            addCriterion("TEAM_DATE <", value, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateLessThanOrEqualTo(Date value) {
            addCriterion("TEAM_DATE <=", value, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateIn(List<Date> values) {
            addCriterion("TEAM_DATE in", values, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateNotIn(List<Date> values) {
            addCriterion("TEAM_DATE not in", values, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateBetween(Date value1, Date value2) {
            addCriterion("TEAM_DATE between", value1, value2, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamDateNotBetween(Date value1, Date value2) {
            addCriterion("TEAM_DATE not between", value1, value2, "teamDate");
            return (Criteria) this;
        }

        public Criteria andTeamFlagIsNull() {
            addCriterion("TEAM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTeamFlagIsNotNull() {
            addCriterion("TEAM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTeamFlagEqualTo(Integer value) {
            addCriterion("TEAM_FLAG =", value, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagNotEqualTo(Integer value) {
            addCriterion("TEAM_FLAG <>", value, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagGreaterThan(Integer value) {
            addCriterion("TEAM_FLAG >", value, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEAM_FLAG >=", value, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagLessThan(Integer value) {
            addCriterion("TEAM_FLAG <", value, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagLessThanOrEqualTo(Integer value) {
            addCriterion("TEAM_FLAG <=", value, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagIn(List<Integer> values) {
            addCriterion("TEAM_FLAG in", values, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagNotIn(List<Integer> values) {
            addCriterion("TEAM_FLAG not in", values, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_FLAG between", value1, value2, "teamFlag");
            return (Criteria) this;
        }

        public Criteria andTeamFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("TEAM_FLAG not between", value1, value2, "teamFlag");
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