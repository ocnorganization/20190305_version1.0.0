package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WFBrandExample {
    /**
     * 添加分页查询用到的参数
     */
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
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFBrandExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("BRAND_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("BRAND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("BRAND_ID =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("BRAND_ID <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("BRAND_ID >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRAND_ID >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("BRAND_ID <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("BRAND_ID <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("BRAND_ID in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("BRAND_ID not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("BRAND_ID between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BRAND_ID not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("BRAND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("BRAND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("BRAND_NAME =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("BRAND_NAME <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("BRAND_NAME >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_NAME >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("BRAND_NAME <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("BRAND_NAME <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("BRAND_NAME like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("BRAND_NAME not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("BRAND_NAME in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("BRAND_NAME not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("BRAND_NAME between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("BRAND_NAME not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandDesIsNull() {
            addCriterion("BRAND_DES is null");
            return (Criteria) this;
        }

        public Criteria andBrandDesIsNotNull() {
            addCriterion("BRAND_DES is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDesEqualTo(String value) {
            addCriterion("BRAND_DES =", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesNotEqualTo(String value) {
            addCriterion("BRAND_DES <>", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesGreaterThan(String value) {
            addCriterion("BRAND_DES >", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_DES >=", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesLessThan(String value) {
            addCriterion("BRAND_DES <", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesLessThanOrEqualTo(String value) {
            addCriterion("BRAND_DES <=", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesLike(String value) {
            addCriterion("BRAND_DES like", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesNotLike(String value) {
            addCriterion("BRAND_DES not like", value, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesIn(List<String> values) {
            addCriterion("BRAND_DES in", values, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesNotIn(List<String> values) {
            addCriterion("BRAND_DES not in", values, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesBetween(String value1, String value2) {
            addCriterion("BRAND_DES between", value1, value2, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandDesNotBetween(String value1, String value2) {
            addCriterion("BRAND_DES not between", value1, value2, "brandDes");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkIsNull() {
            addCriterion("BRAND_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkIsNotNull() {
            addCriterion("BRAND_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkEqualTo(String value) {
            addCriterion("BRAND_REMARK =", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkNotEqualTo(String value) {
            addCriterion("BRAND_REMARK <>", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkGreaterThan(String value) {
            addCriterion("BRAND_REMARK >", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_REMARK >=", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkLessThan(String value) {
            addCriterion("BRAND_REMARK <", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkLessThanOrEqualTo(String value) {
            addCriterion("BRAND_REMARK <=", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkLike(String value) {
            addCriterion("BRAND_REMARK like", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkNotLike(String value) {
            addCriterion("BRAND_REMARK not like", value, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkIn(List<String> values) {
            addCriterion("BRAND_REMARK in", values, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkNotIn(List<String> values) {
            addCriterion("BRAND_REMARK not in", values, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkBetween(String value1, String value2) {
            addCriterion("BRAND_REMARK between", value1, value2, "brandRemark");
            return (Criteria) this;
        }

        public Criteria andBrandRemarkNotBetween(String value1, String value2) {
            addCriterion("BRAND_REMARK not between", value1, value2, "brandRemark");
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