package com.edk.springboot.boot.demo.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChRecmdUserCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChRecmdUserCategoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCategory1idIsNull() {
            addCriterion("category1id is null");
            return (Criteria) this;
        }

        public Criteria andCategory1idIsNotNull() {
            addCriterion("category1id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory1idEqualTo(Integer value) {
            addCriterion("category1id =", value, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idNotEqualTo(Integer value) {
            addCriterion("category1id <>", value, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idGreaterThan(Integer value) {
            addCriterion("category1id >", value, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category1id >=", value, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idLessThan(Integer value) {
            addCriterion("category1id <", value, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idLessThanOrEqualTo(Integer value) {
            addCriterion("category1id <=", value, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idIn(List<Integer> values) {
            addCriterion("category1id in", values, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idNotIn(List<Integer> values) {
            addCriterion("category1id not in", values, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idBetween(Integer value1, Integer value2) {
            addCriterion("category1id between", value1, value2, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory1idNotBetween(Integer value1, Integer value2) {
            addCriterion("category1id not between", value1, value2, "category1id");
            return (Criteria) this;
        }

        public Criteria andCategory2idIsNull() {
            addCriterion("category2id is null");
            return (Criteria) this;
        }

        public Criteria andCategory2idIsNotNull() {
            addCriterion("category2id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory2idEqualTo(Integer value) {
            addCriterion("category2id =", value, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idNotEqualTo(Integer value) {
            addCriterion("category2id <>", value, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idGreaterThan(Integer value) {
            addCriterion("category2id >", value, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category2id >=", value, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idLessThan(Integer value) {
            addCriterion("category2id <", value, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idLessThanOrEqualTo(Integer value) {
            addCriterion("category2id <=", value, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idIn(List<Integer> values) {
            addCriterion("category2id in", values, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idNotIn(List<Integer> values) {
            addCriterion("category2id not in", values, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idBetween(Integer value1, Integer value2) {
            addCriterion("category2id between", value1, value2, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory2idNotBetween(Integer value1, Integer value2) {
            addCriterion("category2id not between", value1, value2, "category2id");
            return (Criteria) this;
        }

        public Criteria andCategory3idIsNull() {
            addCriterion("category3id is null");
            return (Criteria) this;
        }

        public Criteria andCategory3idIsNotNull() {
            addCriterion("category3id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory3idEqualTo(Integer value) {
            addCriterion("category3id =", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idNotEqualTo(Integer value) {
            addCriterion("category3id <>", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idGreaterThan(Integer value) {
            addCriterion("category3id >", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category3id >=", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idLessThan(Integer value) {
            addCriterion("category3id <", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idLessThanOrEqualTo(Integer value) {
            addCriterion("category3id <=", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idIn(List<Integer> values) {
            addCriterion("category3id in", values, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idNotIn(List<Integer> values) {
            addCriterion("category3id not in", values, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idBetween(Integer value1, Integer value2) {
            addCriterion("category3id between", value1, value2, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idNotBetween(Integer value1, Integer value2) {
            addCriterion("category3id not between", value1, value2, "category3id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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