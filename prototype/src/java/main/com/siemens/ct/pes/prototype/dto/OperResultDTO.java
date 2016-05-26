/**
 * 
 */
package com.siemens.ct.pes.prototype.dto;

import java.util.ArrayList;
import java.util.List;

import com.siemens.ct.pes.prototype.boundary.common.constants.ConstantDef;

/**
 * Operation result object
 * 
 * @author Hao Liu
 *
 */
public class OperResultDTO<E> {

    private int errCode;

    private String errDesc;

    private List<ErrItemDTO> errDetails;

    private List<E> dtos;

    public OperResultDTO() {
        errCode = ConstantDef.ErrorCodeDef.SUCCESS;
        errDesc = ConstantDef.Common.EMPTY;
        errDetails = new ArrayList<ErrItemDTO>();
        dtos = new ArrayList<E>();
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

    /**
     * @return the details
     */
    public List<ErrItemDTO> getDetails() {
        return errDetails;
    }

    /**
     * @return the dtos
     */
    public List<E> getDTOs() {
        return dtos;
    }
}