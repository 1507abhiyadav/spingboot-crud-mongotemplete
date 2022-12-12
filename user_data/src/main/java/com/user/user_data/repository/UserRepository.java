package com.user.user_data.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.user.user_data.model.User;

@Repository
// public interface UserRepository extends MongoRepository <User,String>{
public class UserRepository{    
    @Autowired
    MongoTemplate mongoTemplate;

    public User save(User user) {
        return mongoTemplate.save(user);
    }

    public List<User> find() {
        return mongoTemplate.findAll(User.class);
    }

    public User update(User user) {
        User user1 = mongoTemplate.findById(user.getObjectId(), User.class);

        System.out.println(user1);
        // System.out.println(user);
        // user1.setName(user.getName());
        // user1.setEmail(user.getEmail());
        // user1.setAccountNonLocked(user.isAccountNonLocked());
        // user1.setLockedAt(user.getLockedAt());
        // user1.setLoginAttempts(user.getLoginAttempts());
        return mongoTemplate.save(user);
    }










    
    // public User update(User user){
    //     ObjectId objID = new ObjectId("7109af3d-f287-4814-b2cf-eafcdaa5b74c");
    //     Query query = new Query();

    //     query.addCriteria(Criteria.where("objID").is("7109af3d-f287-4814-b2cf-eafcdaa5b74c"));
    //     List<User> user2 =  mongoTemplate.find(query, User.class);
    //     System.out.println(user2);


    //     // Update update = new Update();
    //     // update.set("name", user.getName());
    //     // update.set("email", user.getEmail());
    //     // // return mongoTemplate.findAndModify(query, update, User.class);
    //     // mongoTemplate.upsert(query,Update.update("name",user.getName(),User.class));

    // //     Query query = new Query();
    // //     ((Object) query).addCriteria(Criteria.where("id"));
    // //     // Execute the query and find one matching entry
    // //    User puser = mongoTemplate.findById( query, User.class);

    // //    System.out.println(puser);
    // //    return puser;
    // //    person.setName(name);
    // return user;

    // }

//     public User update(User user) {
//         Query query = new Query();
//         List<Criteria> criterias = new ArrayList<>();
//         ObjectId objID = new ObjectId("7109af3d-f287-4814-b2cf-eafcdaa5b74c");
        

//         criterias.add(Criteria.where("objID").is(objID));
//         // query.addCriteria(Criteria.where("id").is(user.getId()));
//         // Execute the query and find one matching entry
//        User puser = (User) mongoTemplate.find( query,User.class,"objectId");

//        System.out.println(puser);
//        return puser;
//     // }

//     // private Criteria where(String string) {
//     //     return null;
//     // }

// }


}


// mongoTemplate.updateFirst(query,Update.update("Name", name),Person.class)
