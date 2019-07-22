package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNIdIsNull() {
            addCriterion("N_ID is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("N_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("N_ID =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("N_ID <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("N_ID >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_ID >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("N_ID <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("N_ID <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("N_ID in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("N_ID not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("N_ID between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("N_ID not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNTitleIsNull() {
            addCriterion("N_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNTitleIsNotNull() {
            addCriterion("N_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNTitleEqualTo(String value) {
            addCriterion("N_TITLE =", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotEqualTo(String value) {
            addCriterion("N_TITLE <>", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleGreaterThan(String value) {
            addCriterion("N_TITLE >", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleGreaterThanOrEqualTo(String value) {
            addCriterion("N_TITLE >=", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLessThan(String value) {
            addCriterion("N_TITLE <", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLessThanOrEqualTo(String value) {
            addCriterion("N_TITLE <=", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLike(String value) {
            addCriterion("N_TITLE like", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotLike(String value) {
            addCriterion("N_TITLE not like", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleIn(List<String> values) {
            addCriterion("N_TITLE in", values, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotIn(List<String> values) {
            addCriterion("N_TITLE not in", values, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleBetween(String value1, String value2) {
            addCriterion("N_TITLE between", value1, value2, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotBetween(String value1, String value2) {
            addCriterion("N_TITLE not between", value1, value2, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNContentIsNull() {
            addCriterion("N_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andNContentIsNotNull() {
            addCriterion("N_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andNContentEqualTo(String value) {
            addCriterion("N_CONTENT =", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotEqualTo(String value) {
            addCriterion("N_CONTENT <>", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentGreaterThan(String value) {
            addCriterion("N_CONTENT >", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentGreaterThanOrEqualTo(String value) {
            addCriterion("N_CONTENT >=", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLessThan(String value) {
            addCriterion("N_CONTENT <", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLessThanOrEqualTo(String value) {
            addCriterion("N_CONTENT <=", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLike(String value) {
            addCriterion("N_CONTENT like", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotLike(String value) {
            addCriterion("N_CONTENT not like", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentIn(List<String> values) {
            addCriterion("N_CONTENT in", values, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotIn(List<String> values) {
            addCriterion("N_CONTENT not in", values, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentBetween(String value1, String value2) {
            addCriterion("N_CONTENT between", value1, value2, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotBetween(String value1, String value2) {
            addCriterion("N_CONTENT not between", value1, value2, "nContent");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeIsNull() {
            addCriterion("N_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeIsNotNull() {
            addCriterion("N_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeEqualTo(Date value) {
            addCriterion("N_CREATETIME =", value, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeNotEqualTo(Date value) {
            addCriterion("N_CREATETIME <>", value, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeGreaterThan(Date value) {
            addCriterion("N_CREATETIME >", value, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("N_CREATETIME >=", value, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeLessThan(Date value) {
            addCriterion("N_CREATETIME <", value, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("N_CREATETIME <=", value, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeIn(List<Date> values) {
            addCriterion("N_CREATETIME in", values, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeNotIn(List<Date> values) {
            addCriterion("N_CREATETIME not in", values, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeBetween(Date value1, Date value2) {
            addCriterion("N_CREATETIME between", value1, value2, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andNCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("N_CREATETIME not between", value1, value2, "nCreatetime");
            return (Criteria) this;
        }

        public Criteria andPromulgatorIsNull() {
            addCriterion("PROMULGATOR is null");
            return (Criteria) this;
        }

        public Criteria andPromulgatorIsNotNull() {
            addCriterion("PROMULGATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPromulgatorEqualTo(String value) {
            addCriterion("PROMULGATOR =", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotEqualTo(String value) {
            addCriterion("PROMULGATOR <>", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorGreaterThan(String value) {
            addCriterion("PROMULGATOR >", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorGreaterThanOrEqualTo(String value) {
            addCriterion("PROMULGATOR >=", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorLessThan(String value) {
            addCriterion("PROMULGATOR <", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorLessThanOrEqualTo(String value) {
            addCriterion("PROMULGATOR <=", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorLike(String value) {
            addCriterion("PROMULGATOR like", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotLike(String value) {
            addCriterion("PROMULGATOR not like", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorIn(List<String> values) {
            addCriterion("PROMULGATOR in", values, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotIn(List<String> values) {
            addCriterion("PROMULGATOR not in", values, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorBetween(String value1, String value2) {
            addCriterion("PROMULGATOR between", value1, value2, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotBetween(String value1, String value2) {
            addCriterion("PROMULGATOR not between", value1, value2, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPageviewIsNull() {
            addCriterion("PAGEVIEW is null");
            return (Criteria) this;
        }

        public Criteria andPageviewIsNotNull() {
            addCriterion("PAGEVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewEqualTo(Long value) {
            addCriterion("PAGEVIEW =", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewNotEqualTo(Long value) {
            addCriterion("PAGEVIEW <>", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewGreaterThan(Long value) {
            addCriterion("PAGEVIEW >", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewGreaterThanOrEqualTo(Long value) {
            addCriterion("PAGEVIEW >=", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewLessThan(Long value) {
            addCriterion("PAGEVIEW <", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewLessThanOrEqualTo(Long value) {
            addCriterion("PAGEVIEW <=", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewIn(List<Long> values) {
            addCriterion("PAGEVIEW in", values, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewNotIn(List<Long> values) {
            addCriterion("PAGEVIEW not in", values, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewBetween(Long value1, Long value2) {
            addCriterion("PAGEVIEW between", value1, value2, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewNotBetween(Long value1, Long value2) {
            addCriterion("PAGEVIEW not between", value1, value2, "pageview");
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