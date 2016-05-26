/**
 * 
 */
package com.siemens.ct.pes.prototype.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.siemens.ct.pes.prototype.boundary.common.constants.ConstantDef;
import com.siemens.ct.pes.prototype.dto.OperResultDTO;
import com.siemens.ct.pes.prototype.dto.UserInfoDTO;
import com.siemens.ct.pes.prototype.entities.UserInfo;

/**
 * @author Hao Liu
 *
 */
public class UserDAO {

    /**
     * Entity manager
     */
    private EntityManager em;

    public UserDAO() {
        em = Persistence.createEntityManagerFactory("ProtoType").createEntityManager();
    }

    /**
     * Get all user objects
     * 
     * @return List of {@link com.siemens.ct.pes.prototype.dto.UserInfoDTO}
     */
    public OperResultDTO<UserInfoDTO> findAll() {
        int errCode = ConstantDef.ErrorCodeDef.SUCCESS;
        OperResultDTO<UserInfoDTO> result = new OperResultDTO<UserInfoDTO>();

        try {
            List<UserInfo> lst = em.createNamedQuery("UserInfo.findAll", UserInfo.class).getResultList();

            for (UserInfo user : lst) {
                UserInfoDTO dto = new UserInfoDTO(user);
                result.getDTOs().add(dto);
            }

            result.setErrCode(errCode);
        } catch (Exception e) {
            errCode = 10001;
            result.setErrCode(errCode);
        }

        return result;
    }

    /**
     * Add user into DB
     * 
     * @param user
     * @return
     */
    public OperResultDTO<UserInfoDTO> addUser(final UserInfo user) {
        int errCode = ConstantDef.ErrorCodeDef.SUCCESS;
        OperResultDTO<UserInfoDTO> result = new OperResultDTO<UserInfoDTO>();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(user);
            tx.commit();
            result.setErrCode(errCode);

            return result;
        } catch (Exception e) {
            errCode = 1001;
            result.setErrCode(errCode);

            return result;
        }
    }
}