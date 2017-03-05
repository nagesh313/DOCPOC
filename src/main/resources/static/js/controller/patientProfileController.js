angular.module("myApp").controller('PatientProfileController', function ($scope, $rootScope,$routeParams, $timeout, $mdBottomSheet, $mdToast, $mdDialog, PatientService) {
	$scope.query = {
			limit: 5,
			page: 1
	};
	$scope.selected = [];
	PatientService.getPatientRecord($routeParams.id).then(function(data){
		$scope.patientRecords={details:data,prescriptionList:[]};
		PatientService.getPatientPrescriptionRecord($routeParams.id).then(function(data){
			$scope.patientRecords.prescriptionList=data;
			$rootScope.showMessage('Patient Profile Fetched Succesfully'); 
		},function(data){

		});
	},function(data){

	});
	//$scope.patientRecords = PatientService.getPatientRecord(23);
	$scope.addNewPrescription = function () {
		console.log($scope.newPrescription);
		// var n = d.toString();
		$scope.newPrescription.visitDate = new Date().toDateString();
		// $scope.newPrescription.nextAppointement:'11-Oct-16'
		var back = $scope.newPrescription.nextAppointement;
		$scope.newPrescription.nextAppointement = $scope.newPrescription.nextAppointement.toDateString();
		//$scope.newPrescription.medicines = "TBD";
		//$scope.patientRecords.prescriptionList.push($scope.newPrescription, 0);
		//$scope.newPrescription = {};
		$scope.newPrescription.patId = $routeParams.id;
		PatientService.addPatientPresciption($scope.newPrescription).then(function (data) {
			PatientService.getPatientRecord($routeParams.id).then(function(data){
				//$scope.patientRecords={details:data,prescriptionList:[]};
				PatientService.getPatientPrescriptionRecord($routeParams.id).then(function(data){
					$scope.patientRecords.prescriptionList=data;
					$scope.newPrescription.visitDate =  back;
					$scope.newPrescription.nextAppointement = new Date();
					back
					$rootScope.showMessage("Presciption added succesfully");
				},function(data){
				});

			}, function (data) { });
		});
	}

	function DialogController($scope, $mdDialog) {

		// $scope.loadMedicines=function() {
		var medicines = [
		                 'Medicine1 1',
		                 'Medicine2 2',
		                 'Medicine3 3',
		                 'Medicine4 4',
		                 'Medicine5 5',
		                 'Medicine6 6',
		                 'Medicine7 7',
		                 'Medicine8 8',
		                 'Medicine9 9',
		                 'Medicine10 10',
		                 'Medicine11 11',
		                 'Medicine12 12',
		                 ];
		$scope.allMedicines= medicines.map(function (c, index) {
			var cParts = c.split(' ');
			var medicine = {
					name: c,
					desc: cParts[0][0].toLowerCase() + '.' + cParts[1].toLowerCase() + 'desc example'

			};
			medicine._lowername = medicine.name.toLowerCase();
			return medicine;
		});
		// }
		$scope.medicines = [$scope.allMedicines[0]];

		$scope.filterSelected = true;

		$scope.querySearch=function(query) {
			var results = query ?
					$scope.allMedicines.filter(createFilterFor(query)) : [];
					return results;
		}

		$scope.createFilterFor=function (query) {
			var lowercaseQuery = angular.lowercase(query);
			return function filterFn(medicine) {
				return (medicine._lowername.indexOf(lowercaseQuery) != -1);;
			};
		}

		$scope.hide = function () {
			$mdDialog.hide();
		};

		$scope.cancel = function () {
			$mdDialog.cancel();
		};

		$scope.action = function (answer) {
			$mdDialog.hide(answer);
		};
	};
	$scope.showSelectMedicineDialog = function (ev) {
		$mdDialog.show({
			controller: DialogController,
			templateUrl: 'views/templates/MedicineSelectTemplate.html',
			parent: angular.element(document.body),
			targetEvent: ev,
			clickOutsideToClose: true
		})
		.then(function (answer) {
			$scope.status = 'You said the information was "' + answer + '".';
		}, function () {
			$scope.status = 'You cancelled the dialog.';
		});
	};
});



