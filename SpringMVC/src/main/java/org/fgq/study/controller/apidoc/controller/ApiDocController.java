package org.fgq.study.controller.apidoc.controller;

/**
 * @author fenggqc
 * @create 2019-01-31 17:55
 **/

public class ApiDocController {

    //region Getter And Setter
    // endregion

    /**
     * @api {get} /user/:id Read data of a User
     * @apiVersion 0.3.0
     * @apiName GetUser
     * @apiGroup User
     * @apiPermission admin
     * @apiDescription Compare Verison 0.3.0 with 0.2.0 and you will see the green markers with new items in version 0.3.0 and red markers with removed items since 0.2.0.
     * @apiParam {Number} id The Users-ID.
     * @apiExample Example usage:
     * curl -i http://localhost/user/4711
     * @apiSuccess {Number}   id            The Users-ID.
     * @apiSuccess {Date}     registered    Registration Date.
     * @apiSuccess {Date}     name          Fullname of the User.
     * @apiSuccess {String[]} nicknames     List of Users nicknames (Array of Strings).
     * @apiSuccess {Object}   profile       Profile data (example for an Object)
     * @apiSuccess {Number}   profile.age   Users age.
     * @apiSuccess {String}   profile.image Avatar-Image.
     * @apiSuccess {Object[]} options       List of Users options (Array of Objects).
     * @apiSuccess {String}   options.name  Option Name.
     * @apiSuccess {String}   options.value Option Value.
     * @apiError NoAccessRight Only authenticated Admins can access the data.
     * @apiError UserNotFound   The <code>id</code> of the User was not found.
     * @apiErrorExample Response (example):
     * HTTP/1.1 401 Not Authenticated
     * {
     * "error": "NoAccessRight"
     * }
     */
    public User getUser() {
        return null;
    }

    public static class User {

        private String name;
        private Integer age;
        private UserGroup userGroup;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public UserGroup getUserGroup() {
            return userGroup;
        }

        public void setUserGroup(UserGroup userGroup) {
            this.userGroup = userGroup;
        }
    }

    public static class UserGroup {

        private String groupName;
        private String fullName;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }

}
