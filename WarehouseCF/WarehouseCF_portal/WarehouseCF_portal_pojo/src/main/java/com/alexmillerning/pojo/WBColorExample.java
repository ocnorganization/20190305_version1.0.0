/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WBColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WBColorExample() {
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

        public Criteria andColorIdIsNull() {
            addCriterion("COLOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("COLOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(String value) {
            addCriterion("COLOR_ID =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(String value) {
            addCriterion("COLOR_ID <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(String value) {
            addCriterion("COLOR_ID >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_ID >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(String value) {
            addCriterion("COLOR_ID <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(String value) {
            addCriterion("COLOR_ID <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLike(String value) {
            addCriterion("COLOR_ID like", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotLike(String value) {
            addCriterion("COLOR_ID not like", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<String> values) {
            addCriterion("COLOR_ID in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<String> values) {
            addCriterion("COLOR_ID not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(String value1, String value2) {
            addCriterion("COLOR_ID between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(String value1, String value2) {
            addCriterion("COLOR_ID not between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNull() {
            addCriterion("COLOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNotNull() {
            addCriterion("COLOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColorNameEqualTo(String value) {
            addCriterion("COLOR_NAME =", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotEqualTo(String value) {
            addCriterion("COLOR_NAME <>", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThan(String value) {
            addCriterion("COLOR_NAME >", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_NAME >=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThan(String value) {
            addCriterion("COLOR_NAME <", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThanOrEqualTo(String value) {
            addCriterion("COLOR_NAME <=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLike(String value) {
            addCriterion("COLOR_NAME like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotLike(String value) {
            addCriterion("COLOR_NAME not like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameIn(List<String> values) {
            addCriterion("COLOR_NAME in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotIn(List<String> values) {
            addCriterion("COLOR_NAME not in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameBetween(String value1, String value2) {
            addCriterion("COLOR_NAME between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotBetween(String value1, String value2) {
            addCriterion("COLOR_NAME not between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorRemarkIsNull() {
            addCriterion("COLOR_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andColorRemarkIsNotNull() {
            addCriterion("COLOR_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andColorRemarkEqualTo(String value) {
            addCriterion("COLOR_REMARK =", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkNotEqualTo(String value) {
            addCriterion("COLOR_REMARK <>", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkGreaterThan(String value) {
            addCriterion("COLOR_REMARK >", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_REMARK >=", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkLessThan(String value) {
            addCriterion("COLOR_REMARK <", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkLessThanOrEqualTo(String value) {
            addCriterion("COLOR_REMARK <=", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkLike(String value) {
            addCriterion("COLOR_REMARK like", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkNotLike(String value) {
            addCriterion("COLOR_REMARK not like", value, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkIn(List<String> values) {
            addCriterion("COLOR_REMARK in", values, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkNotIn(List<String> values) {
            addCriterion("COLOR_REMARK not in", values, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkBetween(String value1, String value2) {
            addCriterion("COLOR_REMARK between", value1, value2, "colorRemark");
            return (Criteria) this;
        }

        public Criteria andColorRemarkNotBetween(String value1, String value2) {
            addCriterion("COLOR_REMARK not between", value1, value2, "colorRemark");
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