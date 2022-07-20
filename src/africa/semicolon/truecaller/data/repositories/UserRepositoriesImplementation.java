package africa.semicolon.truecaller.data.repositories;

import africa.semicolon.truecaller.data.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepositoriesImplementation implements UserRepositories {
    private int counter;
    private List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        var myUser = user.getId();
        for (User aUser : users) {
            if (aUser.getId() == myUser) {
                aUser.setFirstName(user.getFirstName());
                aUser.setSecondName(user.getLastName());
                aUser.setAddress(user.getAddress());
                aUser.setEmail(user.getEmail());
                aUser.setPhoneNumber(user.getPhoneNumber());
                return aUser;
            }
        }
        counter++;
        user.setId(counter);
        users.add(user);
        return user;
    }

    User existingId(int id) {
        for (User aUser : users) {
            if (aUser.getId() == id)
                return aUser;
        }
        throw new IllegalArgumentException("User with id number " + id + " does not exist!");
    }

    @Override
    public void delete(User user) {
        var aUser = existingId(user.getId());
        users.remove(aUser);
    }

    @Override
    public void delete(int id) {
        var userId = existingId(id);
        users.remove(userId);
    }

    @Override
    public User findById(int id) {
        return existingId(id);
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        List<User> aList = new ArrayList<>();
        for (User myUsers : users) {
            if (Objects.equals(myUsers.getFirstName(), firstName)) {
                aList.add(myUsers);
            }
        }
        return aList;
    }

    @Override
    public List<User> findByLastName(String lastName) {
        List<User> aList = new ArrayList<>();
        for (User myUsers : users) {
            if (Objects.equals(myUsers.getLastName(), lastName)) {
                aList.add(myUsers);
            }
        }
        return aList;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public int count() {
        return users.size();
    }


}
