/**
 * 
 */
package com.siemens.ct.pes.prototype;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.siemens.ct.pes.prototype.boundary.UserRESTFacade;

/**
 * @author Hao Liu
 *
 */
@ApplicationPath("prototype")
public class ApplicationConfig extends Application {

    /*
     * (non-Javadoc)
     * 
     * @see javax.ws.rs.core.Application#getClasses()
     */
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> cls = new HashSet<Class<?>>();

        cls.add(UserRESTFacade.class);

        return cls;
    }
}