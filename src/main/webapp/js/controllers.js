/**
 * Created by k.meissonnier on 22/06/2015.
 */
var userControllers = angular.module('userControllers',[]);

userControllers.controller('CtrlRecherche',['$scope', '$http',
    function ($scope,$http) {
        $http.get("api/recherche/centreInteret").success(function(data) {
            $scope.listeInteret = data;
        });
    }
]);

userControllers.controller('CtrlResultat',
    function ($scope,$http,$routeParams) {
        $http.get("api/resultat/"+$routeParams.idCentreInteret+"/"+$routeParams.idCivilite).success(function(data) {
            $scope.listeUtilisateur = data;
        });
    }
);
