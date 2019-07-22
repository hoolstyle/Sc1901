package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andReviewIdIsNull() {
            addCriterion("REVIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNotNull() {
            addCriterion("REVIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdEqualTo(Integer value) {
            addCriterion("REVIEW_ID =", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotEqualTo(Integer value) {
            addCriterion("REVIEW_ID <>", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThan(Integer value) {
            addCriterion("REVIEW_ID >", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_ID >=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThan(Integer value) {
            addCriterion("REVIEW_ID <", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_ID <=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdIn(List<Integer> values) {
            addCriterion("REVIEW_ID in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotIn(List<Integer> values) {
            addCriterion("REVIEW_ID not in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_ID between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_ID not between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewProjectIsNull() {
            addCriterion("REVIEW_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andReviewProjectIsNotNull() {
            addCriterion("REVIEW_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewProjectEqualTo(String value) {
            addCriterion("REVIEW_PROJECT =", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectNotEqualTo(String value) {
            addCriterion("REVIEW_PROJECT <>", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectGreaterThan(String value) {
            addCriterion("REVIEW_PROJECT >", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_PROJECT >=", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectLessThan(String value) {
            addCriterion("REVIEW_PROJECT <", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_PROJECT <=", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectLike(String value) {
            addCriterion("REVIEW_PROJECT like", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectNotLike(String value) {
            addCriterion("REVIEW_PROJECT not like", value, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectIn(List<String> values) {
            addCriterion("REVIEW_PROJECT in", values, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectNotIn(List<String> values) {
            addCriterion("REVIEW_PROJECT not in", values, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectBetween(String value1, String value2) {
            addCriterion("REVIEW_PROJECT between", value1, value2, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewProjectNotBetween(String value1, String value2) {
            addCriterion("REVIEW_PROJECT not between", value1, value2, "reviewProject");
            return (Criteria) this;
        }

        public Criteria andReviewCaseIsNull() {
            addCriterion("REVIEW_CASE is null");
            return (Criteria) this;
        }

        public Criteria andReviewCaseIsNotNull() {
            addCriterion("REVIEW_CASE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCaseEqualTo(String value) {
            addCriterion("REVIEW_CASE =", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseNotEqualTo(String value) {
            addCriterion("REVIEW_CASE <>", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseGreaterThan(String value) {
            addCriterion("REVIEW_CASE >", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_CASE >=", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseLessThan(String value) {
            addCriterion("REVIEW_CASE <", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_CASE <=", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseLike(String value) {
            addCriterion("REVIEW_CASE like", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseNotLike(String value) {
            addCriterion("REVIEW_CASE not like", value, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseIn(List<String> values) {
            addCriterion("REVIEW_CASE in", values, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseNotIn(List<String> values) {
            addCriterion("REVIEW_CASE not in", values, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseBetween(String value1, String value2) {
            addCriterion("REVIEW_CASE between", value1, value2, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewCaseNotBetween(String value1, String value2) {
            addCriterion("REVIEW_CASE not between", value1, value2, "reviewCase");
            return (Criteria) this;
        }

        public Criteria andReviewGradeIsNull() {
            addCriterion("REVIEW_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andReviewGradeIsNotNull() {
            addCriterion("REVIEW_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewGradeEqualTo(String value) {
            addCriterion("REVIEW_GRADE =", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeNotEqualTo(String value) {
            addCriterion("REVIEW_GRADE <>", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeGreaterThan(String value) {
            addCriterion("REVIEW_GRADE >", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_GRADE >=", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeLessThan(String value) {
            addCriterion("REVIEW_GRADE <", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_GRADE <=", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeLike(String value) {
            addCriterion("REVIEW_GRADE like", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeNotLike(String value) {
            addCriterion("REVIEW_GRADE not like", value, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeIn(List<String> values) {
            addCriterion("REVIEW_GRADE in", values, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeNotIn(List<String> values) {
            addCriterion("REVIEW_GRADE not in", values, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeBetween(String value1, String value2) {
            addCriterion("REVIEW_GRADE between", value1, value2, "reviewGrade");
            return (Criteria) this;
        }

        public Criteria andReviewGradeNotBetween(String value1, String value2) {
            addCriterion("REVIEW_GRADE not between", value1, value2, "reviewGrade");
            return (Criteria) this;
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

        public Criteria andReviewRemarkIsNull() {
            addCriterion("REVIEW_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkIsNotNull() {
            addCriterion("REVIEW_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkEqualTo(String value) {
            addCriterion("REVIEW_REMARK =", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotEqualTo(String value) {
            addCriterion("REVIEW_REMARK <>", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkGreaterThan(String value) {
            addCriterion("REVIEW_REMARK >", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_REMARK >=", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkLessThan(String value) {
            addCriterion("REVIEW_REMARK <", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_REMARK <=", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkLike(String value) {
            addCriterion("REVIEW_REMARK like", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotLike(String value) {
            addCriterion("REVIEW_REMARK not like", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkIn(List<String> values) {
            addCriterion("REVIEW_REMARK in", values, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotIn(List<String> values) {
            addCriterion("REVIEW_REMARK not in", values, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkBetween(String value1, String value2) {
            addCriterion("REVIEW_REMARK between", value1, value2, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotBetween(String value1, String value2) {
            addCriterion("REVIEW_REMARK not between", value1, value2, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewFlagIsNull() {
            addCriterion("REVIEW_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReviewFlagIsNotNull() {
            addCriterion("REVIEW_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReviewFlagEqualTo(Integer value) {
            addCriterion("REVIEW_FLAG =", value, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagNotEqualTo(Integer value) {
            addCriterion("REVIEW_FLAG <>", value, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagGreaterThan(Integer value) {
            addCriterion("REVIEW_FLAG >", value, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_FLAG >=", value, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagLessThan(Integer value) {
            addCriterion("REVIEW_FLAG <", value, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_FLAG <=", value, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagIn(List<Integer> values) {
            addCriterion("REVIEW_FLAG in", values, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagNotIn(List<Integer> values) {
            addCriterion("REVIEW_FLAG not in", values, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_FLAG between", value1, value2, "reviewFlag");
            return (Criteria) this;
        }

        public Criteria andReviewFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_FLAG not between", value1, value2, "reviewFlag");
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