package dio.primeirospassos.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import dio.primeirospassos.model.User;



@Service
public class UserService {
    //simulando um banco de dados com a tabela user
    private List<User> database = new ArrayList<>();

    public void gravar(User user){
        database.add(user);
    }
    public void alterar(User user){
        int index = database.indexOf(user);
        database.set(index,user);
    }
    public User buscarPorUsername(String username){
        int index = database.indexOf(new User(username));
        User selectUser = database.get(index);
        return selectUser;
    }
    public List<User> listar(){
        return database;
    }
}

