package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WFUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WFUnitExample() {
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

        public Criteria andUnitIdIsNull() {
            addCriterion("UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("UNIT_ID =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("UNIT_ID <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("UNIT_ID >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNIT_ID >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("UNIT_ID <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("UNIT_ID <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("UNIT_ID in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("UNIT_ID not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("UNIT_ID between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UNIT_ID not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("UNIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("UNIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("UNIT_NAME =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("UNIT_NAME <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("UNIT_NAME >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("UNIT_NAME <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("UNIT_NAME like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("UNIT_NAME not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("UNIT_NAME in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("UNIT_NAME not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("UNIT_NAME between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("UNIT_NAME not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitDesIsNull() {
            addCriterion("UNIT_DES is null");
            return (Criteria) this;
        }

        public Criteria andUnitDesIsNotNull() {
            addCriterion("UNIT_DES is not null");
            return (Criteria) this;
        }

        public Criteria andUnitDesEqualTo(String value) {
            addCriterion("UNIT_DES =", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesNotEqualTo(String value) {
            addCriterion("UNIT_DES <>", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesGreaterThan(String value) {
            addCriterion("UNIT_DES >", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_DES >=", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesLessThan(String value) {
            addCriterion("UNIT_DES <", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesLessThanOrEqualTo(String value) {
            addCriterion("UNIT_DES <=", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesLike(String value) {
            addCriterion("UNIT_DES like", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesNotLike(String value) {
            addCriterion("UNIT_DES not like", value, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesIn(List<String> values) {
            addCriterion("UNIT_DES in", values, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesNotIn(List<String> values) {
            addCriterion("UNIT_DES not in", values, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesBetween(String value1, String value2) {
            addCriterion("UNIT_DES between", value1, value2, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitDesNotBetween(String value1, String value2) {
            addCriterion("UNIT_DES not between", value1, value2, "unitDes");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkIsNull() {
            addCriterion("UNIT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkIsNotNull() {
            addCriterion("UNIT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkEqualTo(String value) {
            addCriterion("UNIT_REMARK =", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkNotEqualTo(String value) {
            addCriterion("UNIT_REMARK <>", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkGreaterThan(String value) {
            addCriterion("UNIT_REMARK >", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_REMARK >=", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkLessThan(String value) {
            addCriterion("UNIT_REMARK <", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkLessThanOrEqualTo(String value) {
            addCriterion("UNIT_REMARK <=", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkLike(String value) {
            addCriterion("UNIT_REMARK like", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkNotLike(String value) {
            addCriterion("UNIT_REMARK not like", value, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkIn(List<String> values) {
            addCriterion("UNIT_REMARK in", values, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkNotIn(List<String> values) {
            addCriterion("UNIT_REMARK not in", values, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkBetween(String value1, String value2) {
            addCriterion("UNIT_REMARK between", value1, value2, "unitRemark");
            return (Criteria) this;
        }

        public Criteria andUnitRemarkNotBetween(String value1, String value2) {
            addCriterion("UNIT_REMARK not between", value1, value2, "unitRemark");
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