package com.covid.component.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CovidDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CovidDataExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andConfirmedIsNull() {
            addCriterion("confirmed is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedIsNotNull() {
            addCriterion("confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedEqualTo(Integer value) {
            addCriterion("confirmed =", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotEqualTo(Integer value) {
            addCriterion("confirmed <>", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedGreaterThan(Integer value) {
            addCriterion("confirmed >", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirmed >=", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedLessThan(Integer value) {
            addCriterion("confirmed <", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedLessThanOrEqualTo(Integer value) {
            addCriterion("confirmed <=", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedIn(List<Integer> values) {
            addCriterion("confirmed in", values, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotIn(List<Integer> values) {
            addCriterion("confirmed not in", values, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedBetween(Integer value1, Integer value2) {
            addCriterion("confirmed between", value1, value2, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("confirmed not between", value1, value2, "confirmed");
            return (Criteria) this;
        }

        public Criteria andDiedIsNull() {
            addCriterion("died is null");
            return (Criteria) this;
        }

        public Criteria andDiedIsNotNull() {
            addCriterion("died is not null");
            return (Criteria) this;
        }

        public Criteria andDiedEqualTo(Integer value) {
            addCriterion("died =", value, "died");
            return (Criteria) this;
        }

        public Criteria andDiedNotEqualTo(Integer value) {
            addCriterion("died <>", value, "died");
            return (Criteria) this;
        }

        public Criteria andDiedGreaterThan(Integer value) {
            addCriterion("died >", value, "died");
            return (Criteria) this;
        }

        public Criteria andDiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("died >=", value, "died");
            return (Criteria) this;
        }

        public Criteria andDiedLessThan(Integer value) {
            addCriterion("died <", value, "died");
            return (Criteria) this;
        }

        public Criteria andDiedLessThanOrEqualTo(Integer value) {
            addCriterion("died <=", value, "died");
            return (Criteria) this;
        }

        public Criteria andDiedIn(List<Integer> values) {
            addCriterion("died in", values, "died");
            return (Criteria) this;
        }

        public Criteria andDiedNotIn(List<Integer> values) {
            addCriterion("died not in", values, "died");
            return (Criteria) this;
        }

        public Criteria andDiedBetween(Integer value1, Integer value2) {
            addCriterion("died between", value1, value2, "died");
            return (Criteria) this;
        }

        public Criteria andDiedNotBetween(Integer value1, Integer value2) {
            addCriterion("died not between", value1, value2, "died");
            return (Criteria) this;
        }

        public Criteria andCruedIsNull() {
            addCriterion("crued is null");
            return (Criteria) this;
        }

        public Criteria andCruedIsNotNull() {
            addCriterion("crued is not null");
            return (Criteria) this;
        }

        public Criteria andCruedEqualTo(Integer value) {
            addCriterion("crued =", value, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedNotEqualTo(Integer value) {
            addCriterion("crued <>", value, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedGreaterThan(Integer value) {
            addCriterion("crued >", value, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedGreaterThanOrEqualTo(Integer value) {
            addCriterion("crued >=", value, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedLessThan(Integer value) {
            addCriterion("crued <", value, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedLessThanOrEqualTo(Integer value) {
            addCriterion("crued <=", value, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedIn(List<Integer> values) {
            addCriterion("crued in", values, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedNotIn(List<Integer> values) {
            addCriterion("crued not in", values, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedBetween(Integer value1, Integer value2) {
            addCriterion("crued between", value1, value2, "crued");
            return (Criteria) this;
        }

        public Criteria andCruedNotBetween(Integer value1, Integer value2) {
            addCriterion("crued not between", value1, value2, "crued");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticIsNull() {
            addCriterion("asymptomatic is null");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticIsNotNull() {
            addCriterion("asymptomatic is not null");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticEqualTo(Integer value) {
            addCriterion("asymptomatic =", value, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticNotEqualTo(Integer value) {
            addCriterion("asymptomatic <>", value, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticGreaterThan(Integer value) {
            addCriterion("asymptomatic >", value, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("asymptomatic >=", value, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticLessThan(Integer value) {
            addCriterion("asymptomatic <", value, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticLessThanOrEqualTo(Integer value) {
            addCriterion("asymptomatic <=", value, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticIn(List<Integer> values) {
            addCriterion("asymptomatic in", values, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticNotIn(List<Integer> values) {
            addCriterion("asymptomatic not in", values, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticBetween(Integer value1, Integer value2) {
            addCriterion("asymptomatic between", value1, value2, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticNotBetween(Integer value1, Integer value2) {
            addCriterion("asymptomatic not between", value1, value2, "asymptomatic");
            return (Criteria) this;
        }

        public Criteria andCurConfirmIsNull() {
            addCriterion("cur_confirm is null");
            return (Criteria) this;
        }

        public Criteria andCurConfirmIsNotNull() {
            addCriterion("cur_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andCurConfirmEqualTo(Integer value) {
            addCriterion("cur_confirm =", value, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmNotEqualTo(Integer value) {
            addCriterion("cur_confirm <>", value, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmGreaterThan(Integer value) {
            addCriterion("cur_confirm >", value, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_confirm >=", value, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmLessThan(Integer value) {
            addCriterion("cur_confirm <", value, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("cur_confirm <=", value, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmIn(List<Integer> values) {
            addCriterion("cur_confirm in", values, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmNotIn(List<Integer> values) {
            addCriterion("cur_confirm not in", values, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmBetween(Integer value1, Integer value2) {
            addCriterion("cur_confirm between", value1, value2, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_confirm not between", value1, value2, "curConfirm");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeIsNull() {
            addCriterion("cur_confirm_relative is null");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeIsNotNull() {
            addCriterion("cur_confirm_relative is not null");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeEqualTo(Integer value) {
            addCriterion("cur_confirm_relative =", value, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeNotEqualTo(Integer value) {
            addCriterion("cur_confirm_relative <>", value, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeGreaterThan(Integer value) {
            addCriterion("cur_confirm_relative >", value, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_confirm_relative >=", value, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeLessThan(Integer value) {
            addCriterion("cur_confirm_relative <", value, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("cur_confirm_relative <=", value, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeIn(List<Integer> values) {
            addCriterion("cur_confirm_relative in", values, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeNotIn(List<Integer> values) {
            addCriterion("cur_confirm_relative not in", values, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeBetween(Integer value1, Integer value2) {
            addCriterion("cur_confirm_relative between", value1, value2, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andCurConfirmRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_confirm_relative not between", value1, value2, "curConfirmRelative");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeIsNull() {
            addCriterion("relative_time is null");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeIsNotNull() {
            addCriterion("relative_time is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeEqualTo(Long value) {
            addCriterion("relative_time =", value, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeNotEqualTo(Long value) {
            addCriterion("relative_time <>", value, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeGreaterThan(Long value) {
            addCriterion("relative_time >", value, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("relative_time >=", value, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeLessThan(Long value) {
            addCriterion("relative_time <", value, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeLessThanOrEqualTo(Long value) {
            addCriterion("relative_time <=", value, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeIn(List<Long> values) {
            addCriterion("relative_time in", values, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeNotIn(List<Long> values) {
            addCriterion("relative_time not in", values, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeBetween(Long value1, Long value2) {
            addCriterion("relative_time between", value1, value2, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andRelativeTimeNotBetween(Long value1, Long value2) {
            addCriterion("relative_time not between", value1, value2, "relativeTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeIsNull() {
            addCriterion("confirmed_relative is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeIsNotNull() {
            addCriterion("confirmed_relative is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeEqualTo(Integer value) {
            addCriterion("confirmed_relative =", value, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeNotEqualTo(Integer value) {
            addCriterion("confirmed_relative <>", value, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeGreaterThan(Integer value) {
            addCriterion("confirmed_relative >", value, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirmed_relative >=", value, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeLessThan(Integer value) {
            addCriterion("confirmed_relative <", value, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("confirmed_relative <=", value, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeIn(List<Integer> values) {
            addCriterion("confirmed_relative in", values, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeNotIn(List<Integer> values) {
            addCriterion("confirmed_relative not in", values, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeBetween(Integer value1, Integer value2) {
            addCriterion("confirmed_relative between", value1, value2, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andConfirmedRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirmed_relative not between", value1, value2, "confirmedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeIsNull() {
            addCriterion("died_relative is null");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeIsNotNull() {
            addCriterion("died_relative is not null");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeEqualTo(Integer value) {
            addCriterion("died_relative =", value, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeNotEqualTo(Integer value) {
            addCriterion("died_relative <>", value, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeGreaterThan(Integer value) {
            addCriterion("died_relative >", value, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("died_relative >=", value, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeLessThan(Integer value) {
            addCriterion("died_relative <", value, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("died_relative <=", value, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeIn(List<Integer> values) {
            addCriterion("died_relative in", values, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeNotIn(List<Integer> values) {
            addCriterion("died_relative not in", values, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeBetween(Integer value1, Integer value2) {
            addCriterion("died_relative between", value1, value2, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andDiedRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("died_relative not between", value1, value2, "diedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeIsNull() {
            addCriterion("cured_relative is null");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeIsNotNull() {
            addCriterion("cured_relative is not null");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeEqualTo(Integer value) {
            addCriterion("cured_relative =", value, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeNotEqualTo(Integer value) {
            addCriterion("cured_relative <>", value, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeGreaterThan(Integer value) {
            addCriterion("cured_relative >", value, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cured_relative >=", value, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeLessThan(Integer value) {
            addCriterion("cured_relative <", value, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("cured_relative <=", value, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeIn(List<Integer> values) {
            addCriterion("cured_relative in", values, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeNotIn(List<Integer> values) {
            addCriterion("cured_relative not in", values, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeBetween(Integer value1, Integer value2) {
            addCriterion("cured_relative between", value1, value2, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andCuredRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("cured_relative not between", value1, value2, "curedRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeIsNull() {
            addCriterion("asymptomatic_relative is null");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeIsNotNull() {
            addCriterion("asymptomatic_relative is not null");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeEqualTo(Integer value) {
            addCriterion("asymptomatic_relative =", value, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeNotEqualTo(Integer value) {
            addCriterion("asymptomatic_relative <>", value, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeGreaterThan(Integer value) {
            addCriterion("asymptomatic_relative >", value, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("asymptomatic_relative >=", value, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeLessThan(Integer value) {
            addCriterion("asymptomatic_relative <", value, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("asymptomatic_relative <=", value, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeIn(List<Integer> values) {
            addCriterion("asymptomatic_relative in", values, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeNotIn(List<Integer> values) {
            addCriterion("asymptomatic_relative not in", values, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeBetween(Integer value1, Integer value2) {
            addCriterion("asymptomatic_relative between", value1, value2, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andAsymptomaticRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("asymptomatic_relative not between", value1, value2, "asymptomaticRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeIsNull() {
            addCriterion("native_relative is null");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeIsNotNull() {
            addCriterion("native_relative is not null");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeEqualTo(Integer value) {
            addCriterion("native_relative =", value, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeNotEqualTo(Integer value) {
            addCriterion("native_relative <>", value, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeGreaterThan(Integer value) {
            addCriterion("native_relative >", value, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("native_relative >=", value, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeLessThan(Integer value) {
            addCriterion("native_relative <", value, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("native_relative <=", value, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeIn(List<Integer> values) {
            addCriterion("native_relative in", values, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeNotIn(List<Integer> values) {
            addCriterion("native_relative not in", values, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeBetween(Integer value1, Integer value2) {
            addCriterion("native_relative between", value1, value2, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andNativeRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("native_relative not between", value1, value2, "nativeRelative");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveIsNull() {
            addCriterion("screening_positive is null");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveIsNotNull() {
            addCriterion("screening_positive is not null");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveEqualTo(Integer value) {
            addCriterion("screening_positive =", value, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveNotEqualTo(Integer value) {
            addCriterion("screening_positive <>", value, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveGreaterThan(Integer value) {
            addCriterion("screening_positive >", value, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("screening_positive >=", value, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveLessThan(Integer value) {
            addCriterion("screening_positive <", value, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveLessThanOrEqualTo(Integer value) {
            addCriterion("screening_positive <=", value, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveIn(List<Integer> values) {
            addCriterion("screening_positive in", values, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveNotIn(List<Integer> values) {
            addCriterion("screening_positive not in", values, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveBetween(Integer value1, Integer value2) {
            addCriterion("screening_positive between", value1, value2, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andScreeningPositiveNotBetween(Integer value1, Integer value2) {
            addCriterion("screening_positive not between", value1, value2, "screeningPositive");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeIsNull() {
            addCriterion("overseas_input_relative is null");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeIsNotNull() {
            addCriterion("overseas_input_relative is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeEqualTo(Integer value) {
            addCriterion("overseas_input_relative =", value, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeNotEqualTo(Integer value) {
            addCriterion("overseas_input_relative <>", value, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeGreaterThan(Integer value) {
            addCriterion("overseas_input_relative >", value, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("overseas_input_relative >=", value, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeLessThan(Integer value) {
            addCriterion("overseas_input_relative <", value, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("overseas_input_relative <=", value, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeIn(List<Integer> values) {
            addCriterion("overseas_input_relative in", values, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeNotIn(List<Integer> values) {
            addCriterion("overseas_input_relative not in", values, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeBetween(Integer value1, Integer value2) {
            addCriterion("overseas_input_relative between", value1, value2, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andOverseasInputRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("overseas_input_relative not between", value1, value2, "overseasInputRelative");
            return (Criteria) this;
        }

        public Criteria andIcuDisableIsNull() {
            addCriterion("icu_disable is null");
            return (Criteria) this;
        }

        public Criteria andIcuDisableIsNotNull() {
            addCriterion("icu_disable is not null");
            return (Criteria) this;
        }

        public Criteria andIcuDisableEqualTo(Integer value) {
            addCriterion("icu_disable =", value, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableNotEqualTo(Integer value) {
            addCriterion("icu_disable <>", value, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableGreaterThan(Integer value) {
            addCriterion("icu_disable >", value, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableGreaterThanOrEqualTo(Integer value) {
            addCriterion("icu_disable >=", value, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableLessThan(Integer value) {
            addCriterion("icu_disable <", value, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableLessThanOrEqualTo(Integer value) {
            addCriterion("icu_disable <=", value, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableIn(List<Integer> values) {
            addCriterion("icu_disable in", values, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableNotIn(List<Integer> values) {
            addCriterion("icu_disable not in", values, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableBetween(Integer value1, Integer value2) {
            addCriterion("icu_disable between", value1, value2, "icuDisable");
            return (Criteria) this;
        }

        public Criteria andIcuDisableNotBetween(Integer value1, Integer value2) {
            addCriterion("icu_disable not between", value1, value2, "icuDisable");
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

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysIsNull() {
            addCriterion("no_native_relative_days is null");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysIsNotNull() {
            addCriterion("no_native_relative_days is not null");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysEqualTo(String value) {
            addCriterion("no_native_relative_days =", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysNotEqualTo(String value) {
            addCriterion("no_native_relative_days <>", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysGreaterThan(String value) {
            addCriterion("no_native_relative_days >", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysGreaterThanOrEqualTo(String value) {
            addCriterion("no_native_relative_days >=", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysLessThan(String value) {
            addCriterion("no_native_relative_days <", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysLessThanOrEqualTo(String value) {
            addCriterion("no_native_relative_days <=", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysLike(String value) {
            addCriterion("no_native_relative_days like", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysNotLike(String value) {
            addCriterion("no_native_relative_days not like", value, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysIn(List<String> values) {
            addCriterion("no_native_relative_days in", values, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysNotIn(List<String> values) {
            addCriterion("no_native_relative_days not in", values, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysBetween(String value1, String value2) {
            addCriterion("no_native_relative_days between", value1, value2, "noNativeRelativeDays");
            return (Criteria) this;
        }

        public Criteria andNoNativeRelativeDaysNotBetween(String value1, String value2) {
            addCriterion("no_native_relative_days not between", value1, value2, "noNativeRelativeDays");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
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