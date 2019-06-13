package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WFCraftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFCraftExample() {
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

        public Criteria andCraftIdIsNull() {
            addCriterion("CRAFT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCraftIdIsNotNull() {
            addCriterion("CRAFT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCraftIdEqualTo(Integer value) {
            addCriterion("CRAFT_ID =", value, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdNotEqualTo(Integer value) {
            addCriterion("CRAFT_ID <>", value, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdGreaterThan(Integer value) {
            addCriterion("CRAFT_ID >", value, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CRAFT_ID >=", value, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdLessThan(Integer value) {
            addCriterion("CRAFT_ID <", value, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdLessThanOrEqualTo(Integer value) {
            addCriterion("CRAFT_ID <=", value, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdIn(List<Integer> values) {
            addCriterion("CRAFT_ID in", values, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdNotIn(List<Integer> values) {
            addCriterion("CRAFT_ID not in", values, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdBetween(Integer value1, Integer value2) {
            addCriterion("CRAFT_ID between", value1, value2, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CRAFT_ID not between", value1, value2, "craftId");
            return (Criteria) this;
        }

        public Criteria andCraftNameIsNull() {
            addCriterion("CRAFT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCraftNameIsNotNull() {
            addCriterion("CRAFT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCraftNameEqualTo(String value) {
            addCriterion("CRAFT_NAME =", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameNotEqualTo(String value) {
            addCriterion("CRAFT_NAME <>", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameGreaterThan(String value) {
            addCriterion("CRAFT_NAME >", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameGreaterThanOrEqualTo(String value) {
            addCriterion("CRAFT_NAME >=", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameLessThan(String value) {
            addCriterion("CRAFT_NAME <", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameLessThanOrEqualTo(String value) {
            addCriterion("CRAFT_NAME <=", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameLike(String value) {
            addCriterion("CRAFT_NAME like", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameNotLike(String value) {
            addCriterion("CRAFT_NAME not like", value, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameIn(List<String> values) {
            addCriterion("CRAFT_NAME in", values, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameNotIn(List<String> values) {
            addCriterion("CRAFT_NAME not in", values, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameBetween(String value1, String value2) {
            addCriterion("CRAFT_NAME between", value1, value2, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftNameNotBetween(String value1, String value2) {
            addCriterion("CRAFT_NAME not between", value1, value2, "craftName");
            return (Criteria) this;
        }

        public Criteria andCraftDesIsNull() {
            addCriterion("CRAFT_DES is null");
            return (Criteria) this;
        }

        public Criteria andCraftDesIsNotNull() {
            addCriterion("CRAFT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andCraftDesEqualTo(String value) {
            addCriterion("CRAFT_DES =", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesNotEqualTo(String value) {
            addCriterion("CRAFT_DES <>", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesGreaterThan(String value) {
            addCriterion("CRAFT_DES >", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesGreaterThanOrEqualTo(String value) {
            addCriterion("CRAFT_DES >=", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesLessThan(String value) {
            addCriterion("CRAFT_DES <", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesLessThanOrEqualTo(String value) {
            addCriterion("CRAFT_DES <=", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesLike(String value) {
            addCriterion("CRAFT_DES like", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesNotLike(String value) {
            addCriterion("CRAFT_DES not like", value, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesIn(List<String> values) {
            addCriterion("CRAFT_DES in", values, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesNotIn(List<String> values) {
            addCriterion("CRAFT_DES not in", values, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesBetween(String value1, String value2) {
            addCriterion("CRAFT_DES between", value1, value2, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftDesNotBetween(String value1, String value2) {
            addCriterion("CRAFT_DES not between", value1, value2, "craftDes");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkIsNull() {
            addCriterion("CRAFT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkIsNotNull() {
            addCriterion("CRAFT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkEqualTo(Integer value) {
            addCriterion("CRAFT_REMARK =", value, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkNotEqualTo(Integer value) {
            addCriterion("CRAFT_REMARK <>", value, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkGreaterThan(Integer value) {
            addCriterion("CRAFT_REMARK >", value, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("CRAFT_REMARK >=", value, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkLessThan(Integer value) {
            addCriterion("CRAFT_REMARK <", value, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("CRAFT_REMARK <=", value, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkIn(List<Integer> values) {
            addCriterion("CRAFT_REMARK in", values, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkNotIn(List<Integer> values) {
            addCriterion("CRAFT_REMARK not in", values, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkBetween(Integer value1, Integer value2) {
            addCriterion("CRAFT_REMARK between", value1, value2, "craftRemark");
            return (Criteria) this;
        }

        public Criteria andCraftRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("CRAFT_REMARK not between", value1, value2, "craftRemark");
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