package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WFPartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFPartExample() {
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

        public Criteria andPartIdIsNull() {
            addCriterion("PART_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("PART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(Integer value) {
            addCriterion("PART_ID =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(Integer value) {
            addCriterion("PART_ID <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(Integer value) {
            addCriterion("PART_ID >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PART_ID >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(Integer value) {
            addCriterion("PART_ID <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(Integer value) {
            addCriterion("PART_ID <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<Integer> values) {
            addCriterion("PART_ID in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<Integer> values) {
            addCriterion("PART_ID not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(Integer value1, Integer value2) {
            addCriterion("PART_ID between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PART_ID not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("PART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("PART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("PART_NAME =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("PART_NAME <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("PART_NAME >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("PART_NAME >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("PART_NAME <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("PART_NAME <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("PART_NAME like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("PART_NAME not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("PART_NAME in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("PART_NAME not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("PART_NAME between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("PART_NAME not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartDesIsNull() {
            addCriterion("PART_DES is null");
            return (Criteria) this;
        }

        public Criteria andPartDesIsNotNull() {
            addCriterion("PART_DES is not null");
            return (Criteria) this;
        }

        public Criteria andPartDesEqualTo(String value) {
            addCriterion("PART_DES =", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesNotEqualTo(String value) {
            addCriterion("PART_DES <>", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesGreaterThan(String value) {
            addCriterion("PART_DES >", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesGreaterThanOrEqualTo(String value) {
            addCriterion("PART_DES >=", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesLessThan(String value) {
            addCriterion("PART_DES <", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesLessThanOrEqualTo(String value) {
            addCriterion("PART_DES <=", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesLike(String value) {
            addCriterion("PART_DES like", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesNotLike(String value) {
            addCriterion("PART_DES not like", value, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesIn(List<String> values) {
            addCriterion("PART_DES in", values, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesNotIn(List<String> values) {
            addCriterion("PART_DES not in", values, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesBetween(String value1, String value2) {
            addCriterion("PART_DES between", value1, value2, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartDesNotBetween(String value1, String value2) {
            addCriterion("PART_DES not between", value1, value2, "partDes");
            return (Criteria) this;
        }

        public Criteria andPartRemarkIsNull() {
            addCriterion("PART_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPartRemarkIsNotNull() {
            addCriterion("PART_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPartRemarkEqualTo(String value) {
            addCriterion("PART_REMARK =", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkNotEqualTo(String value) {
            addCriterion("PART_REMARK <>", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkGreaterThan(String value) {
            addCriterion("PART_REMARK >", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PART_REMARK >=", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkLessThan(String value) {
            addCriterion("PART_REMARK <", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkLessThanOrEqualTo(String value) {
            addCriterion("PART_REMARK <=", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkLike(String value) {
            addCriterion("PART_REMARK like", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkNotLike(String value) {
            addCriterion("PART_REMARK not like", value, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkIn(List<String> values) {
            addCriterion("PART_REMARK in", values, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkNotIn(List<String> values) {
            addCriterion("PART_REMARK not in", values, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkBetween(String value1, String value2) {
            addCriterion("PART_REMARK between", value1, value2, "partRemark");
            return (Criteria) this;
        }

        public Criteria andPartRemarkNotBetween(String value1, String value2) {
            addCriterion("PART_REMARK not between", value1, value2, "partRemark");
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