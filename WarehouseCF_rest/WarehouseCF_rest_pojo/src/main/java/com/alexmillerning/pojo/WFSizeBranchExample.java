package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WFSizeBranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFSizeBranchExample() {
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

        public Criteria andSizeBranchIdIsNull() {
            addCriterion("SIZE_BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdIsNotNull() {
            addCriterion("SIZE_BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_ID =", value, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdNotEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_ID <>", value, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdGreaterThan(Integer value) {
            addCriterion("SIZE_BRANCH_ID >", value, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_ID >=", value, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdLessThan(Integer value) {
            addCriterion("SIZE_BRANCH_ID <", value, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_ID <=", value, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdIn(List<Integer> values) {
            addCriterion("SIZE_BRANCH_ID in", values, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdNotIn(List<Integer> values) {
            addCriterion("SIZE_BRANCH_ID not in", values, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_BRANCH_ID between", value1, value2, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_BRANCH_ID not between", value1, value2, "sizeBranchId");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameIsNull() {
            addCriterion("SIZE_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameIsNotNull() {
            addCriterion("SIZE_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameEqualTo(String value) {
            addCriterion("SIZE_BRANCH_NAME =", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameNotEqualTo(String value) {
            addCriterion("SIZE_BRANCH_NAME <>", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameGreaterThan(String value) {
            addCriterion("SIZE_BRANCH_NAME >", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIZE_BRANCH_NAME >=", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameLessThan(String value) {
            addCriterion("SIZE_BRANCH_NAME <", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameLessThanOrEqualTo(String value) {
            addCriterion("SIZE_BRANCH_NAME <=", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameLike(String value) {
            addCriterion("SIZE_BRANCH_NAME like", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameNotLike(String value) {
            addCriterion("SIZE_BRANCH_NAME not like", value, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameIn(List<String> values) {
            addCriterion("SIZE_BRANCH_NAME in", values, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameNotIn(List<String> values) {
            addCriterion("SIZE_BRANCH_NAME not in", values, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameBetween(String value1, String value2) {
            addCriterion("SIZE_BRANCH_NAME between", value1, value2, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchNameNotBetween(String value1, String value2) {
            addCriterion("SIZE_BRANCH_NAME not between", value1, value2, "sizeBranchName");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentIsNull() {
            addCriterion("SIZE_BRANCH_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentIsNotNull() {
            addCriterion("SIZE_BRANCH_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_PARENT =", value, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentNotEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_PARENT <>", value, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentGreaterThan(Integer value) {
            addCriterion("SIZE_BRANCH_PARENT >", value, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_PARENT >=", value, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentLessThan(Integer value) {
            addCriterion("SIZE_BRANCH_PARENT <", value, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentLessThanOrEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_PARENT <=", value, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentIn(List<Integer> values) {
            addCriterion("SIZE_BRANCH_PARENT in", values, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentNotIn(List<Integer> values) {
            addCriterion("SIZE_BRANCH_PARENT not in", values, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_BRANCH_PARENT between", value1, value2, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchParentNotBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_BRANCH_PARENT not between", value1, value2, "sizeBranchParent");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkIsNull() {
            addCriterion("SIZE_BRANCH_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkIsNotNull() {
            addCriterion("SIZE_BRANCH_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_REMARK =", value, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkNotEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_REMARK <>", value, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkGreaterThan(Integer value) {
            addCriterion("SIZE_BRANCH_REMARK >", value, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_REMARK >=", value, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkLessThan(Integer value) {
            addCriterion("SIZE_BRANCH_REMARK <", value, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("SIZE_BRANCH_REMARK <=", value, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkIn(List<Integer> values) {
            addCriterion("SIZE_BRANCH_REMARK in", values, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkNotIn(List<Integer> values) {
            addCriterion("SIZE_BRANCH_REMARK not in", values, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_BRANCH_REMARK between", value1, value2, "sizeBranchRemark");
            return (Criteria) this;
        }

        public Criteria andSizeBranchRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_BRANCH_REMARK not between", value1, value2, "sizeBranchRemark");
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