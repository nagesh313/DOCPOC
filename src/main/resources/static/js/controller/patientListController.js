angular.module("myApp").controller('PatientListController', ['$scope','$rootScope', '$http', '$q', '$location', 'RESOURCES', 'PatientService', function ($scope,$rootScope, $http, $q, $location, RESOURCES, PatientService) {
    PatientService.getPatientList().then(function(data){
    	$scope.patientList = data;
    	$rootScope.showMessage('Patient List Fetched Succesfully');
    },function(data){
    	
    });
    $scope.query = {
    	    limit: 5,
    	    page: 1
    	  };
    $scope.seletedPatient = [];
    $scope.goToProfile = function (patientId) {
        console.log(patientId);
        $location.path('/patientProfile/'+patientId);
    }
}]);
