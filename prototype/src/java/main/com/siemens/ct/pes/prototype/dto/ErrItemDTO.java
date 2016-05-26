/**
 * 
 */
package com.siemens.ct.pes.prototype.dto;

import com.siemens.ct.pes.prototype.boundary.common.constants.ConstantDef;

/**
 * Error item object
 * 
 * @author Hao Liu
 *
 */
public class ErrItemDTO {

    private int errCode;

    private String errDesc;

    /**
     * Default constructor
     */
    public ErrItemDTO() {
        errCode = ConstantDef.ErrorCodeDef.SUCCESS;
        errDesc = ConstantDef.Common.EMPTY;
    }

    /**
     * @return the errCode
     */
    public int getErrCode() {
        return errCode;
    }

    /**
     * @param errCode
     *            the errCode to set
     */
    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    /**
     * @return the errDesc
     */
    public String getErrDesc() {
        return errDesc;
    }

    /**
     * @param errDesc
     *            the errDesc to set
     */
    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }
}