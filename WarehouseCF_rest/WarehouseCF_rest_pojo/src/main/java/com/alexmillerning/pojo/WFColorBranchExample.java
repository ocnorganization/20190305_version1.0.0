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

public class WFColorBranchExample {
    /**
     * 添加分页查询用到的参数

    protected Integer limit;
    protected Integer offset;
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getOffset() {
        return offset;
    }
     */

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFColorBranchExample() {
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

        public Criteria andColorBranchIdIsNull() {
            addCriterion("COLOR_BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdIsNotNull() {
            addCriterion("COLOR_BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdEqualTo(Integer value) {
            addCriterion("COLOR_BRANCH_ID =", value, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdNotEqualTo(Integer value) {
            addCriterion("COLOR_BRANCH_ID <>", value, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdGreaterThan(Integer value) {
            addCriterion("COLOR_BRANCH_ID >", value, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLOR_BRANCH_ID >=", value, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdLessThan(Integer value) {
            addCriterion("COLOR_BRANCH_ID <", value, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("COLOR_BRANCH_ID <=", value, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdIn(List<Integer> values) {
            addCriterion("COLOR_BRANCH_ID in", values, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdNotIn(List<Integer> values) {
            addCriterion("COLOR_BRANCH_ID not in", values, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("COLOR_BRANCH_ID between", value1, value2, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COLOR_BRANCH_ID not between", value1, value2, "colorBranchId");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameIsNull() {
            addCriterion("COLOR_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameIsNotNull() {
            addCriterion("COLOR_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameEqualTo(String value) {
            addCriterion("COLOR_BRANCH_NAME =", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameNotEqualTo(String value) {
            addCriterion("COLOR_BRANCH_NAME <>", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameGreaterThan(String value) {
            addCriterion("COLOR_BRANCH_NAME >", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_BRANCH_NAME >=", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameLessThan(String value) {
            addCriterion("COLOR_BRANCH_NAME <", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameLessThanOrEqualTo(String value) {
            addCriterion("COLOR_BRANCH_NAME <=", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameLike(String value) {
            addCriterion("COLOR_BRANCH_NAME like", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameNotLike(String value) {
            addCriterion("COLOR_BRANCH_NAME not like", value, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameIn(List<String> values) {
            addCriterion("COLOR_BRANCH_NAME in", values, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameNotIn(List<String> values) {
            addCriterion("COLOR_BRANCH_NAME not in", values, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameBetween(String value1, String value2) {
            addCriterion("COLOR_BRANCH_NAME between", value1, value2, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchNameNotBetween(String value1, String value2) {
            addCriterion("COLOR_BRANCH_NAME not between", value1, value2, "colorBranchName");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentIsNull() {
            addCriterion("COLOR_BRANCH_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentIsNotNull() {
            addCriterion("COLOR_BRANCH_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentEqualTo(String value) {
            addCriterion("COLOR_BRANCH_PARENT =", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentNotEqualTo(String value) {
            addCriterion("COLOR_BRANCH_PARENT <>", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentGreaterThan(String value) {
            addCriterion("COLOR_BRANCH_PARENT >", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_BRANCH_PARENT >=", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentLessThan(String value) {
            addCriterion("COLOR_BRANCH_PARENT <", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentLessThanOrEqualTo(String value) {
            addCriterion("COLOR_BRANCH_PARENT <=", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentLike(String value) {
            addCriterion("COLOR_BRANCH_PARENT like", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentNotLike(String value) {
            addCriterion("COLOR_BRANCH_PARENT not like", value, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentIn(List<String> values) {
            addCriterion("COLOR_BRANCH_PARENT in", values, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentNotIn(List<String> values) {
            addCriterion("COLOR_BRANCH_PARENT not in", values, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentBetween(String value1, String value2) {
            addCriterion("COLOR_BRANCH_PARENT between", value1, value2, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchParentNotBetween(String value1, String value2) {
            addCriterion("COLOR_BRANCH_PARENT not between", value1, value2, "colorBranchParent");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkIsNull() {
            addCriterion("COLOR_BRANCH_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkIsNotNull() {
            addCriterion("COLOR_BRANCH_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkEqualTo(String value) {
            addCriterion("COLOR_BRANCH_REMARK =", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkNotEqualTo(String value) {
            addCriterion("COLOR_BRANCH_REMARK <>", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkGreaterThan(String value) {
            addCriterion("COLOR_BRANCH_REMARK >", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_BRANCH_REMARK >=", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkLessThan(String value) {
            addCriterion("COLOR_BRANCH_REMARK <", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkLessThanOrEqualTo(String value) {
            addCriterion("COLOR_BRANCH_REMARK <=", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkLike(String value) {
            addCriterion("COLOR_BRANCH_REMARK like", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkNotLike(String value) {
            addCriterion("COLOR_BRANCH_REMARK not like", value, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkIn(List<String> values) {
            addCriterion("COLOR_BRANCH_REMARK in", values, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkNotIn(List<String> values) {
            addCriterion("COLOR_BRANCH_REMARK not in", values, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkBetween(String value1, String value2) {
            addCriterion("COLOR_BRANCH_REMARK between", value1, value2, "colorBranchRemark");
            return (Criteria) this;
        }

        public Criteria andColorBranchRemarkNotBetween(String value1, String value2) {
            addCriterion("COLOR_BRANCH_REMARK not between", value1, value2, "colorBranchRemark");
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