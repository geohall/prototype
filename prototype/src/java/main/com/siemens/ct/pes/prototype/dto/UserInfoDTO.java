/**
 * 
 */
package com.siemens.ct.pes.prototype.dto;

import com.siemens.ct.pes.prototype.boundary.common.constants.ConstantDef;
import com.siemens.ct.pes.prototype.entities.UserInfo;

/**
 * @author Hao Liu
 *
 */
public class UserInfoDTO {

    private int id;

    private String name;

    private String desc;

    /**
     * Default constructor
     */
    public UserInfoDTO() {
        id = ConstantDef.Common.INVALID_VALUE;
        name = ConstantDef.Common.EMPTY;
        desc = ConstantDef.Common.EMPTY;
    }

    /**
     * Construct by POJO
     * 
     * @param user
     */
    public UserInfoDTO(final UserInfo user) {
        id = user.getId();
        name = user.getName();
        desc = user.getDescription();
    }

    /**
     * Build POJO object
     * 
     * @return POJO object
     */
    public UserInfo buildPOJO() {
        UserInfo user = new UserInfo();

        if (id != ConstantDef.Common.INVALID_VALUE) {
            user.setId(id);
        }

        user.setName(name);
        user.setDescription(desc);

        return user;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     *            the description to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}