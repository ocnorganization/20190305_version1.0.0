package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WFMenusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFMenusExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("MENUID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(String value) {
            addCriterion("MENUID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(String value) {
            addCriterion("MENUID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(String value) {
            addCriterion("MENUID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(String value) {
            addCriterion("MENUID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(String value) {
            addCriterion("MENUID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(String value) {
            addCriterion("MENUID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLike(String value) {
            addCriterion("MENUID like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotLike(String value) {
            addCriterion("MENUID not like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<String> values) {
            addCriterion("MENUID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<String> values) {
            addCriterion("MENUID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(String value1, String value2) {
            addCriterion("MENUID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(String value1, String value2) {
            addCriterion("MENUID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidIsNull() {
            addCriterion("PMENUID is null");
            return (Criteria) this;
        }

        public Criteria andPmenuidIsNotNull() {
            addCriterion("PMENUID is not null");
            return (Criteria) this;
        }

        public Criteria andPmenuidEqualTo(String value) {
            addCriterion("PMENUID =", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidNotEqualTo(String value) {
            addCriterion("PMENUID <>", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidGreaterThan(String value) {
            addCriterion("PMENUID >", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidGreaterThanOrEqualTo(String value) {
            addCriterion("PMENUID >=", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidLessThan(String value) {
            addCriterion("PMENUID <", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidLessThanOrEqualTo(String value) {
            addCriterion("PMENUID <=", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidLike(String value) {
            addCriterion("PMENUID like", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidNotLike(String value) {
            addCriterion("PMENUID not like", value, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidIn(List<String> values) {
            addCriterion("PMENUID in", values, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidNotIn(List<String> values) {
            addCriterion("PMENUID not in", values, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidBetween(String value1, String value2) {
            addCriterion("PMENUID between", value1, value2, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andPmenuidNotBetween(String value1, String value2) {
            addCriterion("PMENUID not between", value1, value2, "pmenuid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MENUNAME =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MENUNAME <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MENUNAME >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MENUNAME <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MENUNAME <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MENUNAME like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MENUNAME not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MENUNAME in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MENUNAME not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MENUNAME between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MENUNAME not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenustatusIsNull() {
            addCriterion("MENUSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andMenustatusIsNotNull() {
            addCriterion("MENUSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMenustatusEqualTo(String value) {
            addCriterion("MENUSTATUS =", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusNotEqualTo(String value) {
            addCriterion("MENUSTATUS <>", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusGreaterThan(String value) {
            addCriterion("MENUSTATUS >", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSTATUS >=", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusLessThan(String value) {
            addCriterion("MENUSTATUS <", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusLessThanOrEqualTo(String value) {
            addCriterion("MENUSTATUS <=", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusLike(String value) {
            addCriterion("MENUSTATUS like", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusNotLike(String value) {
            addCriterion("MENUSTATUS not like", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusIn(List<String> values) {
            addCriterion("MENUSTATUS in", values, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusNotIn(List<String> values) {
            addCriterion("MENUSTATUS not in", values, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusBetween(String value1, String value2) {
            addCriterion("MENUSTATUS between", value1, value2, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusNotBetween(String value1, String value2) {
            addCriterion("MENUSTATUS not between", value1, value2, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("MENUURL is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("MENUURL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("MENUURL =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("MENUURL <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("MENUURL >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("MENUURL >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("MENUURL <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("MENUURL <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("MENUURL like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("MENUURL not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("MENUURL in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("MENUURL not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("MENUURL between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("MENUURL not between", value1, value2, "menuurl");
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