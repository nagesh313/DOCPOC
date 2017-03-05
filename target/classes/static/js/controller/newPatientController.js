angular.module("myApp").controller('NewPatientController', ['$scope','$rootScope','$location', '$http', '$q', 'RESOURCES','PatientService', function ($scope,$rootScope,$location, $http, $q, RESOURCES,PatientService) {
    $scope.newPatient = {
        firstName: 'Nagesh',
        middleName: 'Kumar',
        lastName: 'Mishra',
        phoneNumber: 8308283800,
        secondaryPhoneNumber: 555555555,
        email: 'nagesh3.13@gmail.com',
        fatherName: 'SB Mishra',
        bloodGroup: "O-",
        dob: new Date(),
        gender: "male",
        profilePhoto:''
    }

   /* var input = document.querySelector('.uploadProfilePicBtn');
    input.addEventListener('change', function () {
        var file = input.files[0];
        drawOnCanvas(file);
    });
   */ $scope.addNewPatient = function (patientForm) {
    	 var defer = $q.defer();
    	PatientService.addNewPatient($scope.newPatient).then(function(data){
    		$rootScope.showMessage('Patient added Succesfully');
    		$location.path('/patientList');
    		defer.resolve();
    	},function(data){
    		defer.reject();
    	});
    };
    function readFileData() {
        var defer = $q.defer();
        var f = document.querySelector('.uploadProfilePicBtn').files[0],
            r = new FileReader();
        r.onloadend = function (e) {
            var data = e.target.result;
            defer.resolve(data);
            //send your binary data via $http or $resource or do anything else with it
        };
        r.readAsBinaryString(f);
        return defer.promise;
    };
    function uploadNewUser() {
        var defer = $q.defer();
        readFileData().then(function (data) {
        	$scope.newPatient.profilePic=data;
        	PatientService.addNewPatient($scope.newPatient).then(function(data){
        		
        		defer.resolve();
        	},function(data){
        		defer.reject();
        	});
        });
        return defer.promise;
    };
    function drawOnCanvas(file) {
        // We use the File APi to read the content of the input file element
        var reader = new FileReader();
        // On reader load with parse the content and draw it on Canvas
        reader.onload = function (e) {
            var dataURL = e.target.result,
                c = document.querySelector('canvas'),
                ctx = c.getContext('2d'),
                img = new Image();
            img.onload = function () {
                c.width = 100;
                c.height = 100;
                ctx.drawImage(img, 0, 0, img.width, img.height, 0, 0, 100, 100);
            };
            img.src = dataURL;
        };
        // Load the file in reader ...
        reader.readAsDataURL(file);
    }
}]);
