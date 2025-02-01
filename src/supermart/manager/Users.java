package supermart.manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> userList;

    public Users(String filePath) {
        userList = new ArrayList<>();
        loadUsersFromFile(filePath);
    }

    private void loadUsersFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 4) {
                    String username = userData[0];
                    String password = userData[1];
                    String role = userData[2];
                    boolean isActive = Boolean.parseBoolean(userData[3]);
                    userList.add(new User(username, password, role, isActive));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User findUser (String username) {
        for (User  user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; 
    }

    public void addUser (User user) {
        userList.add(user);
        
    }

    public void removeUser (String username) {
        userList.removeIf(user -> user.getUsername().equals(username));
        
    }

    public void updateUser (User updatedUser ) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(updatedUser .getUsername())) {
                userList.set(i, updatedUser );
                break;
            }
        }
       
    }
    public void saveUsersToFile(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (User user : userList) {
                bw.write(user.getUsername() + "," + user.getPassword() + "," + user.getRole() + "," + user.isActive());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public List<User> getUserList() {
        return userList;
    }
}
