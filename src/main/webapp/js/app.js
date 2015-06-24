var app = angular.module("geektic", ['ngRoute', 'userControllers']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});


app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/recherche', {
                templateUrl: 'recherche.html',
                controller: 'CtrlRecherche'
            })
    }]);


app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/resultat/:idCentreInteret/:idCivilite', {
                templateUrl: 'resultat.html',
                controller: 'CtrlResultat'
            })
    }]);