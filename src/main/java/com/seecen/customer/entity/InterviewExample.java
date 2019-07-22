package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewExample() {
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

        public Criteria andViewIdIsNull() {
            addCriterion("VIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andViewIdIsNotNull() {
            addCriterion("VIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andViewIdEqualTo(Integer value) {
            addCriterion("VIEW_ID =", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotEqualTo(Integer value) {
            addCriterion("VIEW_ID <>", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThan(Integer value) {
            addCriterion("VIEW_ID >", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIEW_ID >=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThan(Integer value) {
            addCriterion("VIEW_ID <", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThanOrEqualTo(Integer value) {
            addCriterion("VIEW_ID <=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdIn(List<Integer> values) {
            addCriterion("VIEW_ID in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotIn(List<Integer> values) {
            addCriterion("VIEW_ID not in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdBetween(Integer value1, Integer value2) {
            addCriterion("VIEW_ID between", value1, value2, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VIEW_ID not between", value1, value2, "viewId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
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

        public Criteria andResumeIdIsNull() {
            addCriterion("RESUME_ID is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("RESUME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Integer value) {
            addCriterion("RESUME_ID =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Integer value) {
            addCriterion("RESUME_ID <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Integer value) {
            addCriterion("RESUME_ID >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESUME_ID >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Integer value) {
            addCriterion("RESUME_ID <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESUME_ID <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Integer> values) {
            addCriterion("RESUME_ID in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Integer> values) {
            addCriterion("RESUME_ID not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("RESUME_ID between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESUME_ID not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andConStatusIsNull() {
            addCriterion("CON_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andConStatusIsNotNull() {
            addCriterion("CON_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConStatusEqualTo(Integer value) {
            addCriterion("CON_STATUS =", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusNotEqualTo(Integer value) {
            addCriterion("CON_STATUS <>", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusGreaterThan(Integer value) {
            addCriterion("CON_STATUS >", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CON_STATUS >=", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusLessThan(Integer value) {
            addCriterion("CON_STATUS <", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusLessThanOrEqualTo(Integer value) {
            addCriterion("CON_STATUS <=", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusIn(List<Integer> values) {
            addCriterion("CON_STATUS in", values, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusNotIn(List<Integer> values) {
            addCriterion("CON_STATUS not in", values, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusBetween(Integer value1, Integer value2) {
            addCriterion("CON_STATUS between", value1, value2, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CON_STATUS not between", value1, value2, "conStatus");
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

        public Criteria andViewTimeIsNull() {
            addCriterion("VIEW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andViewTimeIsNotNull() {
            addCriterion("VIEW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andViewTimeEqualTo(Date value) {
            addCriterion("VIEW_TIME =", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotEqualTo(Date value) {
            addCriterion("VIEW_TIME <>", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeGreaterThan(Date value) {
            addCriterion("VIEW_TIME >", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VIEW_TIME >=", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeLessThan(Date value) {
            addCriterion("VIEW_TIME <", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeLessThanOrEqualTo(Date value) {
            addCriterion("VIEW_TIME <=", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeIn(List<Date> values) {
            addCriterion("VIEW_TIME in", values, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotIn(List<Date> values) {
            addCriterion("VIEW_TIME not in", values, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeBetween(Date value1, Date value2) {
            addCriterion("VIEW_TIME between", value1, value2, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotBetween(Date value1, Date value2) {
            addCriterion("VIEW_TIME not between", value1, value2, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewDateIsNull() {
            addCriterion("VIEW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andViewDateIsNotNull() {
            addCriterion("VIEW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andViewDateEqualTo(Date value) {
            addCriterion("VIEW_DATE =", value, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateNotEqualTo(Date value) {
            addCriterion("VIEW_DATE <>", value, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateGreaterThan(Date value) {
            addCriterion("VIEW_DATE >", value, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VIEW_DATE >=", value, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateLessThan(Date value) {
            addCriterion("VIEW_DATE <", value, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateLessThanOrEqualTo(Date value) {
            addCriterion("VIEW_DATE <=", value, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateIn(List<Date> values) {
            addCriterion("VIEW_DATE in", values, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateNotIn(List<Date> values) {
            addCriterion("VIEW_DATE not in", values, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateBetween(Date value1, Date value2) {
            addCriterion("VIEW_DATE between", value1, value2, "viewDate");
            return (Criteria) this;
        }

        public Criteria andViewDateNotBetween(Date value1, Date value2) {
            addCriterion("VIEW_DATE not between", value1, value2, "viewDate");
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