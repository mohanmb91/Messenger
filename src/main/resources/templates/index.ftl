<!DOCTYPE html>
 
<html lang="en" ng-app="crudApp">
    <head>
        <title>Miracle Messenger</title>
        <link href="css/bootstrap.css" rel="stylesheet"/>
        <link href="css/app.css" rel="stylesheet"/>
    </head>
    <body>
        <div ui-view></div>
            <script src="bower_components/angular/angular.min.js" ></script>
            <script src="bower_components/angular-ui-router/release/angular-ui-router.min.js" ></script>
            <script src="bower_components/localforage/dist/localforage.js" ></script>
            <script src="bower_components/ngStorage/ngStorage.min.js"></script>
            <script src="js/app/app.js"></script>
            <script src="js/app/UserService.js"></script>
            <script src="js/app/UserController.js"></script>
    </body>
</html>