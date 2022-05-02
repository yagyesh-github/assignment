angular.module('LoginApp').service('LoginService', function($http) {  
    this.LoginValidate = function(UserData) {  
        var result = $http({  
            method: "Post",  
            url: 'jdbc:mysql://localhost:3306/assignment?createDatabaseIfNotExist=true&autoReconnect=true&useSSL=false  ' ,
            data: save  ,
        });  
        return result;  
    }  
});  