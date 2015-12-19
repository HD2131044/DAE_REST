
package dtos;

import entities.UserGroup.GROUP;
import java.io.Serializable;

public class AdministratorDTO extends UserDTO implements Serializable {
    
    public AdministratorDTO() {
    }    
    
    public AdministratorDTO(Long id, String username, String password, String name, String email) {
        super(id, username, password, name, email, GROUP.Administrator);   
    }
    
    @Override
    public void reset() {
        super.reset();
    }
    
}