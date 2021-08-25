package edu.escuelaing.ieti.Laboratorio1.service;

import edu.escuelaing.ieti.Laboratorio1.data.User;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {
    private final HashMap<String,User> ListaUsuario = new HashMap();



    @Override
    public User create(User user) {
        ListaUsuario.put(user.getId(),user);
        return null;
    }

    @Override
    public User findById(String id) {
        User user = ListaUsuario.get(id);

        return user;
    }

    @Override
    public List<User> all() {
        return new ArrayList<User>(ListaUsuario.values());
    }

    @Override
    public void deleteById(String id) {
        ListaUsuario.remove(id);

    }

    @Override
    public User update(User user, String userId) {
        ListaUsuario.put(userId,user);
        return user;
    }
}
