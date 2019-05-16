package com.alexmillerning.pojo;

import java.util.ArrayList;
import java.util.List;

public class WStaffExample {
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

  public WStaffExample() {
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

    public Criteria andStaffIdIsNull() {
      addCriterion("STAFF_ID is null");
      return (Criteria) this;
    }

    public Criteria andStaffIdIsNotNull() {
      addCriterion("STAFF_ID is not null");
      return (Criteria) this;
    }

    public Criteria andStaffIdEqualTo(String value) {
      addCriterion("STAFF_ID =", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdNotEqualTo(String value) {
      addCriterion("STAFF_ID <>", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdGreaterThan(String value) {
      addCriterion("STAFF_ID >", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
      addCriterion("STAFF_ID >=", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdLessThan(String value) {
      addCriterion("STAFF_ID <", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdLessThanOrEqualTo(String value) {
      addCriterion("STAFF_ID <=", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdLike(String value) {
      addCriterion("STAFF_ID like", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdNotLike(String value) {
      addCriterion("STAFF_ID not like", value, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdIn(List<String> values) {
      addCriterion("STAFF_ID in", values, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdNotIn(List<String> values) {
      addCriterion("STAFF_ID not in", values, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdBetween(String value1, String value2) {
      addCriterion("STAFF_ID between", value1, value2, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffIdNotBetween(String value1, String value2) {
      addCriterion("STAFF_ID not between", value1, value2, "staffId");
      return (Criteria) this;
    }

    public Criteria andStaffNameIsNull() {
      addCriterion("STAFF_NAME is null");
      return (Criteria) this;
    }

    public Criteria andStaffNameIsNotNull() {
      addCriterion("STAFF_NAME is not null");
      return (Criteria) this;
    }

    public Criteria andStaffNameEqualTo(String value) {
      addCriterion("STAFF_NAME =", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameNotEqualTo(String value) {
      addCriterion("STAFF_NAME <>", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameGreaterThan(String value) {
      addCriterion("STAFF_NAME >", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
      addCriterion("STAFF_NAME >=", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameLessThan(String value) {
      addCriterion("STAFF_NAME <", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameLessThanOrEqualTo(String value) {
      addCriterion("STAFF_NAME <=", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameLike(String value) {
      addCriterion("STAFF_NAME like", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameNotLike(String value) {
      addCriterion("STAFF_NAME not like", value, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameIn(List<String> values) {
      addCriterion("STAFF_NAME in", values, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameNotIn(List<String> values) {
      addCriterion("STAFF_NAME not in", values, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameBetween(String value1, String value2) {
      addCriterion("STAFF_NAME between", value1, value2, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffNameNotBetween(String value1, String value2) {
      addCriterion("STAFF_NAME not between", value1, value2, "staffName");
      return (Criteria) this;
    }

    public Criteria andStaffGenderIsNull() {
      addCriterion("STAFF_GENDER is null");
      return (Criteria) this;
    }

    public Criteria andStaffGenderIsNotNull() {
      addCriterion("STAFF_GENDER is not null");
      return (Criteria) this;
    }

    public Criteria andStaffGenderEqualTo(String value) {
      addCriterion("STAFF_GENDER =", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderNotEqualTo(String value) {
      addCriterion("STAFF_GENDER <>", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderGreaterThan(String value) {
      addCriterion("STAFF_GENDER >", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderGreaterThanOrEqualTo(String value) {
      addCriterion("STAFF_GENDER >=", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderLessThan(String value) {
      addCriterion("STAFF_GENDER <", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderLessThanOrEqualTo(String value) {
      addCriterion("STAFF_GENDER <=", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderLike(String value) {
      addCriterion("STAFF_GENDER like", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderNotLike(String value) {
      addCriterion("STAFF_GENDER not like", value, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderIn(List<String> values) {
      addCriterion("STAFF_GENDER in", values, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderNotIn(List<String> values) {
      addCriterion("STAFF_GENDER not in", values, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderBetween(String value1, String value2) {
      addCriterion("STAFF_GENDER between", value1, value2, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffGenderNotBetween(String value1, String value2) {
      addCriterion("STAFF_GENDER not between", value1, value2, "staffGender");
      return (Criteria) this;
    }

    public Criteria andStaffPositionIsNull() {
      addCriterion("STAFF_POSITION is null");
      return (Criteria) this;
    }

    public Criteria andStaffPositionIsNotNull() {
      addCriterion("STAFF_POSITION is not null");
      return (Criteria) this;
    }

    public Criteria andStaffPositionEqualTo(String value) {
      addCriterion("STAFF_POSITION =", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionNotEqualTo(String value) {
      addCriterion("STAFF_POSITION <>", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionGreaterThan(String value) {
      addCriterion("STAFF_POSITION >", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionGreaterThanOrEqualTo(String value) {
      addCriterion("STAFF_POSITION >=", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionLessThan(String value) {
      addCriterion("STAFF_POSITION <", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionLessThanOrEqualTo(String value) {
      addCriterion("STAFF_POSITION <=", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionLike(String value) {
      addCriterion("STAFF_POSITION like", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionNotLike(String value) {
      addCriterion("STAFF_POSITION not like", value, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionIn(List<String> values) {
      addCriterion("STAFF_POSITION in", values, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionNotIn(List<String> values) {
      addCriterion("STAFF_POSITION not in", values, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionBetween(String value1, String value2) {
      addCriterion("STAFF_POSITION between", value1, value2, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPositionNotBetween(String value1, String value2) {
      addCriterion("STAFF_POSITION not between", value1, value2, "staffPosition");
      return (Criteria) this;
    }

    public Criteria andStaffPowerIsNull() {
      addCriterion("STAFF_POWER is null");
      return (Criteria) this;
    }

    public Criteria andStaffPowerIsNotNull() {
      addCriterion("STAFF_POWER is not null");
      return (Criteria) this;
    }

    public Criteria andStaffPowerEqualTo(Integer value) {
      addCriterion("STAFF_POWER =", value, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerNotEqualTo(Integer value) {
      addCriterion("STAFF_POWER <>", value, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerGreaterThan(Integer value) {
      addCriterion("STAFF_POWER >", value, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerGreaterThanOrEqualTo(Integer value) {
      addCriterion("STAFF_POWER >=", value, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerLessThan(Integer value) {
      addCriterion("STAFF_POWER <", value, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerLessThanOrEqualTo(Integer value) {
      addCriterion("STAFF_POWER <=", value, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerIn(List<Integer> values) {
      addCriterion("STAFF_POWER in", values, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerNotIn(List<Integer> values) {
      addCriterion("STAFF_POWER not in", values, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerBetween(Integer value1, Integer value2) {
      addCriterion("STAFF_POWER between", value1, value2, "staffPower");
      return (Criteria) this;
    }

    public Criteria andStaffPowerNotBetween(Integer value1, Integer value2) {
      addCriterion("STAFF_POWER not between", value1, value2, "staffPower");
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