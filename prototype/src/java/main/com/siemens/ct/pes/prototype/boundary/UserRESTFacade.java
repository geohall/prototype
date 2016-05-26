/**
 * 
 */
package com.siemens.ct.pes.prototype.boundary;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.siemens.ct.pes.prototype.dao.UserDAO;
import com.siemens.ct.pes.prototype.dto.OperResultDTO;
import com.siemens.ct.pes.prototype.dto.UserInfoDTO;

/**
 * @author Hao Liu
 *
 */
@Path("user")
public class UserRESTFacade {

    /**
     * DAO for UserInfo
     */
    private UserDAO userDao;

    /**
     * Default constructor
     */
    public UserRESTFacade() {
        userDao = new UserDAO();
    }

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public OperResultDTO<UserInfoDTO> getAllUser() {
        return userDao.findAll();
    }

    @POST
    @Path("create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public OperResultDTO<UserInfoDTO> addUser(final UserInfoDTO user) {
        return userDao.addUser(user.buildPOJO());
    }
}