'use strict';
var app = {};
angular.module('myApp', ['ngMaterial', 'ngRoute', 'ngMessages', 'static-include', 'md.data.table'])
    .config(function ($routeProvider, $mdThemingProvider, $httpProvider) {
        $mdThemingProvider.theme('docs-dark', 'default')
            .primaryPalette('blue');

        $routeProvider
            .when("/", {
                templateUrl: "views/home.html"
            })
            .when("/patientList", {
                templateUrl: "/views/patient/patientList.html",
                controller: "PatientListController"
            })
            .when("/patientProfile/:id", {
                templateUrl: "/views/patient/patientProfile.html",
                controller: "PatientProfileController"
            }).when("/newPatient", {
                templateUrl: "/views/patient/NewPatient.html",
                controller: "NewPatientController"
            })
            ;
        $httpProvider.interceptors.push('loadingStatusInterceptor');
    }).constant('RESOURCES',
        {'DOMAIN' : window.location.hostname,'PORT':window.location.port,
    	'API':'http://'+window.location.hostname+':'+window.location.port+'/'}
        ).run(['$rootScope', '$mdSidenav', '$mdToast', function ($rootScope, $mdSidenav, $mdToast) {

        var last = {
            bottom: false,
            top: true,
            left: false,
            right: true
        };
        $rootScope.showMessage = function (data) {
        	$mdToast.show($mdToast.simple().textContent(data).position('top right').hideDelay(5000));
        };
        $rootScope.toggleLeft = function () {
            $mdSidenav('left').toggle();
        };
    }]);
function buildToggler(componentId) {
    return function () {
        $mdSidenav(componentId).toggle();
    };
}


