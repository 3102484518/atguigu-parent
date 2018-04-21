package com.atguigu.entities;

import java.io.Serializable;

public class EmployeeInfoWithBLOBs extends EmployeeInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.attach_org_id
     *
     * @mbggenerated
     */
    private String attachOrgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.attach_entrust_id
     *
     * @mbggenerated
     */
    private String attachEntrustId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.attach_org_id
     *
     * @return the value of employee_info.attach_org_id
     *
     * @mbggenerated
     */
    public String getAttachOrgId() {
        return attachOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_info.attach_org_id
     *
     * @param attachOrgId the value for employee_info.attach_org_id
     *
     * @mbggenerated
     */
    public void setAttachOrgId(String attachOrgId) {
        this.attachOrgId = attachOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.attach_entrust_id
     *
     * @return the value of employee_info.attach_entrust_id
     *
     * @mbggenerated
     */
    public String getAttachEntrustId() {
        return attachEntrustId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_info.attach_entrust_id
     *
     * @param attachEntrustId the value for employee_info.attach_entrust_id
     *
     * @mbggenerated
     */
    public void setAttachEntrustId(String attachEntrustId) {
        this.attachEntrustId = attachEntrustId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EmployeeInfoWithBLOBs other = (EmployeeInfoWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPersonalId() == null ? other.getPersonalId() == null : this.getPersonalId().equals(other.getPersonalId()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getMarried() == null ? other.getMarried() == null : this.getMarried().equals(other.getMarried()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getJoinTime() == null ? other.getJoinTime() == null : this.getJoinTime().equals(other.getJoinTime()))
            && (this.getPositionId() == null ? other.getPositionId() == null : this.getPositionId().equals(other.getPositionId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getCcLogin() == null ? other.getCcLogin() == null : this.getCcLogin().equals(other.getCcLogin()))
            && (this.getCcPwd() == null ? other.getCcPwd() == null : this.getCcPwd().equals(other.getCcPwd()))
            && (this.getCcServer() == null ? other.getCcServer() == null : this.getCcServer().equals(other.getCcServer()))
            && (this.getCcPhone() == null ? other.getCcPhone() == null : this.getCcPhone().equals(other.getCcPhone()))
            && (this.getContactMode() == null ? other.getContactMode() == null : this.getContactMode().equals(other.getContactMode()))
            && (this.getAttachOrgId() == null ? other.getAttachOrgId() == null : this.getAttachOrgId().equals(other.getAttachOrgId()))
            && (this.getAttachEntrustId() == null ? other.getAttachEntrustId() == null : this.getAttachEntrustId().equals(other.getAttachEntrustId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPersonalId() == null) ? 0 : getPersonalId().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getMarried() == null) ? 0 : getMarried().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getJoinTime() == null) ? 0 : getJoinTime().hashCode());
        result = prime * result + ((getPositionId() == null) ? 0 : getPositionId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getCcLogin() == null) ? 0 : getCcLogin().hashCode());
        result = prime * result + ((getCcPwd() == null) ? 0 : getCcPwd().hashCode());
        result = prime * result + ((getCcServer() == null) ? 0 : getCcServer().hashCode());
        result = prime * result + ((getCcPhone() == null) ? 0 : getCcPhone().hashCode());
        result = prime * result + ((getContactMode() == null) ? 0 : getContactMode().hashCode());
        result = prime * result + ((getAttachOrgId() == null) ? 0 : getAttachOrgId().hashCode());
        result = prime * result + ((getAttachEntrustId() == null) ? 0 : getAttachEntrustId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attachOrgId=").append(attachOrgId);
        sb.append(", attachEntrustId=").append(attachEntrustId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}