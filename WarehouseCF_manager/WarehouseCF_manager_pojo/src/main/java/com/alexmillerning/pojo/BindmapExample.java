package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class BindmapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BindmapExample() {
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

        public Criteria andServiceidIsNull() {
            addCriterion("SERVICEID is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("SERVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(String value) {
            addCriterion("SERVICEID =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(String value) {
            addCriterion("SERVICEID <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(String value) {
            addCriterion("SERVICEID >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICEID >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(String value) {
            addCriterion("SERVICEID <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(String value) {
            addCriterion("SERVICEID <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLike(String value) {
            addCriterion("SERVICEID like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotLike(String value) {
            addCriterion("SERVICEID not like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<String> values) {
            addCriterion("SERVICEID in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<String> values) {
            addCriterion("SERVICEID not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(String value1, String value2) {
            addCriterion("SERVICEID between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(String value1, String value2) {
            addCriterion("SERVICEID not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("STYPE is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("STYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(String value) {
            addCriterion("STYPE =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(String value) {
            addCriterion("STYPE <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(String value) {
            addCriterion("STYPE >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(String value) {
            addCriterion("STYPE >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(String value) {
            addCriterion("STYPE <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(String value) {
            addCriterion("STYPE <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLike(String value) {
            addCriterion("STYPE like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotLike(String value) {
            addCriterion("STYPE not like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<String> values) {
            addCriterion("STYPE in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<String> values) {
            addCriterion("STYPE not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(String value1, String value2) {
            addCriterion("STYPE between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(String value1, String value2) {
            addCriterion("STYPE not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andProtocolidIsNull() {
            addCriterion("PROTOCOLID is null");
            return (Criteria) this;
        }

        public Criteria andProtocolidIsNotNull() {
            addCriterion("PROTOCOLID is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolidEqualTo(String value) {
            addCriterion("PROTOCOLID =", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidNotEqualTo(String value) {
            addCriterion("PROTOCOLID <>", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidGreaterThan(String value) {
            addCriterion("PROTOCOLID >", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOLID >=", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidLessThan(String value) {
            addCriterion("PROTOCOLID <", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOLID <=", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidLike(String value) {
            addCriterion("PROTOCOLID like", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidNotLike(String value) {
            addCriterion("PROTOCOLID not like", value, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidIn(List<String> values) {
            addCriterion("PROTOCOLID in", values, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidNotIn(List<String> values) {
            addCriterion("PROTOCOLID not in", values, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidBetween(String value1, String value2) {
            addCriterion("PROTOCOLID between", value1, value2, "protocolid");
            return (Criteria) this;
        }

        public Criteria andProtocolidNotBetween(String value1, String value2) {
            addCriterion("PROTOCOLID not between", value1, value2, "protocolid");
            return (Criteria) this;
        }

        public Criteria andMaptypeIsNull() {
            addCriterion("MAPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMaptypeIsNotNull() {
            addCriterion("MAPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMaptypeEqualTo(String value) {
            addCriterion("MAPTYPE =", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeNotEqualTo(String value) {
            addCriterion("MAPTYPE <>", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeGreaterThan(String value) {
            addCriterion("MAPTYPE >", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeGreaterThanOrEqualTo(String value) {
            addCriterion("MAPTYPE >=", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeLessThan(String value) {
            addCriterion("MAPTYPE <", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeLessThanOrEqualTo(String value) {
            addCriterion("MAPTYPE <=", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeLike(String value) {
            addCriterion("MAPTYPE like", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeNotLike(String value) {
            addCriterion("MAPTYPE not like", value, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeIn(List<String> values) {
            addCriterion("MAPTYPE in", values, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeNotIn(List<String> values) {
            addCriterion("MAPTYPE not in", values, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeBetween(String value1, String value2) {
            addCriterion("MAPTYPE between", value1, value2, "maptype");
            return (Criteria) this;
        }

        public Criteria andMaptypeNotBetween(String value1, String value2) {
            addCriterion("MAPTYPE not between", value1, value2, "maptype");
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