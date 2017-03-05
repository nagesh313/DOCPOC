angular.module("myApp")
    .factory('PatientService',['$http', '$log', '$q','RESOURCES', function ($http, $log, $q,RESOURCES) {
        return {
        	addNewPatient:function(data){
        		 var deferred = $q.defer();
        		 var payload = {
        				 'blood_Group':data.bloodGroup,
                		 'dob':data.dob,
                		 'email':data.email,
                		 'father_Name':data.fatherName,
                		 'first_Name':data.firstName,
                		 'gender':data.gender,
                		 'isActive':true,
                		 'last_Name':data.lastName,
                		 'middle_Name':data.middleName,
                		 'primaryMobile':data.phoneNumber,
                		 'middle_Name':data.middleName,
                		'secodaryMobile':data.secondaryPhoneNumber
        		 }
        		 var fd=new FormData();
        		 
        		 fd.append('blood_Group',data.bloodGroup);
        		 fd.append('dob',data.dob);
        		 fd.append('email',data.email);
        		 fd.append('father_Name',data.fatherName);
        		 fd.append('first_Name',data.firstName);
        		 fd.append('gender',data.gender);
        		 fd.append('isActive',true);
        		 fd.append('last_Name',data.lastName);
        		 fd.append('middle_Name',data.middleName);
        		 fd.append('photo',data.profilePic);
        		 /*fd.append('primaryMobile',data.phoneNumber);
        		 fd.append('secodaryMobile',data.secondaryPhoneNumber);*/
        		  debugger;

                   $http.post(RESOURCES.API+'patient/add',payload
                		   /*,{
                	   transformRequest:angular.identity,
                	   header:{'Content-Type':undefined}
                   }*/)
                     .then(function(response) { 
                       deferred.resolve(response.data);
                    },function(response){
                    	deferred.reject(response.data);
                    });
        		 return deferred.promise;
        	},
            getMedicinesForSelection: function (prescriptionDetails) {
                var deferred = $q.defer();
                //  $http.get('/api/v1/movies/' + movie)
                //    .success(function(data) { 
                //       deferred.resolve({
                //          title: data.title,
                //          cost: data.price});
                //    }).error(function(msg, code) {
                //       deferred.reject(msg);
                //       $log.error(msg, code);
                //    });
                deferred.resolve();
                return deferred.promise;

            },
            addPatientPresciption: function (prescriptionDetails) {
            	var deferred = $q.defer();
            	debugger;
            	$http.post(RESOURCES.API+'prescription/add',prescriptionDetails)
                  .then(function(response) { 
                	  deferred.resolve(response.data);
                 },function(response){
                 	deferred.reject(response.data);
                 });
     		 return deferred.promise;
            },
            getPatientList: function () {
            	var deferred = $q.defer();
            	$http.get(RESOURCES.API+'patient/all'
             		   /*,{
             	   transformRequest:angular.identity,
             	   header:{'Content-Type':undefined}
                }*/)
                  .then(function(response) { 
                	  deferred.resolve(response.data);
                    
                 },function(response){
                 	deferred.reject(response.data);
                 });
     		 return deferred.promise;
            },
            getPatientRecord: function (patientId) {
            	var deferred = $q.defer();
            	$http.get(RESOURCES.API+'patient/get/'+patientId
             		   /*,{
             	   transformRequest:angular.identity,
             	   header:{'Content-Type':undefined}
                }*/)
                  .then(function(response) { 
                    deferred.resolve(response.data);
                 },function(response){
                 	deferred.reject(response.data);
                 });
     		 return deferred.promise;
            },
            getPatientPrescriptionRecord: function (patientId) {
            	var deferred = $q.defer();
            	$http.get(RESOURCES.API+'prescription/getPatientPrescription/'+patientId
             		   /*,{
             	   transformRequest:angular.identity,
             	   header:{'Content-Type':undefined}
                }*/)
                  .then(function(response) { 
                	  
                    deferred.resolve(response.data);
                 },function(response){
                 	deferred.reject(response.data);
                 });
     		 return deferred.promise;
            }
        }
    }]);
     		 
     		 
     		 /*
                var patientRecord = {};
                patientRecord.details = {};
                patientRecord.prescriptionList = [
                    {
                        'visitDate': '1-Oct-16',
                        'medicines': 'med1,med2,med3',
                        comments: 'doctors internal comments for his/her  reference',
                        feesCharged: '1000',
                        nextAppointement: '3-Oct-16'
                    },
                    {
                        'visitDate': '3-Oct-16',
                        'medicines': 'med1,med2,med3',
                        comments: 'doctors internal comments for his/her  reference',
                        feesCharged: '1000',
                        nextAppointement: '5-Oct-16'
                    }, {
                        'visitDate': '5-Oct-16',
                        'medicines': 'med1,med2,med3',
                        comments: 'doctors internal comments for his/her  reference',
                        feesCharged: '1000',
                        nextAppointement: '7-Oct-16'
                    }, {
                        'visitDate': '7-Oct-16',
                        'medicines': 'med1,med2,med3',
                        comments: 'doctors internal comments for his/her  reference',
                        feesCharged: '1000',
                        nextAppointement: '9-Oct-16'
                    },
                    {
                        'visitDate': '9-Oct-16',
                        'medicines': 'med1,med2,med3',
                        comments: 'doctors internal comments for his/her  reference',
                        feesCharged: '1000',
                        nextAppointement: '11-Oct-16'
                    },

                    {
                        'visitDate': '11-Oct-16',
                        'medicines': 'med1,med2,med3',
                        comments: 'doctors internal comments for his/her  reference',
                        feesCharged: '1000',
                        nextAppointement: '15-Oct-16'
                    }
                ];


                return patientRecord;
            },
            getPatientList: function () {
                var patientList = [
                    {
                        firstName: "Nagesh",
                        lastName: "Mishra",
                        mobileNumber: '8888888888',
                        email: 'nagesh3.13@gmail.com',
                        dob: '20-06-1990',
                        gender: "Male"
                    }, {
                        firstName: "Nagesh",
                        lastName: "Mishra",
                        mobileNumber: '8888888888',
                        email: 'nagesh3.13@gmail.com',
                        dob: '20-06-1990',
                        gender: "Male"

                    }, {
                        firstName: "Nagesh",
                        lastName: "Mishra",
                        mobileNumber: '8888888888',
                        email: 'nagesh3.13@gmail.com',
                        dob: '20-06-1990',
                        gender: "Male"
                    }

                ]*/
               // return patientList;
                //  var deferred = $q.defer();
                //  $http.get('/api/v1/movies/' + movie)
                //    .success(function(data) { 
                //       deferred.resolve({
                //          title: data.title,
                //          cost: data.price});
                //    }).error(function(msg, code) {
                //       deferred.reject(msg);
                //       $log.error(msg, code);
                //    });
                //  return deferred.promise;
