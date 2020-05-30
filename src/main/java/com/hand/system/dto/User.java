package com.hand.system.dto;

import java.util.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/5/30
 * @Time: 10:17
 * @Description:
 */
public class User {

    public static final String FIELD_USER_ID = "userId";
    public static final String FIELD_USER_NAME = "userName";
    public static final String FIELD_PASSWORD_ENCRYPTED = "passwordEncrypted";
    public static final String FIELD_PASSWORD = "password";
    public static final String FIELD_USER_TYPE = "userType";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_PHONE = "phone";
    public static final String FIELD_START_ACTIVE_DATE = "startActiveDate";
    public static final String FIELD_END_ACTIVE_DATE = "endActiveDate";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_LAST_LOGIN_DATE = "lastLoginDate";
    public static final String FIELD_LAST_PASSWORD_UPDATE_DATE = "lastPasswordUpdateDate";
    public static final String FIELD_FIRST_LOGIN = "firstLogin";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_CUSTOMER_ID = "customerId";
    public static final String FIELD_SUPPLIER_ID = "supplierId";
    public static final String FIELD_EMPLOYEE_ID = "employeeId";
    public static final String FIELD_EMPLOYEE_CODE = "employeeCode";
    public static final String FIELD_EMPLOYEE_NAME = "employeeName";

    public static final String LOGIN_CHANGE_INDEX = "login_change_index";
    public static final String FIRST_LOGIN_STATUS = "Y";
    public static final String NOT_FIRST_LOGIN_STATUS = "N";

    public static final String STATUS_ACTV = "ACTV";
    public static final String STATUS_EXPR = "EXPR";
    public static final String STATUS_LOCK = "LOCK";


    private Long userId;

    private String userName;

    private String passwordEncrypted;

    private String password;

    private String userType;

    private String email;


    private String phone;

    private Date startActiveDate;

    private Date endActiveDate;

    private String status;

    private Date lastLoginDate;


    private Date lastPasswordUpdateDate;

    private String firstLogin;


    private String description;


    private Long customerId;


    private Long supplierId;

    private Long employeeId;

    private String employeeCode;

    private String employeeName;

    private List<String> roleCode;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getStartActiveDate() {
        return startActiveDate;
    }

    public void setStartActiveDate(Date startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    public Date getEndActiveDate() {
        return endActiveDate;
    }

    public void setEndActiveDate(Date endActiveDate) {
        this.endActiveDate = endActiveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastPasswordUpdateDate() {
        return lastPasswordUpdateDate;
    }

    public void setLastPasswordUpdateDate(Date lastPasswordUpdateDate) {
        this.lastPasswordUpdateDate = lastPasswordUpdateDate;
    }

    public String getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(String firstLogin) {
        this.firstLogin = firstLogin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(List<String> roleCode) {
        this.roleCode = roleCode;
    }
}
