package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WFSeasonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFSeasonExample() {
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

        public Criteria andSeasonIdIsNull() {
            addCriterion("SEASON_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIsNotNull() {
            addCriterion("SEASON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdEqualTo(Integer value) {
            addCriterion("SEASON_ID =", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotEqualTo(Integer value) {
            addCriterion("SEASON_ID <>", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThan(Integer value) {
            addCriterion("SEASON_ID >", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEASON_ID >=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThan(Integer value) {
            addCriterion("SEASON_ID <", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThanOrEqualTo(Integer value) {
            addCriterion("SEASON_ID <=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIn(List<Integer> values) {
            addCriterion("SEASON_ID in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotIn(List<Integer> values) {
            addCriterion("SEASON_ID not in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdBetween(Integer value1, Integer value2) {
            addCriterion("SEASON_ID between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SEASON_ID not between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIsNull() {
            addCriterion("SEASON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIsNotNull() {
            addCriterion("SEASON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameEqualTo(String value) {
            addCriterion("SEASON_NAME =", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotEqualTo(String value) {
            addCriterion("SEASON_NAME <>", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThan(String value) {
            addCriterion("SEASON_NAME >", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThanOrEqualTo(String value) {
            addCriterion("SEASON_NAME >=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThan(String value) {
            addCriterion("SEASON_NAME <", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThanOrEqualTo(String value) {
            addCriterion("SEASON_NAME <=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLike(String value) {
            addCriterion("SEASON_NAME like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotLike(String value) {
            addCriterion("SEASON_NAME not like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIn(List<String> values) {
            addCriterion("SEASON_NAME in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotIn(List<String> values) {
            addCriterion("SEASON_NAME not in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameBetween(String value1, String value2) {
            addCriterion("SEASON_NAME between", value1, value2, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotBetween(String value1, String value2) {
            addCriterion("SEASON_NAME not between", value1, value2, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkIsNull() {
            addCriterion("SEASON_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkIsNotNull() {
            addCriterion("SEASON_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkEqualTo(String value) {
            addCriterion("SEASON_REMARK =", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkNotEqualTo(String value) {
            addCriterion("SEASON_REMARK <>", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkGreaterThan(String value) {
            addCriterion("SEASON_REMARK >", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SEASON_REMARK >=", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkLessThan(String value) {
            addCriterion("SEASON_REMARK <", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkLessThanOrEqualTo(String value) {
            addCriterion("SEASON_REMARK <=", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkLike(String value) {
            addCriterion("SEASON_REMARK like", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkNotLike(String value) {
            addCriterion("SEASON_REMARK not like", value, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkIn(List<String> values) {
            addCriterion("SEASON_REMARK in", values, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkNotIn(List<String> values) {
            addCriterion("SEASON_REMARK not in", values, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkBetween(String value1, String value2) {
            addCriterion("SEASON_REMARK between", value1, value2, "seasonRemark");
            return (Criteria) this;
        }

        public Criteria andSeasonRemarkNotBetween(String value1, String value2) {
            addCriterion("SEASON_REMARK not between", value1, value2, "seasonRemark");
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